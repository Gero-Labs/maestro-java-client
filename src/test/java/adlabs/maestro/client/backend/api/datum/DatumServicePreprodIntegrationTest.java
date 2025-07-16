package adlabs.maestro.client.backend.api.datum;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatum;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatumMap;
import adlabs.maestro.client.backend.factory.BackendFactory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DatumServicePreprodIntegrationTest {

    private DatumService datumService;

    @BeforeAll
    public void setup() {
        datumService = BackendFactory.getMaestroPreprodService().getDatumService();
    }

    @Test
    void getDatumByHashTest() throws ApiException {
        var datumHash = "20d17e4efe25eaa6bc92d7349abd33fc4a6866b6546db02844349bf0effaa66a";

        Result<TimestampedDatum> datumByHashResult = datumService.getDatumByHash(datumHash);
        Assertions.assertTrue(datumByHashResult.isSuccessful());
        Assertions.assertNotNull(datumByHashResult.getValue());
        log.info(datumByHashResult.getValue().toString());
    }

    @Test
    void getDatumsByHashesTest() throws ApiException {
        var datumHashes = List.of("20d17e4efe25eaa6bc92d7349abd33fc4a6866b6546db02844349bf0effaa66a");

        Result<TimestampedDatumMap> datumByHashResult = datumService.getDatumsByHashes(datumHashes);
        Assertions.assertTrue(datumByHashResult.isSuccessful());
        Assertions.assertNotNull(datumByHashResult.getValue());
        log.info(datumByHashResult.getValue().toString());
    }

}
