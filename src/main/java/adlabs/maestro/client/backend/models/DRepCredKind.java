package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Defines the kind of DRep credential (key or script).
 */
@Getter
public enum DRepCredKind {

  KEY("key"),

  SCRIPT("script");

  private String value;

  DRepCredKind(String value) {
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
  public static DRepCredKind fromValue(String value) {
    for (DRepCredKind b : DRepCredKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
