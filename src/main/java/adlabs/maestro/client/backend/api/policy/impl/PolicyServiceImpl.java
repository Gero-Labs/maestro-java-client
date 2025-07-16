package adlabs.maestro.client.backend.api.policy.impl;

import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetInfoConcise;
import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.policy.api.PolicyApi;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyHolder;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyHolderAccount;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyMintTransaction;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyTransaction;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyUtxo;
import adlabs.maestro.client.backend.api.policy.model.TimestampedPolicyInfo;
import adlabs.maestro.client.backend.api.policy.PolicyService;
import adlabs.maestro.client.backend.factory.options.Options;
import retrofit2.Call;

/**
 * Policy Service Implementation
 */
public class PolicyServiceImpl extends BaseService implements PolicyService {

    private final PolicyApi policyApi;

    /**
     * Policy Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public PolicyServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        policyApi = getRetrofit().create(PolicyApi.class);
    }

    @Override
    public Result<PaginatedPolicyHolderAccount> getPolicyAccounts(String policy, Options options) throws ApiException {
        validateHexFormat(policy);
        Call<PaginatedPolicyHolderAccount> call = policyApi.policyAccounts(policy, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPolicyHolder> getPolicyAddresses(String policy, Options options) throws ApiException {
        validateHexFormat(policy);
        Call<PaginatedPolicyHolder> call = policyApi.policyAddresses(policy, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAssetInfoConcise> getPolicyAssets(String policy, Options options) throws ApiException {
        validateHexFormat(policy);
        Call<PaginatedAssetInfoConcise> call = policyApi.policyAssets(policy, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<TimestampedPolicyInfo> getPolicyInfo(String policy) throws ApiException {
        validateHexFormat(policy);
        Call<TimestampedPolicyInfo> call = policyApi.policyInfo(policy);
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPolicyMintTransaction> getPolicyMints(String policy, Options options) throws ApiException {
        validateHexFormat(policy);
        Call<PaginatedPolicyMintTransaction> call = policyApi.policyMints(policy, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPolicyTransaction> getPolicyTxs(String policy, Options options) throws ApiException {
        validateHexFormat(policy);
        Call<PaginatedPolicyTransaction> call = policyApi.policyTxs(policy, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPolicyUtxo> getPolicyUtxos(String policy, Options options) throws ApiException {
        validateHexFormat(policy);
        Call<PaginatedPolicyUtxo> call = policyApi.policyUtxos(policy, optionsToParamMap(options));
        return processResponse(call);
    }
}
