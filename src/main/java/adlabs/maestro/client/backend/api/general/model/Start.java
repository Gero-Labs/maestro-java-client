package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.api.script.model.Time;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Represents the start details of an era.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Start {

  /**
   * Epoch number at the start.
   */
  @NotNull
  private Long epoch;

  /**
   * Slot number at the start.
   */
  @NotNull
  private Long slot;

  /**
   * Time at the start.
   */
  @NotNull
  @Valid
  private Time time;

  /**
   * Creates a new instance of Start.
   */
  public Start() {
  }

  /**
   * Creates a new instance of Start with all fields.
   *
   * @param epoch the epoch number at the start
   * @param slot the slot number at the start
   * @param time the time at the start
   */
  public Start(Long epoch, Long slot, Time time) {
    this.epoch = epoch;
    this.slot = slot;
    this.time = time;
  }

  /**
   * Gets the epoch number at the start.
   *
   * @return the epoch number at the start
   */
  public Long getEpoch() {
    return epoch;
  }

  /**
   * Sets the epoch number at the start.
   *
   * @param epoch the epoch number at the start
   */
  public void setEpoch(Long epoch) {
    this.epoch = epoch;
  }

  /**
   * Gets the slot number at the start.
   *
   * @return the slot number at the start
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the slot number at the start.
   *
   * @param slot the slot number at the start
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the time at the start.
   *
   * @return the time at the start
   */
  public Time getTime() {
    return time;
  }

  /**
   * Sets the time at the start.
   *
   * @param time the time at the start
   */
  public void setTime(Time time) {
    this.time = time;
  }

  /**
   * Returns a string representation of this Start object.
   *
   * @return a string representation of this Start object
   */
  @Override
  public String toString() {
    return "Start{" +
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
    Start start = (Start) o;
    return Objects.equals(epoch, start.epoch) &&
           Objects.equals(slot, start.slot) &&
           Objects.equals(time, start.time);
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