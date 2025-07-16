package adlabs.maestro.client.backend.api.transaction.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.transaction.api.TransactionApi;
import adlabs.maestro.client.backend.api.transaction.model.PaginatedUtxoWithBytes;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransactionInfo;
import adlabs.maestro.client.backend.api.transaction.TransactionService;
import adlabs.maestro.client.backend.factory.options.Options;
import adlabs.maestro.client.backend.models.*;
import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import retrofit2.Call;

import java.util.List;

/**
 * Transactions Service Implementation
 */
public class TransactionServiceImpl extends BaseService implements TransactionService {

    private final TransactionApi transactionApi;

    /**
     * Transaction Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public TransactionServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        transactionApi = getRetrofit().create(TransactionApi.class);
    }

    @Override
    public Result<TimestampedAddress> getAddressByTxO(String txHash, Integer index) throws ApiException {
        validateHexFormat(txHash);
        Call<TimestampedAddress> call = transactionApi.addressByTxo(txHash, index);
        return processResponse(call);
    }

    @Override
    public Result<List<EvaluatedRedeemer>> evaluateRedeemers(EvaluateRequest evaluateRequest) throws ApiException {
        Call<List<EvaluatedRedeemer>> call = transactionApi.evaluateRedeemers(evaluateRequest);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedTxCbor> getTxCborByTxHash(String txHash) throws ApiException {
        validateHexFormat(txHash);
        Call<TimestampedTxCbor> call = transactionApi.txCborByTxHash(txHash);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedTransactionInfo> getTxInfo(String txHash) throws ApiException {
        validateHexFormat(txHash);
        Call<TimestampedTransactionInfo> call = transactionApi.txInfo(txHash);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedUtxo> getTxOByTxORef(String txHash, Integer index, Options options) throws ApiException {
        validateHexFormat(txHash);
        Call<TimestampedUtxo> call = transactionApi.txoByTxoRef(txHash, index, optionsToParamMap(options));
        return processResponse(call);
    }

    @Override
    public Result<PaginatedUtxoWithBytes> getTxOsByTxORefs(List<String> requestBody, Options options) throws ApiException {

        Call<PaginatedUtxoWithBytes> call = transactionApi.txosByTxoRefs(requestBody, optionsToParamMap(options));
        return processResponse(call);
    }
}