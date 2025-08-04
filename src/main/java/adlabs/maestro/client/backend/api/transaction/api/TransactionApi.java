package adlabs.maestro.client.backend.api.transaction.api;

import adlabs.maestro.client.backend.api.transaction.model.*;
import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * Transactions API
 *
 */
public interface TransactionApi {

    /**
     * Address by transaction output reference
     * Returns the address which was specified in the given transaction output.
     *
     * @param txHash Transaction Hash
     * @param index Output Index
     * @return Get an address via a transaction output reference
     */
    @GET("transactions/{tx_hash}/outputs/{index}/address")
    Call<TimestampedAddress> addressByTxo(
            @Path("tx_hash") String txHash,
            @Path("index") Integer index
    );

    /**
     * Evaluate redeemers of a transaction
     * Executes the redeemers of a transaction in order to compute how many execution units are needed for each.
     *
     * @param evaluateRequest The evaluation request
     * @return Details of executed redeemers
     */
    @POST("transactions/evaluate")
    Call<List<EvaluatedRedeemer>> evaluateRedeemers(
            @Body EvaluateRequest evaluateRequest
    );

    /**
     * CBOR bytes of a transaction
     * Returns hex-encoded CBOR bytes of a transaction
     *
     * @param txHash Transaction Hash
     * @return Get a transaction's hex encoded cbor via a transaction hash
     */
    @GET("transactions/{tx_hash}/cbor")
    Call<TimestampedTxCbor> txCborByTxHash(
            @Path("tx_hash") String txHash
    );

    /**
     * Transaction details
     * Returns detailed information about a transaction
     *
     * @param txHash Transaction hash in hex
     * @return Detailed information about the specified transaction
     */
    @GET("transactions/{tx_hash}")
    Call<TimestampedTransactionInfo> txInfo(
            @Path("tx_hash") String txHash
    );

    /**
     * Transaction output by output reference
     * Returns the specified transaction output.
     *
     * @param txHash Transaction Hash
     * @param index Output Index
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> with_cbor:</b> - Include the CBOR encoding of the transaction output in the response</p>
     * @return Get a transaction output via its output reference
     */
    @GET("transactions/{tx_hash}/outputs/{index}/txo")
    Call<TimestampedUtxo> txoByTxoRef(
            @Path("tx_hash") String txHash,
            @Path("index") Integer index,
            @QueryMap Map<String, String> options
    );

    /**
     * Transaction outputs by output references
     * Returns the specified transaction outputs.
     *
     * @param requestBody List of transaction output references
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> resolve_datums:</b> - Try find and include the corresponding datums for datum hashes</p>
     * <p>-<b> with_cbor:</b> - Include the CBOR encoding of the transaction output in the response</p>
     * <p>-<b> allow_missing:</b> - Do not return 404 if any transactions are not found</p>
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Get transaction outputs via output references
     */
    @POST("transactions/outputs")
    Call<PaginatedUtxoWithBytes> txosByTxoRefs(
            @Body List<String> requestBody,
            @QueryMap Map<String, String> options
    );
}