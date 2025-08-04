package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import adlabs.maestro.client.backend.models.LastUpdated;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 * 
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedDatum {

  private Datum data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedDatum() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the datum data
   * @param lastUpdated the last updated information
   */
  public TimestampedDatum(Datum data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the datum data.
   *
   * @return the datum data
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the datum data.
   *
   * @param data the datum data
   */
  public void setData(Datum data) {
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
    return "TimestampedDatum{" +
      "data=" + data +
      ", lastUpdated=" + lastUpdated +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedDatum that = (TimestampedDatum) o;
    return Objects.equals(data, that.data) &&
      Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}

