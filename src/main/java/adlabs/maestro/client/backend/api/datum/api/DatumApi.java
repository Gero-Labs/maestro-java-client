package adlabs.maestro.client.backend.api.datum.api;

import adlabs.maestro.client.backend.api.datum.model.TimestampedDatum;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatumMap;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

/**
 * Datums API
 *
 */
public interface DatumApi {

    /**
     * Datum by datum hash
     * Returns the datum corresponding to the specified datum hash, if the datum has been seen on-chain
     *
     * @param datumHash Hex encoded datum hash
     * @return Datum corresponding to the datum hash
     */
    @GET("datums/{datum_hash}")
    Call<TimestampedDatum> datumByHash(
            @Path("datum_hash") String datumHash
    );

    /**
     * Datums by hashes
     * Returns the datums corresponding to the specified datum hashes, if the datums have been seen on-chain
     *
     * @param requestBody List of datum hashes
     * @return Map of datum hashes to datum objects
     */
    @POST("datums")
    Call<TimestampedDatumMap> datumsByHashes(
            @Body List<String> requestBody
    );
}
