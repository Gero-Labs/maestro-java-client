package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.models.NetworkId;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for general.model package classes to improve code coverage
 */
class GeneralModelUnitTest {

    @Test
    void ada_ConstructorAndGettersSetters() {
        // Test default constructor
        Ada ada = new Ada();
        assertNull(ada.getLovelace());

        // Test parameterized constructor
        Long lovelaceAmount = 1000000L;
        Ada adaWithValue = new Ada(lovelaceAmount);
        assertEquals(lovelaceAmount, adaWithValue.getLovelace());

        // Test setter
        ada.setLovelace(500000L);
        assertEquals(500000L, ada.getLovelace());
    }

    @Test
    void ada_ToString() {
        Ada ada = new Ada(1000000L);
        String toString = ada.toString();
        assertTrue(toString.contains("Ada{"));
        assertTrue(toString.contains("lovelace=1000000"));
    }

    @Test
    void ada_EqualsAndHashCode() {
        Ada ada1 = new Ada(1000000L);
        Ada ada2 = new Ada(1000000L);
        Ada ada3 = new Ada(2000000L);

        assertEquals(ada1, ada2);
        assertEquals(ada1.hashCode(), ada2.hashCode());
        assertNotEquals(ada1, ada3);
        assertNotEquals(ada1.hashCode(), ada3.hashCode());

        // Test reflexivity
        assertEquals(ada1, ada1);

        // Test null handling
        assertNotEquals(ada1, null);

        // Test different class
        assertNotEquals(ada1, "not an Ada object");
    }

    @Test
    void era_ConstructorAndGettersSetters() {
        // Test default constructor
        Era era = new Era();
        assertNull(era.getEnd());
        assertNull(era.getParameters());
        assertNull(era.getStart());

        // Test setters
        End end = new End();
        Parameters parameters = new Parameters();
        Start start = new Start();

        era.setEnd(end);
        era.setParameters(parameters);
        era.setStart(start);

        assertEquals(end, era.getEnd());
        assertEquals(parameters, era.getParameters());
        assertEquals(start, era.getStart());

        // Test parameterized constructor
        Era eraWithValues = new Era(end, parameters, start);
        assertEquals(end, eraWithValues.getEnd());
        assertEquals(parameters, eraWithValues.getParameters());
        assertEquals(start, eraWithValues.getStart());
    }

    @Test
    void era_ToString() {
        End end = new End();
        Parameters parameters = new Parameters();
        Start start = new Start();
        Era era = new Era(end, parameters, start);

        String toString = era.toString();
        assertTrue(toString.contains("Era{"));
        assertTrue(toString.contains("end="));
        assertTrue(toString.contains("parameters="));
        assertTrue(toString.contains("start="));
    }

    @Test
    void era_EqualsAndHashCode() {
        End end1 = new End();
        Parameters params1 = new Parameters();
        Start start1 = new Start();

        End end2 = new End();
        Parameters params2 = new Parameters();
        Start start2 = new Start();

        Era era1 = new Era(end1, params1, start1);
        Era era2 = new Era(end2, params2, start2);

        assertEquals(era1, era2);
        assertEquals(era1.hashCode(), era2.hashCode());

        // Test reflexivity
        assertEquals(era1, era1);

        // Test null handling
        assertNotEquals(era1, null);

        // Test different class
        assertNotEquals(era1, "not an Era object");
    }

    @Test
    void networkId_Values() {
        // Ensure we have the correct enum values
        NetworkId[] values = NetworkId.values();
        assertEquals(2, values.length);
        
        assertTrue(contains(values, NetworkId.MAINNET));
        assertTrue(contains(values, NetworkId.TESTNET));
    }

    @Test
    void networkId_GetValue() {
        assertEquals("mainnet", NetworkId.MAINNET.getValue());
        assertEquals("testnet", NetworkId.TESTNET.getValue());
    }

    @Test
    void networkId_ToString() {
        assertEquals("mainnet", NetworkId.MAINNET.toString());
        assertEquals("testnet", NetworkId.TESTNET.toString());
    }

    @Test
    void networkId_FromValue() {
        assertEquals(NetworkId.MAINNET, NetworkId.fromValue("mainnet"));
        assertEquals(NetworkId.TESTNET, NetworkId.fromValue("testnet"));
        
        // Test invalid value
        assertThrows(IllegalArgumentException.class, () -> {
            NetworkId.fromValue("invalid");
        });
    }

    private boolean contains(NetworkId[] array, NetworkId value) {
        for (NetworkId item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}