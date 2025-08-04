package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Maximum number of bytes allowed for a transaction.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxTransactionSize {

  /**
   * Maximum number of bytes allowed for a transaction.
   */
  @NotNull
  private Long bytes;

  /**
   * Creates a new instance of MaxTransactionSize.
   */
  public MaxTransactionSize() {
  }

  /**
   * Creates a new instance of MaxTransactionSize with all fields.
   *
   * @param bytes the maximum number of bytes allowed for a transaction
   */
  public MaxTransactionSize(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the maximum number of bytes allowed for a transaction.
   *
   * @return the maximum number of bytes allowed for a transaction
   */
  public Long getBytes() {
    return bytes;
  }

  /**
   * Sets the maximum number of bytes allowed for a transaction.
   *
   * @param bytes the maximum number of bytes allowed for a transaction
   */
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Returns a string representation of this MaxTransactionSize object.
   *
   * @return a string representation of this MaxTransactionSize object
   */
  @Override
  public String toString() {
    return "MaxTransactionSize{" +
           "bytes=" + bytes +
           '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the o argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MaxTransactionSize that = (MaxTransactionSize) o;
    return Objects.equals(bytes, that.bytes);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(bytes);
  }
}
