package adlabs.maestro.client.backend.api.policy;

import adlabs.maestro.client.backend.api.asset.model.PaginatedAssetInfoConcise;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyHolder;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyHolderAccount;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyMintTransaction;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyTransaction;
import adlabs.maestro.client.backend.api.policy.model.PaginatedPolicyUtxo;
import adlabs.maestro.client.backend.api.policy.model.TimestampedPolicyInfo;
import adlabs.maestro.client.backend.factory.options.Options;

/**
 * Asset Policy Service
 */
public interface PolicyService {

    /**
     * Get accounts of addresses holding assets of a specific policy.
     * Returns a list of accounts (as stake/reward addresses) associated with addresses
     * which control some assets of the specified policy.
     *
     * @param policy Hex encoded Policy ID.
     * @param options Options for pagination.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> cursor:</b> Pagination cursor string</p>
     * @return A Result containing a list of stake addresses for accounts which hold assets of the given policy ID,
     * along with the asset names and amounts.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPolicyHolderAccount> getPolicyAccounts(String policy, Options options) throws ApiException;

    /**
     * Get addresses holding assets of a specific policy.
     * Returns a list of addresses which hold some assets of the specified policy ID.
     *
     * @param policy Hex encoded Policy ID.
     * @param options Options for pagination.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> cursor:</b> Pagination cursor string</p>
     * @return A Result containing a list of addresses holding assets of the given policy ID,
     * along with the asset names and amounts.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPolicyHolder> getPolicyAddresses(String policy, Options options) throws ApiException;

    /**
     * Get a list of assets for a policy.
     * Lists all assets that have existed under the specified policy ID with a short information summary for each.
     *
     * @param policy Hex encoded Policy ID.
     * @param options Options for pagination.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> cursor:</b> Pagination cursor string</p>
     * @return A Result containing a list of assets paired with a short information summary.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedAssetInfoConcise> getPolicyAssets(String policy, Options options) throws ApiException;

    /**
     * Get information about a policy for native assets.
     * Returns a summary of information about a native asset policy ID and the assets minted under that policy.
     *
     * @param policy Hex encoded policy ID.
     * @return A Result containing a summary of the asset minting policy.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<TimestampedPolicyInfo> getPolicyInfo(String policy) throws ApiException;

    /**
     * Get transactions that minted or burned assets of a policy.
     * Returns a list of transactions in which assets of the specified policy were minted or burned.
     *
     * @param policy Hex encoded policy ID.
     * @param options Options for pagination and filtering.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> order:</b> The order in which the results are sorted (by point in chain)</p>
     * <p>-<b> from:</b> Return only transactions in blocks minted on or after a specific slot</p>
     * <p>-<b> to:</b> Return only transactions in blocks minted before a specific slot</p>
     * <p>-<b> cursor:</b> Pagination cursor string</p>
     * @return A Result containing an array of transactions with assets and amounts minted.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPolicyMintTransaction> getPolicyMints(String policy, Options options) throws ApiException;

    /**
     * Get transactions involving assets of a policy.
     * Returns transactions which involved (moved, minted) at least one asset of the specified policy.
     *
     * @param policy Hex encoded policy ID.
     * @param options Options for pagination and filtering.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> order:</b> The order in which the results are sorted (by point in chain)</p>
     * <p>-<b> from:</b> Return only transactions in blocks minted on or after a specific slot</p>
     * <p>-<b> to:</b> Return only transactions in blocks minted before a specific slot</p>
     * <p>-<b> cursor:</b> Pagination cursor string</p>
     * @return A Result containing transactions involving assets of the policy.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPolicyTransaction> getPolicyTxs(String policy, Options options) throws ApiException;

    /**
     * Get UTxOs containing assets of a specific policy.
     * Returns UTxO references which contain at least one asset of the specified policy ID.
     *
     * @param policy Hex encoded policy ID.
     * @param options Options for pagination and filtering.
     * <p>-<b> count:</b> The max number of results per page</p>
     * <p>-<b> order:</b> The order in which the results are sorted (by slot at which UTxO was produced)</p>
     * <p>-<b> from:</b> Return only UTxOs created on or after a specific slot</p>
     * <p>-<b> to:</b> Return only UTxOs created before a specific slot</p>
     * <p>-<b> cursor:</b> Pagination cursor string</p>
     * @return A Result containing UTxOs which hold assets of the given policy ID, with the asset names and amounts.
     * @throws ApiException if an error occurs during the API request.
     */
    Result<PaginatedPolicyUtxo> getPolicyUtxos(String policy, Options options) throws ApiException;
}