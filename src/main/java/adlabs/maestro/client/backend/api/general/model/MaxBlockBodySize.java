package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Maximum number of bytes allowed for a block body.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxBlockBodySize {

  /**
   * Maximum number of bytes allowed for a block body.
   */
  @NotNull
  private Long bytes;

  /**
   * Creates a new instance of MaxBlockBodySize.
   */
  public MaxBlockBodySize() {
  }

  /**
   * Creates a new instance of MaxBlockBodySize with all fields.
   *
   * @param bytes the maximum number of bytes allowed for a block body
   */
  public MaxBlockBodySize(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the maximum number of bytes allowed for a block body.
   *
   * @return the maximum number of bytes allowed for a block body
   */
  public Long getBytes() {
    return bytes;
  }

  /**
   * Sets the maximum number of bytes allowed for a block body.
   *
   * @param bytes the maximum number of bytes allowed for a block body
   */
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Returns a string representation of this MaxBlockBodySize object.
   *
   * @return a string representation of this MaxBlockBodySize object
   */
  @Override
  public String toString() {
    return "MaxBlockBodySize{" +
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
    MaxBlockBodySize that = (MaxBlockBodySize) o;
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
