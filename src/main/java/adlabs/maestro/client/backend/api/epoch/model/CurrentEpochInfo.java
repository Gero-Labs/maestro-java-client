package adlabs.maestro.client.backend.api.epoch.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * Information summary of the current epoch.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CurrentEpochInfo {

  /**
   * Total blocks in the epoch so far.
   */
  @NotNull
  private Integer blkCount;

  /**
   * Epoch number.
   */
  @NotNull
  private Integer epochNo;

  /**
   * Total fees collected in the epoch so far.
   */
  @NotNull
  private String fees;

  /**
   * UNIX timestamp when the epoch began.
   */
  @NotNull
  private Long startTime;

  /**
   * Total transactions in the epoch so far.
   */
  @NotNull
  private Integer txCount;

  /**
   * Default constructor
   */
  public CurrentEpochInfo() {
  }

  /**
   * Constructor with all fields
   * @param blkCount Total blocks in the epoch so far
   * @param epochNo Epoch number
   * @param fees Total fees collected in the epoch so far
   * @param startTime UNIX timestamp when the epoch began
   * @param txCount Total transactions in the epoch so far
   */
  public CurrentEpochInfo(Integer blkCount, Integer epochNo, String fees, Long startTime, Integer txCount) {
    this.blkCount = blkCount;
    this.epochNo = epochNo;
    this.fees = fees;
    this.startTime = startTime;
    this.txCount = txCount;
  }

  /**
   * Gets the total blocks in the epoch so far
   * @return block count
   */
  public Integer getBlkCount() {
    return blkCount;
  }

  /**
   * Sets the total blocks in the epoch so far
   * @param blkCount the block count to set
   */
  public void setBlkCount(Integer blkCount) {
    this.blkCount = blkCount;
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
   * Gets the total fees collected in the epoch so far
   * @return fees
   */
  public String getFees() {
    return fees;
  }

  /**
   * Sets the total fees collected in the epoch so far
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
   * Gets the total transactions in the epoch so far
   * @return transaction count
   */
  public Integer getTxCount() {
    return txCount;
  }

  /**
   * Sets the total transactions in the epoch so far
   * @param txCount the transaction count to set
   */
  public void setTxCount(Integer txCount) {
    this.txCount = txCount;
  }

  @Override
  public String toString() {
    return "CurrentEpochInfo{" +
        "blkCount=" + blkCount +
        ", epochNo=" + epochNo +
        ", fees='" + fees + '\'' +
        ", startTime=" + startTime +
        ", txCount=" + txCount +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrentEpochInfo that = (CurrentEpochInfo) o;
    return Objects.equals(blkCount, that.blkCount) &&
           Objects.equals(epochNo, that.epochNo) &&
           Objects.equals(fees, that.fees) &&
           Objects.equals(startTime, that.startTime) &&
           Objects.equals(txCount, that.txCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blkCount, epochNo, fees, startTime, txCount);
  }
}
