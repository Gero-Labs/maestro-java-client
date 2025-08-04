package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;
import java.util.Objects;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedSystemStart {

  private String data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedSystemStart() {
  }

  /**
   * All arguments constructor.
   *
   * @param data the system start data
   * @param lastUpdated the last updated information
   */
  public TimestampedSystemStart(String data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the system start data.
   *
   * @return the system start data
   */
  public String getData() {
    return data;
  }

  /**
   * Sets the system start data.
   *
   * @param data the system start data
   */
  public void setData(String data) {
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

  @Override
  public String toString() {
    return "TimestampedSystemStart{" +
        "data='" + data + '\'' +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedSystemStart that = (TimestampedSystemStart) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}