package adlabs.maestro.client.backend.api.account.api;

import adlabs.maestro.client.backend.api.account.model.*;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddress;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Accounts API
 */
public interface AccountApi {

    /**
     * Get Stake Account Information
     *
     * @param stakeAddr Bech32 encoded reward/stake address ('stake1...')
     * @param paramsMap Query Params
     * @return Information about the account
     */
    @GET("accounts/{stake_addr}")
    Call<TimestampedAccountInfo> getAccountInfo(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);

    /**
     * Get Stake Account Addresses
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param paramsMap Query Params
     * @return Addresses seen on-chain which contain the specified stake key
     */
    @GET("accounts/{stake_addr}/addresses")
    Call<PaginatedAddress> getAccountAddresses(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);


    /**
     * Get Stake Account Assets
     *
     * @param stakeAddr Bech32 encoded reward/stake address ('stake1...')
     * @param paramsMap Query Params
     * @return A list of assets which are owned by addresses that use the specified stake key
     */
    @GET("accounts/{stake_addr}/assets")
    Call<PaginatedAsset> getAccountAssets(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);

    /**
     * Get Stake Account Delegation History
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param paramsMap Query Params
     * @return Stake account delegations
     */
    @GET("accounts/{stake_addr}/delegations")
    Call<PaginatedAccountDelegation> getAccountDelegations(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);

    /**
     * Get Stake Account History
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param paramsMap Query Params
     * @return Per-epoch history of the specified stake key
     */
    @GET("accounts/{stake_addr}/history")
    Call<PaginatedAccountHistory> getAccountHistory(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);

    /**
     * Get Stake Account Rewards
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param paramsMap Query Params
     * @return Staking rewards for the specified stake key
     */
    @GET("accounts/{stake_addr}/rewards")
    Call<PaginatedAccountReward> getAccountRewards(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);

    /**
     * Get Stake Account Updates
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param paramsMap Query Params
     * @return Updates relating to the specified stake key
     */
    @GET("accounts/{stake_addr}/updates")
    Call<PaginatedAccountUpdate> getAccountUpdates(@Path("stake_addr") String stakeAddr, @QueryMap Map<String, String> paramsMap);
}