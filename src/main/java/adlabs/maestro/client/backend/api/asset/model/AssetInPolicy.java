package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NumOrString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Asset of a specific policy
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInPolicy {

  /**
   * Amount of the asset
   */
  @NotNull
  @Valid
  private NumOrString amount;

  /**
   * Hex encoded asset name
   */
  @NotNull
  private String name;
}