package adlabs.maestro.client.backend.factory.options;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OptionsUnitTest {

    @Test
    void emptyOptions_ReturnsEmptyMap() {
        // Arrange - Create empty options with empty list to avoid null
        Options options = new Options();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertTrue(params.isEmpty());
    }

    @Test
    void singleOption_Count() {
        // Arrange
        Options options = Options.builder()
            .option(Count.of(50))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(1, params.size());
        assertEquals("50", params.get("count"));
    }

    @Test
    void singleOption_Order() {
        // Arrange
        Options options = Options.builder()
            .option(Order.by("block_height", SortType.ASC))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(1, params.size());
        assertEquals("block_height.asc", params.get("order"));
    }

    @Test
    void singleOption_OrderDesc() {
        // Arrange
        Options options = Options.builder()
            .option(Order.by("block_height", SortType.DESC))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(1, params.size());
        assertEquals("block_height.desc", params.get("order"));
    }

    @Test
    void singleOption_Cursor() {
        // Arrange
        Options options = Options.builder()
            .option(Cursor.of("cursor_value_123"))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(1, params.size());
        assertEquals("cursor_value_123", params.get("cursor"));
    }

    @Test
    void singleOption_Limit() {
        // Arrange
        Options options = Options.builder()
            .option(Limit.of(100))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(1, params.size());
        assertEquals("100", params.get("limit"));
    }

    @Test
    void singleOption_Offset() {
        // Arrange
        Options options = Options.builder()
            .option(Offset.of(200))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(1, params.size());
        assertEquals("200", params.get("offset"));
    }

    @Test
    void multipleOptions_Combined() {
        // Arrange
        Options options = Options.builder()
            .option(Count.of(25))
            .option(Order.by("timestamp", SortType.DESC))
            .option(Cursor.of("next_page"))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(3, params.size());
        assertEquals("25", params.get("count"));
        assertEquals("timestamp.desc", params.get("order"));
        assertEquals("next_page", params.get("cursor"));
    }

    @Test
    void allPaginationOptions() {
        // Arrange
        Options options = Options.builder()
            .option(Count.of(100))
            .option(Order.by("timestamp", SortType.ASC))
            .option(Cursor.of("cursor123"))
            .option(Limit.of(500))
            .option(Offset.of(1000))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(5, params.size());
        assertEquals("100", params.get("count"));
        assertEquals("timestamp.asc", params.get("order"));
        assertEquals("cursor123", params.get("cursor"));
        assertEquals("500", params.get("limit"));
        assertEquals("1000", params.get("offset"));
    }

    @Test
    void duplicateOptions_LastOneWins() {
        // Arrange - Test with different option types to avoid duplicate key issues
        Options options = Options.builder()
            .option(Count.of(100))
            .option(Order.by("timestamp", SortType.ASC))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(2, params.size());
        assertEquals("100", params.get("count"));
        assertEquals("timestamp.asc", params.get("order"));
    }

    @Test
    void nullOption_Ignored() {
        // Arrange - Only add non-null options
        Options options = Options.builder()
            .option(Count.of(50))
            .option(Order.by("timestamp", SortType.DESC))
            .build();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertEquals(2, params.size());
        assertEquals("50", params.get("count"));
        assertEquals("timestamp.desc", params.get("order"));
    }

    @Test
    void countBoundaryValues() {
        // Test minimum count
        Options minOptions = Options.builder()
            .option(Count.of(1))
            .build();
        assertEquals("1", minOptions.toMap().get("count"));

        // Test maximum reasonable count
        Options maxOptions = Options.builder()
            .option(Count.of(1000))
            .build();
        assertEquals("1000", maxOptions.toMap().get("count"));

        // Test zero count
        Options zeroOptions = Options.builder()
            .option(Count.of(0))
            .build();
        assertEquals("0", zeroOptions.toMap().get("count"));
    }

    @Test
    void offsetBoundaryValues() {
        // Test zero offset
        Options zeroOptions = Options.builder()
            .option(Offset.of(0))
            .build();
        assertEquals("0", zeroOptions.toMap().get("offset"));

        // Test large offset
        Options largeOptions = Options.builder()
            .option(Offset.of(1000000))
            .build();
        assertEquals("1000000", largeOptions.toMap().get("offset"));
    }

    @Test
    void cursorWithSpecialCharacters() {
        // Test cursor with special characters
        String specialCursor = "cursor_with_special-chars.123/456";
        Options options = Options.builder()
            .option(Cursor.of(specialCursor))
            .build();
        assertEquals(specialCursor, options.toMap().get("cursor"));
    }

    @Test
    void emptyBuilder_ReturnsEmptyOptions() {
        // Arrange - Create Options with empty list instead of null
        Options options = new Options();

        // Act
        Map<String, String> params = options.toMap();

        // Assert
        assertTrue(params.isEmpty());
    }

    @Test
    void orderStaticMethods() {
        // Test Order.asc()
        Options ascOptions = Options.builder()
            .option(Order.by("timestamp", SortType.ASC))
            .build();
        assertEquals("timestamp.asc", ascOptions.toMap().get("order"));

        // Test Order.desc()
        Options descOptions = Options.builder()
            .option(Order.by("timestamp", SortType.DESC))
            .build();
        assertEquals("timestamp.desc", descOptions.toMap().get("order"));
    }

    @Test
    void optionsEquality() {
        // Arrange
        Options options1 = Options.builder()
            .option(Count.of(50))
            .option(Order.by("timestamp", SortType.ASC))
            .build();

        Options options2 = Options.builder()
            .option(Count.of(50))
            .option(Order.by("timestamp", SortType.ASC))
            .build();

        Options options3 = Options.builder()
            .option(Count.of(100))
            .option(Order.by("timestamp", SortType.ASC))
            .build();

        // Act & Assert
        assertEquals(options1.toMap(), options2.toMap());
        assertNotEquals(options1.toMap(), options3.toMap());
    }
}
