package adlabs.maestro.client.backend.api.epoch.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.epoch.api.EpochApi;
import adlabs.maestro.client.backend.api.epoch.model.TimestampedCurrentEpochInfo;
import adlabs.maestro.client.backend.api.epoch.model.TimestampedEpochInfo;
import adlabs.maestro.client.backend.api.epoch.EpochService;
import retrofit2.Call;

/**
 * Epoch Service Implementation
 */
public class EpochServiceImpl extends BaseService implements EpochService {

    private final EpochApi epochApi;

    /**
     * Epoch Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public EpochServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        epochApi = getRetrofit().create(EpochApi.class);
    }

    @Override
    public Result<TimestampedCurrentEpochInfo> getCurrentEpochInfo() throws ApiException {
        Call<TimestampedCurrentEpochInfo> call = epochApi.currentEpoch();
        return processResponse(call);
    }

    @Override
    public Result<TimestampedEpochInfo> getEpochInfo(Integer epochNo) throws ApiException {
        Call<TimestampedEpochInfo> call = epochApi.epochInfo(epochNo);
        return processResponse(call);
    }
}