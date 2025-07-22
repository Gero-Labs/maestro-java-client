package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a summary of a delegator's information.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DelegatorInfo {

  /**
   * The epoch at which the delegation becomes active.
   */
  private Long activeEpochNo;

  /**
   * The amount delegated.
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * The transaction hash of the most recent delegation.
   */
  private String latestDelegationTxHash;

  /**
   * The Bech32 encoded stake address (reward address).
   */
  private String stakeAddress;
}
