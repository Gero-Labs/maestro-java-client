package adlabs.maestro.client.backend.api.epoch.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * Information summary of an epoch.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EpochInfo {

  /**
   * Total active stake for the epoch.
   */
  private String activeStake;

  /**
   * Average reward for block producers during the epoch.
   */
  private String averageReward;

  /**
   * Total blocks in the epoch.
   */
  @NotNull
  private Integer blkCount;

  /**
   * UNIX timestamp when the epoch ended.
   */
  @NotNull
  private Long endTime;

  /**
   * Epoch number.
   */
  @NotNull
  private Integer epochNo;

  /**
   * Total fees collected in the epoch.
   */
  @NotNull
  private String fees;

  /**
   * UNIX timestamp when the epoch began.
   */
  @NotNull
  private Long startTime;

  /**
   * Total rewards earned by block producers during the epoch.
   */
  private String totalRewards;

  /**
   * Total transactions in the epoch.
   */
  @NotNull
  private Integer txCount;

  /**
   * Default constructor
   */
  public EpochInfo() {
  }

  /**
   * Constructor with all fields
   * @param activeStake Total active stake for the epoch
   * @param averageReward Average reward for block producers during the epoch
   * @param blkCount Total blocks in the epoch
   * @param endTime UNIX timestamp when the epoch ended
   * @param epochNo Epoch number
   * @param fees Total fees collected in the epoch
   * @param startTime UNIX timestamp when the epoch began
   * @param totalRewards Total rewards earned by block producers during the epoch
   * @param txCount Total transactions in the epoch
   */
  public EpochInfo(String activeStake, String averageReward, Integer blkCount, Long endTime, Integer epochNo, String fees, Long startTime, String totalRewards, Integer txCount) {
    this.activeStake = activeStake;
    this.averageReward = averageReward;
    this.blkCount = blkCount;
    this.endTime = endTime;
    this.epochNo = epochNo;
    this.fees = fees;
    this.startTime = startTime;
    this.totalRewards = totalRewards;
    this.txCount = txCount;
  }

  /**
   * Gets the total active stake for the epoch
   * @return active stake
   */
  public String getActiveStake() {
    return activeStake;
  }

  /**
   * Sets the total active stake for the epoch
   * @param activeStake the active stake to set
   */
  public void setActiveStake(String activeStake) {
    this.activeStake = activeStake;
  }

  /**
   * Gets the average reward for block producers during the epoch
   * @return average reward
   */
  public String getAverageReward() {
    return averageReward;
  }

  /**
   * Sets the average reward for block producers during the epoch
   * @param averageReward the average reward to set
   */
  public void setAverageReward(String averageReward) {
    this.averageReward = averageReward;
  }

  /**
   * Gets the total blocks in the epoch
   * @return block count
   */
  public Integer getBlkCount() {
    return blkCount;
  }

  /**
   * Sets the total blocks in the epoch
   * @param blkCount the block count to set
   */
  public void setBlkCount(Integer blkCount) {
    this.blkCount = blkCount;
  }

  /**
   * Gets the UNIX timestamp when the epoch ended
   * @return end time
   */
  public Long getEndTime() {
    return endTime;
  }

  /**
   * Sets the UNIX timestamp when the epoch ended
   * @param endTime the end time to set
   */
  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  /**
   * Gets the epoch number
   * @return epoch number
   */
  public Integer getEpochNo() {
    return epochNo;
  }

  /**
   * Sets the epoch number
   * @param epochNo the epoch number to set
   */
  public void setEpochNo(Integer epochNo) {
    this.epochNo = epochNo;
  }

  /**
   * Gets the total fees collected in the epoch
   * @return fees
   */
  public String getFees() {
    return fees;
  }

  /**
   * Sets the total fees collected in the epoch
   * @param fees the fees to set
   */
  public void setFees(String fees) {
    this.fees = fees;
  }

  /**
   * Gets the UNIX timestamp when the epoch began
   * @return start time
   */
  public Long getStartTime() {
    return startTime;
  }

  /**
   * Sets the UNIX timestamp when the epoch began
   * @param startTime the start time to set
   */
  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  /**
   * Gets the total rewards earned by block producers during the epoch
   * @return total rewards
   */
  public String getTotalRewards() {
    return totalRewards;
  }

  /**
   * Sets the total rewards earned by block producers during the epoch
   * @param totalRewards the total rewards to set
   */
  public void setTotalRewards(String totalRewards) {
    this.totalRewards = totalRewards;
  }

  /**
   * Gets the total transactions in the epoch
   * @return transaction count
   */
  public Integer getTxCount() {
    return txCount;
  }

  /**
   * Sets the total transactions in the epoch
   * @param txCount the transaction count to set
   */
  public void setTxCount(Integer txCount) {
    this.txCount = txCount;
  }

  @Override
  public String toString() {
    return "EpochInfo{" +
        "activeStake='" + activeStake + '\'' +
        ", averageReward='" + averageReward + '\'' +
        ", blkCount=" + blkCount +
        ", endTime=" + endTime +
        ", epochNo=" + epochNo +
        ", fees='" + fees + '\'' +
        ", startTime=" + startTime +
        ", totalRewards='" + totalRewards + '\'' +
        ", txCount=" + txCount +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EpochInfo epochInfo = (EpochInfo) o;
    return Objects.equals(activeStake, epochInfo.activeStake) &&
           Objects.equals(averageReward, epochInfo.averageReward) &&
           Objects.equals(blkCount, epochInfo.blkCount) &&
           Objects.equals(endTime, epochInfo.endTime) &&
           Objects.equals(epochNo, epochInfo.epochNo) &&
           Objects.equals(fees, epochInfo.fees) &&
           Objects.equals(startTime, epochInfo.startTime) &&
           Objects.equals(totalRewards, epochInfo.totalRewards) &&
           Objects.equals(txCount, epochInfo.txCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeStake, averageReward, blkCount, endTime, epochNo, fees, startTime, totalRewards, txCount);
  }
}
