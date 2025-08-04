package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Stake pool voting thresholds (introduced in Conway).
 */
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

  /**
   * Default constructor.
   */
  public StakePoolVotingThresholds() {
  }

  /**
   * All arguments constructor.
   *
   * @param constitutionalCommittee the constitutional committee thresholds
   * @param hardForkInitiation the hard fork initiation threshold
   * @param noConfidence the no confidence threshold
   * @param protocolParametersUpdate the protocol parameters update thresholds
   */
  public StakePoolVotingThresholds(ConstitutionalCommittee constitutionalCommittee, String hardForkInitiation,
                                  String noConfidence, ProtocolParametersUpdateStakePool protocolParametersUpdate) {
    this.constitutionalCommittee = constitutionalCommittee;
    this.hardForkInitiation = hardForkInitiation;
    this.noConfidence = noConfidence;
    this.protocolParametersUpdate = protocolParametersUpdate;
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
   * Gets the protocol parameters update thresholds.
   *
   * @return the protocol parameters update thresholds
   */
  public ProtocolParametersUpdateStakePool getProtocolParametersUpdate() {
    return protocolParametersUpdate;
  }

  /**
   * Sets the protocol parameters update thresholds.
   *
   * @param protocolParametersUpdate the protocol parameters update thresholds
   */
  public void setProtocolParametersUpdate(ProtocolParametersUpdateStakePool protocolParametersUpdate) {
    this.protocolParametersUpdate = protocolParametersUpdate;
  }

  @Override
  public String toString() {
    return "StakePoolVotingThresholds{" +
        "constitutionalCommittee=" + constitutionalCommittee +
        ", hardForkInitiation='" + hardForkInitiation + '\'' +
        ", noConfidence='" + noConfidence + '\'' +
        ", protocolParametersUpdate=" + protocolParametersUpdate +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StakePoolVotingThresholds that = (StakePoolVotingThresholds) o;
    return Objects.equals(constitutionalCommittee, that.constitutionalCommittee) &&
        Objects.equals(hardForkInitiation, that.hardForkInitiation) &&
        Objects.equals(noConfidence, that.noConfidence) &&
        Objects.equals(protocolParametersUpdate, that.protocolParametersUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constitutionalCommittee, hardForkInitiation, noConfidence, protocolParametersUpdate);
  }
}
