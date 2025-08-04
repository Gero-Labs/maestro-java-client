package adlabs.maestro.client.backend.factory;


/**
 * Operation Type
 */
public enum OperationType {

    /**
     * Mainnet
     */
    MAESTRO_MAINNET("https://mainnet.gomaestro-api.org/"),
    /**
     * Preview
     */
    MAESTRO_PREVIEW("https://preview.gomaestro-api.org/"),
    /**
     * PreProd
     */
    MAESTRO_PREPROD("https://preprod.gomaestro-api.org/");

    private final String baseUrl;

    OperationType() {
        baseUrl = null;
    }

    OperationType(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Gets the base URL for this operation type
     * @return the base URL
     */
    public String getBaseUrl() {
        return baseUrl;
    }
}
