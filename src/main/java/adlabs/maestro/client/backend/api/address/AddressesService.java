package adlabs.maestro.client.backend.api.address;

import adlabs.maestro.client.backend.api.address.model.*;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.options.Options;

import java.util.List;

/**
 * Addresses Service
 */
public interface AddressesService {

    /**
     * Get Balance by Payment Credential
     * Return total amount of assets, including ADA, in UTxOs controlled by a specific payment credential
     *
     * @param credential Payment credential in bech32 format
     * @return Lovelace and native asset balance of payment credential
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<TimestampedBalance> getBalanceByPaymentCredential(String credential) throws ApiException;

    /**
     * Decode Address
     * Returns the different information encoded within a Cardano address, including details of the payment and delegation parts of the address
     *
     * @param address Address in bech32/hex/base58 format
     * @return Decoded address information
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<AddressInfo> decodeAddress(String address) throws ApiException;

    /**
     * Get Address Transaction Count
     * Returns the number of transactions in which the address spent or received some funds.
     *
     * @param address Address in bech32 format
     * @return The transaction count for an address
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<TimestampedTxCount> getAddressTransactionsCount(String address) throws ApiException;

    /**
     * Get Address Transactions
     * Returns transactions in which the specified address spent or received funds.
     *
     * @param address Address in bech32 format
     * @param options Filtering and Pagination options (optional)
     * @return Paginated list of address transactions
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedAddressTransaction> getAddressTransactions(String address, Options options) throws ApiException;

    /**
     * Get Transactions by Payment Credential
     * Returns transactions in which the specified payment credential spent or received funds, or was a required signer.
     *
     * @param credential Payment credential in bech32 format
     * @param options    Filtering and Pagination options (optional)
     * @return Paginated list of payment credential transactions
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedPaymentCredentialTransaction> getTransactionsByPaymentCredential(String credential, Options options) throws ApiException;

    /**
     * Get Transactions by Multiple Payment Credentials
     * Returns transactions in which at least one of a list specified payment credentials spent or received funds, or was a required signer.
     *
     * @param credentials List of payment credentials
     * @param options     Filtering and Pagination options (optional)
     * @return Paginated list of transactions involving the payment credentials
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedPaymentCredentialsTransaction> getTransactionsByPaymentCredentials(List<String> credentials, Options options) throws ApiException;

    /**
     * Get UTxO References at an Address
     * Returns references (pair of transaction hash and output index in transaction) for UTxOs controlled by the specified address
     *
     * @param address Address in bech32 format
     * @param options Filtering and Pagination options (optional)
     * @return Paginated list of UTxO references for the address
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedUtxoRef> getUTxORefsByAddress(String address, Options options) throws ApiException;

    /**
     * Get UTxOs at an Address
     * Return detailed information on UTxOs controlled by an address
     *
     * @param address       Address in bech32 format
     * @param asset         Return only UTxOs which contain some of a specific asset
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor      Include the CBOR encodings of the transaction outputs in the response
     * @param options       Filtering and Pagination options (optional)
     * @return Paginated list of all unspent transaction outputs at an address
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedUtxoWithSlot> getUTxOsByAddress(String address, String asset, boolean resolveDatums, boolean withCbor, Options options) throws ApiException;

    /**
     * Get UTxOs by Multiple Addresses
     * Return detailed information on UTxOs which are controlled by some address in the specified list of addresses
     *
     * @param addresses     List of addresses
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor      Include the CBOR encodings of the transaction outputs in the response
     * @param options       Filtering and Pagination options (optional)
     * @return Paginated list of all unspent transaction outputs residing at any address in the list
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedUtxoWithSlot> getUTxOsByAddresses(List<String> addresses, boolean resolveDatums, boolean withCbor, Options options) throws ApiException;

    /**
     * Get UTxOs by Payment Credential
     * Return detailed information on UTxOs controlled by addresses which use the specified payment credential
     *
     * @param credential    Payment credential in bech32 format
     * @param asset         Return only UTxOs which contain some of a specific asset
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor      Include the CBOR encodings of the transaction outputs in the response
     * @param options       Filtering and Pagination options (optional)
     * @return Paginated list of all unspent transaction outputs at addresses with the given payment credential
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedUtxoWithSlot> getUTxOsByPaymentCredential(String credential, String asset, boolean resolveDatums, boolean withCbor, Options options) throws ApiException;

    /**
     * Get UTxOs by Multiple Payment Credentials
     * Return detailed information on UTxOs which are controlled by some payment credential in a list of payment credentials.
     *
     * @param credentials   List of payment credentials
     * @param resolveDatums Try find and include the corresponding datums for datum hashes
     * @param withCbor      Include the CBOR encodings of the transaction outputs in the response
     * @param options       Filtering and Pagination options (optional)
     * @return Paginated list of unspent transaction outputs
     * @throws ApiException if an error occurs while attempting to invoke the API
     */
    Result<PaginatedUtxoWithSlot> getUTxOsByPaymentCredentials(List<String> credentials, boolean resolveDatums, boolean withCbor, Options options) throws ApiException;
}
