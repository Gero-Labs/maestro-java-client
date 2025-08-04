package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the kind of payment credential (key or script).
 */
public enum PaymentCredKind {

  /** Key-based payment credential. */
  KEY("key"),

  /** Script-based payment credential. */
  SCRIPT("script");

  private String value;

  PaymentCredKind(String value) {
    this.value = value;
  }

  /**
   * Gets the string value of this payment credential kind.
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
   * Creates a PaymentCredKind from its string value.
   *
   * @param value the string value
   * @return the corresponding PaymentCredKind
   * @throws IllegalArgumentException if the value is not recognized
   */
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
