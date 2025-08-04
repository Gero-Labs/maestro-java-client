package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Maximum execution units.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxExecutionUnits {

  /**
   * Maximum execution CPU units.
   */
  @NotNull
  private Long cpu;

  /**
   * Maximum execution memory units.
   */
  @NotNull
  private Long memory;

  /**
   * Creates a new instance of MaxExecutionUnits.
   */
  public MaxExecutionUnits() {
  }

  /**
   * Creates a new instance of MaxExecutionUnits with all fields.
   *
   * @param cpu the maximum execution CPU units
   * @param memory the maximum execution memory units
   */
  public MaxExecutionUnits(Long cpu, Long memory) {
    this.cpu = cpu;
    this.memory = memory;
  }

  /**
   * Gets the maximum execution CPU units.
   *
   * @return the maximum execution CPU units
   */
  public Long getCpu() {
    return cpu;
  }

  /**
   * Sets the maximum execution CPU units.
   *
   * @param cpu the maximum execution CPU units
   */
  public void setCpu(Long cpu) {
    this.cpu = cpu;
  }

  /**
   * Gets the maximum execution memory units.
   *
   * @return the maximum execution memory units
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Sets the maximum execution memory units.
   *
   * @param memory the maximum execution memory units
   */
  public void setMemory(Long memory) {
    this.memory = memory;
  }

  /**
   * Returns a string representation of this MaxExecutionUnits object.
   *
   * @return a string representation of this MaxExecutionUnits object
   */
  @Override
  public String toString() {
    return "MaxExecutionUnits{" +
           "cpu=" + cpu +
           ", memory=" + memory +
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
    MaxExecutionUnits that = (MaxExecutionUnits) o;
    return Objects.equals(cpu, that.cpu) &&
           Objects.equals(memory, that.memory);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(cpu, memory);
  }
}
