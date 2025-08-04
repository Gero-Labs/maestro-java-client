package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Execution units for Plutus scripts.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ExUnit {

  /**
   * Memory execution units.
   */
  @NotNull
  private Long memory;

  /**
   * CPU execution units.
   */
  @NotNull
  private Long steps;

  /**
   * Default constructor.
   */
  public ExUnit() {
  }

  /**
   * Constructor with all fields as parameters.
   *
   * @param memory Memory execution units
   * @param steps CPU execution units
   */
  public ExUnit(Long memory, Long steps) {
    this.memory = memory;
    this.steps = steps;
  }

  /**
   * Gets the memory execution units.
   *
   * @return the memory execution units
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Sets the memory execution units.
   *
   * @param memory the memory execution units
   */
  public void setMemory(Long memory) {
    this.memory = memory;
  }

  /**
   * Gets the CPU execution units.
   *
   * @return the CPU execution units
   */
  public Long getSteps() {
    return steps;
  }

  /**
   * Sets the CPU execution units.
   *
   * @param steps the CPU execution units
   */
  public void setSteps(Long steps) {
    this.steps = steps;
  }

  /**
   * Returns a string representation of this ExUnit.
   *
   * @return a string representation of this ExUnit
   */
  @Override
  public String toString() {
    return "ExUnit{" +
            "memory=" + memory +
            ", steps=" + steps +
            '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param obj the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ExUnit exUnit = (ExUnit) obj;
    return Objects.equals(memory, exUnit.memory) &&
            Objects.equals(steps, exUnit.steps);
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
