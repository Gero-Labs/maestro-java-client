package adlabs.maestro.client.backend.api.account;

import adlabs.maestro.client.backend.api.account.model.*;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddress;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.options.Options;


/**
 * Accounts Service
 */
public interface AccountService {

    /**
     * Get Stake Account Information
     * Returns various information regarding a stake account
     *
     * @param stakeAddr Bech32 encoded reward/stake address ('stake1...')
     * @param options   Query Options
     * @return Information about the account
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<TimestampedAccountInfo> getAccountInfo(String stakeAddr, Options options) throws ApiException;

    /**
     * Get Stake Account Addresses
     * Returns a list of addresses seen on-chain which use the specified stake key
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param options   Query Options
     * @return Addresses seen on-chain which contain the specified stake key
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAddress> getAccountAddresses(String stakeAddr, Options options) throws ApiException;

    /**
     * Get Stake Account Assets
     * Returns a list of native assets which are owned by addresses with the specified stake key
     *
     * @param stakeAddr Bech32 encoded reward/stake address ('stake1...')
     * @param options   Query Options
     * @return A list of assets which are owned by addresses that use the specified stake key
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAsset> getAccountAssets(String stakeAddr, Options options) throws ApiException;

    /**
     * Get Stake Account Delegation History
     * Returns list of delegation actions relating to a stake account
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param options   Query Options
     * @return Stake account delegations
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAccountDelegation> getAccountDelegations(String stakeAddr, Options options) throws ApiException;

    /**
     * Get Stake Account History
     * Returns per-epoch history for the specified stake key
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param options   Query Options
     * @return Per-epoch history of the specified stake key
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAccountHistory> getAccountHistory(String stakeAddr, Options options) throws ApiException;

    /**
     * Get Stake Account Rewards
     * Returns a list of staking-related rewards for the specified stake key
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param options   Query Options
     * @return Staking rewards for the specified stake key
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAccountReward> getAccountRewards(String stakeAddr, Options options) throws ApiException;

    /**
     * Get Stake Account Updates
     * Returns a list of updates relating to the specified stake key
     *
     * @param stakeAddr Bech32 encoded stake/reward address ('stake1...')
     * @param options   Query Options
     * @return Updates relating to the specified stake key
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAccountUpdate> getAccountUpdates(String stakeAddr, Options options) throws ApiException;
}