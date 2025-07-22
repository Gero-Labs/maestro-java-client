package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Represents redeemers for various transaction components.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Redeemers {

  /**
   * Certificate redeemers.
   */
  @Valid
  private List<@Valid CertRedeemer> certificates;

  /**
   * Minting redeemers.
   */
  @Valid
  private List<@Valid MintRedeemer> mints;

  /**
   * Proposal redeemers (introduced in Conway).
   */
  @Valid
  private List<@Valid ProposalRedeemer> proposals;

  /**
   * Spending redeemers.
   */
  @Valid
  private List<@Valid SpendRedeemer> spends;

  /**
   * Voting redeemers (introduced in Conway).
   */
  @Valid
  private List<@Valid VoteRedeemer> votes;

  /**
   * Withdrawal redeemers.
   */
  @Valid
  private List<@Valid WdrlRedeemer> withdrawals;
}
