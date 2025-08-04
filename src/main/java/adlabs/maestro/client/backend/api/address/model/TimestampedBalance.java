package adlabs.maestro.client.backend.api.address.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain's history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedBalance {

  @NotNull
  @Valid
  private Balance data;

  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedBalance() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data Balance data
   * @param lastUpdated Last updated information
   */
  public TimestampedBalance(Balance data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the balance data.
   *
   * @return the balance data
   */
  public Balance getData() {
    return data;
  }

  /**
   * Sets the balance data.
   *
   * @param data the balance data
   */
  public void setData(Balance data) {
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
    return "TimestampedBalance{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }
}