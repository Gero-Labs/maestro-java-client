package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DRep voting thresholds (introduced in Conway).
 */
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

  /**
   * Creates a new instance of DelegateRepresentativeVotingThresholds.
   */
  public DelegateRepresentativeVotingThresholds() {
  }

  /**
   * Creates a new instance of DelegateRepresentativeVotingThresholds with all fields.
   *
   * @param constitution the constitution threshold
   * @param constitutionalCommittee the constitutional committee thresholds
   * @param hardForkInitiation the hard fork initiation threshold
   * @param noConfidence the no confidence threshold
   * @param protocolParametersUpdate the protocol parameters update DRep
   * @param treasuryWithdrawals the treasury withdrawals threshold
   */
  public DelegateRepresentativeVotingThresholds(String constitution, ConstitutionalCommittee constitutionalCommittee, String hardForkInitiation, String noConfidence, ProtocolParametersUpdateDRep protocolParametersUpdate, String treasuryWithdrawals) {
    this.constitution = constitution;
    this.constitutionalCommittee = constitutionalCommittee;
    this.hardForkInitiation = hardForkInitiation;
    this.noConfidence = noConfidence;
    this.protocolParametersUpdate = protocolParametersUpdate;
    this.treasuryWithdrawals = treasuryWithdrawals;
  }

  /**
   * Gets the constitution threshold.
   *
   * @return the constitution threshold
   */
  public String getConstitution() {
    return constitution;
  }

  /**
   * Sets the constitution threshold.
   *
   * @param constitution the constitution threshold
   */
  public void setConstitution(String constitution) {
    this.constitution = constitution;
  }

  /**
   * Gets the constitutional committee thresholds.
   *
   * @return the constitutional committee thresholds
   */
  public ConstitutionalCommittee getConstitutionalCommittee() {
    return constitutionalCommittee;
  }

  /**
   * Sets the constitutional committee thresholds.
   *
   * @param constitutionalCommittee the constitutional committee thresholds
   */
  public void setConstitutionalCommittee(ConstitutionalCommittee constitutionalCommittee) {
    this.constitutionalCommittee = constitutionalCommittee;
  }

  /**
   * Gets the hard fork initiation threshold.
   *
   * @return the hard fork initiation threshold
   */
  public String getHardForkInitiation() {
    return hardForkInitiation;
  }

  /**
   * Sets the hard fork initiation threshold.
   *
   * @param hardForkInitiation the hard fork initiation threshold
   */
  public void setHardForkInitiation(String hardForkInitiation) {
    this.hardForkInitiation = hardForkInitiation;
  }

  /**
   * Gets the no confidence threshold.
   *
   * @return the no confidence threshold
   */
  public String getNoConfidence() {
    return noConfidence;
  }

  /**
   * Sets the no confidence threshold.
   *
   * @param noConfidence the no confidence threshold
   */
  public void setNoConfidence(String noConfidence) {
    this.noConfidence = noConfidence;
  }

  /**
   * Gets the protocol parameters update DRep.
   *
   * @return the protocol parameters update DRep
   */
  public ProtocolParametersUpdateDRep getProtocolParametersUpdate() {
    return protocolParametersUpdate;
  }

  /**
   * Sets the protocol parameters update DRep.
   *
   * @param protocolParametersUpdate the protocol parameters update DRep
   */
  public void setProtocolParametersUpdate(ProtocolParametersUpdateDRep protocolParametersUpdate) {
    this.protocolParametersUpdate = protocolParametersUpdate;
  }

  /**
   * Gets the treasury withdrawals threshold.
   *
   * @return the treasury withdrawals threshold
   */
  public String getTreasuryWithdrawals() {
    return treasuryWithdrawals;
  }

  /**
   * Sets the treasury withdrawals threshold.
   *
   * @param treasuryWithdrawals the treasury withdrawals threshold
   */
  public void setTreasuryWithdrawals(String treasuryWithdrawals) {
    this.treasuryWithdrawals = treasuryWithdrawals;
  }

  /**
   * Returns a string representation of this DelegateRepresentativeVotingThresholds object.
   *
   * @return a string representation of this DelegateRepresentativeVotingThresholds object
   */
  @Override
  public String toString() {
    return "DelegateRepresentativeVotingThresholds{" +
           "constitution='" + constitution + '\'' +
           ", constitutionalCommittee=" + constitutionalCommittee +
           ", hardForkInitiation='" + hardForkInitiation + '\'' +
           ", noConfidence='" + noConfidence + '\'' +
           ", protocolParametersUpdate=" + protocolParametersUpdate +
           ", treasuryWithdrawals='" + treasuryWithdrawals + '\'' +
           '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the o argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DelegateRepresentativeVotingThresholds that = (DelegateRepresentativeVotingThresholds) o;
    return Objects.equals(constitution, that.constitution) &&
           Objects.equals(constitutionalCommittee, that.constitutionalCommittee) &&
           Objects.equals(hardForkInitiation, that.hardForkInitiation) &&
           Objects.equals(noConfidence, that.noConfidence) &&
           Objects.equals(protocolParametersUpdate, that.protocolParametersUpdate) &&
           Objects.equals(treasuryWithdrawals, that.treasuryWithdrawals);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(constitution, constitutionalCommittee, hardForkInitiation, noConfidence, protocolParametersUpdate, treasuryWithdrawals);
  }
}
