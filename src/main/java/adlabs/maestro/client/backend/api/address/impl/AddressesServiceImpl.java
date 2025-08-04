package adlabs.maestro.client.backend.api.address.impl;

import adlabs.maestro.client.backend.api.address.AddressesService;
import adlabs.maestro.client.backend.api.address.api.AddressesApi;
import adlabs.maestro.client.backend.api.address.model.*;
import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.options.Options;
import retrofit2.Call;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Addresses Service Implementation
 */
public class AddressesServiceImpl extends BaseService implements AddressesService {

    private final AddressesApi addressesApi;

    /**
     * Addresses Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public AddressesServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        addressesApi = getRetrofit().create(AddressesApi.class);
    }

    @Override
    public Result<TimestampedBalance> getBalanceByPaymentCredential(String credential) throws ApiException {
        validateBech32(credential);
        Call<TimestampedBalance> call = addressesApi.getBalanceByPaymentCred(credential);
        return processResponse(call);
    }

    @Override
    public Result<AddressInfo> decodeAddress(String address) throws ApiException {
        Call<AddressInfo> call = addressesApi.decodeAddress(address);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedTxCount> getAddressTransactionsCount(String address) throws ApiException {
        validateBech32(address);
        Call<TimestampedTxCount> call = addressesApi.getAddressTransactionsCount(address);
        return processResponse(call);
    }

    @Override
    public Result<PaginatedAddressTransaction> getAddressTransactions(String address, Options options) throws ApiException {
        validateBech32(address);
        Call<PaginatedAddressTransaction> call = addressesApi.getAddressTransactions(address, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPaymentCredentialTransaction> getTransactionsByPaymentCredential(String credential, Options options) throws ApiException {
        validateBech32(credential);
        Call<PaginatedPaymentCredentialTransaction> call = addressesApi
                .getTransactionsByPaymentCredential(credential, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedPaymentCredentialsTransaction> getTransactionsByPaymentCredentials(List<String> credentials, Options options) throws ApiException {
        for (String credential : credentials) {
            validateBech32(credential);
        }
        Call<PaginatedPaymentCredentialsTransaction> call = addressesApi
                .getTransactionsByPaymentCredentials(credentials, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedUtxoRef> getUTxORefsByAddress(String address, Options options) throws ApiException {
        validateBech32(address);
        Call<PaginatedUtxoRef> call = addressesApi
                .getUTxORefsByAddress(address, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedUtxoWithSlot> getUTxOsByAddress(String address, String asset, boolean resolveDatums, boolean withCbor, Options options) throws ApiException {
        validateBech32(address);
        Call<PaginatedUtxoWithSlot> call = addressesApi
                .getUTxOsByAddress(address, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedUtxoWithSlot> getUTxOsByAddresses(List<String> addresses, boolean resolveDatums, boolean withCbor, Options options) throws ApiException {
        for (String address : addresses) {
            validateBech32(address);
        }
        Call<PaginatedUtxoWithSlot> call = addressesApi.getUTxOsByAddresses(addresses, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedUtxoWithSlot> getUTxOsByPaymentCredential(String credential, String asset, boolean resolveDatums, boolean withCbor, Options options) throws ApiException {
        validateBech32(credential);
        Call<PaginatedUtxoWithSlot> call = addressesApi.getUTxOsByPaymentCredential(credential, buildOptionsUTxOs(asset, resolveDatums, withCbor, options));
        return processResponse(call);
    }

    private Map<String, String> buildOptionsUTxOs(String asset, boolean resolveDatums, boolean withCbor, Options options) {
        var queryMap = optionsToParamMap(options);
        if(queryMap.isEmpty()) {
            queryMap = new HashMap<>();
        }
        if(asset!=null) {
            queryMap.put("asset", asset);
        }
        if(resolveDatums) {
            queryMap.put("resolve_datums", "true");
        }
        if(withCbor) {
            queryMap.put("with_cbor", "true");
        }
        return queryMap;
    }

    @Override
    public Result<PaginatedUtxoWithSlot> getUTxOsByPaymentCredentials(List<String> credentials, boolean resolveDatums, boolean withCbor, Options options) throws ApiException {
        for (String credential : credentials) {
            validateBech32(credential);
        }
        Call<PaginatedUtxoWithSlot> call = addressesApi.getUTxOsByPaymentCredentials(credentials, buildOptionsUTxOs(null, resolveDatums, withCbor,
                options));
        return processResponse(call);
    }
}
