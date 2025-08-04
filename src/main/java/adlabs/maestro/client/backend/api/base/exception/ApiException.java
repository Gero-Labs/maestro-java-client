package adlabs.maestro.client.backend.api.base.exception;

/**
 * ApiException
 */
public class ApiException extends Exception {

    /**
     * ApiException Constructor
     *
     * @param message  message
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * ApiException Constructor
     *
     * @param message  message
     * @param e Exception
     */
    public ApiException(String message, Exception e) {
        super(message, e);
    }
}
