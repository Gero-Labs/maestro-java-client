package adlabs.maestro.client.backend.api.block.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for block.model package classes to improve code coverage
 */
class BlockModelUnitTest {

    @Test
    void ledgerEra_Values() {
        LedgerEra[] values = LedgerEra.values();
        assertEquals(8, values.length);
        
        assertTrue(contains(values, LedgerEra.BYRON));
        assertTrue(contains(values, LedgerEra.SHELLEY));
        assertTrue(contains(values, LedgerEra.ALLEGRA));
        assertTrue(contains(values, LedgerEra.MARY));
        assertTrue(contains(values, LedgerEra.ALONZO));
        assertTrue(contains(values, LedgerEra.BABBAGE));
        assertTrue(contains(values, LedgerEra.CONWAY));
        assertTrue(contains(values, LedgerEra.NOTRECOGNIZED));
    }

    @Test
    void ledgerEra_GetValue() {
        assertEquals("byron", LedgerEra.BYRON.getValue());
        assertEquals("shelley", LedgerEra.SHELLEY.getValue());
        assertEquals("allegra", LedgerEra.ALLEGRA.getValue());
        assertEquals("mary", LedgerEra.MARY.getValue());
        assertEquals("alonzo", LedgerEra.ALONZO.getValue());
        assertEquals("babbage", LedgerEra.BABBAGE.getValue());
        assertEquals("conway", LedgerEra.CONWAY.getValue());
        assertEquals("notrecognised", LedgerEra.NOTRECOGNIZED.getValue());
    }

    @Test
    void ledgerEra_ToString() {
        assertEquals("BYRON", LedgerEra.BYRON.toString());
        assertEquals("SHELLEY", LedgerEra.SHELLEY.toString());
        assertEquals("ALLEGRA", LedgerEra.ALLEGRA.toString());
        assertEquals("MARY", LedgerEra.MARY.toString());
        assertEquals("ALONZO", LedgerEra.ALONZO.toString());
        assertEquals("BABBAGE", LedgerEra.BABBAGE.toString());
        assertEquals("CONWAY", LedgerEra.CONWAY.toString());
        assertEquals("NOTRECOGNIZED", LedgerEra.NOTRECOGNIZED.toString());
    }

    @Test
    void ledgerEra_FromValue() {
        assertEquals(LedgerEra.BYRON, LedgerEra.fromValue("byron"));
        assertEquals(LedgerEra.SHELLEY, LedgerEra.fromValue("shelley"));
        assertEquals(LedgerEra.ALLEGRA, LedgerEra.fromValue("allegra"));
        assertEquals(LedgerEra.MARY, LedgerEra.fromValue("mary"));
        assertEquals(LedgerEra.ALONZO, LedgerEra.fromValue("alonzo"));
        assertEquals(LedgerEra.BABBAGE, LedgerEra.fromValue("babbage"));
        assertEquals(LedgerEra.CONWAY, LedgerEra.fromValue("conway"));
        assertEquals(LedgerEra.NOTRECOGNIZED, LedgerEra.fromValue("notrecognised"));
        
        assertThrows(IllegalArgumentException.class, () -> {
            LedgerEra.fromValue("invalid");
        });
    }

    @Test
    void ledgerEra_Name() {
        assertEquals("BYRON", LedgerEra.BYRON.name());
        assertEquals("SHELLEY", LedgerEra.SHELLEY.name());
        assertEquals("ALLEGRA", LedgerEra.ALLEGRA.name());
        assertEquals("MARY", LedgerEra.MARY.name());
        assertEquals("ALONZO", LedgerEra.ALONZO.name());
        assertEquals("BABBAGE", LedgerEra.BABBAGE.name());
        assertEquals("CONWAY", LedgerEra.CONWAY.name());
        assertEquals("NOTRECOGNIZED", LedgerEra.NOTRECOGNIZED.name());
    }

    @Test
    void ledgerEra_Ordinal() {
        assertEquals(0, LedgerEra.BYRON.ordinal());
        assertEquals(1, LedgerEra.SHELLEY.ordinal());
        assertEquals(2, LedgerEra.ALLEGRA.ordinal());
        assertEquals(3, LedgerEra.MARY.ordinal());
        assertEquals(4, LedgerEra.ALONZO.ordinal());
        assertEquals(5, LedgerEra.BABBAGE.ordinal());
        assertEquals(6, LedgerEra.CONWAY.ordinal());
        assertEquals(7, LedgerEra.NOTRECOGNIZED.ordinal());
    }

    @Test
    void ledgerEra_ValueOf() {
        assertEquals(LedgerEra.BYRON, LedgerEra.valueOf("BYRON"));
        assertEquals(LedgerEra.SHELLEY, LedgerEra.valueOf("SHELLEY"));
        assertEquals(LedgerEra.ALLEGRA, LedgerEra.valueOf("ALLEGRA"));
        assertEquals(LedgerEra.MARY, LedgerEra.valueOf("MARY"));
        assertEquals(LedgerEra.ALONZO, LedgerEra.valueOf("ALONZO"));
        assertEquals(LedgerEra.BABBAGE, LedgerEra.valueOf("BABBAGE"));
        assertEquals(LedgerEra.CONWAY, LedgerEra.valueOf("CONWAY"));
        assertEquals(LedgerEra.NOTRECOGNIZED, LedgerEra.valueOf("NOTRECOGNIZED"));
        
        assertThrows(IllegalArgumentException.class, () -> LedgerEra.valueOf("INVALID"));
    }

    @Test
    void ledgerEra_AllValuesHaveStringRepresentation() {
        for (LedgerEra era : LedgerEra.values()) {
            assertNotNull(era.getValue());
            assertFalse(era.getValue().isEmpty());
            // toString() returns enum name, getValue() returns lowercase string value
            assertNotNull(era.toString());
            assertFalse(era.toString().isEmpty());
        }
    }

