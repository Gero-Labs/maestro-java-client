package adlabs.maestro.client.backend.api.address.api;

import adlabs.maestro.client.backend.api.address.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

/**
 * Addresses API
 *
 */
public interface AddressesApi {

    /**
     * Balance by payment credential
     * Return total amount of assets, including ADA, in UTxOs controlled by a specific payment credential
     *
     * @param credential Payment credential in bech32 format
     * @return Lovelace and native asset balance of payment credential
     */
    @GET("addresses/cred/{credential}/balance")
    Call<TimestampedBalance> getBalanceByPaymentCred(
            @Path("credential") String credential
    );

    /**
     * Decode address
     * Returns the different information encoded within a Cardano address, including details of the payment and delegation parts of the address
     *
     * @param address Address in bech32/hex/base58 format
     * @return Decode an address
     */
    @GET("addresses/{address}/decode")
    Call<AddressInfo> decodeAddress(
            @Path("address") String address
    );

    /**
     * Address transaction count
     * Returns the number of transactions in which the address spent or received some funds.
     *
     * @param address Address in bech32 format
     * @return Get the transaction count for an address
     */
    @GET("addresses/{address}/transactions/count")
    Call<TimestampedTxCount> getAddressTransactionsCount(
            @Path("address") String address
    );

    /**
     * Address transactions
     * Returns transactions in which the specified address spent or received funds.
     *
     * @param address Address in bech32 format
     * @param options A map of optional query parameters.
     * <ul>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code order}: The order in which the results are sorted (by point in chain)</li>
     * <li>{@code from}: Return only transactions minted on or after a specific slot</li>
     * <li>{@code to}: Return only transactions minted on or before a specific slot</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Get the transactions for an address
     */
    @GET("addresses/{address}/transactions")
    Call<PaginatedAddressTransaction> getAddressTransactions(
            @Path("address") String address,
            @QueryMap Map<String, String> options
    );

    /**
     * Payment credential transactions
     * Returns transactions in which the specified payment credential spent or received funds, or was a required signer.
     *
     * @param credential Payment credential in bech32 format
     * @param options    A map of optional query parameters.
     * <ul>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code order}: The order in which the results are sorted (by point in chain)</li>
     * <li>{@code from}: Return only transactions minted on or after a specific slot</li>
     * <li>{@code to}: Return only transactions minted on or before a specific slot</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Get the transactions for an address
     */
    @GET("addresses/cred/{credential}/transactions")
    Call<PaginatedPaymentCredentialTransaction> getTransactionsByPaymentCredential(
            @Path("credential") String credential,
            @QueryMap Map<String, String> options
    );

    /**
     * Transactions by multiple payment credentials
     * Returns transactions in which at least one of a list specified payment credentials spent or received funds, or was a required signer.
     *
     * @param requestBody List of payment credentials
     * @param options     A map of optional query parameters.
     * <ul>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code order}: The order in which the results are sorted (by point in chain)</li>
     * <li>{@code from}: Return only transactions minted on or after a specific slot</li>
     * <li>{@code to}: Return only transactions minted on or before a specific slot</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Transactions involving payment credentials
     */
    @POST("addresses/cred/transactions")
    Call<PaginatedPaymentCredentialsTransaction> getTransactionsByPaymentCredentials(
            @Body List<String> requestBody,
            @QueryMap Map<String, String> options
    );

    /**
     * UTxO references at an address
     * Returns references (pair of transaction hash and output index in transaction) for UTxOs controlled by the specified address
     *
     * @param address Address in bech32 format
     * @param options A map of optional query parameters.
     * <ul>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code order}: The order in which the results are sorted (by slot at which UTxO was produced)</li>
     * <li>{@code from}: Return only UTxOs created on or after a specific slot</li>
     * <li>{@code to}: Return only UTxOs created on or before a specific slot</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return UTxO references for all the unspent transaction outputs at an address
     */
    @GET("addresses/{address}/utxo_refs")
    Call<PaginatedUtxoRef> getUTxORefsByAddress(
            @Path("address") String address,
            @QueryMap Map<String, String> options
    );

