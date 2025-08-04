package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * A timestamped response for a transaction count. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedTxCount {

  /**
   * The number of transactions.
   */
  @NotNull
  @Min(0L)
  private Long data;

  /**
   * The last update details, indicating the chain-tip.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedTxCount() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data The number of transactions
   * @param lastUpdated The last update details, indicating the chain-tip
   */
  public TimestampedTxCount(Long data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the number of transactions.
   *
   * @return the transaction count
   */
  public Long getData() {
    return data;
  }

  /**
   * Sets the number of transactions.
   *
   * @param data the transaction count
   */
  public void setData(Long data) {
    this.data = data;
  }

  /**
   * Gets the last update details, indicating the chain-tip.
   *
   * @return the last updated information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last update details, indicating the chain-tip.
   *
   * @param lastUpdated the last updated information
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public String toString() {
    return "TimestampedTxCount{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedTxCount that = (TimestampedTxCount) o;
    return java.util.Objects.equals(data, that.data) &&
        java.util.Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, lastUpdated);
  }
}
