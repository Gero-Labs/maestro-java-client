package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Parameters for reference script fee calculation (introduced in Conway).
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MinFeeReferenceScripts {

  /**
   * Base value for fee calculation.
   */
  @NotNull
  private Double base;

  /**
   * Multiplier value for fee calculation.
   */
  @NotNull
  private Double multiplier;

  /**
   * Range value for fee calculation.
   */
  @NotNull
  private Long range;

  /**
   * Creates a new instance of MinFeeReferenceScripts.
   */
  public MinFeeReferenceScripts() {
  }

  /**
   * Creates a new instance of MinFeeReferenceScripts with all fields.
   *
   * @param base the base value for fee calculation
   * @param multiplier the multiplier value for fee calculation
   * @param range the range value for fee calculation
   */
  public MinFeeReferenceScripts(Double base, Double multiplier, Long range) {
    this.base = base;
    this.multiplier = multiplier;
    this.range = range;
  }

  /**
   * Gets the base value for fee calculation.
   *
   * @return the base value for fee calculation
   */
  public Double getBase() {
    return base;
  }

  /**
   * Sets the base value for fee calculation.
   *
   * @param base the base value for fee calculation
   */
  public void setBase(Double base) {
    this.base = base;
  }

  /**
   * Gets the multiplier value for fee calculation.
   *
   * @return the multiplier value for fee calculation
   */
  public Double getMultiplier() {
    return multiplier;
  }

  /**
   * Sets the multiplier value for fee calculation.
   *
   * @param multiplier the multiplier value for fee calculation
   */
  public void setMultiplier(Double multiplier) {
    this.multiplier = multiplier;
  }

  /**
   * Gets the range value for fee calculation.
   *
   * @return the range value for fee calculation
   */
  public Long getRange() {
    return range;
  }

  /**
   * Sets the range value for fee calculation.
   *
   * @param range the range value for fee calculation
   */
  public void setRange(Long range) {
    this.range = range;
  }

  /**
   * Returns a string representation of this MinFeeReferenceScripts object.
   *
   * @return a string representation of this MinFeeReferenceScripts object
   */
  @Override
  public String toString() {
    return "MinFeeReferenceScripts{" +
           "base=" + base +
           ", multiplier=" + multiplier +
           ", range=" + range +
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
    MinFeeReferenceScripts that = (MinFeeReferenceScripts) o;
    return Objects.equals(base, that.base) &&
           Objects.equals(multiplier, that.multiplier) &&
           Objects.equals(range, that.range);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(base, multiplier, range);
  }
}
