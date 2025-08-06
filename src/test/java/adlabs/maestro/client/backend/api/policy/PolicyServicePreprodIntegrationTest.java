package adlabs.maestro.client.backend.api.policy;

import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetInfoConcise;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.policy.model.*;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PolicyServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(PolicyServicePreprodIntegrationTest.class);

    private PolicyService policyService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_PREPROD_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_PREPROD_API_KEY environment variable is not set. Please set it before running tests.");
        }
        policyService = BackendFactory.getMaestroPreprodService(apiKey).getPolicyService();
    }

    @Test
    void getPolicyAccountsTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<PaginatedPolicyHolderAccount> result = policyService.getPolicyAccounts(policyID, Options.EMPTY);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyAccountsTest: " + result.getValue().toString());
    }

    @Test
    void getPolicyAddressesTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<PaginatedPolicyHolder> result = policyService.getPolicyAddresses(policyID, Options.EMPTY);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyAddressesTest: " + result.getValue().toString());
    }

    @Test
    void getPolicyAssetsTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<PaginatedAssetInfoConcise> result = policyService.getPolicyAssets(policyID, Options.EMPTY);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyAssetsTest: " + result.getValue().toString());
    }

    @Test
    void getPolicyInfoTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<TimestampedPolicyInfo> result = policyService.getPolicyInfo(policyID);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyInfoTest: " + result.getValue().toString());
    }

    @Test
    void getPolicyMintsTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<PaginatedPolicyMintTransaction> result = policyService.getPolicyMints(policyID, Options.EMPTY);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyMintsTest: " + result.getValue().toString());
    }

    @Test
    void getPolicyTxsTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<PaginatedPolicyTransaction> result = policyService.getPolicyTxs(policyID, Options.EMPTY);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyTxsTest: " + result.getValue().toString());
    }

    @Test
    void getPolicyUtxosTest() throws ApiException {
        var policyID = "2c5fdca5caed1095d077cb23b49ccb170c3be4245915ec169c5c57a5";
        Result<PaginatedPolicyUtxo> result = policyService.getPolicyUtxos(policyID, Options.EMPTY);
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info("getPolicyUtxosTest: " + result.getValue().toString());
    }
}