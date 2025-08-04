package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an amount in Lovelace, the smallest unit of Ada.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Ada {

  /**
   * The amount in Lovelace.
   */
  @NotNull
  private Long lovelace;

  /**
   * Creates a new instance of Ada.
   */
  public Ada() {
  }

  /**
   * Creates a new instance of Ada with all fields.
   *
   * @param lovelace the amount in Lovelace
   */
  public Ada(Long lovelace) {
    this.lovelace = lovelace;
  }

  /**
   * Gets the amount in Lovelace.
   *
   * @return the amount in Lovelace
   */
  public Long getLovelace() {
    return lovelace;
  }

  /**
   * Sets the amount in Lovelace.
   *
   * @param lovelace the amount in Lovelace
   */
  public void setLovelace(Long lovelace) {
    this.lovelace = lovelace;
  }

  /**
   * Returns a string representation of this Ada object.
   *
   * @return a string representation of this Ada object
   */
  @Override
  public String toString() {
    return "Ada{" +
           "lovelace=" + lovelace +
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
    Ada ada = (Ada) o;
    return Objects.equals(lovelace, ada.lovelace);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(lovelace);
  }
}
