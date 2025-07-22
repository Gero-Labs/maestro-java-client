package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets StakingCredKind
 */
public enum StakingCredKind {

  KEY("key"),

  SCRIPT("script"),

  POINTER("pointer");

  private String value;

  StakingCredKind(String value) {
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
  public static StakingCredKind fromValue(String value) {
    for (StakingCredKind b : StakingCredKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}