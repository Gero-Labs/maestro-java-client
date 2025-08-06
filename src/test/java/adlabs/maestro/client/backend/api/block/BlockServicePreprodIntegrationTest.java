package adlabs.maestro.client.backend.api.block;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.block.model.TimestampedBlockInfo;
import adlabs.maestro.client.backend.factory.BackendFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BlockServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(BlockServicePreprodIntegrationTest.class);

    private BlockService blockService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_PREPROD_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_PREPROD_API_KEY environment variable is not set. Please set it before running tests.");
        }
        blockService = BackendFactory.getMaestroPreprodService(apiKey).getBlockService();
    }

    @Test
    void getLatestBlockTest() throws ApiException {

        Result<TimestampedBlockInfo> latestBlockResult = blockService.getLatestBlock();
        Assertions.assertTrue(latestBlockResult.isSuccessful());
        Assertions.assertNotNull(latestBlockResult.getValue());
        log.info("getLatestBlockTest: " + latestBlockResult.getValue().toString());
    }

    @Test
    void getBlockInformationTest() throws ApiException {
        var blockHashOrHeight = "20d17e4efe25eaa6bc92d7349abd33fc4a6866b6546db02844349bf0effaa66a";

        Result<TimestampedBlockInfo> blockSummaryResult = blockService.getBlockInfo(blockHashOrHeight);
        Assertions.assertTrue(blockSummaryResult.isSuccessful());
        Assertions.assertNotNull(blockSummaryResult.getValue());
        log.info("getBlockInformationTest: " + blockSummaryResult.getValue().toString());
    }

}
