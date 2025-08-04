package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for unregistering stake credentials.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UnRegCert {

  /**
   * Default constructor.
   */
  public UnRegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param deposit the stake registration deposit to be returned
   * @param stakeAddress the stake address corresponding to the stake key being unregistered
   */
  public UnRegCert(Long certIndex, String deposit, String stakeAddress) {
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.stakeAddress = stakeAddress;
  }

  /**
   * The index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The stake registration deposit to be returned.
   */
  @NotNull
  private String deposit;

  /**
   * The stake address corresponding to the stake key being unregistered.
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
   * Gets the stake registration deposit to be returned.
   *
   * @return the deposit
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the stake registration deposit to be returned.
   *
   * @param deposit the deposit
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the stake address corresponding to the stake key being unregistered.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address corresponding to the stake key being unregistered.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this UnRegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "UnRegCert{" +
        "certIndex=" + certIndex +
        ", deposit='" + deposit + '\'' +
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
    UnRegCert that = (UnRegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(certIndex, deposit, stakeAddress);
  }
}
