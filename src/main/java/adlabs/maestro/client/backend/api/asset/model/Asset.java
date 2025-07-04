package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Lovelace or native asset
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Asset {

  /**
   * Amount of the asset
   */
  @NotNull
  @Valid
  private Long amount;

  /**
   * Asset (either `lovelace` or concatenation of hex encoded policy ID and asset name for native asset)
   */
  @NotNull
  private String unit;
}