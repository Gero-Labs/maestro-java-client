package adlabs.maestro.client.backend.api.epoch.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for epoch.model package classes to improve code coverage
 */
class EpochModelUnitTest {

    @Test
    void epochInfo_DefaultConstructor() {
        EpochInfo epochInfo = new EpochInfo();
        
        assertNull(epochInfo.getActiveStake());
        assertNull(epochInfo.getAverageReward());
        assertNull(epochInfo.getBlkCount());
        assertNull(epochInfo.getEndTime());
        assertNull(epochInfo.getEpochNo());
        assertNull(epochInfo.getFees());
        assertNull(epochInfo.getStartTime());
        assertNull(epochInfo.getTotalRewards());
        assertNull(epochInfo.getTxCount());
    }

    @Test
    void epochInfo_ParameterizedConstructor() {
        String activeStake = "50000000000";
        String averageReward = "100000";
        Integer blkCount = 5000;
        Long endTime = 1672531200L;
        Integer epochNo = 456;
        String fees = "5000000";
        Long startTime = 1672444800L;
        String totalRewards = "500000000";
        Integer txCount = 10000;
        
        EpochInfo epochInfo = new EpochInfo(activeStake, averageReward, blkCount, endTime, epochNo, fees, startTime, totalRewards, txCount);
        
        assertEquals(activeStake, epochInfo.getActiveStake());
        assertEquals(averageReward, epochInfo.getAverageReward());
        assertEquals(blkCount, epochInfo.getBlkCount());
        assertEquals(endTime, epochInfo.getEndTime());
        assertEquals(epochNo, epochInfo.getEpochNo());
        assertEquals(fees, epochInfo.getFees());
        assertEquals(startTime, epochInfo.getStartTime());
        assertEquals(totalRewards, epochInfo.getTotalRewards());
        assertEquals(txCount, epochInfo.getTxCount());
    }

    @Test
    void epochInfo_GettersSetters() {
        EpochInfo epochInfo = new EpochInfo();
        
        String activeStake = "75000000000";
        String averageReward = "150000";
        Integer blkCount = 7500;
        Long endTime = 1672617600L;
        Integer epochNo = 789;
        String fees = "7500000";
        Long startTime = 1672531200L;
        String totalRewards = "750000000";
        Integer txCount = 15000;
        
        epochInfo.setActiveStake(activeStake);
        epochInfo.setAverageReward(averageReward);
        epochInfo.setBlkCount(blkCount);
        epochInfo.setEndTime(endTime);
        epochInfo.setEpochNo(epochNo);
        epochInfo.setFees(fees);
        epochInfo.setStartTime(startTime);
        epochInfo.setTotalRewards(totalRewards);
        epochInfo.setTxCount(txCount);
        
        assertEquals(activeStake, epochInfo.getActiveStake());
        assertEquals(averageReward, epochInfo.getAverageReward());
        assertEquals(blkCount, epochInfo.getBlkCount());
        assertEquals(endTime, epochInfo.getEndTime());
        assertEquals(epochNo, epochInfo.getEpochNo());
        assertEquals(fees, epochInfo.getFees());
        assertEquals(startTime, epochInfo.getStartTime());
        assertEquals(totalRewards, epochInfo.getTotalRewards());
        assertEquals(txCount, epochInfo.getTxCount());
    }

    @Test
    void epochInfo_ToString() {
        EpochInfo epochInfo = new EpochInfo("1000000", "5000", 100, 1672531200L, 123, "10000", 1672444800L, "50000", 200);
        String toString = epochInfo.toString();
        
        assertTrue(toString.contains("EpochInfo{"));
        assertTrue(toString.contains("activeStake='1000000'"));
        assertTrue(toString.contains("averageReward='5000'"));
        assertTrue(toString.contains("blkCount=100"));
        assertTrue(toString.contains("endTime=1672531200"));
        assertTrue(toString.contains("epochNo=123"));
        assertTrue(toString.contains("fees='10000'"));
        assertTrue(toString.contains("startTime=1672444800"));
        assertTrue(toString.contains("totalRewards='50000'"));
        assertTrue(toString.contains("txCount=200"));
    }

