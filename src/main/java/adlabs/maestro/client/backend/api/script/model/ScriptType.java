package adlabs.maestro.client.backend.api.script.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Script type and version.
 */
@Getter
public enum ScriptType {

  NATIVE("native"),

  PLUTUSV1("plutusv1"),

  PLUTUSV2("plutusv2"),

  PLUTUSV3("plutusv3");

  private String value;

  ScriptType(String value) {
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
  public static ScriptType fromValue(String value) {
    for (ScriptType b : ScriptType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
