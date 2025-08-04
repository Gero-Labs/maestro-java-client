package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets StakingCredKind
 */
public enum StakingCredKind {

  /**
   * Key-based staking credential.
   */
  KEY("key"),

  /**
   * Script-based staking credential.
   */
  SCRIPT("script"),

  /**
   * Pointer-based staking credential.
   */
  POINTER("pointer");

  private String value;

  StakingCredKind(String value) {
    this.value = value;
  }

  /**
   * Gets the string value of this staking credential kind.
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
   * Creates a StakingCredKind from its string value.
   *
   * @param value the string value to convert
   * @return the corresponding StakingCredKind
   * @throws IllegalArgumentException if the value is not recognized
   */
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