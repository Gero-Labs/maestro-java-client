package adlabs.maestro.client.backend.factory;

import adlabs.maestro.client.backend.api.account.AccountService;

/**
 * Backend Service
 */
public interface BackendService {

   /**
     * Get Accounts Service
     * @return {@link AccountService}
     */
    AccountService getAccountsService();

}
