package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Defines the kind of payment credential (key or script).
 */
@Getter
public enum PaymentCredKind {

  KEY("key"),

  SCRIPT("script");

  private String value;

  PaymentCredKind(String value) {
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
  public static PaymentCredKind fromValue(String value) {
    for (PaymentCredKind b : PaymentCredKind.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
