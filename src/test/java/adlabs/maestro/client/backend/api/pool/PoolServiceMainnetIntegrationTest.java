package adlabs.maestro.client.backend.api.pool;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.pool.model.*;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PoolServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(PoolServiceMainnetIntegrationTest.class);

    private PoolService poolService;
    private final String poolId = "pool100wj94uzf54vup2hdzk0afng4dhjaqggt7j434mtgm8v2gfvfgp";

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        poolService = BackendFactory.getMaestroMainnetService(apiKey).getPoolService();
    }

    @Test
    void getPoolListTest() throws ApiException {
        Result<PaginatedPoolListInfo> poolsListResult = poolService.getPoolList(Options.EMPTY);
        assertTrue(poolsListResult.isSuccessful());
        assertNotNull(poolsListResult.getValue());
        log.info("getPoolListTest: " + poolsListResult.getValue().toString());
    }

    @Test
    void getPoolBlocksTest() throws ApiException {
        Result<PaginatedPoolBlock> poolBlocksResult = poolService.getPoolBlocks(poolId, Options.EMPTY);
        assertTrue(poolBlocksResult.isSuccessful());
        assertNotNull(poolBlocksResult.getValue());
        log.info("getPoolBlocksTest: " + poolBlocksResult.getValue().toString());
    }

    @Test
    void getPoolDelegatorsTest() throws ApiException {
        Result<PaginatedDelegatorInfo> poolDelegatorsResult = poolService.getPoolDelegators(poolId, Options.EMPTY);
        assertTrue(poolDelegatorsResult.isSuccessful());
        assertNotNull(poolDelegatorsResult.getValue());
        log.info("getPoolDelegatorsTest: " + poolDelegatorsResult.getValue().toString());
    }

    @Test
    void getPoolDelegatorHistoryTest() throws ApiException {
        int epochNo = 257;
        Result<PaginatedHistoricalDelegatorInfo> delegatorHistoryResult = poolService.getPoolDelegatorHistory(poolId, epochNo, Options.EMPTY);
        assertTrue(delegatorHistoryResult.isSuccessful());
        assertNotNull(delegatorHistoryResult.getValue());
        log.info("getPoolDelegatorHistoryTest: " + delegatorHistoryResult.getValue().toString());

    }

    @Test
    void getPoolHistoryTest() throws ApiException {
        Result<PaginatedPoolHistory> poolHistoryResult = poolService.getPoolHistory(poolId, Options.EMPTY);
        assertTrue(poolHistoryResult.isSuccessful());
        assertNotNull(poolHistoryResult.getValue());
        log.info("getPoolHistoryTest: " + poolHistoryResult.getValue().toString());
    }

    @Test
    void getPoolInfoTest() throws ApiException {
        Result<TimestampedPoolInfo> poolInfoResult = poolService.getPoolInfo(poolId);
        assertTrue(poolInfoResult.isSuccessful());
        assertNotNull(poolInfoResult.getValue());
        log.info("getPoolInfoTest: " + poolInfoResult.getValue().toString());
    }

    @Test
    void getPoolMetadataTest() throws ApiException {
        Result<TimestampedPoolMetadata> poolMetadataResult = poolService.getPoolMetadata(poolId);
        assertTrue(poolMetadataResult.isSuccessful());
        assertNotNull(poolMetadataResult.getValue());
        log.info("getPoolMetadataTest: " + poolMetadataResult.getValue().toString());
    }

    @Test
    void getPoolRelaysTest() throws ApiException {
        Result<TimestampedPoolRelays> poolRelaysResult = poolService.getPoolRelays(poolId);
        assertTrue(poolRelaysResult.isSuccessful());
        assertNotNull(poolRelaysResult.getValue());
        log.info("getPoolRelaysTest: " + poolRelaysResult.getValue().toString());
    }

    @Test
    void getPoolUpdatesTest() throws ApiException {
        Result<TimestampedPoolUpdates> poolUpdatesResult = poolService.getPoolUpdates(poolId);
        assertTrue(poolUpdatesResult.isSuccessful());
        assertNotNull(poolUpdatesResult.getValue());
        log.info("getPoolUpdatesTest: " + poolUpdatesResult.getValue().toString());
    }
}