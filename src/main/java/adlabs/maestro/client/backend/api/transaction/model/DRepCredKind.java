package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Defines the kind of DRep credential (key or script).
 */
public enum DRepCredKind {

  /** DRep credential based on a cryptographic key */
  KEY("key"),

  /** DRep credential based on a script */
  SCRIPT("script");

  private String value;

  DRepCredKind(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this DRep credential kind.
   *
   * @return the string representation of this DRep credential kind
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
   * Converts a string value to the corresponding DRepCredKind enum constant.
   *
   * @param value the string value to convert
   * @return the DRepCredKind enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
  @JsonCreator
  public static DRepCredKind fromValue(String value) {
    for (DRepCredKind b : DRepCredKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
