package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.*;
import adlabs.maestro.client.backend.models.LastUpdated;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain's history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedAddress {

  /**
   * Bech32-encoded Cardano Address
   */
  @NotNull
  private String data;

  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedAddress() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data Bech32-encoded Cardano Address
   * @param lastUpdated Last updated information
   */
  public TimestampedAddress(String data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the Bech32-encoded Cardano Address.
   *
   * @return the address data
   */
  public String getData() {
    return data;
  }

  /**
   * Sets the Bech32-encoded Cardano Address.
   *
   * @param data the address data
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
    return "TimestampedAddress{" +
        "data='" + data + '\'' +
        ", lastUpdated=" + lastUpdated +
        '}';
  }
}