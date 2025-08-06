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
class AccountServicePreprodIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(AccountServicePreprodIntegrationTest.class);

    private AccountService accountService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_PREPROD_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_PREPROD_API_KEY environment variable is not set. Please set it before running tests.");
        }
        accountService = BackendFactory.getMaestroPreprodService(apiKey).getAccountService();
    }

    @Test
    void getAccountInformationTest() throws ApiException {
        String address = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<TimestampedAccountInfo> accountInformationResult = accountService.getAccountInfo(address, Options.EMPTY); //options.amounts-as-strings
        Assertions.assertTrue(accountInformationResult.isSuccessful());
        Assertions.assertNotNull(accountInformationResult.getValue());
        log.info("getAccountInformationTest: " + accountInformationResult.getValue().toString());
    }

    @Test
    void getAccountInformationBadRequestTest() {
        String address = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountInfo(address, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountAddressesTest() throws ApiException {
        String address = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<PaginatedAddress> accountAddressesResult = accountService.getAccountAddresses(address, Options.EMPTY);
        Assertions.assertTrue(accountAddressesResult.isSuccessful());
        Assertions.assertNotNull(accountAddressesResult.getValue());
        log.info("getAccountAddressesTest: " + accountAddressesResult.getValue().toString());
    }

    @Test
    void getAccountAddressesBadRequestTest() {
        String address = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountAddresses(address, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountAssetsTest() throws ApiException {
        String address = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<PaginatedAsset> accountAssetsResult = accountService.getAccountAssets(address, Options.EMPTY);
        Assertions.assertTrue(accountAssetsResult.isSuccessful());
        Assertions.assertNotNull(accountAssetsResult.getValue());
        log.info("getAccountAssetsTest: " + accountAssetsResult.getValue().toString());
    }

    @Test
    void getAccountAssetsBadRequestTest() {
        String address = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountAssets(address,Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountDelegationsTest() throws ApiException {
        String stakeAddresses = "stake_test1ur4t5nhceyn2amfuj7z74uxmmj8jf9fmgd2egqw8c98ve3cp2g4wx";
        Result<PaginatedAccountDelegation> delegationsResult = accountService.getAccountDelegations(stakeAddresses, Options.EMPTY);
        Assertions.assertTrue(delegationsResult.isSuccessful());
        Assertions.assertNotNull(delegationsResult.getValue());
        log.info("getAccountDelegationsTest: " + delegationsResult.getValue().toString());
    }

    @Test
    void getAccountDelegationsBadRequestTest() {
        String stakeAddresses = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountDelegations(stakeAddresses, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountHistoryTest() throws ApiException {
        String stakeAddresses = "stake_test1ur4t5nhceyn2amfuj7z74uxmmj8jf9fmgd2egqw8c98ve3cp2g4wx";
        Result<PaginatedAccountHistory> accountHistoryResult = accountService.getAccountHistory(stakeAddresses, Options.EMPTY);
        Assertions.assertTrue(accountHistoryResult.isSuccessful());
        Assertions.assertNotNull(accountHistoryResult.getValue());
        log.info("getAccountHistoryTest: " + accountHistoryResult.getValue().toString());
    }

    @Test
    void getAccountHistoryBadRequestTest() {
        String stakeAddresses = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountHistory(stakeAddresses, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountRewardsTest() throws ApiException {
        int epochNo = 33;
        String stakeAddress = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<PaginatedAccountReward> accountRewardsResult = accountService.getAccountRewards(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(accountRewardsResult.isSuccessful());
        Assertions.assertNotNull(accountRewardsResult.getValue());
        Assertions.assertFalse(accountRewardsResult.getValue().getData().isEmpty());
        Assertions.assertEquals(epochNo, accountRewardsResult.getValue().getData().get(0).getEarnedEpoch());
        log.info("getAccountRewardsTest: " + accountRewardsResult.getValue().toString());
    }

    @Test
    void getAccountRewardsBadRequestTest() {
        String stakeAddresses = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountRewards(stakeAddresses, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountUpdatesTest() throws ApiException {
        String stakeAddresses = "stake_test1ur4t5nhceyn2amfuj7z74uxmmj8jf9fmgd2egqw8c98ve3cp2g4wx";
        Result<PaginatedAccountUpdate> accountRewardsResult = accountService.getAccountUpdates(stakeAddresses, Options.EMPTY);
        Assertions.assertTrue(accountRewardsResult.isSuccessful());
        Assertions.assertNotNull(accountRewardsResult.getValue());
        log.info("getAccountUpdatesTest: " + accountRewardsResult.getValue().toString());
    }

    @Test
    void getAccountUpdatesBadRequestTest() {
        String stakeAddresses = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountUpdates(stakeAddresses, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

}



