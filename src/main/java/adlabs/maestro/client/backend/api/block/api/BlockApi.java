package adlabs.maestro.client.backend.api.block.api;

import adlabs.maestro.client.backend.api.block.model.TimestampedBlockInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Blocks API
 *
 */
public interface BlockApi {

    /**
     * Block information
     * Returns information about the specified block
     *
     * @param hashOrHeight Block height or hex encoded block hash
     * @return Summary of information regarding the specified block
     */
    @GET("blocks/{hash_or_height}")
    Call<TimestampedBlockInfo> blockInfo(
            @Path("hash_or_height") String hashOrHeight
    );

    /**
     * Latest block information
     * Returns information about the most recently minted block
     *
     * @return Summary of information regarding the latest block
     */
    @GET("blocks/latest")
    Call<TimestampedBlockInfo> latestBlock();
}

