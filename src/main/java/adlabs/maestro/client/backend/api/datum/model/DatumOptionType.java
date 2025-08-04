package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Datum type (inline datum or datum hash).
 */
public enum DatumOptionType {

  /** Datum is referenced by its hash */
  HASH("hash"),

  /** Datum is provided inline with the transaction */
  INLINE("inline");

  private String value;

  DatumOptionType(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this datum option type.
   *
   * @return the string representation of this datum option type
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
   * Converts a string value to the corresponding DatumOptionType enum constant.
   *
   * @param value the string value to convert
   * @return the DatumOptionType enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
  @JsonCreator
  public static DatumOptionType fromValue(String value) {
    for (DatumOptionType b : DatumOptionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
