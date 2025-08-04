package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Per-epoch history of a stake pool.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolHistory {

  /**
   * Active stake in the pool for the epoch.
   */
  private String activeStake;

  /**
   * Active stake percentage in the pool for the epoch.
   */
  private String activeStakePct;

  /**
   * Number of blocks produced by the pool in the epoch.
   */
  private Long blockCnt;

  /**
   * Delegator rewards for the epoch.
   */
  @NotNull
  @Valid
  private String delegRewards;

  /**
   * Number of delegators to the pool in the epoch.
   */
  private Long delegatorCnt;

  /**
   * Epoch number.
   */
  @NotNull
  private Long epochNo;

  /**
   * Return on stake for the epoch.
   */
  @NotNull
  private String epochRos;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private String fixedCost;

  /**
   * Margin percentage for the pool.
   */
  private String margin;

  /**
   * Pool fees for the epoch.
   */
  @NotNull
  @Valid
  private String poolFees;

  /**
   * Saturation percentage of the pool.
   */
  private String saturationPct;

  /**
   * Default constructor
   */
  public PoolHistory() {
  }

  /**
   * Constructor with all fields
   * @param activeStake Active stake in the pool for the epoch
   * @param activeStakePct Active stake percentage in the pool for the epoch
   * @param blockCnt Number of blocks produced by the pool in the epoch
   * @param delegRewards Delegator rewards for the epoch
   * @param delegatorCnt Number of delegators to the pool in the epoch
   * @param epochNo Epoch number
   * @param epochRos Return on stake for the epoch
   * @param fixedCost Fixed cost of the pool
   * @param margin Margin percentage for the pool
   * @param poolFees Pool fees for the epoch
   * @param saturationPct Saturation percentage of the pool
   */
  public PoolHistory(String activeStake, String activeStakePct, Long blockCnt, String delegRewards, Long delegatorCnt, Long epochNo, String epochRos, String fixedCost, String margin, String poolFees, String saturationPct) {
    this.activeStake = activeStake;
    this.activeStakePct = activeStakePct;
    this.blockCnt = blockCnt;
    this.delegRewards = delegRewards;
    this.delegatorCnt = delegatorCnt;
    this.epochNo = epochNo;
    this.epochRos = epochRos;
    this.fixedCost = fixedCost;
    this.margin = margin;
    this.poolFees = poolFees;
    this.saturationPct = saturationPct;
  }

  /**
   * Gets the active stake in the pool for the epoch
   * @return active stake
   */
  public String getActiveStake() {
    return activeStake;
  }

  /**
   * Sets the active stake in the pool for the epoch
   * @param activeStake the active stake to set
   */
  public void setActiveStake(String activeStake) {
    this.activeStake = activeStake;
  }

  /**
   * Gets the active stake percentage in the pool for the epoch
   * @return active stake percentage
   */
  public String getActiveStakePct() {
    return activeStakePct;
  }

  /**
   * Sets the active stake percentage in the pool for the epoch
   * @param activeStakePct the active stake percentage to set
   */
  public void setActiveStakePct(String activeStakePct) {
    this.activeStakePct = activeStakePct;
  }

  /**
   * Gets the number of blocks produced by the pool in the epoch
   * @return block count
   */
  public Long getBlockCnt() {
    return blockCnt;
  }

  /**
   * Sets the number of blocks produced by the pool in the epoch
   * @param blockCnt the block count to set
   */
  public void setBlockCnt(Long blockCnt) {
    this.blockCnt = blockCnt;
  }

  /**
   * Gets the delegator rewards for the epoch
   * @return delegator rewards
   */
  public String getDelegRewards() {
    return delegRewards;
  }

  /**
   * Sets the delegator rewards for the epoch
   * @param delegRewards the delegator rewards to set
   */
  public void setDelegRewards(String delegRewards) {
    this.delegRewards = delegRewards;
  }

  /**
   * Gets the number of delegators to the pool in the epoch
   * @return delegator count
   */
  public Long getDelegatorCnt() {
    return delegatorCnt;
  }

  /**
   * Sets the number of delegators to the pool in the epoch
   * @param delegatorCnt the delegator count to set
   */
  public void setDelegatorCnt(Long delegatorCnt) {
    this.delegatorCnt = delegatorCnt;
  }

  /**
   * Gets the epoch number
   * @return epoch number
   */
  public Long getEpochNo() {
    return epochNo;
  }

  /**
   * Sets the epoch number
   * @param epochNo the epoch number to set
   */
  public void setEpochNo(Long epochNo) {
    this.epochNo = epochNo;
  }

  /**
   * Gets the return on stake for the epoch
   * @return epoch ROS
   */
  public String getEpochRos() {
    return epochRos;
  }

  /**
   * Sets the return on stake for the epoch
   * @param epochRos the epoch ROS to set
   */
  public void setEpochRos(String epochRos) {
    this.epochRos = epochRos;
  }

  /**
   * Gets the fixed cost of the pool
   * @return fixed cost
   */
  public String getFixedCost() {
    return fixedCost;
  }

  /**
   * Sets the fixed cost of the pool
   * @param fixedCost the fixed cost to set
   */
  public void setFixedCost(String fixedCost) {
    this.fixedCost = fixedCost;
  }

  /**
   * Gets the margin percentage for the pool
   * @return margin
   */
  public String getMargin() {
    return margin;
  }

  /**
   * Sets the margin percentage for the pool
   * @param margin the margin to set
   */
  public void setMargin(String margin) {
    this.margin = margin;
  }

  /**
   * Gets the pool fees for the epoch
   * @return pool fees
   */
  public String getPoolFees() {
    return poolFees;
  }

  /**
   * Sets the pool fees for the epoch
   * @param poolFees the pool fees to set
   */
  public void setPoolFees(String poolFees) {
    this.poolFees = poolFees;
  }

  /**
   * Gets the saturation percentage of the pool
   * @return saturation percentage
   */
  public String getSaturationPct() {
    return saturationPct;
  }

  /**
   * Sets the saturation percentage of the pool
   * @param saturationPct the saturation percentage to set
   */
  public void setSaturationPct(String saturationPct) {
    this.saturationPct = saturationPct;
  }

  @Override
  public String toString() {
    return "PoolHistory{" +
        "activeStake='" + activeStake + '\'' +
        ", activeStakePct='" + activeStakePct + '\'' +
        ", blockCnt=" + blockCnt +
        ", delegRewards='" + delegRewards + '\'' +
        ", delegatorCnt=" + delegatorCnt +
        ", epochNo=" + epochNo +
        ", epochRos='" + epochRos + '\'' +
        ", fixedCost='" + fixedCost + '\'' +
        ", margin='" + margin + '\'' +
        ", poolFees='" + poolFees + '\'' +
        ", saturationPct='" + saturationPct + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PoolHistory that = (PoolHistory) o;
    return Objects.equals(activeStake, that.activeStake) &&
           Objects.equals(activeStakePct, that.activeStakePct) &&
           Objects.equals(blockCnt, that.blockCnt) &&
           Objects.equals(delegRewards, that.delegRewards) &&
           Objects.equals(delegatorCnt, that.delegatorCnt) &&
           Objects.equals(epochNo, that.epochNo) &&
           Objects.equals(epochRos, that.epochRos) &&
           Objects.equals(fixedCost, that.fixedCost) &&
           Objects.equals(margin, that.margin) &&
           Objects.equals(poolFees, that.poolFees) &&
           Objects.equals(saturationPct, that.saturationPct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeStake, activeStakePct, blockCnt, delegRewards, delegatorCnt, epochNo, epochRos, fixedCost, margin, poolFees, saturationPct);
  }
}
