package adlabs.maestro.client.backend.api.pool.api;

import adlabs.maestro.client.backend.api.pool.model.PaginatedDelegatorInfo;
import adlabs.maestro.client.backend.api.pool.model.PaginatedHistoricalDelegatorInfo;
import adlabs.maestro.client.backend.api.pool.model.PaginatedPoolBlock;
import adlabs.maestro.client.backend.api.pool.model.PaginatedPoolHistory;
import adlabs.maestro.client.backend.api.pool.model.PaginatedPoolListInfo;
import adlabs.maestro.client.backend.api.pool.model.TimestampedPoolInfo;
import adlabs.maestro.client.backend.api.pool.model.TimestampedPoolMetadata;
import adlabs.maestro.client.backend.api.pool.model.TimestampedPoolRelays;
import adlabs.maestro.client.backend.api.pool.model.TimestampedPoolUpdates;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

/**
 * Pools API
 *
 */
public interface PoolApi {

    /**
     * List registered stake pools
     * Returns a list of currently registered stake pools
     *
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return List of all registered stake pools (ticker can be null)
     */
    @GET("pools")
    Call<PaginatedPoolListInfo> listPools(
            @QueryMap Map<String, String> options
    );

    /**
     * Stake pool blocks
     * Return information about blocks minted by a given pool for all epochs (or just for epoch `epoch_no` if provided)
     *
     * @param poolId Pool ID in bech32 format
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> epoch_no:</b> - Epoch number to fetch results for</p>
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> order:</b> - The order in which the results are sorted (by block absolute slot)</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Return information about blocks minted by a given pool for all epochs (or epoch_no if provided)
     */
    @GET("pools/{pool_id}/blocks")
    Call<PaginatedPoolBlock> poolBlocks(
            @Path("pool_id") String poolId,
            @QueryMap Map<String, String> options
    );

    /**
     * Stake pool delegators
     * Returns a list of delegators of the specified pool
     *
     * @param poolId Pool ID in bech32 format
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Array of information about current delegators for a given pool
     */
    @GET("pools/{pool_id}/delegators")
    Call<PaginatedDelegatorInfo> poolDelegators(
            @Path("pool_id") String poolId,
            @QueryMap Map<String, String> options
    );

    /**
     * Stake pool delegator history
     * Returns a list delegators of a pool as of a certain epoch
     *
     * @param poolId Pool ID in bech32 format
     * @param epochNo Epoch number to fetch results for
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Array of information about delegators for a given pool in a specific epoch
     */
    @GET("pools/{pool_id}/delegators/{epoch_no}")
    Call<PaginatedHistoricalDelegatorInfo> poolHistoricalDelegators(
            @Path("pool_id") String poolId,
            @Path("epoch_no") Integer epochNo,
            @QueryMap Map<String, String> options
    );

    /**
     * Stake pool history
     * Returns per-epoch information about the specified pool (or just for epoch `epoch_no` if provided)
     *
     * @param poolId Pool ID in bech32 format
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> epoch_no:</b> - Epoch number to fetch results for</p>
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> order:</b> - The order in which the results are sorted (by epoch number)</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return An array of pool history information for each epoch
     */
    @GET("pools/{pool_id}/history")
    Call<PaginatedPoolHistory> poolHistory(
            @Path("pool_id") String poolId,
            @QueryMap Map<String, String> options
    );

    /**
     * Stake pool information
     * Returns current information about the specified pool
     *
     * @param poolId Pool ID in bech32 format
     * @return Current information regarding the specified pool
     */
    @GET("pools/{pool_id}/info")
    Call<TimestampedPoolInfo> poolInfo(
            @Path("pool_id") String poolId
    );

    /**
     * Stake pool metadata
     * Returns the metadata declared on-chain by the specified stake pool
     *
     * @param poolId Pool ID in bech32 format
     * @return Various metadata for the specified pool
     */
    @GET("pools/{pool_id}/metadata")
    Call<TimestampedPoolMetadata> poolMetadata(
            @Path("pool_id") String poolId
    );

    /**
     * Stake pool relays
     * Returns a list of relays declared on-chain by the specified stake pool
     *
     * @param poolId Pool ID in bech32 format
     * @return List of relays declared on-chain by the specified pool
     */
    @GET("pools/{pool_id}/relays")
    Call<TimestampedPoolRelays> poolRelays(
            @Path("pool_id") String poolId
    );

    /**
     * Stake pool updates
     * Returns a list of updates relating to the specified pool
     *
     * @param poolId Pool ID in bech32 format
     * @return List of pool updates relating to the specified pool
     */
    @GET("pools/{pool_id}/updates")
    Call<TimestampedPoolUpdates> poolUpdates(
            @Path("pool_id") String poolId
    );
}