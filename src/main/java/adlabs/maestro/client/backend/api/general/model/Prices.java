package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents prices for memory and steps.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Prices {

  /**
   * Price per memory unit.
   */
  @NotNull
  private String memory;

  /**
   * Price per step unit.
   */
  @NotNull
  private String steps;

  /**
   * Creates a new instance of Prices.
   */
  public Prices() {
  }

  /**
   * Creates a new instance of Prices with all fields.
   *
   * @param memory the price per memory unit
   * @param steps the price per step unit
   */
  public Prices(String memory, String steps) {
    this.memory = memory;
    this.steps = steps;
  }

  /**
   * Gets the price per memory unit.
   *
   * @return the price per memory unit
   */
  public String getMemory() {
    return memory;
  }

  /**
   * Sets the price per memory unit.
   *
   * @param memory the price per memory unit
   */
  public void setMemory(String memory) {
    this.memory = memory;
  }

  /**
   * Gets the price per step unit.
   *
   * @return the price per step unit
   */
  public String getSteps() {
    return steps;
  }

  /**
   * Sets the price per step unit.
   *
   * @param steps the price per step unit
   */
  public void setSteps(String steps) {
    this.steps = steps;
  }

  /**
   * Returns a string representation of this Prices object.
   *
   * @return a string representation of this Prices object
   */
  @Override
  public String toString() {
    return "Prices{" +
           "memory='" + memory + '\'' +
           ", steps='" + steps + '\'' +
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
    Prices prices = (Prices) o;
    return Objects.equals(memory, prices.memory) &&
           Objects.equals(steps, prices.steps);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(memory, steps);
  }
}
