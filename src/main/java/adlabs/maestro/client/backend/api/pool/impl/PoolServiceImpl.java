package adlabs.maestro.client.backend.api.pool.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.pool.api.PoolApi;
import adlabs.maestro.client.backend.api.pool.model.*;
import adlabs.maestro.client.backend.api.pool.PoolService;
import adlabs.maestro.client.backend.factory.options.Options;
import adlabs.maestro.client.backend.models.PaginatedDelegatorInfo;
import adlabs.maestro.client.backend.models.PaginatedHistoricalDelegatorInfo;
import retrofit2.Call;

/**
 * Pools Service Implementation
 */
public class PoolServiceImpl extends BaseService implements PoolService {

    private final PoolApi poolApi;

    /**
     * Pools Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public PoolServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        poolApi = getRetrofit().create(PoolApi.class);
    }

    @Override
    public Result<PaginatedPoolListInfo> getPoolList(Options options) throws ApiException {
        Call<PaginatedPoolListInfo> call = poolApi.listPools(optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPoolBlock> getPoolBlocks(String poolId, Options options) throws ApiException {
        Call<PaginatedPoolBlock> call = poolApi.poolBlocks(poolId, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedDelegatorInfo> getPoolDelegators(String poolId, Options options) throws ApiException {
        Call<PaginatedDelegatorInfo> call = poolApi.poolDelegators(poolId, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedHistoricalDelegatorInfo> getPoolDelegatorHistory(String poolId, Integer epochNo, Options options) throws ApiException {
        Call<PaginatedHistoricalDelegatorInfo> call = poolApi.poolHistoricalDelegators(poolId, epochNo, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPoolHistory> getPoolHistory(String poolId, Options options) throws ApiException {
        Call<PaginatedPoolHistory> call = poolApi.poolHistory(poolId, optionsToParamMap(options));
        return processResponse(call);
    }



    @Override
    public Result<TimestampedPoolInfo> getPoolInfo(String poolId) throws ApiException {
        Call<TimestampedPoolInfo> call = poolApi.poolInfo(poolId);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedPoolMetadata> getPoolMetadata(String poolId) throws ApiException {
//        validateBech32(poolId);
        Call<TimestampedPoolMetadata> call = poolApi.poolMetadata(poolId);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedPoolRelays> getPoolRelays(String poolId) throws ApiException {
        Call<TimestampedPoolRelays> call = poolApi.poolRelays(poolId);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedPoolUpdates> getPoolUpdates(String poolId) throws ApiException {
        validateBech32(poolId);
        Call<TimestampedPoolUpdates> call = poolApi.poolUpdates(poolId);
        return processResponse(call);
    }
}