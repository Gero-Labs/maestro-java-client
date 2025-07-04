package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Concise information about a specific Cardano native-asset
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInfoConcise {

  /**
   * Hex encoding of the asset name
   */
  @NotNull
  private String assetName;

  /**
   * ASCII representation of the asset name
   */
  @NotNull
  private String assetNameAscii;

  /**
   * Asset standards compliance information
   */
  @NotNull
  @Valid
  private AssetStandards assetStandards;

  /**
   * CIP-14 fingerprint of the asset
   */
  @NotNull
  private String fingerprint;

  /**
   * Current amount of the asset minted
   */
  @NotNull
  private String totalSupply;
}