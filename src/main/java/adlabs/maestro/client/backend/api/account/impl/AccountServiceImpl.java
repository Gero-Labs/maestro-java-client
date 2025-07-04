package adlabs.maestro.client.backend.api.account.impl;

import adlabs.maestro.client.backend.api.account.AccountService;
import adlabs.maestro.client.backend.api.account.api.AccountApi;
import adlabs.maestro.client.backend.api.account.model.*;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddress;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.options.Options;
import retrofit2.Call;

/**
 * Accounts Service Implementation
 */
public class AccountServiceImpl extends BaseService implements AccountService {

    private final AccountApi accountsApi;

    /**
     * Accounts Service Implementation Constructor
     *
     * @param baseUrl Base Url
     */
    public AccountServiceImpl(String baseUrl) {
        super(baseUrl);
        accountsApi = getRetrofit().create(AccountApi.class);
    }

    /**
     * Accounts Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public AccountServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        accountsApi = getRetrofit().create(AccountApi.class);
    }

    @Override
    public Result<TimestampedAccountInfo> getAccountInfo(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<TimestampedAccountInfo> call = accountsApi.getAccountInfo(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAddress> getAccountAddresses(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<PaginatedAddress> call = accountsApi.getAccountAddresses(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAsset> getAccountAssets(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<PaginatedAsset> call = accountsApi.getAccountAssets(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAccountDelegation> getAccountDelegations(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<PaginatedAccountDelegation> call = accountsApi.getAccountDelegations(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAccountHistory> getAccountHistory(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<PaginatedAccountHistory> call = accountsApi.getAccountHistory(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAccountReward> getAccountRewards(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<PaginatedAccountReward> call = accountsApi.getAccountRewards(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAccountUpdate> getAccountUpdates(String stakeAddr, Options options) throws ApiException {
        validateBech32(stakeAddr);
        Call<PaginatedAccountUpdate> call = accountsApi.getAccountUpdates(stakeAddr, optionsToParamMap(options));
        return processResponse(call);
    }
}