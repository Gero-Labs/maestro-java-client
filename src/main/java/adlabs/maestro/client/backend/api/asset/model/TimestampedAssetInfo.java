package adlabs.maestro.client.backend.api.asset.model;

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
public class TimestampedAssetInfo {

  @NotNull
  @Valid
  private AssetInfo data;

  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor
   */
  public TimestampedAssetInfo() {
  }

  /**
   * Constructor with all fields
   *
   * @param data the endpoint response data
   * @param lastUpdated the last updated information
   */
  public TimestampedAssetInfo(AssetInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the endpoint response data
   *
   * @return the endpoint response data
   */
  public AssetInfo getData() {
    return data;
  }

  /**
   * Sets the endpoint response data
   *
   * @param data the endpoint response data
   */
  public void setData(AssetInfo data) {
    this.data = data;
  }

  /**
   * Gets the last updated information
   *
   * @return the last updated information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last updated information
   *
   * @param lastUpdated the last updated information
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public String toString() {
    return "TimestampedAssetInfo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedAssetInfo that = (TimestampedAssetInfo) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}