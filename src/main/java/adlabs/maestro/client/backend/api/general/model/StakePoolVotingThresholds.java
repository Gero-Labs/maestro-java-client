package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Stake pool voting thresholds (introduced in Conway).
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakePoolVotingThresholds {

  /**
   * Thresholds related to constitutional committee.
   */
  @NotNull
  @Valid
  private ConstitutionalCommittee constitutionalCommittee;

  /**
   * Threshold for hard fork initiation.
   */
  @NotNull
  private String hardForkInitiation;

  /**
   * Threshold for no confidence votes.
   */
  @NotNull
  private String noConfidence;

  /**
   * Thresholds for protocol parameters update (stake pool related).
   */
  @NotNull
  @Valid
  private ProtocolParametersUpdateStakePool protocolParametersUpdate;
}
