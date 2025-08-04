package adlabs.maestro.client.backend.api.block.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.block.api.BlockApi;
import adlabs.maestro.client.backend.api.block.model.TimestampedBlockInfo;
import adlabs.maestro.client.backend.api.block.BlockService;
import retrofit2.Call;

/**
 * Implementation of the BlockService.
 */
public class BlockServiceImpl extends BaseService implements BlockService {

    private final BlockApi blockApi;

    /**
     * Constructor for BlockServiceImpl.
     *
     * @param baseUrl  Base URL of the Maestro API.
     * @param apiToken API token for authentication.
     */
    public BlockServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        this.blockApi = getRetrofit().create(BlockApi.class);
    }

    private void validateHashOrHeight(String hashOrHeight) throws ApiException {
        if (hashOrHeight == null || hashOrHeight.trim().isEmpty()) {
            throw new ApiException("Block hash or height cannot be null or empty.");
        }
    }

    @Override
    public Result<TimestampedBlockInfo> getBlockInfo(String hashOrHeight) throws ApiException {
        validateHashOrHeight(hashOrHeight);
        Call<TimestampedBlockInfo> call = blockApi.blockInfo(hashOrHeight);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedBlockInfo> getLatestBlock() throws ApiException {
        Call<TimestampedBlockInfo> call = blockApi.latestBlock();
        return processResponse(call);
    }
}
