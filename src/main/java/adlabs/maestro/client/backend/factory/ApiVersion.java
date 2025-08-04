package adlabs.maestro.client.backend.factory;


/**
 * API Version
 */
public enum ApiVersion {

    /**
     * Version 1
     */
    VERSION_1("v1");

    private final String version;

    ApiVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the API version string
     * @return the version string
     */
    public String getVersion() {
        return version;
    }
}
