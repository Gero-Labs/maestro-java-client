package adlabs.maestro.client.backend.factory;

import adlabs.maestro.client.backend.api.block.BlockService;

/**
 * Backend Service
 */
public interface BackendService {

    /**
     * Get Block Service
     * @return {@link BlockService}
     */
    BlockService getBlockService();
}
