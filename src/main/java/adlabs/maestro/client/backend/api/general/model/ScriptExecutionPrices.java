package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Script execution prices.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScriptExecutionPrices {

  /**
   * Script execution CPU price.
   */
  @NotNull
  private String cpu;

  /**
   * Script execution memory price.
   */
  @NotNull
  private String memory;

  /**
   * Creates a new instance of ScriptExecutionPrices.
   */
  public ScriptExecutionPrices() {
  }

  /**
   * Creates a new instance of ScriptExecutionPrices with all fields.
   *
   * @param cpu the script execution CPU price
   * @param memory the script execution memory price
   */
  public ScriptExecutionPrices(String cpu, String memory) {
    this.cpu = cpu;
    this.memory = memory;
  }

  /**
   * Gets the script execution CPU price.
   *
   * @return the script execution CPU price
   */
  public String getCpu() {
    return cpu;
  }

  /**
   * Sets the script execution CPU price.
   *
   * @param cpu the script execution CPU price
   */
  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  /**
   * Gets the script execution memory price.
   *
   * @return the script execution memory price
   */
  public String getMemory() {
    return memory;
  }

  /**
   * Sets the script execution memory price.
   *
   * @param memory the script execution memory price
   */
  public void setMemory(String memory) {
    this.memory = memory;
  }

  /**
   * Returns a string representation of this ScriptExecutionPrices object.
   *
   * @return a string representation of this ScriptExecutionPrices object
   */
  @Override
  public String toString() {
    return "ScriptExecutionPrices{" +
           "cpu='" + cpu + '\'' +
           ", memory='" + memory + '\'' +
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
    ScriptExecutionPrices that = (ScriptExecutionPrices) o;
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
