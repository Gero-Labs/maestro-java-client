package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NumOrString;

/**
 * UTxO which contains a specific asset
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetUtxo {

  /**
   * Address which controls the UTxO
   */
  private String address;

  /**
   * Amount of the asset in the UTxO
   */
  private NumOrString amount;

  /**
   * UTxO transaction index
   */
  private Long index;

  /**
   * Absolute slot of block which produced the UTxO
   */
  private Long slot;

  /**
   * UTxO transaction hash
   */
  private String txHash;
}