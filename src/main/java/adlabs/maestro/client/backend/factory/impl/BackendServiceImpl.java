package adlabs.maestro.client.backend.factory.impl;

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
    private final AccountService accountsService;

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
        this.accountsService = new AccountServiceImpl(baseUrl, apiToken);

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
