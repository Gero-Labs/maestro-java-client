package adlabs.maestro.client.backend.api.block.impl;

import adlabs.maestro.client.backend.api.base.BaseService;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.block.BlockService;
import adlabs.maestro.client.backend.api.block.api.BlockApi;
import adlabs.maestro.client.backend.api.block.model.Block;
import retrofit2.Call;

import java.util.*;

/**
 * Block Service Implementation
 */
public class BlockServiceImpl extends BaseService implements BlockService {

    private final BlockApi blockApi;

    /**
     * Block Service Implementation Constructor
     *
     * @param baseUrl  Base Url
     * @param apiToken Authorization Bearer JWT Token
     */
    public BlockServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        blockApi = getRetrofit().create(BlockApi.class);
    }

    @Override
    public Result<Block> getLatestBlock() throws ApiException {
        Call<List<Block>> call = blockApi.getLatestBlock(optionsToParamMap(options));
        return processResponseGetOne(call);
    }

    private Map<String, Object> buildBodyBlockTxInfo(List<String> blockHashes, Boolean inputs, Boolean metadata,
                                                     Boolean assets, Boolean withdrawals, Boolean certs,
                                                     Boolean scripts, Boolean byteCode) {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("_block_hashes", blockHashes);
        bodyMap.put("_inputs", Optional.ofNullable(inputs).orElse(false));
        bodyMap.put("_metadata", Optional.ofNullable(metadata).orElse(false));
        bodyMap.put("_assets", Optional.ofNullable(assets).orElse(false));
        bodyMap.put("_withdrawals", Optional.ofNullable(withdrawals).orElse(false));
        bodyMap.put("_certs", Optional.ofNullable(certs).orElse(false));
        bodyMap.put("_scripts", Optional.ofNullable(scripts).orElse(false));
        bodyMap.put("_bytecode", Optional.ofNullable(byteCode).orElse(false));
        return bodyMap;
    }

    private Map<String, Object> buildBody(List<String> blockHashes) {
        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("_block_hashes", blockHashes);
        return bodyMap;
    }
}
