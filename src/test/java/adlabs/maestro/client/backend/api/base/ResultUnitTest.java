package adlabs.maestro.client.backend.api.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultUnitTest {

    @Test
    void successfulResult_ReturnsCorrectValues() {
        // Arrange
        String testValue = "Test data";
        String response = "{\"data\":\"Test data\"}";
        
        Result<String> result = Result.<String>builder()
            .successful(true)
            .code(200)
            .response(response)
            .value(testValue)
            .build();

        // Assert
        assertTrue(result.isSuccessful());
        assertEquals(200, result.getCode());
        assertEquals(response, result.getResponse());
        assertEquals(testValue, result.getValue());
    }

    @Test
    void failedResult_ReturnsCorrectValues() {
        // Arrange
        String errorResponse = "{\"error\":\"Not found\"}";
        
        Result<String> result = Result.<String>builder()
            .successful(false)
            .code(404)
            .response(errorResponse)
            .value(null)
            .build();

        // Assert
        assertFalse(result.isSuccessful());
        assertEquals(404, result.getCode());
        assertEquals(errorResponse, result.getResponse());
        assertNull(result.getValue());
    }

    @Test
    void resultWithComplexObject() {
        // Arrange
        TestObject testObject = new TestObject("test-id", "test-name", 42);
        String response = "{\"id\":\"test-id\",\"name\":\"test-name\",\"count\":42}";
        
        Result<TestObject> result = Result.<TestObject>builder()
            .successful(true)
            .code(200)
            .response(response)
            .value(testObject)
            .build();

        // Assert
        assertTrue(result.isSuccessful());
        assertEquals(200, result.getCode());
        assertNotNull(result.getValue());
        assertEquals("test-id", result.getValue().id);
        assertEquals("test-name", result.getValue().name);
        assertEquals(42, result.getValue().count);
    }

    @Test
    void serverErrorResult() {
        // Arrange
        Result<Object> result = Result.builder()
            .successful(false)
            .code(500)
            .response("{\"error\":\"Internal server error\"}")
            .value(null)
            .build();

        // Assert
        assertFalse(result.isSuccessful());
        assertEquals(500, result.getCode());
        assertTrue(result.getResponse().contains("Internal server error"));
        assertNull(result.getValue());
    }

    @Test
    void unauthorizedResult() {
        // Arrange
        Result<Object> result = Result.builder()
            .successful(false)
            .code(401)
            .response("{\"error\":\"Unauthorized\"}")
            .value(null)
            .build();

        // Assert
        assertFalse(result.isSuccessful());
        assertEquals(401, result.getCode());
        assertTrue(result.getResponse().contains("Unauthorized"));
    }

    @Test
    void rateLimitedResult() {
        // Arrange
        Result<Object> result = Result.builder()
            .successful(false)
            .code(429)
            .response("{\"error\":\"Rate limit exceeded\"}")
            .value(null)
            .build();

        // Assert
        assertFalse(result.isSuccessful());
        assertEquals(429, result.getCode());
        assertTrue(result.getResponse().contains("Rate limit exceeded"));
    }

    @Test
    void successWithEmptyResponse() {
        // Arrange
        Result<Void> result = Result.<Void>builder()
            .successful(true)
            .code(204)
            .response("")
            .value(null)
            .build();

        // Assert
        assertTrue(result.isSuccessful());
        assertEquals(204, result.getCode());
        assertEquals("", result.getResponse());
        assertNull(result.getValue());
    }

    @Test
    void redirectResult() {
        // Arrange
        Result<Object> result = Result.builder()
            .successful(false)
            .code(302)
            .response("{\"location\":\"https://new-url.com\"}")
            .value(null)
            .build();

        // Assert
        assertFalse(result.isSuccessful());
        assertEquals(302, result.getCode());
        assertTrue(result.getResponse().contains("location"));
    }

    @Test
    void badRequestResult() {
        // Arrange
        Result<Object> result = Result.builder()
            .successful(false)
            .code(400)
            .response("{\"error\":\"Invalid parameters\"}")
            .value(null)
            .build();

        // Assert
        assertFalse(result.isSuccessful());
        assertEquals(400, result.getCode());
        assertTrue(result.getResponse().contains("Invalid parameters"));
    }

    @Test
    void resultToString() {
        // Arrange
        Result<String> result = Result.<String>builder()
            .successful(true)
            .code(200)
            .response("OK")
            .value("Success")
            .build();

        // Act
        String toString = result.toString();

        // Assert
        assertNotNull(toString);
        assertTrue(toString.contains("successful=true"));
        assertTrue(toString.contains("code=200"));
        assertTrue(toString.contains("response='OK'"));
        assertTrue(toString.contains("value=Success"));
    }

    // Helper class for testing complex objects
    private static class TestObject {
        String id;
        String name;
        int count;

        TestObject(String id, String name, int count) {
            this.id = id;
            this.name = name;
            this.count = count;
        }
    }
}