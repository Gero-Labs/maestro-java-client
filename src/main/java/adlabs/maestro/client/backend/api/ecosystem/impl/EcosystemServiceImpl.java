package adlabs.maestro.client.backend.api.ecosystem.impl;

import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.ecosystem.api.EcosystemApi;
import adlabs.maestro.client.backend.api.ecosystem.EcosystemService;
import retrofit2.Call;

/**
 * Ecosystem Service Implementation
 */
public class EcosystemServiceImpl extends BaseService implements EcosystemService {

    private final EcosystemApi ecosystemApi;

    /**
     * Ecosystem Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public EcosystemServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        ecosystemApi = getRetrofit().create(EcosystemApi.class);
    }

    @Override
    public Result<TimestampedAddress> resolveAdaHandle(String handle) throws ApiException {
        Call<TimestampedAddress> call = ecosystemApi.adahandleResolve(handle);
        return processResponse(call);
    }
}