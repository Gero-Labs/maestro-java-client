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
class AssetServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(AssetServicePreprodIntegrationTest.class);

    private AssetService assetsService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        assetsService = BackendFactory.getMaestroPreprodService(apiKey).getAssetService();
    }

    @Test
    void getAssetInformationTest() throws ApiException {
        var poliyID = "2190ed7899ceac9eb013f0f9912126ee20e9a5440d92fe6e28a8edc5";
        var assetName = "Sr_1752478720485";
        var assetNameHex = "53725f31373532343738373230343835";
        var assetNameEncoded = "2190ed7899ceac9eb013f0f9912126ee20e9a5440d92fe6e28a8edc5.53725f31373532343738373230343835";
        var asset = "2190ed7899ceac9eb013f0f9912126ee20e9a5440d92fe6e28a8edc553725f31373532343738373230343835";

        Result<TimestampedAssetInfo> assetInfoResult = assetsService.getAssetInfo(asset);
        Assertions.assertTrue(assetInfoResult.isSuccessful());
        Assertions.assertNotNull(assetInfoResult.getValue());
        log.info(assetInfoResult.getValue().toString());
    }

    @Test
    void getAssetAccountsTest() throws ApiException {
        var poliyID = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";
        var assetName = "LUCY";
        var assetNameHex = "4c554359";
        var assetNameEncoded = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e4.4c554359";
        var asset = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";

        Result<PaginatedAssetHolderAccount> assetInfoResult = assetsService.getAssetAccounts(asset, Options.EMPTY);
        Assertions.assertTrue(assetInfoResult.isSuccessful());
        Assertions.assertNotNull(assetInfoResult.getValue());
        log.info(assetInfoResult.getValue().toString());
    }

    @Test
    void getAssetddressesTest() throws ApiException {
        var poliyID = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";
        var assetName = "LUCY";
        var assetNameHex = "4c554359";
        var assetNameEncoded = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e4.4c554359";
        var asset = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";

        Result<PaginatedAssetHolder> assetInfoResult = assetsService.getAssetAddresses(asset, Options.EMPTY);
        Assertions.assertTrue(assetInfoResult.isSuccessful());
        Assertions.assertNotNull(assetInfoResult.getValue());
        log.info(assetInfoResult.getValue().toString());
    }

    @Test
    void getAssetMintsAndBurnsTest() throws ApiException {
        var poliyID = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";
        var assetName = "LUCY";
        var assetNameHex = "4c554359";
        var assetNameEncoded = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e4.4c554359";
        var asset = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";

        Result<PaginatedMintTransaction> assetMints = assetsService.getAssetMints(asset, Options.EMPTY);
        Assertions.assertTrue(assetMints.isSuccessful());
        Assertions.assertNotNull(assetMints.getValue());
        log.info(assetMints.getValue().toString());
    }

    @Test
    void getAssetTransactionsTest() throws ApiException {
        var poliyID = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";
        var assetName = "LUCY";
        var assetNameHex = "4c554359";
        var assetNameEncoded = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e4.4c554359";
        var asset = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";

        Result<PaginatedTimestampedTransaction> assetMints = assetsService.getAssetTransactions(asset, Options.EMPTY);
        Assertions.assertTrue(assetMints.isSuccessful());
        Assertions.assertNotNull(assetMints.getValue());
        log.info(assetMints.getValue().toString());
    }

    @Test
    void getAssetUTxOsTest() throws ApiException {
        var poliyID = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";
        var assetName = "LUCY";
        var assetNameHex = "4c554359";
        var assetNameEncoded = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e4.4c554359";
        var asset = "07cceab5ea30fd508ab7cb79fb14a6640ae183aa0bc110f73b4c51e44c554359";

        Result<PaginatedAssetUtxo> assetUtxos = assetsService.getAssetUtxos(asset, Options.EMPTY);
        Assertions.assertTrue(assetUtxos.isSuccessful());
        Assertions.assertNotNull(assetUtxos.getValue());
        log.info(assetUtxos.getValue().toString());
    }
}
