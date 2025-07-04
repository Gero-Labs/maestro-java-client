package adlabs.maestro.client.backend.api.transactions.api;

import adlabs.maestro.client.backend.models.EvaluateRequest;
import adlabs.maestro.client.backend.models.EvaluatedRedeemer;
import adlabs.maestro.client.backend.models.PaginatedUtxoWithBytes;
import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import adlabs.maestro.client.backend.models.TimestampedTransactionInfo;
import adlabs.maestro.client.backend.models.TimestampedTxCbor;
import adlabs.maestro.client.backend.models.TimestampedUtxo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Transactions API
 *
 */
public interface TransactionsApi {

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
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Detailed information about the specified transaction
     */
    @GET("transactions/{tx_hash}")
    Call<TimestampedTransactionInfo> txInfo(
            @Path("tx_hash") String txHash,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * Transaction output by output reference
     * Returns the specified transaction output.
     *
     * @param txHash Transaction Hash
     * @param index Output Index
     * @param withCbor Include the CBOR encoding of the transaction output in the response
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Get a transaction output via its output reference
     */
    @GET("transactions/{tx_hash}/outputs/{index}/txo")
    Call<TimestampedUtxo> txoByTxoRef(
            @Path("tx_hash") String txHash,
            @Path("index") Integer index,
            @Query("with_cbor") Boolean withCbor,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * Transaction outputs by output references
     * Returns the specified transaction outputs.
     *
     * @param requestBody List of transaction output references
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor Include the CBOR encoding of the transaction output in the response
     * @param allowMissing Do not return 404 if any transactions are not found
     * @param count The max number of results per page
     * @param cursor Pagination cursor string
     * @return Get transaction outputs via output references
     */
    @POST("transactions/outputs")
    Call<PaginatedUtxoWithBytes> txosByTxoRefs(
            @Body List<String> requestBody,
            @Query("resolve_datums") Boolean resolveDatums,
            @Query("with_cbor") Boolean withCbor,
            @Query("allow_missing") Boolean allowMissing,
            @Query("count") Integer count,
            @Query("cursor") String cursor
    );
}
