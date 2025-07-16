package adlabs.maestro.client.backend.factory.impl;

import adlabs.maestro.client.backend.api.address.AddressesService;
import adlabs.maestro.client.backend.api.address.impl.AddressesServiceImpl;
import adlabs.maestro.client.backend.api.asset.AssetService;
import adlabs.maestro.client.backend.api.asset.impl.AssetServiceImpl;
import adlabs.maestro.client.backend.api.block.BlockService;
import adlabs.maestro.client.backend.api.block.impl.BlockServiceImpl;
import adlabs.maestro.client.backend.api.datum.DatumService;
import adlabs.maestro.client.backend.api.datum.impl.DatumServiceImpl;
import adlabs.maestro.client.backend.api.policy.PolicyService;
import adlabs.maestro.client.backend.api.policy.impl.PolicyServiceImpl;
import adlabs.maestro.client.backend.api.pool.PoolService;
import adlabs.maestro.client.backend.api.pool.impl.PoolServiceImpl;
import adlabs.maestro.client.backend.api.transaction.TransactionService;
import adlabs.maestro.client.backend.api.transaction.impl.TransactionServiceImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import adlabs.maestro.client.backend.api.account.AccountService;
import adlabs.maestro.client.backend.api.account.impl.AccountServiceImpl;
import adlabs.maestro.client.backend.factory.ApiVersion;
import adlabs.maestro.client.backend.factory.BackendService;
import adlabs.maestro.client.backend.factory.OperationType;

/**
 * Backend Service Implementation
 */
@Getter
@Setter
@Slf4j
public class BackendServiceImpl implements BackendService {
    private final AccountService accountService;
    private final AddressesService addressService;
    private final AssetService assetService;
    private final BlockService blockService;
    private final DatumService datumService;
    private final PolicyService policyService;
    private final PoolService poolService;
    private final TransactionService transactionService;


    /**
     * Backend Service Implementation Constructor
     *
     * @param baseUrl baseUrl
     */
    public BackendServiceImpl(String baseUrl) {
        this(baseUrl, null);
    }

    /**
     * Backend Service Implementation Constructor
     *
     * @param baseUrl baseUrl
     */
    public BackendServiceImpl(String baseUrl, String apiToken) {
        log.info("Maestro URL: {}", baseUrl);
        this.accountService = new AccountServiceImpl(baseUrl, apiToken);
        this.addressService = new AddressesServiceImpl(baseUrl, apiToken);
        this.assetService = new AssetServiceImpl(baseUrl, apiToken);
        this.blockService = new BlockServiceImpl(baseUrl, apiToken);
        this.datumService = new DatumServiceImpl(baseUrl, apiToken);
        this.policyService = new PolicyServiceImpl(baseUrl,apiToken);
        this.poolService = new PoolServiceImpl(baseUrl,apiToken);
        this.transactionService = new TransactionServiceImpl(baseUrl,apiToken);


    }

    /**
     * Backend Service Implementation Constructor
     *
     * @param operationType Operation Type
     * @param apiVersion    API Version
     * @param apiToken      Authorization Bearer JWT Token
     */
    public BackendServiceImpl(OperationType operationType, ApiVersion apiVersion, String apiToken) {
        this(operationType.getBaseUrl() + apiVersion.getVersion() + "/", apiToken);
    }
}
