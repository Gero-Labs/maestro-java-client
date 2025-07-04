package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Name of asset of a specific policy and amount minted or burned
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInPolicyMint {

  /**
   * Amount of asset minted (negative if burned)
   */
  private String amount;

  /**
   * Asset name
   */
  private String name;
}