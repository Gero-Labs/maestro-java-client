package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

/**
 * Information summary of a historical delegator.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class HistoricalDelegatorInfo {

  /**
   * Delegator live stake.
   */
  private String amount;

  /**
   * Bech32 encoded stake address (reward address).
   */
  private String stakeAddress;

  /**
   * Creates a new HistoricalDelegatorInfo instance.
   */
  public HistoricalDelegatorInfo() {
  }

  /**
   * Creates a new HistoricalDelegatorInfo instance with all fields.
   *
   * @param amount the delegator live stake
   * @param stakeAddress the Bech32 encoded stake address (reward address)
   */
  public HistoricalDelegatorInfo(String amount, String stakeAddress) {
    this.amount = amount;
    this.stakeAddress = stakeAddress;
  }

  /**
   * Gets the delegator live stake.
   *
   * @return the amount
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the delegator live stake.
   *
   * @param amount the amount
   */
  public void setAmount(String amount) {
    this.amount = amount;
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
   * Returns a string representation of this HistoricalDelegatorInfo.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "HistoricalDelegatorInfo{" +
        "amount='" + amount + '\'' +
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
    HistoricalDelegatorInfo that = (HistoricalDelegatorInfo) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for this object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(amount, stakeAddress);
  }
}
