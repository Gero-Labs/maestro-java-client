package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicy;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Holder of assets of a specific policy.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyHolder {

  /**
   * Address of the holder.
   */
  @NotNull
  private String address;

  /**
   * List of assets owned by the holder belonging to the policy.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicy> assets;
}
