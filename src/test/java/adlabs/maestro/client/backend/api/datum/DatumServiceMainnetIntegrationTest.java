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
class DatumServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(DatumServiceMainnetIntegrationTest.class);

    private DatumService datumService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        datumService = BackendFactory.getMaestroMainnetService(apiKey).getDatumService();
    }

    @Test
    void getDatumByHashTest() throws ApiException {
        var datumHash = "818ee3db3bbbd04f9f2ce21778cac3ac605802a4fcb00c8b3a58ee2dafc17d46";

        Result<TimestampedDatum> datumByHashResult = datumService.getDatumByHash(datumHash);
        Assertions.assertTrue(datumByHashResult.isSuccessful());
        Assertions.assertNotNull(datumByHashResult.getValue());
        log.info("getDatumByHashTest: " + datumByHashResult.getValue().toString());
    }

    @Test
    void getDatumsByHashesTest() throws ApiException {
        var datumHashes = List.of("818ee3db3bbbd04f9f2ce21778cac3ac605802a4fcb00c8b3a58ee2dafc17d46");

        Result<TimestampedDatumMap> datumByHashResult = datumService.getDatumsByHashes(datumHashes);
        Assertions.assertTrue(datumByHashResult.isSuccessful());
        Assertions.assertNotNull(datumByHashResult.getValue());
        log.info("getDatumsByHashesTest: " + datumByHashResult.getValue().toString());
    }

}