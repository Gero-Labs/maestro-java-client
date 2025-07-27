package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Reference Script
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReferenceScript {

    /**
     * Hash of referenced script
     */
    private String hash;

    /**
     * Size in bytes
     */
    private Integer size;

    /**
     * Type of script
     */
    private String type;

    /**
     * Script bytes (hex)
     */
    private String bytes;

    /**
     * Value (json)
     */
    private JsonNode value;
}
