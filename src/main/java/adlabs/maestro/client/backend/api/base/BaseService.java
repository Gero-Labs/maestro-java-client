package adlabs.maestro.client.backend.api.base;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.base.interceptor.GzipInterceptor;
import adlabs.maestro.client.backend.factory.options.Options;
import adlabs.maestro.client.utils.Bech32Util;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Base Service
 */
@Slf4j
@Getter
public class BaseService {

    private final Retrofit retrofit;
    private int retriesCount = 5;
    private boolean retryOnTimeout = true;
    private final String apiToken;
    private int readTimeoutSec = 300;
    private int connectTimeoutSec = 300;
    private int sleepTimeSec = 60;
    private boolean gzipCompression = true;

    /**
     * Base Service Constructor
     *
     * @param baseUrl Base URL
     */
    public BaseService(String baseUrl) {
        this(baseUrl, null);
    }

    /**
     * Base Service Constructor
     *
     * @param baseUrl  Base URL
     * @param apiToken Authorization Bearer JWT Token
     */
    public BaseService(String baseUrl, String apiToken) {
        this.apiToken = apiToken;

        String strReadTimeoutSec = System.getenv("MAESTRO_JAVA_LIB_READ_TIMEOUT_SEC");
        if (strReadTimeoutSec != null && !strReadTimeoutSec.isEmpty()) {
            int readTimeoutSec = Integer.parseInt(strReadTimeoutSec);
            if (readTimeoutSec >= 1) {
                this.readTimeoutSec = readTimeoutSec;
            }
        }

        String strConnectTimeoutSec = System.getenv("MAESTRO_JAVA_LIB_CONNECT_TIMEOUT_SEC");
        if (strConnectTimeoutSec != null && !strConnectTimeoutSec.isEmpty()) {
            int connectTimeoutSec = Integer.parseInt(strConnectTimeoutSec);
            if (connectTimeoutSec >= 1) {
                this.connectTimeoutSec = connectTimeoutSec;
            }
        }

        boolean logging = Boolean.parseBoolean(System.getenv("MAESTRO_JAVA_LIB_LOGGING"));
        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();
        okHttpClientBuilder.readTimeout(readTimeoutSec, TimeUnit.SECONDS)
                .connectTimeout(connectTimeoutSec, TimeUnit.SECONDS);
        if (logging) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okHttpClientBuilder.addInterceptor(interceptor).build();
        }
        String apiKey = System.getenv("MAESTRO_JAVA_LIB_API_KEY");

        if (apiKey != null && !apiKey.isEmpty()) {
            okHttpClientBuilder.addInterceptor(new Interceptor() {
                @NotNull
                @Override
                public okhttp3.Response intercept(@NotNull Chain chain) throws IOException {
                    Request original = chain.request();

                    Request request = original.newBuilder()
                            .header("api-key", apiKey)
                            .method(original.method(), original.body())
                            .build();
                    return chain.proceed(request);
                }
            });
        }

        if (System.getenv("MAESTRO_JAVA_LIB_GZIP_COMPRESSION") != null) {
            gzipCompression = Boolean.parseBoolean(System.getenv("MAESTRO_JAVA_LIB_GZIP_COMPRESSION"));
        }
        if (gzipCompression) {
            okHttpClientBuilder.addInterceptor(new GzipInterceptor());
        }

        String strRetries = System.getenv("MAESTRO_JAVA_LIB_RETRIES_COUNT");
        if (strRetries != null && !strRetries.isEmpty()) {
            retriesCount = Math.max(Integer.parseInt(strRetries), 1);
        }
        String retryOnTimeoutEnv = System.getenv("MAESTRO_JAVA_LIB_RETRY_ON_TIMEOUT");
        if (retryOnTimeoutEnv != null && !Boolean.parseBoolean(retryOnTimeoutEnv)) {
            retryOnTimeout = false;
        }

