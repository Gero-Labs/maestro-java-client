package adlabs.maestro.client.backend.api.script.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for script.model package classes to improve code coverage
 */
class ScriptModelUnitTest {

    @Test
    void scriptType_Values() {
        ScriptType[] values = ScriptType.values();
        assertEquals(4, values.length);
        
        assertTrue(contains(values, ScriptType.NATIVE));
        assertTrue(contains(values, ScriptType.PLUTUSV1));
        assertTrue(contains(values, ScriptType.PLUTUSV2));
        assertTrue(contains(values, ScriptType.PLUTUSV3));
    }

    @Test
    void scriptType_GetValue() {
        assertEquals("native", ScriptType.NATIVE.getValue());
        assertEquals("plutusv1", ScriptType.PLUTUSV1.getValue());
        assertEquals("plutusv2", ScriptType.PLUTUSV2.getValue());
        assertEquals("plutusv3", ScriptType.PLUTUSV3.getValue());
    }

    @Test
    void scriptType_ToString() {
        assertEquals("native", ScriptType.NATIVE.toString());
        assertEquals("plutusv1", ScriptType.PLUTUSV1.toString());
        assertEquals("plutusv2", ScriptType.PLUTUSV2.toString());
        assertEquals("plutusv3", ScriptType.PLUTUSV3.toString());
    }

    @Test
    void scriptType_FromValue() {
        assertEquals(ScriptType.NATIVE, ScriptType.fromValue("native"));
        assertEquals(ScriptType.PLUTUSV1, ScriptType.fromValue("plutusv1"));
        assertEquals(ScriptType.PLUTUSV2, ScriptType.fromValue("plutusv2"));
        assertEquals(ScriptType.PLUTUSV3, ScriptType.fromValue("plutusv3"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            ScriptType.fromValue("invalid");
        });
    }

    @Test
    void scriptType_Name() {
        assertEquals("NATIVE", ScriptType.NATIVE.name());
        assertEquals("PLUTUSV1", ScriptType.PLUTUSV1.name());
        assertEquals("PLUTUSV2", ScriptType.PLUTUSV2.name());
        assertEquals("PLUTUSV3", ScriptType.PLUTUSV3.name());
    }

    @Test
    void scriptType_Ordinal() {
        assertEquals(0, ScriptType.NATIVE.ordinal());
        assertEquals(1, ScriptType.PLUTUSV1.ordinal());
        assertEquals(2, ScriptType.PLUTUSV2.ordinal());
        assertEquals(3, ScriptType.PLUTUSV3.ordinal());
    }

    @Test
    void scriptType_ValueOf() {
        assertEquals(ScriptType.NATIVE, ScriptType.valueOf("NATIVE"));
        assertEquals(ScriptType.PLUTUSV1, ScriptType.valueOf("PLUTUSV1"));
        assertEquals(ScriptType.PLUTUSV2, ScriptType.valueOf("PLUTUSV2"));
        assertEquals(ScriptType.PLUTUSV3, ScriptType.valueOf("PLUTUSV3"));
        
        assertThrows(IllegalArgumentException.class, () -> ScriptType.valueOf("INVALID"));
    }

    @Test
    void script_DefaultConstructor() {
        Script script = new Script();
        assertNotNull(script);
    }

    @Test
    void scriptFirstSeen_DefaultConstructor() {
        ScriptFirstSeen scriptFirstSeen = new ScriptFirstSeen();
        assertNotNull(scriptFirstSeen);
    }

    @Test
    void time_DefaultConstructor() {
        Time time = new Time();
        assertNotNull(time);
    }

    @Test
    void timestampedScript_DefaultConstructor() {
        TimestampedScript timestampedScript = new TimestampedScript();
        assertNotNull(timestampedScript);
    }

    @Test
    void timestampedScriptFirstSeen_DefaultConstructor() {
        TimestampedScriptFirstSeen timestampedScriptFirstSeen = new TimestampedScriptFirstSeen();
        assertNotNull(timestampedScriptFirstSeen);
    }

    @Test
    void scriptType_AllValuesHaveStringRepresentation() {
        for (ScriptType scriptType : ScriptType.values()) {
            assertNotNull(scriptType.getValue());
            assertFalse(scriptType.getValue().isEmpty());
            assertEquals(scriptType.getValue(), scriptType.toString());
        }
    }

    @Test
    void scriptType_FromValueCaseInsensitive() {
        // Test that fromValue is case sensitive (should throw exception for wrong case)
        assertThrows(IllegalArgumentException.class, () -> {
            ScriptType.fromValue("NATIVE");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            ScriptType.fromValue("PLUTUSV1");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            ScriptType.fromValue("PlutusV2");
        });
    }

    @Test
    void scriptType_FromValueWithNullAndEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            ScriptType.fromValue(null);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            ScriptType.fromValue("");
        });
    }

    @Test
    void scriptType_EnumConsistency() {
        // Test that all enum values can be converted back and forth
        for (ScriptType scriptType : ScriptType.values()) {
            String value = scriptType.getValue();
            ScriptType convertedBack = ScriptType.fromValue(value);
            assertEquals(scriptType, convertedBack);
        }
    }

    // Helper method for enum testing
    private boolean contains(ScriptType[] array, ScriptType value) {
        for (ScriptType item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}