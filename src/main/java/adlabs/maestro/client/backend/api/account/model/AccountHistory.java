package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Per-epoch information about a stake account
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountHistory {

  /**
   * Active stake amount
   */
  private String activeStake;

  /**
   * Epoch number
   */
  private Integer epochNo;

  /**
   * Bech32 encoded pool ID the account was delegated to
   */
  private String poolId;

  /**
   * Default constructor
   */
  public AccountHistory() {
  }

  /**
   * Constructor with all fields
   *
   * @param activeStake Active stake amount
   * @param epochNo     Epoch number
   * @param poolId      Bech32 encoded pool ID the account was delegated to
   */
  public AccountHistory(String activeStake, Integer epochNo, String poolId) {
    this.activeStake = activeStake;
    this.epochNo = epochNo;
    this.poolId = poolId;
  }

  /**
   * Gets the active stake amount
   *
   * @return the active stake amount
   */
  public String getActiveStake() {
    return activeStake;
  }

  /**
   * Sets the active stake amount
   *
   * @param activeStake the active stake amount
   */
  public void setActiveStake(String activeStake) {
    this.activeStake = activeStake;
  }

  /**
   * Gets the epoch number
   *
   * @return the epoch number
   */
  public Integer getEpochNo() {
    return epochNo;
  }

  /**
   * Sets the epoch number
   *
   * @param epochNo the epoch number
   */
  public void setEpochNo(Integer epochNo) {
    this.epochNo = epochNo;
  }

  /**
   * Gets the Bech32 encoded pool ID the account was delegated to
   *
   * @return the pool ID
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the Bech32 encoded pool ID the account was delegated to
   *
   * @param poolId the pool ID
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   * Returns a string representation of the AccountHistory
   *
   * @return string representation
   */
  @Override
  public String toString() {
    return "AccountHistory{" +
        "activeStake='" + activeStake + '\'' +
        ", epochNo=" + epochNo +
        ", poolId='" + poolId + '\'' +
        '}';
  }
}