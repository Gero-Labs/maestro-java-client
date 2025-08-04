package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Bound information for epoch, slot, and time
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Bound {

  /**
   * Epoch number
   */
  @NotNull
  private Long epoch;

  /**
   * Slot number
   */
  @NotNull
  private Long slot;

  /**
   * Time value
   */
  @NotNull
  private Long time;

  /**
   * Creates a new instance of Bound.
   */
  public Bound() {
  }

  /**
   * Creates a new instance of Bound with all fields.
   *
   * @param epoch the epoch number
   * @param slot the slot number
   * @param time the time value
   */
  public Bound(Long epoch, Long slot, Long time) {
    this.epoch = epoch;
    this.slot = slot;
    this.time = time;
  }

  /**
   * Gets the epoch number.
   *
   * @return the epoch number
   */
  public Long getEpoch() {
    return epoch;
  }

  /**
   * Sets the epoch number.
   *
   * @param epoch the epoch number
   */
  public void setEpoch(Long epoch) {
    this.epoch = epoch;
  }

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
   * Gets the time value.
   *
   * @return the time value
   */
  public Long getTime() {
    return time;
  }

  /**
   * Sets the time value.
   *
   * @param time the time value
   */
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   * Returns a string representation of this Bound object.
   *
   * @return a string representation of this Bound object
   */
  @Override
  public String toString() {
    return "Bound{" +
           "epoch=" + epoch +
           ", slot=" + slot +
           ", time=" + time +
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
    Bound bound = (Bound) o;
    return Objects.equals(epoch, bound.epoch) &&
           Objects.equals(slot, bound.slot) &&
           Objects.equals(time, bound.time);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(epoch, slot, time);
  }
}