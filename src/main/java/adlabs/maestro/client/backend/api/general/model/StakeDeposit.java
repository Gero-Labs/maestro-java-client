package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Stake deposit amount.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeDeposit {

  /**
   * ADA amount for the stake deposit.
   */
  @NotNull
  @Valid
  private Ada ada;

  /**
   * Creates a new instance of StakeDeposit.
   */
  public StakeDeposit() {
  }

  /**
   * Creates a new instance of StakeDeposit with all fields.
   *
   * @param ada the ADA amount for the stake deposit
   */
  public StakeDeposit(Ada ada) {
    this.ada = ada;
  }

  /**
   * Gets the ADA amount for the stake deposit.
   *
   * @return the ADA amount for the stake deposit
   */
  public Ada getAda() {
    return ada;
  }

  /**
   * Sets the ADA amount for the stake deposit.
   *
   * @param ada the ADA amount for the stake deposit
   */
  public void setAda(Ada ada) {
    this.ada = ada;
  }

  /**
   * Returns a string representation of this StakeDeposit object.
   *
   * @return a string representation of this StakeDeposit object
   */
  @Override
  public String toString() {
    return "StakeDeposit{" +
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
    StakeDeposit that = (StakeDeposit) o;
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
