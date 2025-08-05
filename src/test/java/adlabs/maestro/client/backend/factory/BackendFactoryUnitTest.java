package adlabs.maestro.client.backend.factory;

import adlabs.maestro.client.backend.factory.impl.BackendServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackendFactoryUnitTest {

    @Test
    void getMaestroMainnetService_Success() {
        // Arrange
        String apiKey = "test-api-key";
        
        // Act
        BackendService service = BackendFactory.getMaestroMainnetService(apiKey);
        
        // Assert
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }

    @Test
    void getMaestroPreprodService_Success() {
        // Arrange
        String apiKey = "test-api-key";
        
        // Act
        BackendService service = BackendFactory.getMaestroPreprodService(apiKey);
        
        // Assert
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }

    @Test
    void getMaestroPreviewService_Success() {
        // Arrange
        String apiKey = "test-api-key";
        
        // Act
        BackendService service = BackendFactory.getMaestroPreviewService(apiKey);
        
        // Assert
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }

    @Test
    void getMaestroMainnetService_NullApiKey() {
        // Act
        BackendService service = BackendFactory.getMaestroMainnetService(null);
        
        // Assert - Service should be created even with null API key
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }

    @Test
    void getMaestroPreprodService_NullApiKey() {
        // Act
        BackendService service = BackendFactory.getMaestroPreprodService(null);
        
        // Assert - Service should be created even with null API key
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }

    @Test
    void getMaestroPreviewService_NullApiKey() {
        // Act
        BackendService service = BackendFactory.getMaestroPreviewService(null);
        
        // Assert - Service should be created even with null API key  
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }

    @Test
    void getMaestroMainnetService_EmptyApiKey() {
        // Act
        BackendService service = BackendFactory.getMaestroMainnetService("");
        
        // Assert - Service should be created even with empty API key
        assertNotNull(service);
        assertInstanceOf(BackendServiceImpl.class, service);
    }
}