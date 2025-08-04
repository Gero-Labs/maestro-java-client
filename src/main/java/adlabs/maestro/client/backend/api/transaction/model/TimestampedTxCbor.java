package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * A timestamped response containing a transaction CBOR. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedTxCbor {

  /**
   * The transaction CBOR data as a hex-encoded string.
   */
  @NotNull
  private String data;

  /**
   * The last update details, indicating the chain-tip.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedTxCbor() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the transaction CBOR data as a hex-encoded string
   * @param lastUpdated the last update details, indicating the chain-tip
   */
  public TimestampedTxCbor(String data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the transaction CBOR data as a hex-encoded string.
   *
   * @return the transaction CBOR data
   */
  public String getData() {
    return data;
  }

  /**
   * Sets the transaction CBOR data as a hex-encoded string.
   *
   * @param data the transaction CBOR data
   */
  public void setData(String data) {
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
   * Returns a string representation of this TimestampedTxCbor.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "TimestampedTxCbor{" +
        "data='" + data + '\'' +
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
    TimestampedTxCbor that = (TimestampedTxCbor) o;
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
