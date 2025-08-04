package adlabs.maestro.client.backend.api.script.api;

import adlabs.maestro.client.backend.api.script.model.TimestampedScriptFirstSeen;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Scripts API
 *
 */
public interface ScriptsApi {

    /**
     * Script by script hash
     * Returns the script corresponding to the specified script hash, if the script has been seen on-chain
     *
     * @param scriptHash Hex encoded script hash
     * @return Script corresponding to the provided script hash
     */
    @GET("scripts/{script_hash}")
    Call<TimestampedScriptFirstSeen> scriptByHash(
            @Path("script_hash") String scriptHash
    );
}
