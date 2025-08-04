package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
/**
 * A marker interface for types that can represent either a number or a string.
 * Implementations should handle the specific serialization/deserialization logic.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public interface NumOrString {
    // This is a marker interface, no fields or methods are expected here.
    // Concrete implementations will define the actual data and serialization.
}
