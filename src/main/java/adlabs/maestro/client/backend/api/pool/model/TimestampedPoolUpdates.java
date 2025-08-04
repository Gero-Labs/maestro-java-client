package adlabs.maestro.client.backend.api.pool.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedPoolUpdates {

  @Valid
  private List<@Valid PoolUpdate> data = new ArrayList<>();

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedPoolUpdates() {
  }

  /**
   * Constructor with all parameters.
   *
   * @param data        the data
   * @param lastUpdated the last updated information
   */
  public TimestampedPoolUpdates(List<PoolUpdate> data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the data.
   *
   * @return the data
   */
  public List<PoolUpdate> getData() {
    return data;
  }

  /**
   * Sets the data.
   *
   * @param data the data to set
   */
  public void setData(List<PoolUpdate> data) {
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
   * @param lastUpdated the last updated information to set
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Returns a string representation of this object.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "TimestampedPoolUpdates{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

}

