package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Asset
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
public class Asset {

    /**
     * Asset Policy ID (hex)
     */
    private String policyId;

    /**
     * Asset Name (hex) (hex for policy + assetname)
     */
    private String assetName;

    /**
     * The CIP14 fingerprint of the asset
     */
    private String fingerprint;

    /**
     * Asset decimals
     */
    private Integer decimals;

    /**
     * Sum of assets for output UTxO
     */
    private String quantity;
}
