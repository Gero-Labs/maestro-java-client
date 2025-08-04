package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a redeemer for minting operations.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MintRedeemer {

  /**
   * Datum for the redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * Execution unit budget (memory, steps).
   */
  @NotNull
  private List<@Min(0L)Long> exUnits;

  /**
   * Asset policy (hash of script being executed).
   */
  @NotNull
  private String policy;

  /**
   * Default constructor.
   */
  public MintRedeemer() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the datum for the redeemer
   * @param exUnits the execution unit budget (memory, steps)
   * @param policy the asset policy (hash of script being executed)
   */
  public MintRedeemer(Datum data, List<Long> exUnits, String policy) {
    this.data = data;
    this.exUnits = exUnits;
    this.policy = policy;
  }

  /**
   * Gets the datum for the redeemer.
   *
   * @return the datum for the redeemer
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the datum for the redeemer.
   *
   * @param data the datum for the redeemer
   */
  public void setData(Datum data) {
    this.data = data;
  }

  /**
   * Gets the execution unit budget (memory, steps).
   *
   * @return the execution unit budget
   */
  public List<Long> getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution unit budget (memory, steps).
   *
   * @param exUnits the execution unit budget
   */
  public void setExUnits(List<Long> exUnits) {
    this.exUnits = exUnits;
  }

  /**
   * Gets the asset policy (hash of script being executed).
   *
   * @return the asset policy
   */
  public String getPolicy() {
    return policy;
  }

  /**
   * Sets the asset policy (hash of script being executed).
   *
   * @param policy the asset policy
   */
  public void setPolicy(String policy) {
    this.policy = policy;
  }

  /**
   * Returns a string representation of this MintRedeemer.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "MintRedeemer{" +
        "data=" + data +
        ", exUnits=" + exUnits +
        ", policy='" + policy + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MintRedeemer that = (MintRedeemer) o;
    return Objects.equals(data, that.data) && Objects.equals(exUnits, that.exUnits) && Objects.equals(policy, that.policy);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(data, exUnits, policy);
  }
}
