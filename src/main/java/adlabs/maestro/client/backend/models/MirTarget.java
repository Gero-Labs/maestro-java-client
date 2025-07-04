package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Where the MIR reward(s) are being sent.
 */
@Getter
public enum MirTarget {

  RESERVES("reserves"),

  TREASURY("treasury"),

  ACCOUNTS("accounts");

  private String value;

  MirTarget(String value) {
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
  public static MirTarget fromValue(String value) {
    for (MirTarget b : MirTarget.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
