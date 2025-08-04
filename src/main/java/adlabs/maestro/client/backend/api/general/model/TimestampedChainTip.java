package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.*;

import adlabs.maestro.client.backend.models.LastUpdated;
import java.util.Objects;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain's history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedChainTip {

  @NotNull
  @Valid
  private ChainTip data;

  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedChainTip() {
  }

  /**
   * All arguments constructor.
   *
   * @param data the chain tip data
   * @param lastUpdated the last updated information
   */
  public TimestampedChainTip(ChainTip data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the chain tip data.
   *
   * @return the chain tip data
   */
  public ChainTip getData() {
    return data;
  }

  /**
   * Sets the chain tip data.
   *
   * @param data the chain tip data
   */
  public void setData(ChainTip data) {
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
    return "TimestampedChainTip{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedChainTip that = (TimestampedChainTip) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}