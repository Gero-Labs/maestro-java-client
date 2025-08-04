package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * The pot from which an MIR reward is being funded by.
 */
public enum MirSource {

  /** MIR rewards from the reserves pot */
  RESERVES("reserves"),

  /** MIR rewards from the treasury pot */
  TREASURY("treasury");

  private String value;

  MirSource(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this MIR source.
   *
   * @return the string representation of this MIR source
   */
  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  /**
   * Converts a string value to the corresponding MirSource enum constant.
   *
   * @param value the string value to convert
   * @return the corresponding MirSource enum constant
   * @throws IllegalArgumentException if the value doesn't match any enum constant
   */
  @JsonCreator
  public static MirSource fromValue(String value) {
    for (MirSource b : MirSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
