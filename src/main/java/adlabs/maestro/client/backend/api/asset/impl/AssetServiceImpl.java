package adlabs.maestro.client.backend.api.asset.impl;

import adlabs.maestro.client.backend.api.asset.api.AssetApi;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetHolder;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetHolderAccount;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetUtxo;
import adlabs.maestro.client.backend.api.asset.model.PaginatedMintTransaction;
import adlabs.maestro.client.backend.api.asset.model.PaginatedTimestampedTransaction;
import adlabs.maestro.client.backend.api.asset.model.TimestampedAssetInfo;
import adlabs.maestro.client.backend.api.asset.AssetService;
import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.options.Options;
import retrofit2.Call;

/**
 * Implementation of the AssetsService.
 */
public class AssetServiceImpl extends BaseService implements AssetService {

    private final AssetApi assetApi;

    /**
     * Constructor for AssetsServiceImpl.
     *
     * @param baseUrl Base URL of the Maestro API.
     * @param apiToken API token for authentication.
     */
    public AssetServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        this.assetApi = getRetrofit().create(AssetApi.class);
    }

    private void validateAsset(String asset) throws ApiException {
        if (asset == null || asset.trim().isEmpty()) {
            throw new ApiException("Asset cannot be null or empty.");
        }
        // Additional validation for hex format can be added here if needed.
    }

    @Override
    public Result<PaginatedAssetHolderAccount> getAssetAccounts(String asset, Options options) throws ApiException {
        validateAsset(asset);

        Call<PaginatedAssetHolderAccount> call = assetApi.assetAccounts(asset, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAssetHolder> getAssetAddresses(String asset, Options options) throws ApiException {
        validateAsset(asset);

        Call<PaginatedAssetHolder> call = assetApi.assetAddresses(asset, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<TimestampedAssetInfo> getAssetInfo(String asset) throws ApiException {
        validateAsset(asset);
        Call<TimestampedAssetInfo> call = assetApi.assetInfo(asset);
        return processResponse(call);
    }

    @Override
    public Result<PaginatedMintTransaction> getAssetMints(String asset, Options options) throws ApiException {
        validateAsset(asset);

        Call<PaginatedMintTransaction> call = assetApi.assetMints(asset, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedTimestampedTransaction> getAssetTransactions(String asset, Options options) throws ApiException {
        validateAsset(asset);

        Call<PaginatedTimestampedTransaction> call = assetApi.assetTxs(asset,optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAssetUtxo> getAssetUtxos(String asset, Options options) throws ApiException {
        validateAsset(asset);

        Call<PaginatedAssetUtxo> call = assetApi.assetUtxos(asset, optionsToParamMap(options));
        return processResponse(call);
    }
}
