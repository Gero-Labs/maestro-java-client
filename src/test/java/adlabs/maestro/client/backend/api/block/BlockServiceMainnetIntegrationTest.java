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
class BlockServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(BlockServiceMainnetIntegrationTest.class);

    private BlockService blockService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        blockService = BackendFactory.getMaestroMainnetService(apiKey).getBlockService();
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
        var blockHashOrHeight = "f6192a1aaa6d3d05b4703891a6b66cd757801c61ace86cbe5ab0d66e07f601ab";

        Result<TimestampedBlockInfo> blockSummaryResult = blockService.getBlockInfo(blockHashOrHeight);
        Assertions.assertTrue(blockSummaryResult.isSuccessful());
        Assertions.assertNotNull(blockSummaryResult.getValue());
        log.info("getBlockInformationTest: " + blockSummaryResult.getValue().toString());
    }

}