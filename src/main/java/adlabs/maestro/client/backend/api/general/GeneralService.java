package adlabs.maestro.client.backend.api.general;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.general.model.TimestampedChainTip;
import adlabs.maestro.client.backend.api.general.model.TimestampedEraSummaries;
import adlabs.maestro.client.backend.api.general.model.TimestampedProtocolParameters;
import adlabs.maestro.client.backend.api.general.model.TimestampedSystemStart;

/**
 * General Service
 */
public interface GeneralService {

    /**
     * Returns the identifier of the most recently processed block on the network.
     *
     * @return Details of the chain-tip (latest block)
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedChainTip> chainTip() throws ApiException;

    /**
     * Returns the blockchain era summaries. May include a future Era before hard forks.
     * You should not assume the last item is the current epoch. Check "slot" against the current /chain-tip.
     *
     * @return Era summaries
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedEraSummaries> eraSummaries() throws ApiException;

    /**
     * Returns the current blockchain protocol parameters.
     *
     * @return Protocol params
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedProtocolParameters> protocolParameters() throws ApiException;

    /**
     * Returns the blockchain system start time.
     *
     * @return System start time
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedSystemStart> systemStart() throws ApiException;
}