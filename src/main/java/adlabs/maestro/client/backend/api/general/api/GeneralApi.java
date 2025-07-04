package adlabs.maestro.client.backend.api.general.api;

import adlabs.maestro.client.backend.api.general.model.TimestampedChainTip;
import adlabs.maestro.client.backend.api.general.model.TimestampedEraSummaries;
import adlabs.maestro.client.backend.api.general.model.TimestampedProtocolParameters;
import adlabs.maestro.client.backend.api.general.model.TimestampedSystemStart;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * General API
 *
 */
public interface GeneralApi {

    /**
     * Chain-tip
     * Returns the identifier of the most recently processed block on the network
     *
     * @return Get details of the chain-tip (lastest block)
     */
    @GET("chain-tip")
    Call<TimestampedChainTip> chainTip();

    /**
     * GET /era-summaries : Era summary
     * Returns the blockchain era summaries. May include a future Era before hard forks. You should not assume the last item is the current epoch. Check "slot" against the current /chain-tip.
     *
     * @return Get era summaries
     */
    @GET("era-summaries")
    Call<TimestampedEraSummaries> eraSummaries();

    /**
     * Protocol parameters
     * Returns the current blockchain protocol parameters
     *
     * @return Get protocol params
     */
    @GET("protocol-parameters")
    Call<TimestampedProtocolParameters> protocolParameters();

    /**
     * Blockchain system start
     * Returns the blockchain system start time
     *
     * @return Get system start time
     */
    @GET("system-start")
    Call<TimestampedSystemStart> systemStart();
}