    /**
     * UTxOs at an address
     * Return detailed information on UTxOs controlled by an address
     *
     * @param address          Address in bech32 format
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @param options          A map of optional query parameters.
     * <ul>
     * <li>{@code asset}: Return only UTxOs which contain some of a specific asset</li>
     * <li>{@code resolve_datums}: Try find and include the corresponding datums for datum hashes</li>
     * <li>{@code with_cbor}: Include the CBOR encodings of the transaction outputs in the response</li>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code order}: The order in which the results are sorted (by slot at which UTxO was produced)</li>
     * <li>{@code from}: Return only UTxOs created on or after a specific slot</li>
     * <li>{@code to}: Return only UTxOs created on or before a specific slot</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Get all unspent transaction outputs at an address
     */
    @Headers("amounts-as-strings: true")
    @GET("addresses/{address}/utxos")
    Call<PaginatedUtxoWithSlot> getUTxOsByAddress(
            @Path("address") String address,
            @QueryMap Map<String, String> options
    );

    /**
     * UTxOs by multiple addresses
     * Return detailed information on UTxOs which are controlled by some address in the specified list of addresses
     *
     * @param requestBody      List of addresses
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @param options          A map of optional query parameters.
     * <ul>
     * <li>{@code resolve_datums}: Try find and include the corresponding datums for datum hashes</li>
     * <li>{@code with_cbor}: Include the CBOR encodings of the transaction outputs in the response</li>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Get all unspent transaction outputs residing at any address in a list
     */
    @Headers("amounts-as-strings: true")
    @POST("addresses/utxos")
    Call<PaginatedUtxoWithSlot> getUTxOsByAddresses(
            @Body List<String> requestBody,
            @QueryMap Map<String, String> options
    );

    /**
     * UTxOs by payment credential
     * Return detailed information on UTxOs controlled by addresses which use the specified payment credential
     *
     * @param credential       Payment credential in bech32 format
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @param options          A map of optional query parameters.
     * <ul>
     * <li>{@code asset}: Return only UTxOs which contain some of a specific asset</li>
     * <li>{@code resolve_datums}: Try find and include the corresponding datums for datum hashes</li>
     * <li>{@code with_cbor}: Include the CBOR encodings of the transaction outputs in the response</li>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code order}: The order in which the results are sorted (by slot at which UTxO was produced)</li>
     * <li>{@code from}: Return only UTxOs created on or after a specific slot</li>
     * <li>{@code to}: Return only UTxOs created on or before a specific slot</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Get all unspent transaction outputs at addresses with the given payment credential
     */
    @Headers("amounts-as-strings: true")
    @GET("addresses/cred/{credential}/utxos")
    Call<PaginatedUtxoWithSlot> getUTxOsByPaymentCredential(
            @Path("credential") String credential,
            @QueryMap Map<String, String> options
    );

    /**
     * UTxOs by multiple payment credentials
     * Return detailed information on UTxOs which are controlled by some payment credential in a list of payment credentials.
     *
     * @param requestBody      List of payment credentials
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @param options          A map of optional query parameters.
     * <ul>
     * <li>{@code resolve_datums}: Try find and include the corresponding datums for datum hashes</li>
     * <li>{@code with_cbor}: Include the CBOR encodings of the transaction outputs in the response</li>
     * <li>{@code count}: The max number of results per page</li>
     * <li>{@code cursor}: Pagination cursor string</li>
     * </ul>
     * @return Unspent transaction outputs
     */
    @Headers("amounts-as-strings: true")
    @POST("addresses/cred/utxos")
    Call<PaginatedUtxoWithSlot> getUTxOsByPaymentCredentials(
            @Body List<String> requestBody,
            @QueryMap Map<String, String> options
    );
}
