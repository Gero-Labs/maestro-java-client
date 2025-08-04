package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for delegating votes to a DRep (Delegated Representative).
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VoteDelegCert {

  /**
   * Default constructor.
   */
  public VoteDelegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param drep the DRep to which the votes are delegated
   * @param stakeAddress the stake address corresponding to the stake key being updated
   */
  public VoteDelegCert(Long certIndex, DRep drep, String stakeAddress) {
    this.certIndex = certIndex;
    this.drep = drep;
    this.stakeAddress = stakeAddress;
  }

  /**
   * The index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The DRep to which the votes are delegated.
   */
  @NotNull
  @Valid
  private DRep drep;

  /**
   * The stake address corresponding to the stake key being updated.
   */
  @NotNull
  private String stakeAddress;

  /**
   * Gets the index of the certificate in the transaction.
   *
   * @return the certificate index
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate in the transaction.
   *
   * @param certIndex the certificate index
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the DRep to which the votes are delegated.
   *
   * @return the DRep
   */
  public DRep getDrep() {
    return drep;
  }

  /**
   * Sets the DRep to which the votes are delegated.
   *
   * @param drep the DRep
   */
  public void setDrep(DRep drep) {
    this.drep = drep;
  }

  /**
   * Gets the stake address corresponding to the stake key being updated.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address corresponding to the stake key being updated.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this VoteDelegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "VoteDelegCert{" +
        "certIndex=" + certIndex +
        ", drep=" + drep +
        ", stakeAddress='" + stakeAddress + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VoteDelegCert that = (VoteDelegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(drep, that.drep) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(certIndex, drep, stakeAddress);
  }
}
