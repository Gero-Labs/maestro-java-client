package adlabs.maestro.client.backend.api.base;

/**
 * Result Object Of type T
 * @param <T> Result Type
 */
public class Result<T> {

    private boolean successful;
    private String response;
    private int code;
    private T value;

    /**
     * Default constructor.
     */
    public Result() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param successful whether the operation was successful
     * @param response the response text
     * @param code the HTTP status code
     * @param value the result value
     */
    public Result(boolean successful, String response, int code, T value) {
        this.successful = successful;
        this.response = response;
        this.code = code;
        this.value = value;
    }

    /**
     * Gets whether the operation was successful.
     * 
     * @return true if successful, false otherwise
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets whether the operation was successful.
     * 
     * @param successful true if successful, false otherwise
     */
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    /**
     * Gets the response text.
     * 
     * @return the response text
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the response text.
     * 
     * @param response the response text to set
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * Gets the HTTP status code.
     * 
     * @return the HTTP status code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the HTTP status code.
     * 
     * @param code the HTTP status code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets the result value.
     * 
     * @return the result value
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets the result value.
     * 
     * @param value the result value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Result{" +
                "successful=" + successful +
                ", response='" + response + '\'' +
                ", code=" + code +
                ", value=" + value +
                '}';
    }

    /**
     * Creates a new ResultBuilder.
     * 
     * @param <T> the type of the result value
     * @return a new ResultBuilder instance
     */
    public static <T> ResultBuilder<T> builder() {
        return new ResultBuilder<T>();
    }

    /**
     * Builder class for Result.
     * 
     * @param <T> the type of the result value
     */
    public static class ResultBuilder<T> {
        private boolean successful;
        private String response;
        private int code;
        private T value;

        /**
         * Default constructor for the ResultBuilder.
         */
        public ResultBuilder() {
        }

        /**
         * Sets the successful flag.
         * 
         * @param successful whether the operation was successful
         * @return this builder instance
         */
        public ResultBuilder<T> successful(boolean successful) {
            this.successful = successful;
            return this;
        }

        /**
         * Sets the response text.
         * 
         * @param response the response text
         * @return this builder instance
         */
        public ResultBuilder<T> response(String response) {
            this.response = response;
            return this;
        }

        /**
         * Sets the HTTP status code.
         * 
         * @param code the HTTP status code
         * @return this builder instance
         */
        public ResultBuilder<T> code(int code) {
            this.code = code;
            return this;
        }

        /**
         * Sets the result value.
         * 
         * @param value the result value
         * @return this builder instance
         */
        public ResultBuilder<T> value(T value) {
            this.value = value;
            return this;
        }

        /**
         * Builds the Result instance.
         * 
         * @return a new Result instance
         */
        public Result<T> build() {
            return new Result<T>(successful, response, code, value);
        }
    }
}

