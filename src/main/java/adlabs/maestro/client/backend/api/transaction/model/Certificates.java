package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

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

  /**
   * Creates a no-argument constructor.
   */
  public Certificates() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param authCommitteeHotCerts Authority committee hot key certificates
   * @param mirTransfers Instantaneous rewards certificates
   * @param poolRegistrations Stake pool registration certificates
   * @param poolRetirements Stake pool retirement certificates
   * @param regCerts Registration certificates
   * @param regDrepCerts DRep registration certificates
   * @param resignCommitteeColdCerts Committee cold key resignation certificates
   * @param stakeDelegations Stake key delegation certificates
   * @param stakeDeregistrations Stake key deregistration certificates
   * @param stakeRegDelegations Stake registration and delegation certificates
   * @param stakeRegistrations Stake key registration certificates
   * @param stakeVoteDelegations Stake and vote delegation certificates
   * @param stakeVoteRegDelegations Stake, vote registration and delegation certificates
   * @param unregCerts Unregistration certificates
   * @param unregDrepCerts DRep unregistration certificates
   * @param updateDrepCerts DRep update certificates
   * @param voteDelegations Vote delegation certificates
   * @param voteRegDelegations Vote registration and delegation certificates
   */
  public Certificates(List<AuthCommitteeHotCert> authCommitteeHotCerts, List<MirCert> mirTransfers,
                      List<PoolRegCert> poolRegistrations, List<PoolRetireCert> poolRetirements,
                      List<RegCert> regCerts, List<RegDRepCert> regDrepCerts,
                      List<ResignCommitteeColdCert> resignCommitteeColdCerts, List<StakeDelegCert> stakeDelegations,
                      List<StakeRegCert> stakeDeregistrations, List<StakeRegDelegCert> stakeRegDelegations,
                      List<StakeRegCert> stakeRegistrations, List<StakeVoteDelegCert> stakeVoteDelegations,
                      List<StakeVoteRegDelegCert> stakeVoteRegDelegations, List<UnRegCert> unregCerts,
                      List<UnRegDRepCert> unregDrepCerts, List<UpdateDRepCert> updateDrepCerts,
                      List<VoteDelegCert> voteDelegations, List<VoteRegDelegCert> voteRegDelegations) {
    this.authCommitteeHotCerts = authCommitteeHotCerts;
    this.mirTransfers = mirTransfers;
    this.poolRegistrations = poolRegistrations;
    this.poolRetirements = poolRetirements;
    this.regCerts = regCerts;
    this.regDrepCerts = regDrepCerts;
    this.resignCommitteeColdCerts = resignCommitteeColdCerts;
    this.stakeDelegations = stakeDelegations;
    this.stakeDeregistrations = stakeDeregistrations;
    this.stakeRegDelegations = stakeRegDelegations;
    this.stakeRegistrations = stakeRegistrations;
    this.stakeVoteDelegations = stakeVoteDelegations;
    this.stakeVoteRegDelegations = stakeVoteRegDelegations;
    this.unregCerts = unregCerts;
    this.unregDrepCerts = unregDrepCerts;
    this.updateDrepCerts = updateDrepCerts;
    this.voteDelegations = voteDelegations;
    this.voteRegDelegations = voteRegDelegations;
  }

  /**
   * Gets the authority committee hot key certificates.
   *
   * @return the authority committee hot key certificates
   */
  public List<AuthCommitteeHotCert> getAuthCommitteeHotCerts() {
    return authCommitteeHotCerts;
  }

  /**
   * Sets the authority committee hot key certificates.
   *
   * @param authCommitteeHotCerts the authority committee hot key certificates to set
   */
  public void setAuthCommitteeHotCerts(List<AuthCommitteeHotCert> authCommitteeHotCerts) {
    this.authCommitteeHotCerts = authCommitteeHotCerts;
  }

  /**
   * Gets the instantaneous rewards certificates.
   *
   * @return the instantaneous rewards certificates
   */
  public List<MirCert> getMirTransfers() {
    return mirTransfers;
  }

  /**
   * Sets the instantaneous rewards certificates.
   *
   * @param mirTransfers the instantaneous rewards certificates to set
   */
  public void setMirTransfers(List<MirCert> mirTransfers) {
    this.mirTransfers = mirTransfers;
  }

  /**
   * Gets the stake pool registration certificates.
   *
   * @return the stake pool registration certificates
   */
  public List<PoolRegCert> getPoolRegistrations() {
    return poolRegistrations;
  }

  /**
   * Sets the stake pool registration certificates.
   *
   * @param poolRegistrations the stake pool registration certificates to set
   */
  public void setPoolRegistrations(List<PoolRegCert> poolRegistrations) {
    this.poolRegistrations = poolRegistrations;
  }

  /**
   * Gets the stake pool retirement certificates.
   *
   * @return the stake pool retirement certificates
   */
  public List<PoolRetireCert> getPoolRetirements() {
    return poolRetirements;
  }

  /**
   * Sets the stake pool retirement certificates.
   *
   * @param poolRetirements the stake pool retirement certificates to set
   */
  public void setPoolRetirements(List<PoolRetireCert> poolRetirements) {
    this.poolRetirements = poolRetirements;
  }

  /**
   * Gets the registration certificates.
   *
   * @return the registration certificates
   */
  public List<RegCert> getRegCerts() {
    return regCerts;
  }

  /**
   * Sets the registration certificates.
   *
   * @param regCerts the registration certificates to set
   */
  public void setRegCerts(List<RegCert> regCerts) {
    this.regCerts = regCerts;
  }

  /**
   * Gets the DRep registration certificates.
   *
   * @return the DRep registration certificates
   */
  public List<RegDRepCert> getRegDrepCerts() {
    return regDrepCerts;
  }

  /**
   * Sets the DRep registration certificates.
   *
   * @param regDrepCerts the DRep registration certificates to set
   */
  public void setRegDrepCerts(List<RegDRepCert> regDrepCerts) {
    this.regDrepCerts = regDrepCerts;
  }

  /**
   * Gets the committee cold key resignation certificates.
   *
   * @return the committee cold key resignation certificates
   */
  public List<ResignCommitteeColdCert> getResignCommitteeColdCerts() {
    return resignCommitteeColdCerts;
  }

  /**
   * Sets the committee cold key resignation certificates.
   *
   * @param resignCommitteeColdCerts the committee cold key resignation certificates to set
   */
  public void setResignCommitteeColdCerts(List<ResignCommitteeColdCert> resignCommitteeColdCerts) {
    this.resignCommitteeColdCerts = resignCommitteeColdCerts;
  }

  /**
   * Gets the stake key delegation certificates.
   *
   * @return the stake key delegation certificates
   */
  public List<StakeDelegCert> getStakeDelegations() {
    return stakeDelegations;
  }

  /**
   * Sets the stake key delegation certificates.
   *
   * @param stakeDelegations the stake key delegation certificates to set
   */
  public void setStakeDelegations(List<StakeDelegCert> stakeDelegations) {
    this.stakeDelegations = stakeDelegations;
  }

  /**
   * Gets the stake key deregistration certificates.
   *
   * @return the stake key deregistration certificates
   */
  public List<StakeRegCert> getStakeDeregistrations() {
    return stakeDeregistrations;
  }

  /**
   * Sets the stake key deregistration certificates.
   *
   * @param stakeDeregistrations the stake key deregistration certificates to set
   */
  public void setStakeDeregistrations(List<StakeRegCert> stakeDeregistrations) {
    this.stakeDeregistrations = stakeDeregistrations;
  }

  /**
   * Gets the stake registration and delegation certificates.
   *
   * @return the stake registration and delegation certificates
   */
  public List<StakeRegDelegCert> getStakeRegDelegations() {
    return stakeRegDelegations;
  }

  /**
   * Sets the stake registration and delegation certificates.
   *
   * @param stakeRegDelegations the stake registration and delegation certificates to set
   */
  public void setStakeRegDelegations(List<StakeRegDelegCert> stakeRegDelegations) {
    this.stakeRegDelegations = stakeRegDelegations;
  }

  /**
   * Gets the stake key registration certificates.
   *
   * @return the stake key registration certificates
   */
  public List<StakeRegCert> getStakeRegistrations() {
    return stakeRegistrations;
  }

  /**
   * Sets the stake key registration certificates.
   *
   * @param stakeRegistrations the stake key registration certificates to set
   */
  public void setStakeRegistrations(List<StakeRegCert> stakeRegistrations) {
    this.stakeRegistrations = stakeRegistrations;
  }

  /**
   * Gets the stake and vote delegation certificates.
   *
   * @return the stake and vote delegation certificates
   */
  public List<StakeVoteDelegCert> getStakeVoteDelegations() {
    return stakeVoteDelegations;
  }

  /**
   * Sets the stake and vote delegation certificates.
   *
   * @param stakeVoteDelegations the stake and vote delegation certificates to set
   */
  public void setStakeVoteDelegations(List<StakeVoteDelegCert> stakeVoteDelegations) {
    this.stakeVoteDelegations = stakeVoteDelegations;
  }

  /**
   * Gets the stake, vote registration and delegation certificates.
   *
   * @return the stake, vote registration and delegation certificates
   */
  public List<StakeVoteRegDelegCert> getStakeVoteRegDelegations() {
    return stakeVoteRegDelegations;
  }

  /**
   * Sets the stake, vote registration and delegation certificates.
   *
   * @param stakeVoteRegDelegations the stake, vote registration and delegation certificates to set
   */
  public void setStakeVoteRegDelegations(List<StakeVoteRegDelegCert> stakeVoteRegDelegations) {
    this.stakeVoteRegDelegations = stakeVoteRegDelegations;
  }

  /**
   * Gets the unregistration certificates.
   *
   * @return the unregistration certificates
   */
  public List<UnRegCert> getUnregCerts() {
    return unregCerts;
  }

  /**
   * Sets the unregistration certificates.
   *
   * @param unregCerts the unregistration certificates to set
   */
  public void setUnregCerts(List<UnRegCert> unregCerts) {
    this.unregCerts = unregCerts;
  }

  /**
   * Gets the DRep unregistration certificates.
   *
   * @return the DRep unregistration certificates
   */
  public List<UnRegDRepCert> getUnregDrepCerts() {
    return unregDrepCerts;
  }

  /**
   * Sets the DRep unregistration certificates.
   *
   * @param unregDrepCerts the DRep unregistration certificates to set
   */
  public void setUnregDrepCerts(List<UnRegDRepCert> unregDrepCerts) {
    this.unregDrepCerts = unregDrepCerts;
  }

  /**
   * Gets the DRep update certificates.
   *
   * @return the DRep update certificates
   */
  public List<UpdateDRepCert> getUpdateDrepCerts() {
    return updateDrepCerts;
  }

  /**
   * Sets the DRep update certificates.
   *
   * @param updateDrepCerts the DRep update certificates to set
   */
  public void setUpdateDrepCerts(List<UpdateDRepCert> updateDrepCerts) {
    this.updateDrepCerts = updateDrepCerts;
  }

  /**
   * Gets the vote delegation certificates.
   *
   * @return the vote delegation certificates
   */
  public List<VoteDelegCert> getVoteDelegations() {
    return voteDelegations;
  }

  /**
   * Sets the vote delegation certificates.
   *
   * @param voteDelegations the vote delegation certificates to set
   */
  public void setVoteDelegations(List<VoteDelegCert> voteDelegations) {
    this.voteDelegations = voteDelegations;
  }

  /**
   * Gets the vote registration and delegation certificates.
   *
   * @return the vote registration and delegation certificates
   */
  public List<VoteRegDelegCert> getVoteRegDelegations() {
    return voteRegDelegations;
  }

  /**
   * Sets the vote registration and delegation certificates.
   *
   * @param voteRegDelegations the vote registration and delegation certificates to set
   */
  public void setVoteRegDelegations(List<VoteRegDelegCert> voteRegDelegations) {
    this.voteRegDelegations = voteRegDelegations;
  }

  @Override
  public String toString() {
    return "Certificates{" +
        "authCommitteeHotCerts=" + authCommitteeHotCerts +
        ", mirTransfers=" + mirTransfers +
        ", poolRegistrations=" + poolRegistrations +
        ", poolRetirements=" + poolRetirements +
        ", regCerts=" + regCerts +
        ", regDrepCerts=" + regDrepCerts +
        ", resignCommitteeColdCerts=" + resignCommitteeColdCerts +
        ", stakeDelegations=" + stakeDelegations +
        ", stakeDeregistrations=" + stakeDeregistrations +
        ", stakeRegDelegations=" + stakeRegDelegations +
        ", stakeRegistrations=" + stakeRegistrations +
        ", stakeVoteDelegations=" + stakeVoteDelegations +
        ", stakeVoteRegDelegations=" + stakeVoteRegDelegations +
        ", unregCerts=" + unregCerts +
        ", unregDrepCerts=" + unregDrepCerts +
        ", updateDrepCerts=" + updateDrepCerts +
        ", voteDelegations=" + voteDelegations +
        ", voteRegDelegations=" + voteRegDelegations +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Certificates that = (Certificates) o;
    return java.util.Objects.equals(authCommitteeHotCerts, that.authCommitteeHotCerts) &&
        java.util.Objects.equals(mirTransfers, that.mirTransfers) &&
        java.util.Objects.equals(poolRegistrations, that.poolRegistrations) &&
        java.util.Objects.equals(poolRetirements, that.poolRetirements) &&
        java.util.Objects.equals(regCerts, that.regCerts) &&
        java.util.Objects.equals(regDrepCerts, that.regDrepCerts) &&
        java.util.Objects.equals(resignCommitteeColdCerts, that.resignCommitteeColdCerts) &&
        java.util.Objects.equals(stakeDelegations, that.stakeDelegations) &&
        java.util.Objects.equals(stakeDeregistrations, that.stakeDeregistrations) &&
        java.util.Objects.equals(stakeRegDelegations, that.stakeRegDelegations) &&
        java.util.Objects.equals(stakeRegistrations, that.stakeRegistrations) &&
        java.util.Objects.equals(stakeVoteDelegations, that.stakeVoteDelegations) &&
        java.util.Objects.equals(stakeVoteRegDelegations, that.stakeVoteRegDelegations) &&
        java.util.Objects.equals(unregCerts, that.unregCerts) &&
        java.util.Objects.equals(unregDrepCerts, that.unregDrepCerts) &&
        java.util.Objects.equals(updateDrepCerts, that.updateDrepCerts) &&
        java.util.Objects.equals(voteDelegations, that.voteDelegations) &&
        java.util.Objects.equals(voteRegDelegations, that.voteRegDelegations);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(authCommitteeHotCerts, mirTransfers, poolRegistrations, poolRetirements,
        regCerts, regDrepCerts, resignCommitteeColdCerts, stakeDelegations, stakeDeregistrations,
        stakeRegDelegations, stakeRegistrations, stakeVoteDelegations, stakeVoteRegDelegations,
        unregCerts, unregDrepCerts, updateDrepCerts, voteDelegations, voteRegDelegations);
  }
}