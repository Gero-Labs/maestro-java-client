package adlabs.maestro.client.backend.factory;

import lombok.Getter;

/**
 * Operation Type
 */
@Getter
public enum OperationType {

    /**
     * Mainnet
     */
    MAINNET("https://mainnet.gomaestro-api.org"),
    /**
     * Preview
     */
    PREVIEW("https://preview.gomaestro-api.org"),
    /**
     * PreProd
     */
    PREPROD("https://preprod.gomaestro-api.org");

    private final String baseUrl;

    OperationType() {
        baseUrl = null;
    }

    OperationType(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
