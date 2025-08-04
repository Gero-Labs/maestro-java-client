package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Maximum value size.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxValueSize {

  /**
   * Maximum value size in bytes.
   */
  @NotNull
  private Long bytes;

  /**
   * Creates a new instance of MaxValueSize.
   */
  public MaxValueSize() {
  }

  /**
   * Creates a new instance of MaxValueSize with all fields.
   *
   * @param bytes the maximum value size in bytes
   */
  public MaxValueSize(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the maximum value size in bytes.
   *
   * @return the maximum value size in bytes
   */
  public Long getBytes() {
    return bytes;
  }

  /**
   * Sets the maximum value size in bytes.
   *
   * @param bytes the maximum value size in bytes
   */
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Returns a string representation of this MaxValueSize object.
   *
   * @return a string representation of this MaxValueSize object
   */
  @Override
  public String toString() {
    return "MaxValueSize{" +
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
    MaxValueSize that = (MaxValueSize) o;
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
