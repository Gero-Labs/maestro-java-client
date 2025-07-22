package adlabs.maestro.client.backend.api.general.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.general.api.GeneralApi;
import adlabs.maestro.client.backend.api.general.model.TimestampedChainTip;
import adlabs.maestro.client.backend.api.general.model.TimestampedEraSummaries;
import adlabs.maestro.client.backend.api.general.model.TimestampedProtocolParameters;
import adlabs.maestro.client.backend.api.general.model.TimestampedSystemStart;
import adlabs.maestro.client.backend.api.general.GeneralService;
import retrofit2.Call;

/**
 * General Service Implementation
 */
public class GeneralServiceImpl extends BaseService implements GeneralService {

    private final GeneralApi generalApi;

    /**
     * General Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public GeneralServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        generalApi = getRetrofit().create(GeneralApi.class);
    }

    @Override
    public Result<TimestampedChainTip> getChainTip() throws ApiException {
        Call<TimestampedChainTip> call = generalApi.chainTip();
        return processResponse(call);
    }

    @Override
    public Result<TimestampedEraSummaries> getEraSummaries() throws ApiException {
        Call<TimestampedEraSummaries> call = generalApi.eraSummaries();
        return processResponse(call);
    }

    @Override
    public Result<TimestampedProtocolParameters> getProtocolParameters() throws ApiException {
        Call<TimestampedProtocolParameters> call = generalApi.protocolParameters();
        return processResponse(call);
    }

    @Override
    public Result<TimestampedSystemStart> getSystemStart() throws ApiException {
        Call<TimestampedSystemStart> call = generalApi.systemStart();
        return processResponse(call);
    }
}