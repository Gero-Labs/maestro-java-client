package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a summary of a delegator's information.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DelegatorInfo {

  /**
   * The epoch at which the delegation becomes active.
   */
  private Long activeEpochNo;

  /**
   * The amount delegated.
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * The transaction hash of the most recent delegation.
   */
  private String latestDelegationTxHash;

  /**
   * The Bech32 encoded stake address (reward address).
   */
  private String stakeAddress;

  /**
   * Creates a new DelegatorInfo instance.
   */
  public DelegatorInfo() {
  }

  /**
   * Creates a new DelegatorInfo instance with all fields.
   *
   * @param activeEpochNo the epoch at which the delegation becomes active
   * @param amount the amount delegated
   * @param latestDelegationTxHash the transaction hash of the most recent delegation
   * @param stakeAddress the Bech32 encoded stake address (reward address)
   */
  public DelegatorInfo(Long activeEpochNo, String amount, String latestDelegationTxHash, String stakeAddress) {
    this.activeEpochNo = activeEpochNo;
    this.amount = amount;
    this.latestDelegationTxHash = latestDelegationTxHash;
    this.stakeAddress = stakeAddress;
  }

  /**
   * Gets the epoch at which the delegation becomes active.
   *
   * @return the active epoch number
   */
  public Long getActiveEpochNo() {
    return activeEpochNo;
  }

  /**
   * Sets the epoch at which the delegation becomes active.
   *
   * @param activeEpochNo the active epoch number
   */
  public void setActiveEpochNo(Long activeEpochNo) {
    this.activeEpochNo = activeEpochNo;
  }

  /**
   * Gets the amount delegated.
   *
   * @return the amount delegated
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount delegated.
   *
   * @param amount the amount delegated
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the transaction hash of the most recent delegation.
   *
   * @return the latest delegation transaction hash
   */
  public String getLatestDelegationTxHash() {
    return latestDelegationTxHash;
  }

  /**
   * Sets the transaction hash of the most recent delegation.
   *
   * @param latestDelegationTxHash the latest delegation transaction hash
   */
  public void setLatestDelegationTxHash(String latestDelegationTxHash) {
    this.latestDelegationTxHash = latestDelegationTxHash;
  }

  /**
   * Gets the Bech32 encoded stake address (reward address).
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the Bech32 encoded stake address (reward address).
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this DelegatorInfo.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "DelegatorInfo{" +
        "activeEpochNo=" + activeEpochNo +
        ", amount='" + amount + '\'' +
        ", latestDelegationTxHash='" + latestDelegationTxHash + '\'' +
        ", stakeAddress='" + stakeAddress + '\'' +
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
    DelegatorInfo that = (DelegatorInfo) o;
    return Objects.equals(activeEpochNo, that.activeEpochNo) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(latestDelegationTxHash, that.latestDelegationTxHash) &&
        Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for this object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(activeEpochNo, amount, latestDelegationTxHash, stakeAddress);
  }
}
