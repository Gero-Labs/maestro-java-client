package adlabs.maestro.client.backend.api.asset;

import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetHolder;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetHolderAccount;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetUtxo;
import adlabs.maestro.client.backend.api.asset.model.PaginatedMintTransaction;
import adlabs.maestro.client.backend.api.asset.model.PaginatedTimestampedTransaction;
import adlabs.maestro.client.backend.api.asset.model.TimestampedAssetInfo;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.options.Options;

/**
 * A service for retrieving information about native assets on the Cardano blockchain.
 */
public interface AssetService {

    /**
     * Retrieves a list of stake accounts that hold a specific asset.
     * <p>
     * This endpoint merges addresses by their delegation part/account. Note that an asset's association
     * with a stake account doesn't guarantee the account owner controls the asset.
     *
     * @param asset Asset, encoded as a concatenation of the hex policy ID and hex asset name.
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * @return A {@link Result} containing a {@link PaginatedAssetHolderAccount} with the list of stake addresses.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<PaginatedAssetHolderAccount> getAssetAccounts(String asset, Options options) throws ApiException;

    /**
     * Retrieves a list of addresses that hold a specific native asset.
     *
     * @param asset Asset, encoded as a concatenation of the hex policy ID and hex asset name.
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * @return A {@link Result} containing a {@link PaginatedAssetHolder} with addresses and their corresponding asset amounts.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<PaginatedAssetHolder> getAssetAddresses(String asset, Options options) throws ApiException;

    /**
     * Retrieves detailed information about a specific native asset.
     *
     * @param asset Asset, encoded as a concatenation of the hex policy ID and hex asset name.
     * @return A {@link Result} containing the {@link TimestampedAssetInfo} for the asset.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<TimestampedAssetInfo> getAssetInfo(String asset) throws ApiException;

    /**
     * Retrieves the minting and burning history for a specific native asset.
     *
     * @param asset Asset, encoded as a concatenation of the hex policy ID and hex asset name.
     * @param options Options for pagination and sorting (e.g., count, cursor, order, from/to slots).
     * @return A {@link Result} containing a {@link PaginatedMintTransaction} list.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<PaginatedMintTransaction> getAssetMints(String asset, Options options) throws ApiException;

    /**
     * Retrieves a list of all transactions involving a specific native asset.
     *
     * @param asset Asset, encoded as a concatenation of the hex policy ID and hex asset name.
     * @param options Options for pagination and sorting (e.g., count, cursor, order, from/to slots).
     * @return A {@link Result} containing a {@link PaginatedTimestampedTransaction} list.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<PaginatedTimestampedTransaction> getAssetTransactions(String asset, Options options) throws ApiException;

    /**
     * Retrieves a list of UTxOs containing a specific native asset.
     *
     * @param asset Asset, encoded as a concatenation of the hex policy ID and hex asset name.
     * @param options Options for filtering, pagination, and sorting (e.g., address, count, cursor, order).
     * @return A {@link Result} containing a {@link PaginatedAssetUtxo} list, with each entry paired with the asset amount.
     * @throws ApiException if an error occurs during the API call.
     */
    Result<PaginatedAssetUtxo> getAssetUtxos(String asset, Options options) throws ApiException;
}