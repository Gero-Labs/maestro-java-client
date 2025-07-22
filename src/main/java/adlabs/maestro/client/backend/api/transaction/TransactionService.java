package adlabs.maestro.client.backend.api.transaction;

import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.transaction.model.*;
import adlabs.maestro.client.backend.factory.options.Options;
import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;

import java.util.List;

/**
 * Transactions Service
 */
public interface TransactionService {

    /**
     * Executes the redeemers of a transaction in order to compute how many execution units are needed for each.
     *
     * @param evaluateRequest The evaluation request
     * @return Details of executed redeemers
     * @throws ApiException if an error occurs during API call
     */
    Result<List<EvaluatedRedeemer>> evaluateRedeemers(EvaluateRequest evaluateRequest) throws ApiException;

    /**
     * Returns the specified transaction outputs.
     *
     * @param requestBody List of transaction output references
     * @param options     Options for pagination and number formatting.
     * <p>-<b> resolve_datums:</b> - Try find and include the corresponding datums for datum hashes</p>
     * <p>-<b> with_cbor:</b> - Include the CBOR encoding of the transaction output in the response</p>
     * <p>-<b> allow_missing:</b> - Do not return 404 if any transactions are not found</p>
     * @return Get transaction outputs via output references
     * @throws ApiException if an error occurs during API call
     */
    Result<PaginatedUtxoWithBytes> getTxOsByTxORefs(List<String> requestBody, Options options) throws ApiException;

    /**
     * Returns detailed information about a transaction.
     *
     * @param txHash Transaction hash in hex
     * @return Detailed information about the specified transaction
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedTransactionInfo> getTxInfo(String txHash) throws ApiException;

    /**
     * Returns hex-encoded CBOR bytes of a transaction.
     *
     * @param txHash Transaction Hash
     * @return Get a transaction's hex encoded cbor via a transaction hash
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedTxCbor> getTxCborByTxHash(String txHash) throws ApiException;

    /**
     * Returns the address which was specified in the given transaction output.
     *
     * @param txHash Transaction Hash
     * @param index  Output Index
     * @return Get an address via a transaction output reference
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedAddress> getAddressByTxO(String txHash, Integer index) throws ApiException;

    /**
     * Returns the specified transaction output.
     *
     * @param txHash  Transaction Hash
     * @param index   Output Index
     * @param options Options for pagination and number formatting.
     * <p>-<b> with_cbor:</b> - Include the CBOR encoding of the transaction output in the response</p>
     * @return Get a transaction output via its output reference
     * @throws ApiException if an error occurs during API call
     */
    Result<TimestampedUtxo> getTxOByTxORef(String txHash, Integer index, Options options) throws ApiException;

}