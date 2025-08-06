package adlabs.maestro.client.backend.api.datum;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatum;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatumMap;
import adlabs.maestro.client.backend.factory.BackendFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DatumServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(DatumServicePreprodIntegrationTest.class);

    private DatumService datumService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        datumService = BackendFactory.getMaestroPreprodService(apiKey).getDatumService();
    }

    @Test
    void getDatumByHashTest() throws ApiException {
        var datumHash = "5571e2c3549f15934a38382d1318707a86751fb70827f4cbd29b104480f1be9b";

        Result<TimestampedDatum> datumByHashResult = datumService.getDatumByHash(datumHash);
        Assertions.assertTrue(datumByHashResult.isSuccessful());
        Assertions.assertNotNull(datumByHashResult.getValue());
        log.info("getDatumByHashTest: " + datumByHashResult.getValue().toString());
    }

    @Test
    void getDatumsByHashesTest() throws ApiException {
        var datumHashes = List.of("5571e2c3549f15934a38382d1318707a86751fb70827f4cbd29b104480f1be9b");

        Result<TimestampedDatumMap> datumByHashResult = datumService.getDatumsByHashes(datumHashes);
        Assertions.assertTrue(datumByHashResult.isSuccessful());
        Assertions.assertNotNull(datumByHashResult.getValue());
        log.info("getDatumsByHashesTest: " + datumByHashResult.getValue().toString());
    }

}
