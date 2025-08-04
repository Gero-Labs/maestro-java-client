package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Registers stake credentials and delegates to a stake pool.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeRegDelegCert {

  /**
   * Default constructor.
   */
  public StakeRegDelegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param deposit the deposit amount for registration
   * @param poolId the Bech32 pool ID to which the stake key is being delegated
   * @param stakeAddress the stake address corresponding to stake key being registered and delegated
   */
  public StakeRegDelegCert(Long certIndex, String deposit, String poolId, String stakeAddress) {
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.poolId = poolId;
    this.stakeAddress = stakeAddress;
  }

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Deposit amount for registration.
   */
  @NotNull
  private String deposit;

  /**
   * Bech32 pool ID to which the stake key is being delegated.
   */
  @NotNull
  private String poolId;

  /**
   * Stake address corresponding to stake key being registered and delegated.
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
   * Gets the deposit amount for registration.
   *
   * @return the deposit
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the deposit amount for registration.
   *
   * @param deposit the deposit
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the Bech32 pool ID to which the stake key is being delegated.
   *
   * @return the pool ID
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the Bech32 pool ID to which the stake key is being delegated.
   *
   * @param poolId the pool ID
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   * Gets the stake address corresponding to stake key being registered and delegated.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address corresponding to stake key being registered and delegated.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this StakeRegDelegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "StakeRegDelegCert{" +
        "certIndex=" + certIndex +
        ", deposit='" + deposit + '\'' +
        ", poolId='" + poolId + '\'' +
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
    StakeRegDelegCert that = (StakeRegDelegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(poolId, that.poolId) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(certIndex, deposit, poolId, stakeAddress);
  }
}
