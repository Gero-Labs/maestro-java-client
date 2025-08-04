package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents the parameters of an era.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EraParameters {

  /**
   * Length of the epoch.
   */
  @NotNull
  private Long epochLength;

  /**
   * Safe zone.
   */
  private Long safeZone;

  /**
   * Length of the slot.
   */
  @NotNull
  private Long slotLength;

  /**
   * Creates a new instance of EraParameters.
   */
  public EraParameters() {
  }

  /**
   * Creates a new instance of EraParameters with all fields.
   *
   * @param epochLength the length of the epoch
   * @param safeZone the safe zone
   * @param slotLength the length of the slot
   */
  public EraParameters(Long epochLength, Long safeZone, Long slotLength) {
    this.epochLength = epochLength;
    this.safeZone = safeZone;
    this.slotLength = slotLength;
  }

  /**
   * Gets the length of the epoch.
   *
   * @return the length of the epoch
   */
  public Long getEpochLength() {
    return epochLength;
  }

  /**
   * Sets the length of the epoch.
   *
   * @param epochLength the length of the epoch
   */
  public void setEpochLength(Long epochLength) {
    this.epochLength = epochLength;
  }

  /**
   * Gets the safe zone.
   *
   * @return the safe zone
   */
  public Long getSafeZone() {
    return safeZone;
  }

  /**
   * Sets the safe zone.
   *
   * @param safeZone the safe zone
   */
  public void setSafeZone(Long safeZone) {
    this.safeZone = safeZone;
  }

  /**
   * Gets the length of the slot.
   *
   * @return the length of the slot
   */
  public Long getSlotLength() {
    return slotLength;
  }

  /**
   * Sets the length of the slot.
   *
   * @param slotLength the length of the slot
   */
  public void setSlotLength(Long slotLength) {
    this.slotLength = slotLength;
  }

  /**
   * Returns a string representation of this EraParameters object.
   *
   * @return a string representation of this EraParameters object
   */
  @Override
  public String toString() {
    return "EraParameters{" +
           "epochLength=" + epochLength +
           ", safeZone=" + safeZone +
           ", slotLength=" + slotLength +
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
    EraParameters that = (EraParameters) o;
    return Objects.equals(epochLength, that.epochLength) &&
           Objects.equals(safeZone, that.safeZone) &&
           Objects.equals(slotLength, that.slotLength);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(epochLength, safeZone, slotLength);
  }
}