    @Test
    void epochInfo_EqualsAndHashCode() {
        EpochInfo epoch1 = new EpochInfo("1000000", "5000", 100, 1672531200L, 123, "10000", 1672444800L, "50000", 200);
        EpochInfo epoch2 = new EpochInfo("1000000", "5000", 100, 1672531200L, 123, "10000", 1672444800L, "50000", 200);
        EpochInfo epoch3 = new EpochInfo("2000000", "7500", 150, 1672617600L, 456, "15000", 1672531200L, "75000", 300);
        
        assertEquals(epoch1, epoch2);
        assertEquals(epoch1.hashCode(), epoch2.hashCode());
        assertNotEquals(epoch1, epoch3);
        assertNotEquals(epoch1.hashCode(), epoch3.hashCode());
        
        // Test reflexivity
        assertEquals(epoch1, epoch1);
        
        // Test null handling
        assertNotEquals(epoch1, null);
        
        // Test different class
        assertNotEquals(epoch1, "not an EpochInfo object");
    }

    @Test
    void epochInfo_EqualsWithNullFields() {
        EpochInfo epoch1 = new EpochInfo();
        EpochInfo epoch2 = new EpochInfo();
        
        assertEquals(epoch1, epoch2);
        assertEquals(epoch1.hashCode(), epoch2.hashCode());
        
        epoch1.setEpochNo(123);
        assertNotEquals(epoch1, epoch2);
        
        epoch2.setEpochNo(123);
        assertEquals(epoch1, epoch2);
    }

    @Test
    void currentEpochInfo_DefaultConstructor() {
        CurrentEpochInfo currentEpochInfo = new CurrentEpochInfo();
        
        assertNull(currentEpochInfo.getBlkCount());
        assertNull(currentEpochInfo.getEpochNo());
        assertNull(currentEpochInfo.getFees());
        assertNull(currentEpochInfo.getStartTime());
        assertNull(currentEpochInfo.getTxCount());
    }

    @Test
    void currentEpochInfo_ParameterizedConstructor() {
        Integer blkCount = 2500;
        Integer epochNo = 789;
        String fees = "2500000";
        Long startTime = 1672444800L;
        Integer txCount = 5000;
        
        CurrentEpochInfo currentEpochInfo = new CurrentEpochInfo(blkCount, epochNo, fees, startTime, txCount);
        
        assertEquals(blkCount, currentEpochInfo.getBlkCount());
        assertEquals(epochNo, currentEpochInfo.getEpochNo());
        assertEquals(fees, currentEpochInfo.getFees());
        assertEquals(startTime, currentEpochInfo.getStartTime());
        assertEquals(txCount, currentEpochInfo.getTxCount());
    }

    @Test
    void currentEpochInfo_GettersSetters() {
        CurrentEpochInfo currentEpochInfo = new CurrentEpochInfo();
        
        Integer blkCount = 3750;
        Integer epochNo = 456;
        String fees = "3750000";
        Long startTime = 1672531200L;
        Integer txCount = 7500;
        
        currentEpochInfo.setBlkCount(blkCount);
        currentEpochInfo.setEpochNo(epochNo);
        currentEpochInfo.setFees(fees);
        currentEpochInfo.setStartTime(startTime);
        currentEpochInfo.setTxCount(txCount);
        
        assertEquals(blkCount, currentEpochInfo.getBlkCount());
        assertEquals(epochNo, currentEpochInfo.getEpochNo());
        assertEquals(fees, currentEpochInfo.getFees());
        assertEquals(startTime, currentEpochInfo.getStartTime());
        assertEquals(txCount, currentEpochInfo.getTxCount());
    }

    @Test
    void currentEpochInfo_ToString() {
        CurrentEpochInfo currentEpochInfo = new CurrentEpochInfo(150, 321, "15000", 1672444800L, 300);
        String toString = currentEpochInfo.toString();
        
        assertTrue(toString.contains("CurrentEpochInfo{"));
        assertTrue(toString.contains("blkCount=150"));
        assertTrue(toString.contains("epochNo=321"));
        assertTrue(toString.contains("fees='15000'"));
        assertTrue(toString.contains("startTime=1672444800"));
        assertTrue(toString.contains("txCount=300"));
    }

