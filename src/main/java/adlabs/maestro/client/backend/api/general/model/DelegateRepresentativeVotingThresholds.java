package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * DRep voting thresholds (introduced in Conway).
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DelegateRepresentativeVotingThresholds {

  /**
   * Constitution threshold.
   */
  @NotNull
  private String constitution;

  /**
   * Constitutional Committee thresholds.
   */
  @NotNull
  @Valid
  private ConstitutionalCommittee constitutionalCommittee;

  /**
   * Hard Fork Initiation threshold.
   */
  @NotNull
  private String hardForkInitiation;

  /**
   * No Confidence threshold.
   */
  @NotNull
  private String noConfidence;

  /**
   * Protocol Parameters Update DRep.
   */
  @NotNull
  @Valid
  private ProtocolParametersUpdateDRep protocolParametersUpdate;

  /**
   * Treasury Withdrawals threshold.
   */
  @NotNull
  private String treasuryWithdrawals;
}
