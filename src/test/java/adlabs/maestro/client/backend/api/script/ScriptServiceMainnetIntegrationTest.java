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
class ScriptServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(ScriptServiceMainnetIntegrationTest.class);

    private ScriptsService scriptsService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        scriptsService = BackendFactory.getMaestroMainnetService(apiKey).getScriptsService();
    }

    @Test
    void getScriptInformationTest() throws ApiException {
        String scriptHash = "d8480dc869b94b80e81ec91b0abe307279311fe0e7001a9488f61ff8";
        Result<TimestampedScriptFirstSeen> scriptInformationResult = scriptsService.getScriptByHash(scriptHash);
        Assertions.assertTrue(scriptInformationResult.isSuccessful());
        Assertions.assertNotNull(scriptInformationResult.getValue());
        log.info("getScriptInformationTest: " + scriptInformationResult.getValue().toString());
    }

}