        String sleepTimeSecEnv = System.getenv("MAESTRO_JAVA_LIB_RETRY_SLEEP_TIME_SEC");
        if (sleepTimeSecEnv != null && !sleepTimeSecEnv.isEmpty()) {
            sleepTimeSec = Math.max(Integer.parseInt(sleepTimeSecEnv), 60);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        retrofit = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClientBuilder.build()).addConverterFactory(JacksonConverterFactory
                .create(objectMapper)).build();
    }

    protected <T> Result<T> processResponseGetOne(Call<List<T>> call) throws ApiException {
        try {
            Response<List<T>> response = (Response<List<T>>) execute(call);
            if (response.isSuccessful()) {
                if (response.body() != null && !response.body().isEmpty()) {
                    return (Result<T>) Result.builder().successful(true).response(response.toString()).value(response.body().get(0)).code(response.code()).build();
                } else if (response.body() != null) {
                    return (Result<T>) Result.builder().successful(false).response("Response Body is Empty").code(404).build();
                } else {
                    return (Result<T>) Result.builder().successful(false).response("Response Body is Invalid").code(500).build();
                }
            } else {
                return (Result<T>) Result.builder().successful(false).response(Objects.requireNonNull(response.errorBody()).string()).code(response.code()).build();
            }
        } catch (IOException e) {
            throw new ApiException(e.getMessage(), e);
        }
    }

    protected <T> Result<T> badRequestResult(String responseText) {
        return (Result<T>) Result.builder().successful(false).response(responseText).code(400).build();
    }

    /**
     * processResponse
     *
     * @param call the call to execute
     * @param <T>  Type Of Response
     * @return Result of Response
     * @throws ApiException upon null Response Error Body
     */
    protected <T> Result<T> processResponse(Call<?> call) throws ApiException {
        try {
            Response<T> response = (Response<T>) execute(call);
            if (response.isSuccessful())
                return (Result<T>) Result.builder().successful(true).response(response.toString()).value(response.body()).code(response.code()).build();
            else
                return (Result<T>) Result.builder().successful(false).response(Objects.requireNonNull(response.errorBody()).string()).code(response.code()).build();
        } catch (IOException e) {
            throw new ApiException(e.getMessage(), e);
        }
    }

    /**
     * getRequest
     *
     * @param call Retrofit2 Call
     * @return Response Object type defined by clazz
     * @throws ApiException if an error occurs while attempting to invoke the API
     * @throws IOException  if an error occurs while attempting to invoke the API
     */
    public Response<?> execute(Call<?> call) throws ApiException, IOException {
        int tryCount = 1;
        Response<?> response = null;
        while (tryCount < retriesCount) {
            try {
                response = call.clone().execute();
                if (response.code() == 429) {
                    log.warn("429 Too Many Requests.");
                    tryCount = retry(tryCount, response.code());
                } else if (response.code() == 504) {
                    log.warn(response.message());
                    tryCount = retry(tryCount, response.code());
                } else {
                    return response;
                }
            } catch (SocketTimeoutException e) {
                log.warn(e.getMessage());
                if (retryOnTimeout) {
                    tryCount = retry(tryCount, null);
                } else {
                    throw new ApiException("Timeout Error");
                }
            }
        }
        if (response != null) {
            throw new ApiException("Retry Count Exceeded (" + tryCount + "/" + retriesCount + "). Reason: " + response);
        } else {
            throw new ApiException("Retry Count Exceeded (" + tryCount + "/" + retriesCount + ").");
        }
    }

    private void sleep(int timeMillis) {
        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
            log.error(e.getMessage(), e);
        }
    }

    private int retry(int tryCount, Integer responseCode) throws ApiException {
        tryCount++;
        if (tryCount < retriesCount) {
            log.info("Retrying in {}s ... ({}/{})", getSleepTimeSec() * tryCount, tryCount, retriesCount);
            sleep(getSleepTimeSec() * tryCount);
        } else if (responseCode == null) {
            throw new ApiException("Timeout Error");
        } else if (responseCode == 429) {
            throw new ApiException("429 Too Many Requests.");
        }
        return tryCount;
    }

    /**
     * Validate Epoch
     *
     * @param epochNo Epoch Number
     * @throws ApiException if an error occurs while attempting to validate epoch
     */
    protected void validateEpoch(Integer epochNo) throws ApiException {
        if (epochNo == null) {
            throw new ApiException("Null Value for \"epochNo\"");
        }
        if (epochNo < 0) {
            throw new ApiException("Non Positive \"epochNo\" Value");
        }
    }

    /**
     * Validate Bech32 Format
     *
     * @param bech32 string to validate
     * @throws ApiException if an error occurs while attempting to validate bech32 string
     */
    protected void validateBech32(String bech32) throws ApiException {
        if (!Bech32Util.isValid(bech32)) {
            throw new ApiException("Invalid Bech32 Format");
        }
    }

    /**
     * Validate Hex Format
     *
     * @param hex string to validate
     * @throws ApiException if an error occurs while attempting to validate hex string
     */
    protected void validateHexFormat(String hex) throws ApiException {
        if (!hex.isEmpty() && !hex.matches("^[\\da-fA-F]+$")) {
            throw new ApiException("Invalid Hexadecimal String Format");
        }
    }

    protected Map<String, String> optionsToParamMap(Options options) {
        Map<String, String> paramsMap = Collections.emptyMap();
        if (options != null && !options.getOptionList().isEmpty()) {
            paramsMap = options.toMap();
        }
        return paramsMap;
    }
}
