package adlabs.maestro.client.backend.api.account;

import adlabs.maestro.client.backend.api.account.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddress;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;


@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountServicePreprodIntegrationTest {

    private AccountService accountService;

    @BeforeAll
    public void setup() {
        accountService = BackendFactory.getMaestroPreprodService().getAccountService();
    }

    @Test
    void getAccountInformationTest() throws ApiException {
        String address = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<TimestampedAccountInfo> accountInformationResult = accountService.getAccountInfo(address, Options.EMPTY); //options.amounts-as-strings
        Assertions.assertTrue(accountInformationResult.isSuccessful());
        Assertions.assertNotNull(accountInformationResult.getValue());
        log.info(accountInformationResult.getValue().toString());
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
        log.info(accountAddressesResult.getValue().toString());
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
        log.info(accountAssetsResult.getValue().toString());
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
        log.info(delegationsResult.getValue().toString());
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
        log.info(accountHistoryResult.getValue().toString());
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
        log.info(accountRewardsResult.getValue().toString());
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
        log.info(accountRewardsResult.getValue().toString());
    }

    @Test
    void getAccountUpdatesBadRequestTest() {
        String stakeAddresses = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountUpdates(stakeAddresses, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    /*

    @Test
    void getAccountListLimitTest() throws ApiException {
        Options options = Options.builder().option(Limit.of(10)).build();
        Result<List<StakeAddress>> stakeAddressesResult = accountService.getAccountList(options);
        Assertions.assertTrue(stakeAddressesResult.isSuccessful());
        Assertions.assertNotNull(stakeAddressesResult.getValue());
        log.info(stakeAddressesResult.getValue().toString());
        assertEquals(10, stakeAddressesResult.getValue().size());
    }

    @Test
    void getAccountUTxOsTest() throws ApiException {
        List<String> stakeAddresses = List.of("stake_test1urq4rcynzj4uxqc74c852zky7wa6epgmn9r6k3j3gv7502q8jks0l", "stake_test1ur4t5nhceyn2amfuj7z74uxmmj8jf9fmgd2egqw8c98ve3cp2g4wx");
        Result<List<UTxO>> utxosResult = accountService.getAccountUTxOs(stakeAddresses, true, Options.EMPTY);
        Assertions.assertTrue(utxosResult.isSuccessful());
        Assertions.assertNotNull(utxosResult.getValue());
        log.info(utxosResult.getValue().toString());
    }

    @Test
    void getAccountUTxOsBadRequestTest() {
        List<String> stakeAddresses = List.of("asd", "stake_test1ur4t5nhceyn2amfuj7z74uxmmj8jf9fmgd2egqw8c98ve3cp2g4wx");
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountUTxOs(stakeAddresses, true, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountTxsTest() throws ApiException {
        String stakeAddress = "stake_test1urkzeud48zxwnjc54emzmmc3gkg2r6d6tm2sd799jxjnqxqlfzmvk";
        Result<List<AccountTx>> accountTxsResult = accountService.getAccountTxs(stakeAddress, null, Options.EMPTY);
        Assertions.assertTrue(accountTxsResult.isSuccessful());
        Assertions.assertNotNull(accountTxsResult.getValue());
        log.info(accountTxsResult.getValue().toString());
    }

    @Test
    void getAccountTxsBadRequestTest() {
        String stakeAddress = "stake_test1urkzeud48zxwnjc54emzmmc3gkg2r6d6tm2sd799jxjnqxqlfzmvk";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountTxs(stakeAddress, -2, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountRewardsTest() throws ApiException {
        int epochNo = 33;
        String stakeAddress = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<List<AccountRewardHistory>> accountRewardsResult = accountService.getAccountRewardHistory(List.of(stakeAddress), epochNo, Options.EMPTY);
        Assertions.assertTrue(accountRewardsResult.isSuccessful());
        Assertions.assertNotNull(accountRewardsResult.getValue());
        assertFalse(accountRewardsResult.getValue().isEmpty());
        assertEquals(epochNo, accountRewardsResult.getValue().get(0).getEarnedEpoch());
        log.info(accountRewardsResult.getValue().toString());
    }

    @Test
    void getAccountRewardsBadRequestBadAddressTest() {
        String stakeAddress = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountRewardHistory(List.of(stakeAddress), 180, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getAccountUpdatesTest() throws ApiException {
        String stakeAddress = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<List<AccountUpdateHistory>> accountUpdatesResult = accountService.getAccountUpdateHistory(List.of(stakeAddress), Options.EMPTY);
        Assertions.assertTrue(accountUpdatesResult.isSuccessful());
        Assertions.assertNotNull(accountUpdatesResult.getValue());
        log.info(accountUpdatesResult.getValue().toString());
    }

    @Test
    void getAccountUpdatesBadRequestTest() {
        String stakeAddress = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountUpdateHistory(List.of(stakeAddress), Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }





    @Test
    void getAccountHistoryTest() throws ApiException {
        String address = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<List<AccountStakeHistory>> accountHistoryResult = accountService.getAccountStakeHistory(List.of(address), Options.EMPTY);
        Assertions.assertTrue(accountHistoryResult.isSuccessful());
        Assertions.assertNotNull(accountHistoryResult.getValue());
        log.info(accountHistoryResult.getValue().toString());
    }

    @Test
    void getAccountHistoryBadRequestTest() {
        String address = "a123sd";
        ApiException exception = assertThrows(ApiException.class, () -> accountService.getAccountStakeHistory(List.of(address), Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }


    @Test
    void getAccountInfoTest() throws ApiException {
        // Given
        AccountInfo mockAccountInfo = AccountInfo.builder()
                .stakeAddress(validStakeAddress)
                .active(true)
                .balance(BigInteger.valueOf(5000000))
                .rewards(BigInteger.valueOf(100000))
                .withdrawals(BigInteger.valueOf(50000))
                .registrations(2)
                .deregistrations(0)
                .build();

        TimestampedAccountInfo mockTimestampedInfo = TimestampedAccountInfo.builder()
                .data(mockAccountInfo)
                .lastUpdated(Instant.now())
                .build();

        Result<TimestampedAccountInfo> expectedResult = Result.success(mockTimestampedInfo);
        when(accountsService.getAccountInfo(validStakeAddress, emptyOptions)).thenReturn(expectedResult);

        // When
        Result<TimestampedAccountInfo> result = accountsService.getAccountInfo(validStakeAddress, emptyOptions);

        // Then
        assertTrue(result.isSuccessful());
        assertNotNull(result.getValue());
        assertNotNull(result.getValue().getData());
        assertEquals(validStakeAddress, result.getValue().getData().getStakeAddress());
        assertTrue(result.getValue().getData().getActive());
        assertEquals(BigInteger.valueOf(5000000), result.getValue().getData().getBalance());
        verify(accountsService).getAccountInfo(validStakeAddress, emptyOptions);
    }

*/

}



