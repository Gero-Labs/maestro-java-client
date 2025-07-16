package adlabs.maestro.client.backend.api.asset.api;

import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetHolder;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetHolderAccount;
import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetUtxo;
import adlabs.maestro.client.backend.api.asset.model.PaginatedMintTransaction;
import adlabs.maestro.client.backend.api.asset.model.PaginatedTimestampedTransaction;
import adlabs.maestro.client.backend.api.asset.model.TimestampedAssetInfo;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Assets API
 *
 */
public interface AssetApi {

    /**
     * Accounts of addresses holding specific asset
     * Returns a list of accounts (as stake/reward addresses) associated with addresses which control some of the specified asset; in other words, instead of returning the addresses which hold some of the asset, the addresses are merged by their delegation part/account. Assets controlled by Byron, enterprise, or pointer addresses are omitted.  CAUTION: An asset being associated with a particular stake account does not necessarily mean the owner of that account controls the asset; use "asset addresses" unless you are sure you want to work with stake keys. Read more [here]( https://medium.com/adamant-security/multi-sig-concerns-mangled-addresses-and-the-dangers-of-using-stake-keys-in-your-cardano-project-94894319b1d8).
     *
     * @param asset Asset, encoded as concatenation of hex of policy ID and asset name
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Returns stake addresses for accounts which control some of the specified asset
     */
    @GET("assets/{asset}/accounts")
    Call<PaginatedAssetHolderAccount> assetAccounts(
            @Path("asset") String asset,
            @QueryMap Map<String, String> options
    );

    /**
     * Native asset addresses
     * Returns a list of addresses which control some amount of the specified asset
     *
     * @param asset Asset, encoded as concatenation of hex of policy ID and asset name
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> count:</b> - The max number of results per page</p>
     * <p>-<b> cursor:</b> - Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Returns addresses holding the specified asset, paired with the amounts of the asset owned
     */
    @GET("assets/{asset}/addresses")
    Call<PaginatedAssetHolder> assetAddresses(
            @Path("asset") String asset,
            @QueryMap Map<String, String> options
    );

    /**
     * Native asset information
     * Return a summary of information about an asset
     *
     * @param asset Asset, encoded as concatenation of hex of policy ID and asset name
     * @return Information about the asset
     */
    @GET("assets/{asset}")
    Call<TimestampedAssetInfo> assetInfo(
            @Path("asset") String asset
    );

    /**
     * Native asset mints and burns
     * Returns a list of transactions in which some of the specified asset was minted or burned
     *
     * @param asset Asset, encoded as concatenation of hex of policy ID and asset name
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     *  <p>-<b> count:</b> The max number of results per page</p>
     *  <p>-<b> cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     *  <p>-<b> count:</b>  The max number of results per page</p>
     *  <p>-<b> order:</b>  The order in which the results are sorted (by point in chain)</p>
     *  <p>-<b> from:</b>  Return only transactions in blocks minted on or after a specific slot</p>
     *  <p>-<b> to:</b>  Return only transactions in blocks minted on or before a specific slot</p>
     *  <p>-<b>  cursor:</b>  Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return Array of transactions with amounts of asset minted
     */
    @GET("assets/{asset}/mints")
    Call<PaginatedMintTransaction> assetMints(
            @Path("asset") String asset,
            @QueryMap Map<String, String> options
    );

    /**
     * Native asset transactions
     * Returns a list of transactions in which some of a specific asset is moved or minted
     *
     * @param asset Asset, encoded as concatenation of hex of policy ID and asset name
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> order:</b> The order in which the results are sorted (by point in chain)</p>
     * <p>-<b> from:</b> Return only transactions in blocks minted on or after a specific slot</p>
     * <p>-<b>  to:</b> Return only transactions in blocks minted on or before a specific slot</p>
     * <p>-<b>  cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page</p>
     * @return An array of transactions
     */
    @GET("assets/{asset}/transactions")
    Call<PaginatedTimestampedTransaction> assetTxs(
            @Path("asset") String asset,
            @QueryMap Map<String, String> options
    );

    /**
     * Native asset UTxOs
     * Returns references for UTxOs which contain some of the specified asset, each paired with the amount of the asset contained in the UTxO
     *
     * @param asset Asset, encoded as concatenation of hex of policy ID and asset name
     * @param options Options for pagination and number formatting (e.g., count, cursor).
     * <p>-<b>  count:</b> The max number of results per page
     * <p>-<b>  order:</b> The order in which the results are sorted (by slot at which UTxO was produced)
     * <p>-<b>  from:</b> Return only UTxOs created on or after a specific slot
     * <p>-<b>  to:</b> Return only UTxOs created before a specific slot
     * <p>-<b>  cursor:</b> Pagination cursor string, use the cursor included in a page of results to fetch the next page
     * @return Returns UTxOs containing the specified asset, each paired with the amount of the asset
     */
    @GET("assets/{asset}/utxos")
    Call<PaginatedAssetUtxo> assetUtxos(
            @Path("asset") String asset,
            @QueryMap Map<String, String> options
    );
}
