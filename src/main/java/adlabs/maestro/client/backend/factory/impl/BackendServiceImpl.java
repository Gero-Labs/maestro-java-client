package adlabs.maestro.client.backend.factory.impl;

import adlabs.maestro.client.backend.api.block.BlockService;
import adlabs.maestro.client.backend.factory.ApiVersion;
import adlabs.maestro.client.backend.factory.BackendService;
import adlabs.maestro.client.backend.factory.OperationType;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Backend Service Implementation
 */
@Getter
@Setter
@Slf4j
public class BackendServiceImpl implements BackendService {

//    private final NetworkService networkService;
//    private final EpochService epochService;
    private final BlockService blockService;
//    private final TransactionsService transactionsService;
//    private final AccountService accountService;
//    private final AddressService addressService;
//    private final AssetService assetService;
//    private final PoolService poolService;
//    private final ScriptService scriptService;
//    private final GovernanceService governanceService;

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
//        this.networkService = new NetworkServiceImpl(baseUrl, apiToken);
//        this.epochService = new EpochServiceImpl(baseUrl, apiToken);
        this.blockService = new BlockServiceImpl(baseUrl, apiToken);
//        this.transactionsService = new TransactionsServiceImpl(baseUrl, apiToken);
//        this.accountService = new AccountServiceImpl(baseUrl, apiToken);
//        this.addressService = new AddressServiceImpl(baseUrl, apiToken);
//        this.assetService = new AssetServiceImpl(baseUrl, apiToken);
//        this.poolService = new PoolServiceImpl(baseUrl, apiToken);
//        this.scriptService = new ScriptServiceImpl(baseUrl, apiToken);
//        this.governanceService = new GovernanceServiceImpl(baseUrl, apiToken);
    }

    /**
     * Backend Service Implementation Constructor
     *
     * @param operationType Operation Type
     * @param apiVersion    API Version
     * @param apiToken      Authorization Bearer JWT Token
     */
    public BackendServiceImpl(OperationType operationType, ApiVersion apiVersion, String apiToken) {
        this(operationType.getBaseUrl() + "/" + apiVersion.getVersion() + "/", apiToken);
    }
}
