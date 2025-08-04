package adlabs.maestro.client.backend.api.epoch.api;

import adlabs.maestro.client.backend.api.epoch.model.TimestampedCurrentEpochInfo;
import adlabs.maestro.client.backend.api.epoch.model.TimestampedEpochInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Epochs API
 *
 */
public interface EpochApi {

    /**
     * Current epoch details
     * Returns a summary of information about the current epoch
     *
     * @return Information about the current epoch
     */
    @GET("epochs/current")
    Call<TimestampedCurrentEpochInfo> currentEpoch();

    /**
     * Specific epoch details
     * Returns a summary of information about a specific epoch
     *
     * @param epochNo Epoch number to return information about
     * @return Information about the requested epoch
     */
    @GET("epochs/{epoch_no}")
    Call<TimestampedEpochInfo> epochInfo(
            @Path("epoch_no") Integer epochNo
    );
}

