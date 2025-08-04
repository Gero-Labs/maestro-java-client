package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A timestamped response containing block information. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedBlockInfo {

  /**
   * The block information data.
   */
  @NotNull
  @Valid
  private BlockInfo data;

  /**
   * The last update details, indicating the chain-tip.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedBlockInfo() {
  }

  /**
   * Constructor with all fields as parameters.
   *
   * @param data The block information data
   * @param lastUpdated The last update details, indicating the chain-tip
   */
  public TimestampedBlockInfo(BlockInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the block information data.
   *
   * @return the block information data
   */
  public BlockInfo getData() {
    return data;
  }

  /**
   * Sets the block information data.
   *
   * @param data the block information data
   */
  public void setData(BlockInfo data) {
    this.data = data;
  }

  /**
   * Gets the last update details, indicating the chain-tip.
   *
   * @return the last update details, indicating the chain-tip
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last update details, indicating the chain-tip.
   *
   * @param lastUpdated the last update details, indicating the chain-tip
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Returns a string representation of this TimestampedBlockInfo.
   *
   * @return a string representation of this TimestampedBlockInfo
   */
  @Override
  public String toString() {
    return "TimestampedBlockInfo{" +
            "data=" + data +
            ", lastUpdated=" + lastUpdated +
            '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param obj the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TimestampedBlockInfo that = (TimestampedBlockInfo) obj;
    return Objects.equals(data, that.data) &&
            Objects.equals(lastUpdated, that.lastUpdated);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}
