package adlabs.maestro.client.backend.api.general;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.general.model.TimestampedChainTip;
import adlabs.maestro.client.backend.api.general.model.TimestampedEraSummaries;
import adlabs.maestro.client.backend.api.general.model.TimestampedProtocolParameters;
import adlabs.maestro.client.backend.api.general.model.TimestampedSystemStart;
import adlabs.maestro.client.backend.factory.BackendFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GeneralServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(GeneralServicePreprodIntegrationTest.class);

    private GeneralService generalService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_PREPROD_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_PREPROD_API_KEY environment variable is not set. Please set it before running tests.");
        }
        generalService = BackendFactory.getMaestroPreprodService(apiKey).getGeneralService();
    }


    @Test
    void getChainTipTest() throws ApiException {
        Result<TimestampedChainTip> chainTipResult = generalService.getChainTip();
        assertTrue(chainTipResult.isSuccessful());
        assertNotNull(chainTipResult.getValue());
        log.info("getChainTipTest: " + chainTipResult.getValue().toString());
    }

    @Test
    void getEraSummariesTest() throws ApiException {
        Result<TimestampedEraSummaries> eraSummariesResult = generalService.getEraSummaries();
        assertTrue(eraSummariesResult.isSuccessful());
        assertNotNull(eraSummariesResult.getValue());
        log.info("getEraSummariesTest: " + eraSummariesResult.getValue().toString());
    }

    @Test
    void getProtocolParametersTest() throws ApiException {
        Result<TimestampedProtocolParameters> protocolParametersResult = generalService.getProtocolParameters();
        assertTrue(protocolParametersResult.isSuccessful());
        assertNotNull(protocolParametersResult.getValue());
        log.info("getProtocolParametersTest: " + protocolParametersResult.getValue().toString());
    }

    @Test
    void getSystemStartTest() throws ApiException {
        Result<TimestampedSystemStart> systemStartResult = generalService.getSystemStart();
        assertTrue(systemStartResult.isSuccessful());
        assertNotNull(systemStartResult.getValue());
        log.info("getSystemStartTest: " + systemStartResult.getValue().toString());
    }

}