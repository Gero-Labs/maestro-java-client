package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Defines the kind of DRep (credential, abstain, or no_confidence).
 */
@Getter
public enum DRepKind {

  CREDENTIAL("credential"),

  ABSTAIN("abstain"),

  NO_CONFIDENCE("no_confidence");

  private String value;

  DRepKind(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

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
