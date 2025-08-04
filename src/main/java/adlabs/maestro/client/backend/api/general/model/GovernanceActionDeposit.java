package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Governance action deposit (introduced in Conway).
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GovernanceActionDeposit {

  /**
   * ADA amount.
   */
  @NotNull
  @Valid
  private Ada ada;

  /**
   * Creates a new instance of GovernanceActionDeposit.
   */
  public GovernanceActionDeposit() {
  }

  /**
   * Creates a new instance of GovernanceActionDeposit with all fields.
   *
   * @param ada the ADA amount
   */
  public GovernanceActionDeposit(Ada ada) {
    this.ada = ada;
  }

  /**
   * Gets the ADA amount.
   *
   * @return the ADA amount
   */
  public Ada getAda() {
    return ada;
  }

  /**
   * Sets the ADA amount.
   *
   * @param ada the ADA amount
   */
  public void setAda(Ada ada) {
    this.ada = ada;
  }

  /**
   * Returns a string representation of this GovernanceActionDeposit object.
   *
   * @return a string representation of this GovernanceActionDeposit object
   */
  @Override
  public String toString() {
    return "GovernanceActionDeposit{" +
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
    GovernanceActionDeposit that = (GovernanceActionDeposit) o;
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
