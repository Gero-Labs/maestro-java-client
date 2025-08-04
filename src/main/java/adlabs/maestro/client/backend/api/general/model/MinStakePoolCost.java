package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Minimum stake pool cost.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MinStakePoolCost {

  /**
   * ADA amount for minimum stake pool cost.
   */
  @NotNull
  @Valid
  private Ada ada;

  /**
   * Creates a new instance of MinStakePoolCost.
   */
  public MinStakePoolCost() {
  }

  /**
   * Creates a new instance of MinStakePoolCost with all fields.
   *
   * @param ada the ADA amount for minimum stake pool cost
   */
  public MinStakePoolCost(Ada ada) {
    this.ada = ada;
  }

  /**
   * Gets the ADA amount for minimum stake pool cost.
   *
   * @return the ADA amount for minimum stake pool cost
   */
  public Ada getAda() {
    return ada;
  }

  /**
   * Sets the ADA amount for minimum stake pool cost.
   *
   * @param ada the ADA amount for minimum stake pool cost
   */
  public void setAda(Ada ada) {
    this.ada = ada;
  }

  /**
   * Returns a string representation of this MinStakePoolCost object.
   *
   * @return a string representation of this MinStakePoolCost object
   */
  @Override
  public String toString() {
    return "MinStakePoolCost{" +
           "ada=" + ada +
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
    MinStakePoolCost that = (MinStakePoolCost) o;
    return Objects.equals(ada, that.ada);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(ada);
  }
}
