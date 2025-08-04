package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.api.script.model.Time;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the end details of an era.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class End {
    
  /**
   * Epoch number at the end.
   */
  @NotNull
  private Long epoch;

  /**
   * Slot number at the end.
   */
  @NotNull
  private Long slot;

  /**
   * Time at the end.
   */
  @NotNull
  @Valid
  private Time time;

  /**
   * Creates a new instance of End.
   */
  public End() {
  }

  /**
   * Creates a new instance of End with all fields.
   *
   * @param epoch the epoch number at the end
   * @param slot the slot number at the end
   * @param time the time at the end
   */
  public End(Long epoch, Long slot, Time time) {
    this.epoch = epoch;
    this.slot = slot;
    this.time = time;
  }

  /**
   * Gets the epoch number at the end.
   *
   * @return the epoch number at the end
   */
  public Long getEpoch() {
    return epoch;
  }

  /**
   * Sets the epoch number at the end.
   *
   * @param epoch the epoch number at the end
   */
  public void setEpoch(Long epoch) {
    this.epoch = epoch;
  }

  /**
   * Gets the slot number at the end.
   *
   * @return the slot number at the end
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the slot number at the end.
   *
   * @param slot the slot number at the end
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the time at the end.
   *
   * @return the time at the end
   */
  public Time getTime() {
    return time;
  }

  /**
   * Sets the time at the end.
   *
   * @param time the time at the end
   */
  public void setTime(Time time) {
    this.time = time;
  }

  /**
   * Returns a string representation of this End object.
   *
   * @return a string representation of this End object
   */
  @Override
  public String toString() {
    return "End{" +
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
    End end = (End) o;
    return Objects.equals(epoch, end.epoch) &&
           Objects.equals(slot, end.slot) &&
           Objects.equals(time, end.time);
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
