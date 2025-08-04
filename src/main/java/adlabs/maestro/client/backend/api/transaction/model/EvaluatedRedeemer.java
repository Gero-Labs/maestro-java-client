package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.RedeemerTag;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.block.model.ExUnits;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Identifier of an evaluated redeemer and the execution units required to execute it.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EvaluatedRedeemer {

  /**
   * Execution units for the redeemer.
   */
  @NotNull
  @Valid
  private ExUnits exUnits;

  /**
   * Index for the redeemer tag (which input, policy, etc).
   */
  @NotNull
  @Min(0)
  private Integer redeemerIndex;

  /**
   * Tag for the redeemer.
   */
  @NotNull
  @Valid
  private RedeemerTag redeemerTag;

  /**
   * Creates a no-argument constructor.
   */
  public EvaluatedRedeemer() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param exUnits Execution units for the redeemer
   * @param redeemerIndex Index for the redeemer tag (which input, policy, etc)
   * @param redeemerTag Tag for the redeemer
   */
  public EvaluatedRedeemer(ExUnits exUnits, Integer redeemerIndex, RedeemerTag redeemerTag) {
    this.exUnits = exUnits;
    this.redeemerIndex = redeemerIndex;
    this.redeemerTag = redeemerTag;
  }

  /**
   * Gets the execution units for the redeemer.
   *
   * @return the execution units
   */
  public ExUnits getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution units for the redeemer.
   *
   * @param exUnits the execution units to set
   */
  public void setExUnits(ExUnits exUnits) {
    this.exUnits = exUnits;
  }

  /**
   * Gets the index for the redeemer tag (which input, policy, etc).
   *
   * @return the redeemer index
   */
  public Integer getRedeemerIndex() {
    return redeemerIndex;
  }

  /**
   * Sets the index for the redeemer tag (which input, policy, etc).
   *
   * @param redeemerIndex the redeemer index to set
   */
  public void setRedeemerIndex(Integer redeemerIndex) {
    this.redeemerIndex = redeemerIndex;
  }

  /**
   * Gets the tag for the redeemer.
   *
   * @return the redeemer tag
   */
  public RedeemerTag getRedeemerTag() {
    return redeemerTag;
  }

  /**
   * Sets the tag for the redeemer.
   *
   * @param redeemerTag the redeemer tag to set
   */
  public void setRedeemerTag(RedeemerTag redeemerTag) {
    this.redeemerTag = redeemerTag;
  }

  @Override
  public String toString() {
    return "EvaluatedRedeemer{" +
        "exUnits=" + exUnits +
        ", redeemerIndex=" + redeemerIndex +
        ", redeemerTag=" + redeemerTag +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EvaluatedRedeemer that = (EvaluatedRedeemer) o;
    return java.util.Objects.equals(exUnits, that.exUnits) &&
        java.util.Objects.equals(redeemerIndex, that.redeemerIndex) &&
        java.util.Objects.equals(redeemerTag, that.redeemerTag);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(exUnits, redeemerIndex, redeemerTag);
  }
}
