package adlabs.maestro.client.backend.api.asset;

import adlabs.maestro.client.backend.api.asset.model.*;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AssetServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(AssetServiceMainnetIntegrationTest.class);

    private AssetService assetsService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        assetsService = BackendFactory.getMaestroMainnetService(apiKey).getAssetService();
    }

    @Test
    void getAssetInformationTest() throws ApiException {
        var poliyID = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff";
        var assetName = "DONTSPAM";
        var assetNameHex = "444f4e545350414d";
        var assetNameEncoded = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff.444f4e545350414d";
        var asset = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff444f4e545350414d";

        Result<TimestampedAssetInfo> assetInfoResult = assetsService.getAssetInfo(asset);
        Assertions.assertTrue(assetInfoResult.isSuccessful());
        Assertions.assertNotNull(assetInfoResult.getValue());
        log.info("getAssetInformationTest: " + assetInfoResult.getValue().toString());
    }

    @Test
    void getAssetAccountsTest() throws ApiException {
        var poliyID = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff";
        var assetName = "DONTSPAM";
        var assetNameHex = "444f4e545350414d";
        var assetNameEncoded = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff.444f4e545350414d";
        var asset = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff444f4e545350414d";

        Result<PaginatedAssetHolderAccount> assetInfoResult = assetsService.getAssetAccounts(asset, Options.EMPTY);
        Assertions.assertTrue(assetInfoResult.isSuccessful());
        Assertions.assertNotNull(assetInfoResult.getValue());
        log.info("getAssetAccountsTest: " + assetInfoResult.getValue().toString());
    }

    @Test
    void getAssetddressesTest() throws ApiException {
        var poliyID = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff";
        var assetName = "DONTSPAM";
        var assetNameHex = "444f4e545350414d";
        var assetNameEncoded = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff.444f4e545350414d";
        var asset = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff444f4e545350414d";

        Result<PaginatedAssetHolder> assetInfoResult = assetsService.getAssetAddresses(asset, Options.EMPTY);
        Assertions.assertTrue(assetInfoResult.isSuccessful());
        Assertions.assertNotNull(assetInfoResult.getValue());
        log.info("getAssetddressesTest: " + assetInfoResult.getValue().toString());
    }

    @Test
    void getAssetMintsAndBurnsTest() throws ApiException {
        var poliyID = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff";
        var assetName = "DONTSPAM";
        var assetNameHex = "444f4e545350414d";
        var assetNameEncoded = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff.444f4e545350414d";
        var asset = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff444f4e545350414d";

        Result<PaginatedMintTransaction> assetMints = assetsService.getAssetMints(asset, Options.EMPTY);
        Assertions.assertTrue(assetMints.isSuccessful());
        Assertions.assertNotNull(assetMints.getValue());
        log.info("getAssetMintsAndBurnsTest: " + assetMints.getValue().toString());
    }

    @Test
    void getAssetTransactionsTest() throws ApiException {
        var poliyID = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff";
        var assetName = "DONTSPAM";
        var assetNameHex = "444f4e545350414d";
        var assetNameEncoded = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff.444f4e545350414d";
        var asset = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff444f4e545350414d";

        Result<PaginatedTimestampedTransaction> assetMints = assetsService.getAssetTransactions(asset, Options.EMPTY);
        Assertions.assertTrue(assetMints.isSuccessful());
        Assertions.assertNotNull(assetMints.getValue());
        log.info("getAssetTransactionsTest: " + assetMints.getValue().toString());
    }

    @Test
    void getAssetUTxOsTest() throws ApiException {
        var poliyID = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff";
        var assetName = "DONTSPAM";
        var assetNameHex = "444f4e545350414d";
        var assetNameEncoded = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff.444f4e545350414d";
        var asset = "d3501d9531fcc25e3ca4b6429318c2cc374dbdbcf5e99c1c1e5da1ff444f4e545350414d";

        Result<PaginatedAssetUtxo> assetUtxos = assetsService.getAssetUtxos(asset, Options.EMPTY);
        Assertions.assertTrue(assetUtxos.isSuccessful());
        Assertions.assertNotNull(assetUtxos.getValue());
        log.info("getAssetUTxOsTest: " + assetUtxos.getValue().toString());
    }
}