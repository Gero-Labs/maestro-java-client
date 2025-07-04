package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NumOrString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Account which controls some of a specific asset
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetHolderAccount {

  /**
   * Stake/reward address for stake credential
   */
  @NotNull
  private String account;

  /**
   * Amount controlled by the account
   */
  @NotNull
  @Valid
  private NumOrString amount;
}