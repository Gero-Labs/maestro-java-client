package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a Lovelace or native asset.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MintAsset {

  /**
   * Amount of the asset.
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * Asset (represented as concatenation of hex encoded policy ID and asset name).
   */
  @NotNull
  private String unit;
}
