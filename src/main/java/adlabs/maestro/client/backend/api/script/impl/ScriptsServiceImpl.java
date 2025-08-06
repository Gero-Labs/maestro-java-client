package adlabs.maestro.client.backend.api.script.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.script.api.ScriptsApi;
import adlabs.maestro.client.backend.api.script.model.TimestampedScriptFirstSeen;
import adlabs.maestro.client.backend.api.script.ScriptsService;
import retrofit2.Call;

/**
 * Implementation of the ScriptsService.
 */
public class ScriptsServiceImpl extends BaseService implements ScriptsService {

    private final ScriptsApi scriptsApi;

    /**
     * Constructor for ScriptsServiceImpl.
     *
     * @param baseUrl  Base URL of the Maestro API.
     * @param apiToken API token for authentication.
     */
    public ScriptsServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        this.scriptsApi = getRetrofit().create(ScriptsApi.class);
    }

    private void validateScriptHash(String scriptHash) throws ApiException {
        if (scriptHash == null || scriptHash.trim().isEmpty()) {
            throw new ApiException("Script hash cannot be null or empty.");
        }
    }

    @Override
    public Result<TimestampedScriptFirstSeen> getScriptByHash(String scriptHash) throws ApiException {
        validateHexFormat(scriptHash);
        Call<TimestampedScriptFirstSeen> call = scriptsApi.scriptByHash(scriptHash);
        return processResponse(call);
    }
}