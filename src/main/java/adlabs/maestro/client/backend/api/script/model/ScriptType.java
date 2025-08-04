package adlabs.maestro.client.backend.api.script.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Script type and version.
 */
public enum ScriptType {

  /**
   * Native script type.
   */
  NATIVE("native"),

  /**
   * Plutus V1 script type.
   */
  PLUTUSV1("plutusv1"),

  /**
   * Plutus V2 script type.
   */
  PLUTUSV2("plutusv2"),

  /**
   * Plutus V3 script type.
   */
  PLUTUSV3("plutusv3");

  private String value;

  ScriptType(String value) {
    this.value = value;
  }

  /**
   * Gets the string value of this script type.
   *
   * @return the string value
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
   * Creates a ScriptType from its string value.
   *
   * @param value the string value to convert
   * @return the corresponding ScriptType
   * @throws IllegalArgumentException if the value is not recognized
   */
  @JsonCreator
  public static ScriptType fromValue(String value) {
    for (ScriptType b : ScriptType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
