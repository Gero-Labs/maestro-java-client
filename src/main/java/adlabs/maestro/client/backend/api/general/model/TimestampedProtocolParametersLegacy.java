package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;
import java.util.Objects;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedProtocolParametersLegacy {

  private ProtocolParametersV5 data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedProtocolParametersLegacy() {
  }

  /**
   * All arguments constructor.
   *
   * @param data the legacy protocol parameters data
   * @param lastUpdated the last updated information
   */
  public TimestampedProtocolParametersLegacy(ProtocolParametersV5 data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the legacy protocol parameters data.
   *
   * @return the legacy protocol parameters data
   */
  public ProtocolParametersV5 getData() {
    return data;
  }

  /**
   * Sets the legacy protocol parameters data.
   *
   * @param data the legacy protocol parameters data
   */
  public void setData(ProtocolParametersV5 data) {
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
    return "TimestampedProtocolParametersLegacy{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedProtocolParametersLegacy that = (TimestampedProtocolParametersLegacy) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}