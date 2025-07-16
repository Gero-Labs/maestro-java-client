package adlabs.maestro.client.backend.api.pool;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.pool.model.*;
import adlabs.maestro.client.backend.factory.options.Options;
import adlabs.maestro.client.backend.models.PaginatedDelegatorInfo;
import adlabs.maestro.client.backend.models.PaginatedHistoricalDelegatorInfo;

/**
 * Pools Service
 */
public interface PoolService {

    /**
     * Get a list of registered stake pools.
     * Returns a list of currently registered stake pools.
     *
     * @param options Options for pagination.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return A Result containing a list of all registered stake pools.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPoolListInfo> getPoolList(Options options) throws ApiException;

    /**
     * Get stake pool blocks.
     * Returns information about blocks minted by a given pool for all epochs (or for a specific epoch if provided).
     *
     * @param poolId Pool ID in bech32 format.
     * @param options Options for pagination and filtering.
     * <p>-<b> epoch_no:</b> Epoch number to fetch results for</p>
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> order:</b> The order in which the results are sorted (by block absolute slot)</p>
     * <p>-<b> cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return A Result containing information about blocks minted by a given pool.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPoolBlock> getPoolBlocks(String poolId, Options options) throws ApiException;

    /**
     * Get stake pool delegators.
     * Returns a list of the current delegators for a specified pool.
     *
     * @param poolId Pool ID in bech32 format.
     * @param options Options for pagination.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return A Result containing an array of information about current delegators for a given pool.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedDelegatorInfo> getPoolDelegators(String poolId, Options options) throws ApiException;

    /**
     * Get stake pool delegator history for a specific epoch.
     * Returns a list of delegators for a pool as of a certain epoch.
     *
     * @param poolId Pool ID in bech32 format.
     * @param epochNo Epoch number to fetch results for.
     * @param options Options for pagination.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return A Result containing an array of information about delegators for a given pool in a specific epoch.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedHistoricalDelegatorInfo> getPoolDelegatorHistory(String poolId, Integer epochNo, Options options) throws ApiException;

    /**
     * Get stake pool history.
     * Returns per-epoch information about the specified pool (or for a specific epoch if provided).
     *
     * @param poolId Pool ID in bech32 format.
     * @param options Options for pagination and filtering.
     * <p>-<b> epoch_no:</b> Epoch number to fetch results for</p>
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> order:</b> The order in which the results are sorted (by epoch number)</p>
     * <p>-<b> cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return A Result containing an array of pool history information for each epoch.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPoolHistory> getPoolHistory(String poolId, Options options) throws ApiException;

    /**
     * Get stake pool information.
     * Returns current information about the specified pool.
     *
     * @param poolId Pool ID in bech32 format.
     * @return A Result containing the current information for the specified pool.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedPoolInfo> getPoolInfo(String poolId) throws ApiException;

    /**
     * Get stake pool metadata.
     * Returns the metadata declared on-chain by the specified stake pool.
     *
     * @param poolId Pool ID in bech32 format.
     * @return A Result containing various metadata for the specified pool.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedPoolMetadata> getPoolMetadata(String poolId) throws ApiException;

    /**
     * Get stake pool relays.
     * Returns a list of relays declared on-chain by the specified stake pool.
     *
     * @param poolId Pool ID in bech32 format.
     * @return A Result containing a list of relays for the specified pool.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedPoolRelays> getPoolRelays(String poolId) throws ApiException;

    /**
     * Get stake pool updates.
     * Returns a list of registration and retirement updates relating to the specified pool.
     *
     * @param poolId Pool ID in bech32 format.
     * @return A Result containing a list of pool updates for the specified pool.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedPoolUpdates> getPoolUpdates(String poolId) throws ApiException;
}