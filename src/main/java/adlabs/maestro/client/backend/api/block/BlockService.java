package adlabs.maestro.client.backend.api.block;

import adlabs.maestro.client.backend.api.block.model.TimestampedBlockInfo;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;

/**
 * A service for retrieving information about blocks on the Cardano blockchain.
 */
public interface BlockService {

    /**
     * Retrieves detailed information for a specific block.
     *
     * @param hashOrHeight The block's height (integer) or its hex-encoded hash (string).
     * @return A {@link Result} containing a {@link TimestampedBlockInfo} summary for the specified block.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<TimestampedBlockInfo> getBlockInfo(String hashOrHeight) throws ApiException;

    /**
     * Retrieves information for the most recently minted block.
     *
     * @return A {@link Result} containing a {@link TimestampedBlockInfo} summary for the latest block.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<TimestampedBlockInfo> getLatestBlock() throws ApiException;
}