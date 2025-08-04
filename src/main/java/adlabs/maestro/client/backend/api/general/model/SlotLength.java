package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the length of a slot in milliseconds.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SlotLength {

  /**
   * Slot length in milliseconds.
   */
  @NotNull
  private Long milliseconds;

  /**
   * Creates a new instance of SlotLength.
   */
  public SlotLength() {
  }

  /**
   * Creates a new instance of SlotLength with all fields.
   *
   * @param milliseconds the slot length in milliseconds
   */
  public SlotLength(Long milliseconds) {
    this.milliseconds = milliseconds;
  }

  /**
   * Gets the slot length in milliseconds.
   *
   * @return the slot length in milliseconds
   */
  public Long getMilliseconds() {
    return milliseconds;
  }

  /**
   * Sets the slot length in milliseconds.
   *
   * @param milliseconds the slot length in milliseconds
   */
  public void setMilliseconds(Long milliseconds) {
    this.milliseconds = milliseconds;
  }

  /**
   * Returns a string representation of this SlotLength object.
   *
   * @return a string representation of this SlotLength object
   */
  @Override
  public String toString() {
    return "SlotLength{" +
           "milliseconds=" + milliseconds +
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
    SlotLength that = (SlotLength) o;
    return Objects.equals(milliseconds, that.milliseconds);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(milliseconds);
  }
}
