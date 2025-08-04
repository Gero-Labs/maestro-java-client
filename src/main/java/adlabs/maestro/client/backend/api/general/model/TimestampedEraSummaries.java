package adlabs.maestro.client.backend.api.general.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedEraSummaries {

  @Valid
  private List<@Valid Era> data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedEraSummaries() {
  }

  /**
   * All arguments constructor.
   *
   * @param data the era summaries data
   * @param lastUpdated the last updated information
   */
  public TimestampedEraSummaries(List<Era> data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the era summaries data.
   *
   * @return the era summaries data
   */
  public List<Era> getData() {
    return data;
  }

  /**
   * Sets the era summaries data.
   *
   * @param data the era summaries data
   */
  public void setData(List<Era> data) {
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
    return "TimestampedEraSummaries{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedEraSummaries that = (TimestampedEraSummaries) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}