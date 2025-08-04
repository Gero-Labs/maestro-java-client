package adlabs.maestro.client.backend.api.datum.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Timestamped response containing a map of datum hash to Datum objects.
 * 
 * <p>Returns the endpoint response data along with the chain-tip of the indexer, 
 * which details at which point in the chain's history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedDatumMap {

  private Map<String, Datum> data = new HashMap<>();

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedDatumMap() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the map of datum hash to Datum objects
   * @param lastUpdated the last updated information
   */
  public TimestampedDatumMap(Map<String, Datum> data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the map of datum hash to Datum objects.
   *
   * @return the map of datum hash to Datum objects
   */
  public Map<String, Datum> getData() {
    return data;
  }

  /**
   * Sets the map of datum hash to Datum objects.
   *
   * @param data the map of datum hash to Datum objects
   */
  public void setData(Map<String, Datum> data) {
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
    return "TimestampedDatumMap{" +
      "data=" + data +
      ", lastUpdated=" + lastUpdated +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedDatumMap that = (TimestampedDatumMap) o;
    return Objects.equals(data, that.data) &&
      Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}