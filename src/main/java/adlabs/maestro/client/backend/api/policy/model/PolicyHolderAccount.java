package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicy;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Account which controls some assets of a specific policy.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyHolderAccount {

  /**
   * Bech32-encoded stake address (reward address) or payment address.
   */
  @NotNull
  private String account;

  /**
   * List of assets owned by the holder belonging to the policy.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicy> assets;
}
