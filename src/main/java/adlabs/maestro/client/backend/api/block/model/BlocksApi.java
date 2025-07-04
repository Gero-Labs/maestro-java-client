package adlabs.maestro.client.backend.api.block.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * Blocks API
 *
 */
public interface BlocksApi {

    /**
     * Block information
     * Returns information about the specified block
     *
     * @param hashOrHeight Block height or hex encoded block hash
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Summary of information regarding the specified block
     */
    @GET("blocks/{hash_or_height}")
    Call<TimestampedBlockInfo> blockInfo(
            @Path("hash_or_height") String hashOrHeight,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * Latest block information
     * Returns information about the most recently minted block
     *
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Summary of information regarding the latest block
     */
    @GET("blocks/latest")
    Call<TimestampedBlockInfo> latestBlock(
            @Header("amounts-as-strings") String amountsAsStrings
    );
}

