package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import adlabs.maestro.client.backend.models.LastUpdated;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedPoolInfo {

  private PoolInfo data;

  private LastUpdated lastUpdated;

  /**
   * Creates a new TimestampedPoolInfo instance.
   */
  public TimestampedPoolInfo() {
  }

  /**
   * Creates a new TimestampedPoolInfo instance with all fields.
   *
   * @param data the pool info data
   * @param lastUpdated the last updated information
   */
  public TimestampedPoolInfo(PoolInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the pool info data.
   *
   * @return the data
   */
  public PoolInfo getData() {
    return data;
  }

  /**
   * Sets the pool info data.
   *
   * @param data the data
   */
  public void setData(PoolInfo data) {
    this.data = data;
  }

  /**
   * Gets the last updated information.
   *
   * @return the last updated information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last updated information.
   *
   * @param lastUpdated the last updated information
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Returns a string representation of this TimestampedPoolInfo.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "TimestampedPoolInfo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  /**
   * Indicates whether some other object is \"equal to\" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the o argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedPoolInfo that = (TimestampedPoolInfo) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  /**
   * Returns a hash code value for this object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}

