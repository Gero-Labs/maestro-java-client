package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Registers stake credentials, delegates to a pool, and to a DRep
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeVoteRegDelegCert {

  /**
   * Default constructor.
   */
  public StakeVoteRegDelegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the certificate index
   * @param deposit the deposit amount
   * @param drep the DRep
   * @param poolId the pool ID
   * @param stakeAddress the stake address
   */
  public StakeVoteRegDelegCert(Long certIndex, String deposit, DRep drep, String poolId, String stakeAddress) {
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.drep = drep;
    this.poolId = poolId;
    this.stakeAddress = stakeAddress;
  }

  @NotNull
  private Long certIndex;

  @NotNull
  private String deposit;

  @NotNull
  @Valid
  private DRep drep;

  @NotNull
  private String poolId;

  @NotNull
  private String stakeAddress;

  /**
   * Gets the certificate index.
   *
   * @return the certificate index
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the certificate index.
   *
   * @param certIndex the certificate index
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the deposit amount.
   *
   * @return the deposit
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the deposit amount.
   *
   * @param deposit the deposit
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the DRep.
   *
   * @return the DRep
   */
  public DRep getDrep() {
    return drep;
  }

  /**
   * Sets the DRep.
   *
   * @param drep the DRep
   */
  public void setDrep(DRep drep) {
    this.drep = drep;
  }

  /**
   * Gets the pool ID.
   *
   * @return the pool ID
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the pool ID.
   *
   * @param poolId the pool ID
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   * Gets the stake address.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this StakeVoteRegDelegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "StakeVoteRegDelegCert{" +
        "certIndex=" + certIndex +
        ", deposit='" + deposit + '\'' +
        ", drep=" + drep +
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
    StakeVoteRegDelegCert that = (StakeVoteRegDelegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(drep, that.drep) &&
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
    return java.util.Objects.hash(certIndex, deposit, drep, poolId, stakeAddress);
  }
}