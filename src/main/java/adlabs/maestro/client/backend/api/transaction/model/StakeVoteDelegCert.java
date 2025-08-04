package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Delegates to a stake pool and a DRep from the same certificate.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeVoteDelegCert {

  /**
   * Default constructor.
   */
  public StakeVoteDelegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param drep the delegated DRep
   * @param poolId the Bech32 pool ID to which the stake key is being delegated
   * @param stakeAddress the stake address corresponding to stake key being delegated
   */
  public StakeVoteDelegCert(Long certIndex, DRep drep, String poolId, String stakeAddress) {
    this.certIndex = certIndex;
    this.drep = drep;
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
   * Delegated DRep.
   */
  @NotNull
  @Valid
  private DRep drep;

  /**
   * Bech32 pool ID to which the stake key is being delegated.
   */
  @NotNull
  private String poolId;

  /**
   * Stake address corresponding to stake key being delegated.
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
   * Gets the delegated DRep.
   *
   * @return the DRep
   */
  public DRep getDrep() {
    return drep;
  }

  /**
   * Sets the delegated DRep.
   *
   * @param drep the DRep
   */
  public void setDrep(DRep drep) {
    this.drep = drep;
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
   * Gets the stake address corresponding to stake key being delegated.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address corresponding to stake key being delegated.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this StakeVoteDelegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "StakeVoteDelegCert{" +
        "certIndex=" + certIndex +
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
    StakeVoteDelegCert that = (StakeVoteDelegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
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
    return java.util.Objects.hash(certIndex, drep, poolId, stakeAddress);
  }
}
