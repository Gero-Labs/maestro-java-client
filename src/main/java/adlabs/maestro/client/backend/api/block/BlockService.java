package adlabs.maestro.client.backend.api.block;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.block.model.Block;

/**
 * Block Service
 */
public interface BlockService {

    /**
     * Latest block information
     * Returns information about the most recently minted block
     * <p><b>200</b> - Success!
     * <p><b>401</b> - The selected server has restricted the endpoint to be only usable via authentication. The authentication supplied was not authorized to access the endpoint
     * <p><b>404</b> - The server does not recognise the combination of endpoint and parameters provided
     *
     * @return Result of detailed summary of latest {@link Block}
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<Block> getLatestBlock() throws ApiException;
}
