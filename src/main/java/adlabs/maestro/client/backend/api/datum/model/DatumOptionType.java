package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Datum type (inline datum or datum hash).
 */
@Getter
public enum DatumOptionType {

  HASH("hash"),

  INLINE("inline");

  private String value;

  DatumOptionType(String value) {
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
  public static DatumOptionType fromValue(String value) {
    for (DatumOptionType b : DatumOptionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
