package adlabs.maestro.client.backend.api.pool.model;

import adlabs.maestro.client.backend.models.Relay;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for pool.model package classes to improve code coverage
 */
class PoolModelUnitTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void poolInfo_DefaultConstructor() {
        PoolInfo poolInfo = new PoolInfo();
        assertNotNull(poolInfo);
    }

    @Test
    void poolInfo_ParameterizedConstructor() throws Exception {
        // Setup test data
        Long activeEpochNo = 365L;
        String activeStake = "1000000000";
        Long blockCount = 100L;
        String fixedCost = "340000000";
        Long liveDelegators = 50L;
        String livePledge = "1000000000";
        String liveSaturation = "0.5";
        String liveStake = "2000000000";
        String liveStakePct = "1.5";
        String margin = "0.05";
        String metaHash = "abc123hash";
        JsonNode metaJson = objectMapper.readTree("{\"name\": \"Test Pool\", \"ticker\": \"TEST\"}");
        String metaUrl = "https://test.pool/metadata.json";
        Long opCertCounter = 1L;
        List<String> owners = Arrays.asList("stake1owner1", "stake1owner2");
        String pledge = "1000000000";
        String poolIdBech32 = "pool1test123";
        String poolIdHex = "abcdef123456";
        String poolStatus = "active";
        List<Relay> relays = Arrays.asList(
            new Relay("relay1.test.com", null, null, 3001, null),
            new Relay("relay2.test.com", null, null, 3002, null)
        );
        Long retiringEpoch = null;
        String rewardAddr = "stake1reward123";
        String sigma = "0.001";
        String vrfKeyHash = "vrf123hash";

        PoolInfo poolInfo = new PoolInfo(activeEpochNo, activeStake, blockCount, fixedCost, liveDelegators,
                livePledge, liveSaturation, liveStake, liveStakePct, margin, metaHash, metaJson, metaUrl,
                opCertCounter, owners, pledge, poolIdBech32, poolIdHex, poolStatus, relays, retiringEpoch,
                rewardAddr, sigma, vrfKeyHash);

        assertEquals(activeEpochNo, poolInfo.getActiveEpochNo());
        assertEquals(activeStake, poolInfo.getActiveStake());
        assertEquals(blockCount, poolInfo.getBlockCount());
        assertEquals(fixedCost, poolInfo.getFixedCost());
        assertEquals(liveDelegators, poolInfo.getLiveDelegators());
        assertEquals(livePledge, poolInfo.getLivePledge());
        assertEquals(liveSaturation, poolInfo.getLiveSaturation());
        assertEquals(liveStake, poolInfo.getLiveStake());
        assertEquals(liveStakePct, poolInfo.getLiveStakePct());
        assertEquals(margin, poolInfo.getMargin());
        assertEquals(metaHash, poolInfo.getMetaHash());
        assertEquals(metaJson, poolInfo.getMetaJson());
        assertEquals(metaUrl, poolInfo.getMetaUrl());
        assertEquals(opCertCounter, poolInfo.getOpCertCounter());
        assertEquals(owners, poolInfo.getOwners());
        assertEquals(pledge, poolInfo.getPledge());
        assertEquals(poolIdBech32, poolInfo.getPoolIdBech32());
        assertEquals(poolIdHex, poolInfo.getPoolIdHex());
        assertEquals(poolStatus, poolInfo.getPoolStatus());
        assertEquals(relays, poolInfo.getRelays());
        assertEquals(retiringEpoch, poolInfo.getRetiringEpoch());
        assertEquals(rewardAddr, poolInfo.getRewardAddr());
        assertEquals(sigma, poolInfo.getSigma());
        assertEquals(vrfKeyHash, poolInfo.getVrfKeyHash());
    }

    @Test
    void poolInfo_GettersSetters() throws Exception {
        PoolInfo poolInfo = new PoolInfo();

        Long activeEpochNo = 400L;
        String activeStake = "5000000000";
        Long blockCount = 200L;
        String fixedCost = "340000000";
        Long liveDelegators = 75L;
        String livePledge = "2000000000";
        String liveSaturation = "0.8";
        String liveStake = "6000000000";
        String liveStakePct = "2.0";
        String margin = "0.03";
        String metaHash = "def456hash";
        JsonNode metaJson = objectMapper.readTree("{\"name\": \"Another Pool\", \"ticker\": \"ANOT\"}");
        String metaUrl = "https://another.pool/metadata.json";
        Long opCertCounter = 5L;
        List<String> owners = Arrays.asList("stake1owner3");
        String pledge = "2000000000";
        String poolIdBech32 = "pool1another456";
        String poolIdHex = "fedcba654321";
        String poolStatus = "retiring";
        List<Relay> relays = Arrays.asList(new Relay("relay.another.com", null, null, 3003, null));
        Long retiringEpoch = 450L;
        String rewardAddr = "stake1reward456";
        String sigma = "0.002";
        String vrfKeyHash = "vrf456hash";

        // Set all values
        poolInfo.setActiveEpochNo(activeEpochNo);
        poolInfo.setActiveStake(activeStake);
        poolInfo.setBlockCount(blockCount);
        poolInfo.setFixedCost(fixedCost);
        poolInfo.setLiveDelegators(liveDelegators);
        poolInfo.setLivePledge(livePledge);
        poolInfo.setLiveSaturation(liveSaturation);
        poolInfo.setLiveStake(liveStake);
        poolInfo.setLiveStakePct(liveStakePct);
        poolInfo.setMargin(margin);
        poolInfo.setMetaHash(metaHash);
        poolInfo.setMetaJson(metaJson);
        poolInfo.setMetaUrl(metaUrl);
        poolInfo.setOpCertCounter(opCertCounter);
        poolInfo.setOwners(owners);
        poolInfo.setPledge(pledge);
        poolInfo.setPoolIdBech32(poolIdBech32);
        poolInfo.setPoolIdHex(poolIdHex);
        poolInfo.setPoolStatus(poolStatus);
        poolInfo.setRelays(relays);
        poolInfo.setRetiringEpoch(retiringEpoch);
        poolInfo.setRewardAddr(rewardAddr);
        poolInfo.setSigma(sigma);
        poolInfo.setVrfKeyHash(vrfKeyHash);

        // Verify all values
        assertEquals(activeEpochNo, poolInfo.getActiveEpochNo());
        assertEquals(activeStake, poolInfo.getActiveStake());
        assertEquals(blockCount, poolInfo.getBlockCount());
        assertEquals(fixedCost, poolInfo.getFixedCost());
        assertEquals(liveDelegators, poolInfo.getLiveDelegators());
        assertEquals(livePledge, poolInfo.getLivePledge());
        assertEquals(liveSaturation, poolInfo.getLiveSaturation());
        assertEquals(liveStake, poolInfo.getLiveStake());
        assertEquals(liveStakePct, poolInfo.getLiveStakePct());
        assertEquals(margin, poolInfo.getMargin());
        assertEquals(metaHash, poolInfo.getMetaHash());
        assertEquals(metaJson, poolInfo.getMetaJson());
        assertEquals(metaUrl, poolInfo.getMetaUrl());
        assertEquals(opCertCounter, poolInfo.getOpCertCounter());
        assertEquals(owners, poolInfo.getOwners());
        assertEquals(pledge, poolInfo.getPledge());
        assertEquals(poolIdBech32, poolInfo.getPoolIdBech32());
        assertEquals(poolIdHex, poolInfo.getPoolIdHex());
        assertEquals(poolStatus, poolInfo.getPoolStatus());
        assertEquals(relays, poolInfo.getRelays());
        assertEquals(retiringEpoch, poolInfo.getRetiringEpoch());
        assertEquals(rewardAddr, poolInfo.getRewardAddr());
        assertEquals(sigma, poolInfo.getSigma());
        assertEquals(vrfKeyHash, poolInfo.getVrfKeyHash());
    }

    @Test
    void poolInfo_ToString() {
        PoolInfo poolInfo = new PoolInfo();
        poolInfo.setActiveEpochNo(365L);
        poolInfo.setActiveStake("1000000000");
        poolInfo.setPoolIdBech32("pool1test123");

        String toString = poolInfo.toString();
        assertTrue(toString.contains("PoolInfo{"));
        assertTrue(toString.contains("activeEpochNo=365"));
        assertTrue(toString.contains("activeStake='1000000000'"));
        assertTrue(toString.contains("poolIdBech32='pool1test123'"));
    }

    @Test
    void poolInfo_EqualsAndHashCode() throws Exception {
        JsonNode metaJson = objectMapper.readTree("{\"name\": \"Test Pool\"}");
        List<String> owners = Arrays.asList("stake1owner1");
        List<Relay> relays = Arrays.asList(new Relay("relay.test.com", null, null, 3001, null));

        PoolInfo poolInfo1 = new PoolInfo();
        poolInfo1.setActiveEpochNo(365L);
        poolInfo1.setActiveStake("1000000000");
        poolInfo1.setPoolIdBech32("pool1test123");
        poolInfo1.setMetaJson(metaJson);
        poolInfo1.setOwners(owners);
        poolInfo1.setRelays(relays);

        PoolInfo poolInfo2 = new PoolInfo();
        poolInfo2.setActiveEpochNo(365L);
        poolInfo2.setActiveStake("1000000000");
        poolInfo2.setPoolIdBech32("pool1test123");
        poolInfo2.setMetaJson(metaJson);
        poolInfo2.setOwners(owners);
        poolInfo2.setRelays(relays);

        PoolInfo poolInfo3 = new PoolInfo();
        poolInfo3.setActiveEpochNo(400L);
        poolInfo3.setActiveStake("2000000000");
        poolInfo3.setPoolIdBech32("pool1different456");

        // Test equality
        assertEquals(poolInfo1, poolInfo2);
        assertEquals(poolInfo1.hashCode(), poolInfo2.hashCode());
        assertNotEquals(poolInfo1, poolInfo3);
        assertNotEquals(poolInfo1.hashCode(), poolInfo3.hashCode());

        // Test reflexivity
        assertEquals(poolInfo1, poolInfo1);

        // Test null handling
        assertNotEquals(poolInfo1, null);

        // Test different class
        assertNotEquals(poolInfo1, "not a PoolInfo object");
    }

    @Test
    void poolListInfo_DefaultConstructor() {
        PoolListInfo poolListInfo = new PoolListInfo();
        assertNotNull(poolListInfo);
    }

    @Test
    void poolListInfo_GettersSetters() {
        PoolListInfo poolListInfo = new PoolListInfo();

        String poolIdBech32 = "pool1test123";
        String ticker = "TEST";

        poolListInfo.setPoolIdBech32(poolIdBech32);
        poolListInfo.setTicker(ticker);

        assertEquals(poolIdBech32, poolListInfo.getPoolIdBech32());
        assertEquals(ticker, poolListInfo.getTicker());
    }

    @Test
    void poolListInfo_ToString() {
        PoolListInfo poolListInfo = new PoolListInfo();
        poolListInfo.setPoolIdBech32("pool1test123");
        poolListInfo.setTicker("TEST");

        String toString = poolListInfo.toString();
        assertNotNull(toString);
        assertTrue(toString.contains("PoolListInfo") || toString.contains("pool1test123") || toString.contains("TEST"));
    }

    @Test
    void poolListInfo_EqualsAndHashCode() {
        PoolListInfo poolListInfo1 = new PoolListInfo();
        poolListInfo1.setPoolIdBech32("pool1test123");
        poolListInfo1.setTicker("TEST");

        PoolListInfo poolListInfo2 = new PoolListInfo();
        poolListInfo2.setPoolIdBech32("pool1test123");
        poolListInfo2.setTicker("TEST");

        PoolListInfo poolListInfo3 = new PoolListInfo();
        poolListInfo3.setPoolIdBech32("pool1different456");
        poolListInfo3.setTicker("DIFF");

        // Test equality
        assertEquals(poolListInfo1, poolListInfo2);
        assertEquals(poolListInfo1.hashCode(), poolListInfo2.hashCode());
        assertNotEquals(poolListInfo1, poolListInfo3);

        // Test reflexivity
        assertEquals(poolListInfo1, poolListInfo1);

        // Test null handling
        assertNotEquals(poolListInfo1, null);

        // Test different class
        assertNotEquals(poolListInfo1, "not a PoolListInfo object");
    }

    @Test
    void poolMetaJson_DefaultConstructor() {
        PoolMetaJson poolMetaJson = new PoolMetaJson();
        assertNotNull(poolMetaJson);
    }

    @Test
    void poolMetadata_DefaultConstructor() {
        PoolMetadata poolMetadata = new PoolMetadata();
        assertNotNull(poolMetadata);
    }

    @Test
    void poolRelay_DefaultConstructor() {
        PoolRelay poolRelay = new PoolRelay();
        assertNotNull(poolRelay);
    }

    @Test
    void poolUpdate_DefaultConstructor() {
        PoolUpdate poolUpdate = new PoolUpdate();
        assertNotNull(poolUpdate);
    }

    @Test
    void poolHistory_DefaultConstructor() {
        PoolHistory poolHistory = new PoolHistory();
        assertNotNull(poolHistory);
    }

    @Test
    void poolBlock_DefaultConstructor() {
        PoolBlock poolBlock = new PoolBlock();
        assertNotNull(poolBlock);
    }

    @Test
    void delegatorInfo_DefaultConstructor() {
        DelegatorInfo delegatorInfo = new DelegatorInfo();
        assertNotNull(delegatorInfo);
    }

    @Test
    void historicalDelegatorInfo_DefaultConstructor() {
        HistoricalDelegatorInfo historicalDelegatorInfo = new HistoricalDelegatorInfo();
        assertNotNull(historicalDelegatorInfo);
    }

    @Test
    void timestampedPoolInfo_DefaultConstructor() {
        TimestampedPoolInfo timestampedPoolInfo = new TimestampedPoolInfo();
        assertNotNull(timestampedPoolInfo);
    }

    @Test
    void timestampedPoolMetadata_DefaultConstructor() {
        TimestampedPoolMetadata timestampedPoolMetadata = new TimestampedPoolMetadata();
        assertNotNull(timestampedPoolMetadata);
    }

    @Test
    void timestampedPoolRelays_DefaultConstructor() {
        TimestampedPoolRelays timestampedPoolRelays = new TimestampedPoolRelays();
        assertNotNull(timestampedPoolRelays);
    }

    @Test
    void timestampedPoolUpdates_DefaultConstructor() {
        TimestampedPoolUpdates timestampedPoolUpdates = new TimestampedPoolUpdates();
        assertNotNull(timestampedPoolUpdates);
    }

    // Paginated classes
    @Test
    void paginatedPoolListInfo_DefaultConstructor() {
        PaginatedPoolListInfo paginatedPoolListInfo = new PaginatedPoolListInfo();
        assertNotNull(paginatedPoolListInfo);
    }

    @Test
    void paginatedPoolHistory_DefaultConstructor() {
        PaginatedPoolHistory paginatedPoolHistory = new PaginatedPoolHistory();
        assertNotNull(paginatedPoolHistory);
    }

    @Test
    void paginatedPoolBlock_DefaultConstructor() {
        PaginatedPoolBlock paginatedPoolBlock = new PaginatedPoolBlock();
        assertNotNull(paginatedPoolBlock);
    }

    @Test
    void paginatedDelegatorInfo_DefaultConstructor() {
        PaginatedDelegatorInfo paginatedDelegatorInfo = new PaginatedDelegatorInfo();
        assertNotNull(paginatedDelegatorInfo);
    }

    @Test
    void paginatedHistoricalDelegatorInfo_DefaultConstructor() {
        PaginatedHistoricalDelegatorInfo paginatedHistoricalDelegatorInfo = new PaginatedHistoricalDelegatorInfo();
        assertNotNull(paginatedHistoricalDelegatorInfo);
    }

    @Test
    void poolInfo_WithNullValues() {
        PoolInfo poolInfo = new PoolInfo();
        
        // Set some non-null required fields
        poolInfo.setActiveEpochNo(365L);
        poolInfo.setActiveStake("1000000000");
        poolInfo.setFixedCost("340000000");
        poolInfo.setLiveDelegators(50L);
        poolInfo.setLivePledge("1000000000");
        poolInfo.setLiveStake("2000000000");
        poolInfo.setLiveStakePct("1.5");
        poolInfo.setMargin("0.05");
        poolInfo.setOpCertCounter(1L);
        poolInfo.setOwners(Arrays.asList("stake1owner1"));
        poolInfo.setPledge("1000000000");
        poolInfo.setPoolIdBech32("pool1test123");
        poolInfo.setPoolIdHex("abcdef123456");
        poolInfo.setPoolStatus("active");
        poolInfo.setRelays(Arrays.asList(new Relay("relay.test.com", null, null, 3001, null)));
        poolInfo.setRewardAddr("stake1reward123");
        poolInfo.setSigma("0.001");
        poolInfo.setVrfKeyHash("vrf123hash");
        
        // Set nullable fields to null
        poolInfo.setBlockCount(null);
        poolInfo.setLiveSaturation(null);
        poolInfo.setMetaHash(null);
        poolInfo.setMetaJson(null);
        poolInfo.setMetaUrl(null);
        poolInfo.setRetiringEpoch(null);
        
        // Verify nullable fields
        assertNull(poolInfo.getBlockCount());
        assertNull(poolInfo.getLiveSaturation());
        assertNull(poolInfo.getMetaHash());
        assertNull(poolInfo.getMetaJson());
        assertNull(poolInfo.getMetaUrl());
        assertNull(poolInfo.getRetiringEpoch());
        
        // Verify toString handles null values
        String toString = poolInfo.toString();
        assertTrue(toString.contains("PoolInfo{"));
        assertNotNull(toString);
    }

    @Test
    void poolListInfo_WithNullTicker() {  
        PoolListInfo poolListInfo = new PoolListInfo();
        poolListInfo.setPoolIdBech32("pool1test123");
        poolListInfo.setTicker(null);
        
        assertEquals("pool1test123", poolListInfo.getPoolIdBech32());
        assertNull(poolListInfo.getTicker());
        
        // Ensure toString handles null values properly
        String toString = poolListInfo.toString();
        assertNotNull(toString);
    }

    @Test
    void poolInfo_EqualsWithDifferentValues() throws Exception {
        JsonNode metaJson1 = objectMapper.readTree("{\"name\": \"Pool A\"}");
        JsonNode metaJson2 = objectMapper.readTree("{\"name\": \"Pool B\"}");

        PoolInfo poolInfo1 = new PoolInfo();
        poolInfo1.setActiveEpochNo(365L);
        poolInfo1.setMetaJson(metaJson1);

        PoolInfo poolInfo2 = new PoolInfo();
        poolInfo2.setActiveEpochNo(365L);
        poolInfo2.setMetaJson(metaJson2);

        assertNotEquals(poolInfo1, poolInfo2);
        assertNotEquals(poolInfo1.hashCode(), poolInfo2.hashCode());
    }

    @Test
    void poolInfo_EqualsWithNullFields() {
        PoolInfo poolInfo1 = new PoolInfo();
        poolInfo1.setActiveEpochNo(null);
        poolInfo1.setMetaJson(null);

        PoolInfo poolInfo2 = new PoolInfo();
        poolInfo2.setActiveEpochNo(null);
        poolInfo2.setMetaJson(null);

        assertEquals(poolInfo1, poolInfo2);
        assertEquals(poolInfo1.hashCode(), poolInfo2.hashCode());
    }
}