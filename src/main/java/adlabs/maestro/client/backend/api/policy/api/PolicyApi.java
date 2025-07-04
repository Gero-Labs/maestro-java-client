package adlabs.maestro.client.backend.api.policy.api;

import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetInfoConcise;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyHolder;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyHolderAccount;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyMintTransaction;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyTransaction;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyUtxo;
import adlabs.maestro.client.backend.api.policy.model.TimestampedPolicyInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Asset Policy API
 *
 */
public interface PolicyApi {
    /**
     * Accounts of addresses holding assets of specific policy
     * Returns a list of accounts (as stake/reward addresses) associated with addresses which control some of an asset of the specified policy.
     *
     * @param policy Hex encoded Policy ID
     * @param count The max number of results per page
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Returns stake addresses for accounts which hold assets of the given policy ID with the asset names and amounts
     */
    @GET("policy/{policy}/accounts")
    Call<PaginatedPolicyHolderAccount> policyAccounts(
            @Path("policy") String policy,
            @Query("count") Integer count,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * Addresses holding assets of specific policy
     * Returns a list of addresses which hold some of an asset of the specified policy ID
     *
     * @param policy Hex encoded Policy ID
     * @param count The max number of results per page
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Returns addresses holding assets of the given policy ID with the asset names and amounts
     */
    @GET("policy/{policy}/addresses")
    Call<PaginatedPolicyHolder> policyAddresses(
            @Path("policy") String policy,
            @Query("count") Integer count,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );

    /**
     * List assets of a policy
     * Lists all assets which have existed under the specified policy ID with a short information summary for each
     *
     * @param policy Hex encoded Policy ID
     * @param count The max number of results per page
     * @param cursor Pagination cursor string
     * @return List of assets paired with short information summary
     */
    @GET("policy/{policy}/assets")
    Call<PaginatedAssetInfoConcise> policyAssets(
            @Path("policy") String policy,
            @Query("count") Integer count,
            @Query("cursor") String cursor
    );

    /**
     * Information about a policy of native assets
     * Returns a summary of information about a native asset policy ID and assets minted under that policy
     *
     * @param policy Hex encoded policy ID
     * @return Summary of asset minting policy
     */
    @GET("policy/{policy}")
    Call<TimestampedPolicyInfo> policyInfo(
            @Path("policy") String policy
    );

    /**
     * Transactions minting or burning assets of policy
     * Returns a list of transactions in which some of the specified asset was minted or burned
     *
     * @param policy Hex encoded policy ID
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by point in chain)
     * @param from Return only transactions in blocks minted on or after a specific slot
     * @param to Return only transactions in blocks minted before a specific slot
     * @param cursor Pagination cursor string
     * @return Array of transactions with assets and amounts minted
     */
    @GET("policy/{policy}/mints")
    Call<PaginatedPolicyMintTransaction> policyMints(
            @Path("policy") String policy,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor
    );

    /**
     * Transactions involving assets of policy
     * Returns transactions which involved (moved, minted) at least one asset of the specified policy.
     *
     * @param policy Hex encoded policy ID
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by point in chain)
     * @param from Return only transactions in blocks minted on or after a specific slot
     * @param to Return only transactions in blocks minted before a specific slot
     * @param cursor Pagination cursor string
     * @return Transactions involving assets of policy
     */
    @GET("policy/{policy}/transactions")
    Call<PaginatedPolicyTransaction> policyTxs(
            @Path("policy") String policy,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor
    );

    /**
     * UTxOs containing assets of specific policy
     * Returns UTxO references of UTxOs which contain some of at least one asset of the specified policy ID.
     *
     * @param policy Hex encoded policy ID
     * @param count The max number of results per page
     * @param order The order in which the results are sorted (by slot at which UTxO was produced)
     * @param from Return only UTxOs created on or after a specific slot
     * @param to Return only UTxOs created before a specific slot
     * @param cursor Pagination cursor string
     * @param amountsAsStrings Large numbers returned as strings if set to `true`
     * @return Returns UTxOs which contain assets of the given policy ID, with the asset names and amounts
     */
    @GET("policy/{policy}/utxos")
    Call<PaginatedPolicyUtxo> policyUtxos(
            @Path("policy") String policy,
            @Query("count") Integer count,
            @Query("order") String order,
            @Query("from") Long from,
            @Query("to") Long to,
            @Query("cursor") String cursor,
            @Header("amounts-as-strings") String amountsAsStrings
    );
}

