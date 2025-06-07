package adlabs.maestro.client.backend.api.block.api;

import adlabs.maestro.client.backend.api.block.model.Block;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Block API
 */
public interface BlockApi {

    /**
     * Get summarised details about all blocks (paginated - latest first)
     *
     * @param paramsMap Options and Filters Map
     * @return List of {@link Block}
     */
    @GET("blocks")
    Call<List<Block>> getBlockList(@QueryMap Map<String, String> paramsMap);
}
