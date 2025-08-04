package adlabs.maestro.client.backend.factory.impl;

import adlabs.maestro.client.backend.api.address.AddressesService;
import adlabs.maestro.client.backend.api.address.impl.AddressesServiceImpl;
import adlabs.maestro.client.backend.api.asset.AssetService;
import adlabs.maestro.client.backend.api.asset.impl.AssetServiceImpl;
import adlabs.maestro.client.backend.api.block.BlockService;
import adlabs.maestro.client.backend.api.block.impl.BlockServiceImpl;
import adlabs.maestro.client.backend.api.datum.DatumService;
import adlabs.maestro.client.backend.api.datum.impl.DatumServiceImpl;
import adlabs.maestro.client.backend.api.general.GeneralService;
import adlabs.maestro.client.backend.api.general.impl.GeneralServiceImpl;
import adlabs.maestro.client.backend.api.policy.PolicyService;
import adlabs.maestro.client.backend.api.policy.impl.PolicyServiceImpl;
import adlabs.maestro.client.backend.api.pool.PoolService;
import adlabs.maestro.client.backend.api.pool.impl.PoolServiceImpl;
import adlabs.maestro.client.backend.api.script.ScriptsService;
import adlabs.maestro.client.backend.api.script.impl.ScriptsServiceImpl;
import adlabs.maestro.client.backend.api.transaction.TransactionService;
import adlabs.maestro.client.backend.api.transaction.impl.TransactionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import adlabs.maestro.client.backend.api.account.AccountService;
import adlabs.maestro.client.backend.api.account.impl.AccountServiceImpl;
import adlabs.maestro.client.backend.factory.ApiVersion;
import adlabs.maestro.client.backend.factory.BackendService;
import adlabs.maestro.client.backend.factory.OperationType;

/**
 * Backend Service Implementation
 */
public class BackendServiceImpl implements BackendService {
    private static final Logger log = LoggerFactory.getLogger(BackendServiceImpl.class);
    private final AccountService accountService;
    private final AddressesService addressService;
    private final AssetService assetService;
    private final BlockService blockService;
    private final DatumService datumService;
    private final PolicyService policyService;
    private final PoolService poolService;
    private final TransactionService transactionService;
    private final ScriptsService scriptsService;
    private final GeneralService generalService;


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
     * @param apiToken Authorization Bearer JWT Token
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
        this.scriptsService = new ScriptsServiceImpl(baseUrl, apiToken);
        this.generalService = new GeneralServiceImpl(baseUrl, apiToken);
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

    @Override
    public AccountService getAccountService() {
        return accountService;
    }

    @Override
    public AddressesService getAddressService() {
        return addressService;
    }

    @Override
    public AssetService getAssetService() {
        return assetService;
    }

    @Override
    public BlockService getBlockService() {
        return blockService;
    }

    @Override
    public DatumService getDatumService() {
        return datumService;
    }

    @Override
    public PolicyService getPolicyService() {
        return policyService;
    }

    @Override
    public PoolService getPoolService() {
        return poolService;
    }

    @Override
    public TransactionService getTransactionService() {
        return transactionService;
    }

    @Override
    public ScriptsService getScriptsService() {
        return scriptsService;
    }

    @Override
    public GeneralService getGeneralService() {
        return generalService;
    }
}
