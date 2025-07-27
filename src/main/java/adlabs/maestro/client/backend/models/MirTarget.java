package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Where the MIR reward(s) are being sent.
 */
@Getter
public enum MirTarget {

  /** MIR rewards sent to the reserves pot */
  RESERVES("reserves"),

  /** MIR rewards sent to the treasury pot */
  TREASURY("treasury"),

  /** MIR rewards sent to specific accounts */
  ACCOUNTS("accounts");

  private String value;

  MirTarget(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this MIR target.
   *
   * @return the string representation of this MIR target
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
   * Converts a string value to the corresponding MirTarget enum constant.
   *
   * @param value the string value to convert
   * @return the corresponding MirTarget enum constant
   * @throws IllegalArgumentException if the value doesn't match any enum constant
   */
  @JsonCreator
  public static MirTarget fromValue(String value) {
    for (MirTarget b : MirTarget.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
