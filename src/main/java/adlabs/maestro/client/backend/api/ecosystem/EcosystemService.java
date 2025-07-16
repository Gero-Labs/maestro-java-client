package adlabs.maestro.client.backend.api.ecosystem;

import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;

/**
 * Ecosystem Service
 */
public interface EcosystemService {

    /**
     * Resolve an ADA Handle.
     * Returns the Cardano address corresponding to a given ADA Handle.
     *
     * @param handle The Ada Handle to resolve.
     * @return A Result containing the address to which the Ada Handle resolves.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedAddress> resolveAdaHandle(String handle) throws ApiException;
}