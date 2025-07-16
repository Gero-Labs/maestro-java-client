package adlabs.maestro.client.backend.factory;

import adlabs.maestro.client.backend.api.account.AccountService;
import adlabs.maestro.client.backend.api.address.AddressesService;
import adlabs.maestro.client.backend.api.asset.AssetService;
import adlabs.maestro.client.backend.api.block.BlockService;
import adlabs.maestro.client.backend.api.datum.DatumService;
import adlabs.maestro.client.backend.api.policy.PolicyService;
import adlabs.maestro.client.backend.api.pool.PoolService;
import adlabs.maestro.client.backend.api.transaction.TransactionService;

/**
 * Backend Service
 */
public interface BackendService {

   /**
     * Get Accounts Service
     * @return {@link AccountService}
     */
    AccountService getAccountService();

    /**
     * Get Addresses Service
     * @return {@link AddressesService}
     */
    AddressesService getAddressService();

    /**
     * Get Assets Service
     * @return {@link AssetService}
     */
    AssetService getAssetService();

    /**
     * Get Block Service
     * @return {@link BlockService}
     */
    BlockService getBlockService();

    /**
     * Get Datum Service
     * @return {@link DatumService}
     */
    DatumService getDatumService();

 /**
  * Get Poll Service
  * @return {@link PoolService}
  */
    PoolService getPoolService();

 /**
  * Get Transaction Service
  * @return {@link TransactionService}
  */
   TransactionService getTransactionService();

   /**
    * Get Policy Service
    * @return {@link PolicyService}
    */
    PolicyService getPolicyService();
}
