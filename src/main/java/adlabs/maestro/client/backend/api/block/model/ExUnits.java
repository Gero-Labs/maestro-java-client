package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Execution unit budget for executing a redeemer.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ExUnits {

  /**
   * Memory budget.
   */
  @NotNull
  @Min(0L)
  private Long mem;

  /**
   * Steps budget.
   */
  @NotNull
  @Min(0L)
  private Long steps;

  /**
   * Default constructor.
   */
  public ExUnits() {
  }

  /**
   * Constructor with all fields as parameters.
   *
   * @param mem Memory budget
   * @param steps Steps budget
   */
  public ExUnits(Long mem, Long steps) {
    this.mem = mem;
    this.steps = steps;
  }

  /**
   * Gets the memory budget.
   *
   * @return the memory budget
   */
  public Long getMem() {
    return mem;
  }

  /**
   * Sets the memory budget.
   *
   * @param mem the memory budget
   */
  public void setMem(Long mem) {
    this.mem = mem;
  }

  /**
   * Gets the steps budget.
   *
   * @return the steps budget
   */
  public Long getSteps() {
    return steps;
  }

  /**
   * Sets the steps budget.
   *
   * @param steps the steps budget
   */
  public void setSteps(Long steps) {
    this.steps = steps;
  }

  /**
   * Returns a string representation of this ExUnits.
   *
   * @return a string representation of this ExUnits
   */
  @Override
  public String toString() {
    return "ExUnits{" +
            "mem=" + mem +
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
    ExUnits exUnits = (ExUnits) obj;
    return Objects.equals(mem, exUnits.mem) &&
            Objects.equals(steps, exUnits.steps);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(mem, steps);
  }
}
