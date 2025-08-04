package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Stake account related reward
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountReward {

  /**
   * Amount of the reward
   */
  private String amount;

  /**
   * Epoch in which the reward was earned
   */
  private Integer earnedEpoch;

  /**
   * Bech32 encoded pool ID (if relevant to reward type)
   */
  private String poolId;

  /**
   * Epoch at which the reward is spendable
   */
  private Integer spendableEpoch;

  /**
   * Type of reward
   */
  private AccountRewardType type;

  /**
   * Default constructor
   */
  public AccountReward() {
  }

  /**
   * Constructor with all fields
   *
   * @param amount         Amount of the reward
   * @param earnedEpoch    Epoch in which the reward was earned
   * @param poolId         Bech32 encoded pool ID (if relevant to reward type)
   * @param spendableEpoch Epoch at which the reward is spendable
   * @param type           Type of reward
   */
  public AccountReward(String amount, Integer earnedEpoch, String poolId, Integer spendableEpoch, AccountRewardType type) {
    this.amount = amount;
    this.earnedEpoch = earnedEpoch;
    this.poolId = poolId;
    this.spendableEpoch = spendableEpoch;
    this.type = type;
  }

  /**
   * Gets the amount of the reward
   *
   * @return the reward amount
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the reward
   *
   * @param amount the reward amount
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the epoch in which the reward was earned
   *
   * @return the earned epoch
   */
  public Integer getEarnedEpoch() {
    return earnedEpoch;
  }

  /**
   * Sets the epoch in which the reward was earned
   *
   * @param earnedEpoch the earned epoch
   */
  public void setEarnedEpoch(Integer earnedEpoch) {
    this.earnedEpoch = earnedEpoch;
  }

  /**
   * Gets the Bech32 encoded pool ID (if relevant to reward type)
   *
   * @return the pool ID
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the Bech32 encoded pool ID (if relevant to reward type)
   *
   * @param poolId the pool ID
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   * Gets the epoch at which the reward is spendable
   *
   * @return the spendable epoch
   */
  public Integer getSpendableEpoch() {
    return spendableEpoch;
  }

  /**
   * Sets the epoch at which the reward is spendable
   *
   * @param spendableEpoch the spendable epoch
   */
  public void setSpendableEpoch(Integer spendableEpoch) {
    this.spendableEpoch = spendableEpoch;
  }

  /**
   * Gets the type of reward
   *
   * @return the reward type
   */
  public AccountRewardType getType() {
    return type;
  }

  /**
   * Sets the type of reward
   *
   * @param type the reward type
   */
  public void setType(AccountRewardType type) {
    this.type = type;
  }

  /**
   * Returns a string representation of the AccountReward
   *
   * @return string representation
   */
  @Override
  public String toString() {
    return "AccountReward{" +
        "amount='" + amount + '\'' +
        ", earnedEpoch=" + earnedEpoch +
        ", poolId='" + poolId + '\'' +
        ", spendableEpoch=" + spendableEpoch +
        ", type=" + type +
        '}';
  }
}