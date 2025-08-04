package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Certificate for registering a stake key.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeRegCert {

  /**
   * Default constructor.
   */
  public StakeRegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param stakeAddress the stake address corresponding to stake key being updated
   */
  public StakeRegCert(Long certIndex, String stakeAddress) {
    this.certIndex = certIndex;
    this.stakeAddress = stakeAddress;
  }

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Stake address corresponding to stake key being updated.
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
   * Gets the stake address corresponding to stake key being updated.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address corresponding to stake key being updated.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this StakeRegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "StakeRegCert{" +
        "certIndex=" + certIndex +
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
    StakeRegCert that = (StakeRegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(certIndex, stakeAddress);
  }
}
