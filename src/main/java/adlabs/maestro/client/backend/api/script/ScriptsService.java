package adlabs.maestro.client.backend.api.script;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.script.model.TimestampedScriptFirstSeen;

/**
 * A service for retrieving on-chain script information.
 */
public interface ScriptsService {

    /**
     * Retrieves the script corresponding to a specific script hash.
     * This information is only available if the script has been seen on-chain.
     *
     * @param scriptHash The hex-encoded script hash.
     * @return A {@link Result} containing the {@link TimestampedScriptFirstSeen} if found.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<TimestampedScriptFirstSeen> getScriptByHash(String scriptHash) throws ApiException;
}