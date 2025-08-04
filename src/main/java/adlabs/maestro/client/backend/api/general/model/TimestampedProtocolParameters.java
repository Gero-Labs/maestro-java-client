package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;
import java.util.Objects;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedProtocolParameters {

  private ProtocolParametersV6 data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedProtocolParameters() {
  }

  /**
   * All arguments constructor.
   *
   * @param data the protocol parameters data
   * @param lastUpdated the last updated information
   */
  public TimestampedProtocolParameters(ProtocolParametersV6 data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the protocol parameters data.
   *
   * @return the protocol parameters data
   */
  public ProtocolParametersV6 getData() {
    return data;
  }

  /**
   * Sets the protocol parameters data.
   *
   * @param data the protocol parameters data
   */
  public void setData(ProtocolParametersV6 data) {
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
    return "TimestampedProtocolParameters{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedProtocolParameters that = (TimestampedProtocolParameters) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}