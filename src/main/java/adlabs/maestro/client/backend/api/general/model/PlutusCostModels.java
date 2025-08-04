package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Plutus script execution cost models.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PlutusCostModels {

  /**
   * Plutus V1 cost model parameters.
   */
  @NotNull
  private List<Long> plutusV1;

  /**
   * Plutus V2 cost model parameters.
   */
  @NotNull
  private List<Long> plutusV2;

  /**
   * Plutus V3 cost model parameters.
   */
  private List<Long> plutusV3;

  /**
   * Creates a new instance of PlutusCostModels.
   */
  public PlutusCostModels() {
  }

  /**
   * Creates a new instance of PlutusCostModels with all fields.
   *
   * @param plutusV1 the Plutus V1 cost model parameters
   * @param plutusV2 the Plutus V2 cost model parameters
   * @param plutusV3 the Plutus V3 cost model parameters
   */
  public PlutusCostModels(List<Long> plutusV1, List<Long> plutusV2, List<Long> plutusV3) {
    this.plutusV1 = plutusV1;
    this.plutusV2 = plutusV2;
    this.plutusV3 = plutusV3;
  }

  /**
   * Gets the Plutus V1 cost model parameters.
   *
   * @return the Plutus V1 cost model parameters
   */
  public List<Long> getPlutusV1() {
    return plutusV1;
  }

  /**
   * Sets the Plutus V1 cost model parameters.
   *
   * @param plutusV1 the Plutus V1 cost model parameters
   */
  public void setPlutusV1(List<Long> plutusV1) {
    this.plutusV1 = plutusV1;
  }

  /**
   * Gets the Plutus V2 cost model parameters.
   *
   * @return the Plutus V2 cost model parameters
   */
  public List<Long> getPlutusV2() {
    return plutusV2;
  }

  /**
   * Sets the Plutus V2 cost model parameters.
   *
   * @param plutusV2 the Plutus V2 cost model parameters
   */
  public void setPlutusV2(List<Long> plutusV2) {
    this.plutusV2 = plutusV2;
  }

  /**
   * Gets the Plutus V3 cost model parameters.
   *
   * @return the Plutus V3 cost model parameters
   */
  public List<Long> getPlutusV3() {
    return plutusV3;
  }

  /**
   * Sets the Plutus V3 cost model parameters.
   *
   * @param plutusV3 the Plutus V3 cost model parameters
   */
  public void setPlutusV3(List<Long> plutusV3) {
    this.plutusV3 = plutusV3;
  }

  /**
   * Returns a string representation of this PlutusCostModels object.
   *
   * @return a string representation of this PlutusCostModels object
   */
  @Override
  public String toString() {
    return "PlutusCostModels{" +
           "plutusV1=" + plutusV1 +
           ", plutusV2=" + plutusV2 +
           ", plutusV3=" + plutusV3 +
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
    PlutusCostModels that = (PlutusCostModels) o;
    return Objects.equals(plutusV1, that.plutusV1) &&
           Objects.equals(plutusV2, that.plutusV2) &&
           Objects.equals(plutusV3, that.plutusV3);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(plutusV1, plutusV2, plutusV3);
  }
}
