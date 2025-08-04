package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Maximum number of bytes allowed for a block header.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxBlockHeaderSize {

  /**
   * Maximum number of bytes allowed for a block header.
   */
  @NotNull
  private Long bytes;

  /**
   * Creates a new instance of MaxBlockHeaderSize.
   */
  public MaxBlockHeaderSize() {
  }

  /**
   * Creates a new instance of MaxBlockHeaderSize with all fields.
   *
   * @param bytes the maximum number of bytes allowed for a block header
   */
  public MaxBlockHeaderSize(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the maximum number of bytes allowed for a block header.
   *
   * @return the maximum number of bytes allowed for a block header
   */
  public Long getBytes() {
    return bytes;
  }

  /**
   * Sets the maximum number of bytes allowed for a block header.
   *
   * @param bytes the maximum number of bytes allowed for a block header
   */
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Returns a string representation of this MaxBlockHeaderSize object.
   *
   * @return a string representation of this MaxBlockHeaderSize object
   */
  @Override
  public String toString() {
    return "MaxBlockHeaderSize{" +
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
    MaxBlockHeaderSize that = (MaxBlockHeaderSize) o;
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
