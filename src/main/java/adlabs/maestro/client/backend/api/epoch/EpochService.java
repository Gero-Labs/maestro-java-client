package adlabs.maestro.client.backend.api.epoch;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.epoch.model.TimestampedCurrentEpochInfo;
import adlabs.maestro.client.backend.api.epoch.model.TimestampedEpochInfo;

/**
 * Epochs Service
 */
public interface EpochService {

    /**
     * Get current epoch details.
     * Returns a summary of information about the current epoch.
     *
     * @return A Result containing information about the current epoch.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedCurrentEpochInfo> getCurrentEpochInfo() throws ApiException;

    /**
     * Get specific epoch details.
     * Returns a summary of information about a specific epoch.
     *
     * @param epochNo The epoch number to return information about.
     * @return A Result containing information about the requested epoch.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedEpochInfo> getEpochInfo(Integer epochNo) throws ApiException;
}