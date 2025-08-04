package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * A timestamped response containing a UTxO. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedUtxo {

  /**
   * The UTxO data.
   */
  @NotNull
  @Valid
  private Utxo data;

  /**
   * The last update details, indicating the chain-tip.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedUtxo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the UTxO data
   * @param lastUpdated the last update details, indicating the chain-tip
   */
  public TimestampedUtxo(Utxo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the UTxO data.
   *
   * @return the UTxO data
   */
  public Utxo getData() {
    return data;
  }

  /**
   * Sets the UTxO data.
   *
   * @param data the UTxO data
   */
  public void setData(Utxo data) {
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
   * @param lastUpdated the last update details
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Returns a string representation of this TimestampedUtxo.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "TimestampedUtxo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedUtxo that = (TimestampedUtxo) o;
    return Objects.equals(data, that.data) && Objects.equals(lastUpdated, that.lastUpdated);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}
