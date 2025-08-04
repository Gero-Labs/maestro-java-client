package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * A timestamped response containing transaction information. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedTransactionInfo {

  /**
   * No-argument constructor.
   */
  public TimestampedTransactionInfo() {
  }

  /**
   * All-argument constructor.
   *
   * @param data the transaction information data
   * @param lastUpdated the last update details, indicating the chain-tip
   */
  public TimestampedTransactionInfo(TransactionInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * The transaction information data.
   */
  @NotNull
  @Valid
  private TransactionInfo data;

  /**
   * The last update details, indicating the chain-tip.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Gets the transaction information data.
   *
   * @return the transaction information data
   */
  public TransactionInfo getData() {
    return data;
  }

  /**
   * Sets the transaction information data.
   *
   * @param data the transaction information data to set
   */
  public void setData(TransactionInfo data) {
    this.data = data;
  }

  /**
   * Gets the last update details, indicating the chain-tip.
   *
   * @return the last update details
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last update details, indicating the chain-tip.
   *
   * @param lastUpdated the last update details to set
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedTransactionInfo that = (TimestampedTransactionInfo) o;
    return java.util.Objects.equals(data, that.data) &&
        java.util.Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, lastUpdated);
  }

  @Override
  public String toString() {
    return "TimestampedTransactionInfo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }
}
