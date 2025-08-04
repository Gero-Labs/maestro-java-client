package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Registers stake credentials.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RegCert {

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Deposit amount.
   */
  @NotNull
  private String deposit;

  /**
   * Stake address corresponding to stake key being updated.
   */
  @NotNull
  private String stakeAddress;

  /**
   * Default constructor.
   */
  public RegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param deposit the deposit amount
   * @param stakeAddress the stake address corresponding to stake key being updated
   */
  public RegCert(Long certIndex, String deposit, String stakeAddress) {
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.stakeAddress = stakeAddress;
  }

  /**
   * Gets the index of the certificate in the transaction.
   *
   * @return the index of the certificate in the transaction
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate in the transaction.
   *
   * @param certIndex the index of the certificate in the transaction
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the deposit amount.
   *
   * @return the deposit amount
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the deposit amount.
   *
   * @param deposit the deposit amount
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
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
   * Returns a string representation of this RegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "RegCert{" +
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
    RegCert regCert = (RegCert) o;
    return Objects.equals(certIndex, regCert.certIndex) && Objects.equals(deposit, regCert.deposit) && Objects.equals(stakeAddress, regCert.stakeAddress);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(certIndex, deposit, stakeAddress);
  }
}