    @Test
    void currentEpochInfo_EqualsAndHashCode() {
        CurrentEpochInfo current1 = new CurrentEpochInfo(150, 321, "15000", 1672444800L, 300);
        CurrentEpochInfo current2 = new CurrentEpochInfo(150, 321, "15000", 1672444800L, 300);
        CurrentEpochInfo current3 = new CurrentEpochInfo(200, 654, "20000", 1672531200L, 400);
        
        assertEquals(current1, current2);
        assertEquals(current1.hashCode(), current2.hashCode());
        assertNotEquals(current1, current3);
        assertNotEquals(current1.hashCode(), current3.hashCode());
        
        // Test reflexivity
        assertEquals(current1, current1);
        
        // Test null handling
        assertNotEquals(current1, null);
        
        // Test different class
        assertNotEquals(current1, "not a CurrentEpochInfo object");
    }

    @Test
    void currentEpochInfo_EqualsWithNullFields() {
        CurrentEpochInfo current1 = new CurrentEpochInfo();
        CurrentEpochInfo current2 = new CurrentEpochInfo();
        
        assertEquals(current1, current2);
        assertEquals(current1.hashCode(), current2.hashCode());
        
        current1.setEpochNo(123);
        assertNotEquals(current1, current2);
        
        current2.setEpochNo(123);
        assertEquals(current1, current2);
    }

    @Test
    void timestampedEpochInfo_DefaultConstructor() {
        TimestampedEpochInfo timestampedEpochInfo = new TimestampedEpochInfo();
        assertNotNull(timestampedEpochInfo);
    }

    @Test
    void timestampedCurrentEpochInfo_DefaultConstructor() {
        TimestampedCurrentEpochInfo timestampedCurrentEpochInfo = new TimestampedCurrentEpochInfo();
        assertNotNull(timestampedCurrentEpochInfo);
    }

    @Test
    void epochInfo_FieldsWithNullValues() {
        EpochInfo epochInfo = new EpochInfo();
        
        // Test setting and getting null values
        epochInfo.setActiveStake(null);
        epochInfo.setAverageReward(null);
        epochInfo.setTotalRewards(null);
        
        assertNull(epochInfo.getActiveStake());
        assertNull(epochInfo.getAverageReward());
        assertNull(epochInfo.getTotalRewards());
    }

    @Test
    void currentEpochInfo_FieldsWithNullValues() {
        CurrentEpochInfo currentEpochInfo = new CurrentEpochInfo();
        
        // Test setting and getting null values
        currentEpochInfo.setFees(null);
        
        assertNull(currentEpochInfo.getFees());
    }

    @Test
    void epochInfo_ZeroValues() {
        EpochInfo epochInfo = new EpochInfo();
        
        epochInfo.setBlkCount(0);
        epochInfo.setEpochNo(0);
        epochInfo.setTxCount(0);
        epochInfo.setStartTime(0L);
        epochInfo.setEndTime(0L);
        
        assertEquals(Integer.valueOf(0), epochInfo.getBlkCount());
        assertEquals(Integer.valueOf(0), epochInfo.getEpochNo());
        assertEquals(Integer.valueOf(0), epochInfo.getTxCount());
        assertEquals(Long.valueOf(0L), epochInfo.getStartTime());
        assertEquals(Long.valueOf(0L), epochInfo.getEndTime());
    }

    @Test
    void currentEpochInfo_ZeroValues() {
        CurrentEpochInfo currentEpochInfo = new CurrentEpochInfo();
        
        currentEpochInfo.setBlkCount(0);
        currentEpochInfo.setEpochNo(0);
        currentEpochInfo.setTxCount(0);
        currentEpochInfo.setStartTime(0L);
        
        assertEquals(Integer.valueOf(0), currentEpochInfo.getBlkCount());
        assertEquals(Integer.valueOf(0), currentEpochInfo.getEpochNo());
        assertEquals(Integer.valueOf(0), currentEpochInfo.getTxCount());
        assertEquals(Long.valueOf(0L), currentEpochInfo.getStartTime());
    }
}