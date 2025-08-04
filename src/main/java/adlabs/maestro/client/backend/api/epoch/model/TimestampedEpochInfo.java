package adlabs.maestro.client.backend.api.epoch.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A timestamped response containing epoch information. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedEpochInfo {

  @NotNull
  @Valid
  private EpochInfo data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor
   */
  public TimestampedEpochInfo() {
  }

  /**
   * Constructor with all fields
   * @param data the epoch info data
   * @param lastUpdated the last updated timestamp information
   */
  public TimestampedEpochInfo(EpochInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the epoch info data
   * @return epoch info data
   */
  public EpochInfo getData() {
    return data;
  }

  /**
   * Sets the epoch info data
   * @param data the epoch info data to set
   */
  public void setData(EpochInfo data) {
    this.data = data;
  }

  /**
   * Gets the last updated timestamp information
   * @return last updated timestamp information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last updated timestamp information
   * @param lastUpdated the last updated timestamp information to set
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public String toString() {
    return "TimestampedEpochInfo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedEpochInfo that = (TimestampedEpochInfo) o;
    return Objects.equals(data, that.data) &&
           Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}

