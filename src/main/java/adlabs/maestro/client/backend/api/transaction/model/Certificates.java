package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificates found in a blockchain transaction, containing various types of
 * certificate operations including stake delegations, pool registrations, and governance actions.
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
public class Certificates {

  /** Authority committee hot key certificates */
  @NotNull
  @Valid
  private List<AuthCommitteeHotCert> authCommitteeHotCerts;

  /** Instantaneous rewards certificates */
  @NotNull
  @Valid
  private List<MirCert> mirTransfers;

  /** Stake pool registration certificates */
  @NotNull
  @Valid
  private List<PoolRegCert> poolRegistrations;

  /** Stake pool retirement certificates */
  @NotNull
  @Valid
  private List<PoolRetireCert> poolRetirements;

  /** Registration certificates */
  @NotNull
  @Valid
  private List<RegCert> regCerts;

  /** DRep registration certificates */
  @NotNull
  @Valid
  private List<RegDRepCert> regDrepCerts;

  /** Committee cold key resignation certificates */
  @NotNull
  @Valid
  private List<ResignCommitteeColdCert> resignCommitteeColdCerts;

  /** Stake key delegation certificates */
  @NotNull
  @Valid
  private List<StakeDelegCert> stakeDelegations;

  /** Stake key deregistration certificates */
  @NotNull
  @Valid
  private List<StakeRegCert> stakeDeregistrations;

  /** Stake registration and delegation certificates */
  @NotNull
  @Valid
  private List<StakeRegDelegCert> stakeRegDelegations;

  /** Stake key registration certificates */
  @NotNull
  @Valid
  private List<StakeRegCert> stakeRegistrations;

  /** Stake and vote delegation certificates */
  @NotNull
  @Valid
  private List<StakeVoteDelegCert> stakeVoteDelegations;

  /** Stake, vote registration and delegation certificates */
  @NotNull
  @Valid
  private List<StakeVoteRegDelegCert> stakeVoteRegDelegations;

  /** Unregistration certificates */
  @NotNull
  @Valid
  private List<UnRegCert> unregCerts;

  /** DRep unregistration certificates */
  @NotNull
  @Valid
  private List<UnRegDRepCert> unregDrepCerts;

  /** DRep update certificates */
  @NotNull
  @Valid
  private List<UpdateDRepCert> updateDrepCerts;

  /** Vote delegation certificates */
  @NotNull
  @Valid
  private List<VoteDelegCert> voteDelegations;

  /** Vote registration and delegation certificates */
  @NotNull
  @Valid
  private List<VoteRegDelegCert> voteRegDelegations;
}