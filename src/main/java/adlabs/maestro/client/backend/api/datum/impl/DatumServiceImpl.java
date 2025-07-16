package adlabs.maestro.client.backend.api.datum.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.datum.DatumService;
import adlabs.maestro.client.backend.api.datum.api.DatumApi;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatum;
import adlabs.maestro.client.backend.api.datum.model.TimestampedDatumMap;
import retrofit2.Call;

import java.util.List;

/**
 * Implementation of the DatumService
 */
public class DatumServiceImpl extends BaseService implements DatumService {
    private final DatumApi datumApi;

    public DatumServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        this.datumApi = getRetrofit().create(DatumApi.class);
    }

    private void validateDatum(String datumHash) throws ApiException {
        if (datumHash == null || datumHash.trim().isEmpty()) {
            throw new ApiException("DatumHash cannot be null or empty.");
        }
    }


    @Override
    public Result<TimestampedDatum> getDatumByHash(String datumHash) throws ApiException {
        validateDatum(datumHash);

        Call<TimestampedDatum> call = datumApi.datumByHash(datumHash);
        return processResponse(call);
    }

    @Override
    public Result<TimestampedDatumMap> getDatumsByHashes(List<String> datumHashes) throws ApiException {
        for(String datumHash: datumHashes) {
            validateDatum(datumHash);
        }
        Call<TimestampedDatumMap> call = datumApi.datumsByHashes(datumHashes);

        return processResponse(call);
    }
}
