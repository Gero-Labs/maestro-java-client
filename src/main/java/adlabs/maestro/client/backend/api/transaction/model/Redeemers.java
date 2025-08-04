package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import java.util.List;

/**
 * Represents redeemers for various transaction components.
 */
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

  /**
   * Creates a no-argument constructor.
   */
  public Redeemers() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param certificates Certificate redeemers
   * @param mints Minting redeemers
   * @param proposals Proposal redeemers (introduced in Conway)
   * @param spends Spending redeemers
   * @param votes Voting redeemers (introduced in Conway)
   * @param withdrawals Withdrawal redeemers
   */
  public Redeemers(List<CertRedeemer> certificates, List<MintRedeemer> mints, List<ProposalRedeemer> proposals, 
                   List<SpendRedeemer> spends, List<VoteRedeemer> votes, List<WdrlRedeemer> withdrawals) {
    this.certificates = certificates;
    this.mints = mints;
    this.proposals = proposals;
    this.spends = spends;
    this.votes = votes;
    this.withdrawals = withdrawals;
  }

  /**
   * Gets the certificate redeemers.
   *
   * @return the certificate redeemers
   */
  public List<CertRedeemer> getCertificates() {
    return certificates;
  }

  /**
   * Sets the certificate redeemers.
   *
   * @param certificates the certificate redeemers to set
   */
  public void setCertificates(List<CertRedeemer> certificates) {
    this.certificates = certificates;
  }

  /**
   * Gets the minting redeemers.
   *
   * @return the minting redeemers
   */
  public List<MintRedeemer> getMints() {
    return mints;
  }

  /**
   * Sets the minting redeemers.
   *
   * @param mints the minting redeemers to set
   */
  public void setMints(List<MintRedeemer> mints) {
    this.mints = mints;
  }

  /**
   * Gets the proposal redeemers (introduced in Conway).
   *
   * @return the proposal redeemers
   */
  public List<ProposalRedeemer> getProposals() {
    return proposals;
  }

  /**
   * Sets the proposal redeemers (introduced in Conway).
   *
   * @param proposals the proposal redeemers to set
   */
  public void setProposals(List<ProposalRedeemer> proposals) {
    this.proposals = proposals;
  }

  /**
   * Gets the spending redeemers.
   *
   * @return the spending redeemers
   */
  public List<SpendRedeemer> getSpends() {
    return spends;
  }

  /**
   * Sets the spending redeemers.
   *
   * @param spends the spending redeemers to set
   */
  public void setSpends(List<SpendRedeemer> spends) {
    this.spends = spends;
  }

  /**
   * Gets the voting redeemers (introduced in Conway).
   *
   * @return the voting redeemers
   */
  public List<VoteRedeemer> getVotes() {
    return votes;
  }

  /**
   * Sets the voting redeemers (introduced in Conway).
   *
   * @param votes the voting redeemers to set
   */
  public void setVotes(List<VoteRedeemer> votes) {
    this.votes = votes;
  }

  /**
   * Gets the withdrawal redeemers.
   *
   * @return the withdrawal redeemers
   */
  public List<WdrlRedeemer> getWithdrawals() {
    return withdrawals;
  }

  /**
   * Sets the withdrawal redeemers.
   *
   * @param withdrawals the withdrawal redeemers to set
   */
  public void setWithdrawals(List<WdrlRedeemer> withdrawals) {
    this.withdrawals = withdrawals;
  }

  @Override
  public String toString() {
    return "Redeemers{" +
        "certificates=" + certificates +
        ", mints=" + mints +
        ", proposals=" + proposals +
        ", spends=" + spends +
        ", votes=" + votes +
        ", withdrawals=" + withdrawals +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Redeemers redeemers = (Redeemers) o;
    return java.util.Objects.equals(certificates, redeemers.certificates) &&
        java.util.Objects.equals(mints, redeemers.mints) &&
        java.util.Objects.equals(proposals, redeemers.proposals) &&
        java.util.Objects.equals(spends, redeemers.spends) &&
        java.util.Objects.equals(votes, redeemers.votes) &&
        java.util.Objects.equals(withdrawals, redeemers.withdrawals);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(certificates, mints, proposals, spends, votes, withdrawals);
  }
}
