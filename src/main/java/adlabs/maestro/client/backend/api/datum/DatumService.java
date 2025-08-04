package adlabs.maestro.client.backend.api.datum;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatum;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatumMap;

import java.util.List;

/**
 * Service interface for datum-related operations.
 * Provides methods to retrieve datums by their hashes from the blockchain.
 */
public interface DatumService {
    /**
     * Get Datum by Datum Hash
     * @param datumHash Datum by datum hash
     * @return Returns the datums corresponding to the specified datum hashes, if the datums have been seen on-chain
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<TimestampedDatum> getDatumByHash(String datumHash) throws ApiException;

    /**
     * Get Datums by Datum Hashes
     * Return the datums corresponding to the specified datum hashes, if the datums have been seen on-chain
     * @param datumHashes List of datum hashes
     * @return Map of datum hashes to datum objects
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<TimestampedDatumMap> getDatumsByHashes(List<String> datumHashes) throws ApiException;
}
