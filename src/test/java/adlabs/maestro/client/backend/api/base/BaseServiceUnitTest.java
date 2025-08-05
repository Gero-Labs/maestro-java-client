package adlabs.maestro.client.backend.api.base;

import adlabs.maestro.client.backend.api.base.exception.ApiException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseServiceUnitTest {

    @Test
    void apiException_WithMessage() {
        // Arrange
        String message = "Test API exception";
        
        // Act
        ApiException exception = new ApiException(message);
        
        // Assert
        assertEquals(message, exception.getMessage());
    }

    @Test
    void apiException_WithMessageAndCause() {
        // Arrange
        String message = "Test API exception";
        Throwable cause = new RuntimeException("Root cause");
        
        // Act
        ApiException exception = new ApiException(message, (Exception) cause);
        
        // Assert
        assertEquals(message, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }

    @Test
    void apiException_WithCause() {
        // Arrange
        Throwable cause = new RuntimeException("Root cause");
        
        // Act
        ApiException exception = new ApiException(cause.getMessage(), (Exception) cause);
        
        // Assert
        assertEquals(cause, exception.getCause());
    }
}