    @Test
    void ledgerEra_FromValueCaseSensitive() {
        // Test that fromValue is case sensitive
        assertThrows(IllegalArgumentException.class, () -> {
            LedgerEra.fromValue("BYRON");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            LedgerEra.fromValue("Shelley");
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            LedgerEra.fromValue("ALONZO");
        });
    }

    @Test
    void ledgerEra_FromValueWithNullAndEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            LedgerEra.fromValue(null);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            LedgerEra.fromValue("");
        });
    }

    @Test
    void ledgerEra_EnumConsistency() {
        // Test that all enum values can be converted back and forth
        for (LedgerEra era : LedgerEra.values()) {
            String value = era.getValue();
            LedgerEra convertedBack = LedgerEra.fromValue(value);
            assertEquals(era, convertedBack);
        }
    }

    @Test
    void block_DefaultConstructor() {
        Block block = new Block();
        assertNotNull(block);
    }

    @Test
    void block_GettersSetters() {
        Block block = new Block();
        
        String hash = "abc123hash";
        Integer epochNo = 365;
        Integer absSlot = 50000000;
        Integer epochSlot = 432000;
        Integer blockHeight = 8000000;
        Integer blockSize = 65536;
        Long blockTime = 1640995200L;
        Integer txCount = 100;
        
        block.setHash(hash);
        block.setEpochNo(epochNo);
        block.setAbsSlot(absSlot);
        block.setEpochSlot(epochSlot);
        block.setBlockHeight(blockHeight);
        block.setBlockSize(blockSize);
        block.setBlockTime(blockTime);
        block.setTxCount(txCount);
        
        assertEquals(hash, block.getHash());
        assertEquals(epochNo, block.getEpochNo());
        assertEquals(absSlot, block.getAbsSlot());
        assertEquals(epochSlot, block.getEpochSlot());
        assertEquals(blockHeight, block.getBlockHeight());
        assertEquals(blockSize, block.getBlockSize());
        assertEquals(blockTime, block.getBlockTime());
        assertEquals(txCount, block.getTxCount());
    }

    @Test
    void block_ToString() {
        Block block = new Block();
        block.setHash("abc123hash");
        block.setEpochNo(365);
        block.setBlockHeight(8000000);
        
        String toString = block.toString();
        assertTrue(toString.contains("Block{") || toString.contains("hash"));
        assertNotNull(toString);
    }

    @Test
    void block_EqualsAndHashCode() {
        Block block1 = new Block();
        block1.setHash("abc123hash");
        block1.setEpochNo(365);
        block1.setBlockHeight(8000000);
        
        Block block2 = new Block();
        block2.setHash("abc123hash");
        block2.setEpochNo(365);
        block2.setBlockHeight(8000000);
        
        Block block3 = new Block();
        block3.setHash("def456hash");
        block3.setEpochNo(366);
        block3.setBlockHeight(8000001);
        
        // Test equality
        assertEquals(block1, block2);
        assertEquals(block1.hashCode(), block2.hashCode());
        assertNotEquals(block1, block3);
        
        // Test reflexivity
        assertEquals(block1, block1);
        
        // Test null handling
        assertNotEquals(block1, null);
        
        // Test different class
        assertNotEquals(block1, "not a Block object");
    }

    @Test
    void blockInfo_DefaultConstructor() {
        BlockInfo blockInfo = new BlockInfo();
        assertNotNull(blockInfo);
    }

    @Test
    void exUnit_DefaultConstructor() {
        ExUnit exUnit = new ExUnit();
        assertNotNull(exUnit);
    }

    @Test
    void exUnits_DefaultConstructor() {
        ExUnits exUnits = new ExUnits();
        assertNotNull(exUnits);
    }

    @Test
    void operationalCert_DefaultConstructor() {
        OperationalCert operationalCert = new OperationalCert();
        assertNotNull(operationalCert);
    }

    @Test
    void timestampedBlockInfo_DefaultConstructor() {
        TimestampedBlockInfo timestampedBlockInfo = new TimestampedBlockInfo();
        assertNotNull(timestampedBlockInfo);
    }

    @Test
    void block_WithNullValues() {
        Block block = new Block();
        
        // All fields start as null, verify they remain null
        assertNull(block.getHash());
        assertNull(block.getEpochNo());
        assertNull(block.getAbsSlot());
        assertNull(block.getEpochSlot());
        assertNull(block.getBlockHeight());
        assertNull(block.getBlockSize());
        assertNull(block.getBlockTime());
        assertNull(block.getTxCount());
        
        // Verify toString handles null values
        String toString = block.toString();
        assertNotNull(toString);
    }

    @Test
    void block_EqualsWithNullFields() {
        Block block1 = new Block();
        Block block2 = new Block();
        
        // Both blocks have all null fields
        assertEquals(block1, block2);
        assertEquals(block1.hashCode(), block2.hashCode());
        
        // Set one field and verify inequality
        block1.setHash("test");
        assertNotEquals(block1, block2);
        
        // Set same field on second block
        block2.setHash("test");
        assertEquals(block1, block2);
        assertEquals(block1.hashCode(), block2.hashCode());
    }

    @Test
    void block_EqualsWithDifferentValues() {
        Block block1 = new Block();
        block1.setHash("hash1");
        block1.setEpochNo(365);
        
        Block block2 = new Block();
        block2.setHash("hash2");
        block2.setEpochNo(365);
        
        assertNotEquals(block1, block2);
        assertNotEquals(block1.hashCode(), block2.hashCode());
    }

    // Helper method for enum testing
    private boolean contains(LedgerEra[] array, LedgerEra value) {
        for (LedgerEra item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}