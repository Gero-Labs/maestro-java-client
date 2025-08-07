package adlabs.maestro.client.backend.api.account;

import adlabs.maestro.client.backend.api.account.model.*;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddress;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
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

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(AccountServiceMainnetIntegrationTest.class);

    private AccountService  accountService;
    private String stakeAddress;
    private String badAddress;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        accountService = BackendFactory.getMaestroMainnetService(apiKey).getAccountService();
        stakeAddress = "stake1u8yxtugdv63wxafy9d00nuz6hjyyp4qnggvc9a3vxh8yl0ckml2uz";
        badAddress = "addr1234";
    }

    @Test
    void getAccountInformationTest() throws ApiException {
        Result<TimestampedAccountInfo> accountInformationResult = accountService.getAccountInfo(stakeAddress, Options.EMPTY); //options.amounts-as-strings
        Assertions.assertTrue(accountInformationResult.isSuccessful());
        Assertions.assertNotNull(accountInformationResult.getValue());
        log.info("getAccountInformationTest: " + accountInformationResult.getValue().toString());
    }

    @Test
    void getAccountInformationBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountInfo(badAddress, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountAddressesTest() throws ApiException {
        Result<PaginatedAddress> accountAddressesResult = accountService.getAccountAddresses(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(accountAddressesResult.isSuccessful());
        Assertions.assertNotNull(accountAddressesResult.getValue());
        log.info("getAccountAddressesTest: " + accountAddressesResult.getValue().toString());
    }

    @Test
    void getAccountAddressesBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountAddresses(badAddress, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountAssetsTest() throws ApiException {
        Result<PaginatedAsset> accountAssetsResult = accountService.getAccountAssets(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(accountAssetsResult.isSuccessful());
        Assertions.assertNotNull(accountAssetsResult.getValue());
        log.info("getAccountAssetsTest: " + accountAssetsResult.getValue().toString());
    }

    @Test
    void getAccountAssetsBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountAssets(badAddress,Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountDelegationsTest() throws ApiException {
        Result<PaginatedAccountDelegation> delegationsResult = accountService.getAccountDelegations(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(delegationsResult.isSuccessful());
        Assertions.assertNotNull(delegationsResult.getValue());
        log.info("getAccountDelegationsTest: " + delegationsResult.getValue().toString());
    }

    @Test
    void getAccountDelegationsBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountDelegations(badAddress, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountHistoryTest() throws ApiException {
        Result<PaginatedAccountHistory> accountHistoryResult = accountService.getAccountHistory(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(accountHistoryResult.isSuccessful());
        Assertions.assertNotNull(accountHistoryResult.getValue());
        log.info("getAccountHistoryTest: " + accountHistoryResult.getValue().toString());
    }

    @Test
    void getAccountHistoryBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountHistory(badAddress, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountRewardsTest() throws ApiException {
        int epochNo = 213;
        Result<PaginatedAccountReward> accountRewardsResult = accountService.getAccountRewards(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(accountRewardsResult.isSuccessful());
        Assertions.assertNotNull(accountRewardsResult.getValue());
        Assertions.assertFalse(accountRewardsResult.getValue().getData().isEmpty());
        Assertions.assertEquals(epochNo, accountRewardsResult.getValue().getData().get(0).getEarnedEpoch());
        log.info("getAccountRewardsTest: " + accountRewardsResult.getValue().toString());
    }

    @Test
    void getAccountRewardsBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountRewards(badAddress, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountUpdatesTest() throws ApiException {
        Result<PaginatedAccountUpdate> accountRewardsResult = accountService.getAccountUpdates(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(accountRewardsResult.isSuccessful());
        Assertions.assertNotNull(accountRewardsResult.getValue());
        log.info("getAccountUpdatesTest: " + accountRewardsResult.getValue().toString());
    }

    @Test
    void getAccountUpdatesBadRequestTest() {
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountUpdates(badAddress, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

}


