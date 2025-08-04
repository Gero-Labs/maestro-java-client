package adlabs.maestro.client.backend.api.script;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.script.model.TimestampedScriptFirstSeen;
import adlabs.maestro.client.backend.factory.BackendFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ScriptServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(ScriptServicePreprodIntegrationTest.class);

    private ScriptsService scriptsService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        scriptsService = BackendFactory.getMaestroPreprodService(apiKey).getScriptsService();
    }

    @Test
    void getScriptInformationTest() throws ApiException {
        String scriptHash = "a8e9f8f34fd631b1d5b9f41a90f4abc0d3935cea7baba0bb34c96f59";
        Result<TimestampedScriptFirstSeen> scriptInformationResult = scriptsService.getScriptByHash(scriptHash);
        Assertions.assertTrue(scriptInformationResult.isSuccessful());
        Assertions.assertNotNull(scriptInformationResult.getValue());
        log.info(scriptInformationResult.getValue().toString());
    }

}