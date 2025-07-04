package adlabs.maestro.client.backend.api.address.api;

import adlabs.maestro.client.backend.api.address.model.AddressInfo;
import adlabs.maestro.client.backend.api.address.model.Balance;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddressTransaction;
import adlabs.maestro.client.backend.api.address.model.PaginatedPaymentCredentialTransaction;
import adlabs.maestro.client.backend.api.address.model.PaginatedPaymentCredentialsTransaction;
import adlabs.maestro.client.backend.api.address.model.PaginatedUtxoRef;
import adlabs.maestro.client.backend.api.address.PaginatedUtxoWithSlot;
import adlabs.maestro.client.backend.api.address.model.TimestampedTxCount;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

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
    Call<Balance> balanceByPaymentCred(
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
    Call<TimestampedTxCount> txCountByAddress(
            @Path("address") String address
    );

    /**
     * Address transactions
     * Returns transactions in which the specified address spent or received funds.
     *
     * @param address Address in bech32 format
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by point in chain)
     * @param from Return only transactions minted on or after a specific slot
     * @param to Return only transactions minted on or before a specific slot
     * @param cursor Pagination cursor string
     * @return Get the transactions for an address
     */
    @GET("addresses/{address}/transactions")
    Call<PaginatedAddressTransaction> txsByAddress(
            @Path("address") String address,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor
    );

    /**
     * Payment credential transactions
     * Returns transactions in which the specified payment credential spent or received funds, or was a required signer.
     *
     * @param credential Payment credential in bech32 format
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by point in chain)
     * @param from Return only transactions minted on or after a specific slot
     * @param to Return only transactions minted on or before a specific slot
     * @param cursor Pagination cursor string
     * @return Get the transactions for an address
     */
    @GET("addresses/cred/{credential}/transactions")
    Call<PaginatedPaymentCredentialTransaction> txsByPaymentCred(
            @Path("credential") String credential,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor
    );

    /**
     * Transactions by multiple payment credentials
     * Returns transactions in which at least one of a list specified payment credentials spent or received funds, or was a required signer.
     *
     * @param requestBody List of payment credentials
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by point in chain)
     * @param from Return only transactions minted on or after a specific slot
     * @param to Return only transactions minted on or before a specific slot
     * @param cursor Pagination cursor string
     * @return Transactions involving payment credentials
     */
    @POST("addresses/cred/transactions")
    Call<PaginatedPaymentCredentialsTransaction> txsByPaymentCreds(
            @Body List<String> requestBody,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor
    );

    /**
     * UTxO references at an address
     * Returns references (pair of transaction hash and output index in transaction) for UTxOs controlled by the specified address
     *
     * @param address Address in bech32 format
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by slot at which UTxO was produced)
     * @param from Return only UTxOs created on or after a specific slot
     * @param to Return only UTxOs created on or before a specific slot
     * @param cursor Pagination cursor string
     * @return UTxO references for all the unspent transaction outputs at an address
     */
    @GET("addresses/{address}/utxo_refs")
    Call<PaginatedUtxoRef> utxoRefsAtAddress(
            @Path("address") String address,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor
    );

    /**
     * UTxOs at an address
     * Return detailed information on UTxOs controlled by an address
     *
     * @param address Address in bech32 format
     * @param asset Return only UTxOs which contain some of a specific asset
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor Include the CBOR encodings of the transaction outputs in the response
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by slot at which UTxO was produced)
     * @param from Return only UTxOs created on or after a specific slot
     * @param to Return only UTxOs created on or before a specific slot
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Get all unspent transaction outputs at an address
     */
    @GET("addresses/{address}/utxos")
    Call<PaginatedUtxoWithSlot> utxosByAddress(
            @Path("address") String address,
            @Query("asset") String asset,
            @Query("resolve_datums") Boolean resolveDatums,
            @Query("with_cbor") Boolean withCbor,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * UTxOs by multiple addresses
     * Return detailed information on UTxOs which are controlled by some address in the specified list of addresses
     *
     * @param requestBody List of addresses
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor Include the CBOR encodings of the transaction outputs in the response
     * @param count The max number of results per page
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Get all unspent transaction outputs residing at any address in a list
     */
    @POST("addresses/utxos")
    Call<PaginatedUtxoWithSlot> utxosByAddresses(
            @Body List<String> requestBody,
            @Query("resolve_datums") Boolean resolveDatums,
            @Query("with_cbor") Boolean withCbor,
            @Query("count") Integer count,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * UTxOs by payment credential
     * Return detailed information on UTxOs controlled by addresses which use the specified payment credential
     *
     * @param credential Payment credential in bech32 format
     * @param asset Return only UTxOs which contain some of a specific asset
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor Include the CBOR encodings of the transaction outputs in the response
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by slot at which UTxO was produced)
     * @param from Return only UTxOs created on or after a specific slot
     * @param to Return only UTxOs created on or before a specific slot
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Get all unspent transaction outputs at addresses with the given payment credential
     */
    @GET("addresses/cred/{credential}/utxos")
    Call<PaginatedUtxoWithSlot> utxosByPaymentCred(
            @Path("credential") String credential,
            @Query("asset") String asset,
            @Query("resolve_datums") Boolean resolveDatums,
            @Query("with_cbor") Boolean withCbor,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * UTxOs by multiple payment credentials
     * Return detailed information on UTxOs which are controlled by some payment credential in a list of payment credentials.
     *
     * @param requestBody List of payment credentials
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor Include the CBOR encodings of the transaction outputs in the response
     * @param count The max number of results per page
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Unspent transaction outputs
     */
    @POST("addresses/cred/utxos")
    Call<PaginatedUtxoWithSlot> utxosByPaymentCreds(
            @Body List<String> requestBody,
            @Query("resolve_datums") Boolean resolveDatums,
            @Query("with_cbor") Boolean withCbor,
            @Query("count") Integer count,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );
}
