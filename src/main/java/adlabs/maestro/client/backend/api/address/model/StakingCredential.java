package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Staking credential, the delegation part of a Cardano address
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakingCredential {

  /**
   * Bech32-encoding of the credential key hash or script hash
   */
  private String bech32;

  private String hex;

  @NotNull
  @Valid
  private StakingCredKind kind;

  @Valid
  private Pointer pointer;

  private String rewardAddress;
}