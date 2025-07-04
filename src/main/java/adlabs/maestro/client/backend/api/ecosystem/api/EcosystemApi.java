package adlabs.maestro.client.backend.api.ecosystem.api;

import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Ecosystem API
 *
 */
public interface EcosystemApi {

    /**
     * Resolve ADA Handle
     * Returns the Cardano address corresponding to an ADA Handle
     *
     * @param handle Ada Handle to resolve
     * @return Return the address which the Ada Handle resolves to
     */
    @GET("ecosystem/adahandle/{handle}")
    Call<TimestampedAddress> adahandleResolve(
            @Path("handle") String handle
    );
}

