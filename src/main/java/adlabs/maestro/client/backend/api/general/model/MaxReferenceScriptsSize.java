package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Maximum reference script size (introduced in Conway).
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxReferenceScriptsSize {

  /**
   * Maximum reference script size in bytes.
   */
  @NotNull
  private Long bytes;

  /**
   * Creates a new instance of MaxReferenceScriptsSize.
   */
  public MaxReferenceScriptsSize() {
  }

  /**
   * Creates a new instance of MaxReferenceScriptsSize with all fields.
   *
   * @param bytes the maximum reference script size in bytes
   */
  public MaxReferenceScriptsSize(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the maximum reference script size in bytes.
   *
   * @return the maximum reference script size in bytes
   */
  public Long getBytes() {
    return bytes;
  }

  /**
   * Sets the maximum reference script size in bytes.
   *
   * @param bytes the maximum reference script size in bytes
   */
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }

  /**
   * Returns a string representation of this MaxReferenceScriptsSize object.
   *
   * @return a string representation of this MaxReferenceScriptsSize object
   */
  @Override
  public String toString() {
    return "MaxReferenceScriptsSize{" +
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
    MaxReferenceScriptsSize that = (MaxReferenceScriptsSize) o;
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
