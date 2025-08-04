package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Transaction hash with details of when that transaction appeared on-chain
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedTransaction {

  /**
   * Default constructor.
   */
  public TimestampedTransaction() {
  }

  /**
   * Constructor with all fields.
   *
   * @param slot the slot number
   * @param timestamp the timestamp
   * @param txHash the transaction hash
   */
  public TimestampedTransaction(Long slot, String timestamp, String txHash) {
    this.slot = slot;
    this.timestamp = timestamp;
    this.txHash = txHash;
  }

  private Long slot;

  private String timestamp;

  private String txHash;

  /**
   * Gets the slot number.
   *
   * @return the slot number
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the slot number.
   *
   * @param slot the slot number
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the timestamp.
   *
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the timestamp.
   *
   * @param timestamp the timestamp
   */
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Gets the transaction hash.
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash.
   *
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Returns a string representation of this TimestampedTransaction.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "TimestampedTransaction{" +
        "slot=" + slot +
        ", timestamp='" + timestamp + '\'' +
        ", txHash='" + txHash + '\'' +
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
    TimestampedTransaction that = (TimestampedTransaction) o;
    return java.util.Objects.equals(slot, that.slot) &&
        java.util.Objects.equals(timestamp, that.timestamp) &&
        java.util.Objects.equals(txHash, that.txHash);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(slot, timestamp, txHash);
  }
}

