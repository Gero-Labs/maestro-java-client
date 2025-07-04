package adlabs.maestro.client.backend.factory;

import adlabs.maestro.client.backend.factory.impl.BackendServiceImpl;

/**
 * Backend Factory
 */
public class BackendFactory {

    private BackendFactory() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Get Mainnet BackendService for maestro (Latest Version)
     *
     * @return {@link BackendService}
     */
    public static BackendService getMaestroMainnetService() {
        return getMaestroMainnetService(null);
    }

    /**
     * Get Mainnet BackendService for maestro (Latest Version)
     *
     * @return {@link BackendService}
     */
    public static BackendService getMaestroMainnetService(String apiToken) {
        return getMaestroMainnetService(ApiVersion.VERSION_1, apiToken);
    }

    /**
     * Get Mainnet BackendService for maestro By Version
     *
     * @param apiVersion API Version
     * @param apiToken   Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getMaestroMainnetService(ApiVersion apiVersion, String apiToken) {
        return new BackendServiceImpl(OperationType.MAESTRO_MAINNET, apiVersion, apiToken);
    }

    /**
     * Get Guild Network BackendService for maestro (Latest Version)
     *
     * @return {@link BackendService}
     */
    public static BackendService getMaestroGuildService() {
        return getMaestroGuildService(ApiVersion.VERSION_1, null);
    }

    /**
     * Get Guild Network BackendService for maestro (Latest Version)
     *
     * @param apiToken Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getMaestroGuildService(String apiToken) {
        return getMaestroGuildService(ApiVersion.VERSION_1, apiToken);
    }

    /**
     * Get Guild Network BackendService for maestro By Version
     *
     * @param apiVersion API Version
     * @return {@link BackendService}
     */
    public static BackendService getMaestroGuildService(ApiVersion apiVersion, String apiToken) {
        return new BackendServiceImpl(OperationType.MAESTRO_GUILD, apiVersion, apiToken);
    }

    /**
     * Get Preview Network BackendService for maestro (Latest Version)
     *
     * @return {@link BackendService}
     */
    public static BackendService getMaestroPreviewService() {
        return getMaestroPreviewService(null);
    }

    /**
     * Get Preview Network BackendService for maestro (Latest Version)
     *
     * @param apiToken Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getMaestroPreviewService(String apiToken) {
        return getMaestroPreviewService(ApiVersion.VERSION_1, apiToken);
    }

    /**
     * Get Preview Network BackendService for maestro By Version
     *
     * @param apiVersion API Version
     * @param apiToken   Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getMaestroPreviewService(ApiVersion apiVersion, String apiToken) {
        return new BackendServiceImpl(OperationType.MAESTRO_PREVIEW, apiVersion, apiToken);
    }

    /**
     * Get Preprod Network BackendService for maestro (Latest Version)
     *
     * @return {@link BackendService}
     */
    public static BackendService getMaestroPreprodService() {
        return getMaestroPreprodService(null);
    }

    /**
     * Get Preprod Network BackendService for maestro (Latest Version)
     *
     * @param apiToken Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getMaestroPreprodService(String apiToken) {
        return getMaestroPreprodService(ApiVersion.VERSION_1, apiToken);
    }

    /**
     * Get Preprod Network BackendService for maestro By Version
     *
     * @param apiVersion API Version
     * @param apiToken   Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getMaestroPreprodService(ApiVersion apiVersion, String apiToken) {
        return new BackendServiceImpl(OperationType.MAESTRO_PREPROD, apiVersion, apiToken);
    }

    /**
     * Get BackendService for maestro
     *
     * @param baseUrl base URL for maestro
     * @return {@link BackendService}
     */
    public static BackendService getCustomRPCService(String baseUrl) {
        return getCustomRPCService(baseUrl, null);
    }

    /**
     * Get BackendService for maestro
     *
     * @param baseUrl  base URL for maestro
     * @param apiToken Authorization Bearer JWT Token
     * @return {@link BackendService}
     */
    public static BackendService getCustomRPCService(String baseUrl, String apiToken) {
        return new BackendServiceImpl(baseUrl, apiToken);
    }
}
