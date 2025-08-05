package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for datum.model package classes to improve code coverage
 */
class DatumModelUnitTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void datumOptionType_Values() {
        DatumOptionType[] values = DatumOptionType.values();
        assertEquals(2, values.length);
        
        assertTrue(contains(values, DatumOptionType.HASH));
        assertTrue(contains(values, DatumOptionType.INLINE));
    }

    @Test
    void datumOptionType_GetValue() {
        assertEquals("hash", DatumOptionType.HASH.getValue());
        assertEquals("inline", DatumOptionType.INLINE.getValue());
    }

    @Test
    void datumOptionType_ToString() {
        assertEquals("hash", DatumOptionType.HASH.toString());
        assertEquals("inline", DatumOptionType.INLINE.toString());
    }

    @Test
    void datumOptionType_FromValue() {
        assertEquals(DatumOptionType.HASH, DatumOptionType.fromValue("hash"));
        assertEquals(DatumOptionType.INLINE, DatumOptionType.fromValue("inline"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            DatumOptionType.fromValue("invalid");
        });
    }

    @Test
    void datumOptionType_Name() {
        assertEquals("HASH", DatumOptionType.HASH.name());
        assertEquals("INLINE", DatumOptionType.INLINE.name());
    }

    @Test
    void datumOptionType_Ordinal() {
        assertEquals(0, DatumOptionType.HASH.ordinal());
        assertEquals(1, DatumOptionType.INLINE.ordinal());
    }

    @Test
    void datumOptionType_ValueOf() {
        assertEquals(DatumOptionType.HASH, DatumOptionType.valueOf("HASH"));
        assertEquals(DatumOptionType.INLINE, DatumOptionType.valueOf("INLINE"));
        
        assertThrows(IllegalArgumentException.class, () -> DatumOptionType.valueOf("INVALID"));
    }

    @Test
    void datum_DefaultConstructor() {
        Datum datum = new Datum();
        
        assertNull(datum.getBytes());
        assertNull(datum.getJson());
    }

    @Test
    void datum_ParameterizedConstructor() throws Exception {
        String bytes = "abc123def456";
        JsonNode json = objectMapper.readTree("{\"test\": \"value\"}");
        
        Datum datum = new Datum(bytes, json);
        
        assertEquals(bytes, datum.getBytes());
        assertEquals(json, datum.getJson());
    }

    @Test
    void datum_GettersSetters() throws Exception {
        Datum datum = new Datum();
        
        String bytes = "xyz789ghi012";
        JsonNode json = objectMapper.readTree("{\"field\": 123}");
        
        datum.setBytes(bytes);
        datum.setJson(json);
        
        assertEquals(bytes, datum.getBytes());
        assertEquals(json, datum.getJson());
    }

    @Test
    void datum_ToString() throws Exception {
        String bytes = "test123";
        JsonNode json = objectMapper.readTree("{\"name\": \"test\"}");
        
        Datum datum = new Datum(bytes, json);
        String toString = datum.toString();
        
        assertTrue(toString.contains("Datum{"));
        assertTrue(toString.contains("bytes='test123'"));
        assertTrue(toString.contains("json="));
    }

    @Test
    void datum_EqualsAndHashCode() throws Exception {
        String bytes1 = "bytes123";
        String bytes2 = "bytes123";
        String bytes3 = "bytes456";
        
        JsonNode json1 = objectMapper.readTree("{\"value\": 1}");
        JsonNode json2 = objectMapper.readTree("{\"value\": 1}");
        JsonNode json3 = objectMapper.readTree("{\"value\": 2}");
        
        Datum datum1 = new Datum(bytes1, json1);
        Datum datum2 = new Datum(bytes2, json2);
        Datum datum3 = new Datum(bytes3, json3);
        
        assertEquals(datum1, datum2);
        assertEquals(datum1.hashCode(), datum2.hashCode());
        assertNotEquals(datum1, datum3);
        assertNotEquals(datum1.hashCode(), datum3.hashCode());
        
        // Test reflexivity
        assertEquals(datum1, datum1);
        
        // Test null handling
        assertNotEquals(datum1, null);
        
        // Test different class
        assertNotEquals(datum1, "not a Datum object");
    }

    @Test
    void datum_EqualsWithNullFields() {
        Datum datum1 = new Datum();
        Datum datum2 = new Datum();
        
        assertEquals(datum1, datum2);
        assertEquals(datum1.hashCode(), datum2.hashCode());
        
        datum1.setBytes("test");
        assertNotEquals(datum1, datum2);
        
        datum2.setBytes("test");
        assertEquals(datum1, datum2);
    }

    @Test
    void datum_WithNullValues() {
        Datum datum = new Datum();
        
        datum.setBytes(null);
        datum.setJson(null);
        
        assertNull(datum.getBytes());
        assertNull(datum.getJson());
        
        String toString = datum.toString();
        assertTrue(toString.contains("Datum{"));
        // Check that the toString method works with null values
        assertNotNull(toString);
    }

    @Test
    void datum_WithEmptyValues() {
        Datum datum = new Datum();
        
        datum.setBytes("");
        
        assertEquals("", datum.getBytes());
        assertNull(datum.getJson());
    }

    @Test
    void datum_WithComplexJson() throws Exception {
        String bytes = "complex123";
        JsonNode complexJson = objectMapper.readTree("{\"nested\": {\"array\": [1, 2, 3], \"boolean\": true}, \"null_field\": null}");
        
        Datum datum = new Datum(bytes, complexJson);
        
        assertEquals(bytes, datum.getBytes());
        assertEquals(complexJson, datum.getJson());
        
        // Test that toString includes the complex JSON
        String toString = datum.toString();
        assertTrue(toString.contains("Datum{"));
        assertTrue(toString.contains("bytes='complex123'"));
    }

    @Test
    void datumOption_DefaultConstructor() {
        DatumOption datumOption = new DatumOption();
        assertNotNull(datumOption);
    }

    @Test
    void timestampedDatum_DefaultConstructor() {
        TimestampedDatum timestampedDatum = new TimestampedDatum();
        assertNotNull(timestampedDatum);
    }

    @Test
    void timestampedDatumMap_DefaultConstructor() {
        TimestampedDatumMap timestampedDatumMap = new TimestampedDatumMap();
        assertNotNull(timestampedDatumMap);
    }

    @Test
    void datum_EqualsWithSameBytesButDifferentJson() throws Exception {
        String bytes = "same123";
        JsonNode json1 = objectMapper.readTree("{\"test\": 1}");
        JsonNode json2 = objectMapper.readTree("{\"test\": 2}");
        
        Datum datum1 = new Datum(bytes, json1);
        Datum datum2 = new Datum(bytes, json2);
        
        assertNotEquals(datum1, datum2);
        assertNotEquals(datum1.hashCode(), datum2.hashCode());
    }

    @Test
    void datum_EqualsWithDifferentBytesButSameJson() throws Exception {
        String bytes1 = "bytes1";
        String bytes2 = "bytes2";
        JsonNode json = objectMapper.readTree("{\"same\": \"json\"}");
        
        Datum datum1 = new Datum(bytes1, json);
        Datum datum2 = new Datum(bytes2, json);
        
        assertNotEquals(datum1, datum2);
        assertNotEquals(datum1.hashCode(), datum2.hashCode());
    }

    @Test
    void datum_WithLongHexString() {
        String longHexBytes = "1234567890abcdef".repeat(10); // Create a long hex string
        Datum datum = new Datum();
        
        datum.setBytes(longHexBytes);
        
        assertEquals(longHexBytes, datum.getBytes());
        
        String toString = datum.toString();
        assertTrue(toString.contains(longHexBytes));
    }

    @Test
    void datum_JsonNodeTypes() throws Exception {
        Datum datum = new Datum();
        
        // Test with null JSON node
        datum.setJson(null);
        assertNull(datum.getJson());
        
        // Test with text JSON node
        JsonNode textNode = objectMapper.readTree("\"simple text\"");
        datum.setJson(textNode);
        assertEquals(textNode, datum.getJson());
        
        // Test with number JSON node
        JsonNode numberNode = objectMapper.readTree("42");
        datum.setJson(numberNode);
        assertEquals(numberNode, datum.getJson());
        
        // Test with boolean JSON node
        JsonNode booleanNode = objectMapper.readTree("true");
        datum.setJson(booleanNode);
        assertEquals(booleanNode, datum.getJson());
        
        // Test with array JSON node
        JsonNode arrayNode = objectMapper.readTree("[1, 2, 3]");
        datum.setJson(arrayNode);
        assertEquals(arrayNode, datum.getJson());
    }

    // Helper method for enum testing
    private boolean contains(DatumOptionType[] array, DatumOptionType value) {
        for (DatumOptionType item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}