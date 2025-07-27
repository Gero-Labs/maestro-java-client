package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Defines the kind of DRep (credential, abstain, or no_confidence).
 */
@Getter
public enum DRepKind {

  /** DRep with specific credentials for voting */
  CREDENTIAL("credential"),

  /** DRep that abstains from voting */
  ABSTAIN("abstain"),

  /** Represents a no-confidence vote in governance */
  NO_CONFIDENCE("no_confidence");

  private String value;

  DRepKind(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this DRep kind.
   *
   * @return the string representation of this DRep kind
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
   * Converts a string value to the corresponding DRepKind enum constant.
   *
   * @param value the string value to convert
   * @return the DRepKind enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
  @JsonCreator
  public static DRepKind fromValue(String value) {
    for (DRepKind b : DRepKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
