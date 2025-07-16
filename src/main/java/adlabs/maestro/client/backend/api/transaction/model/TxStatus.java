package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the on-chain status of a transaction.
 */
public enum TxStatus {
  FAILED("Failed"),
  ONCHAIN("Onchain"),
  PENDING("Pending"),
  REJECTED("Rejected"),
  ROLLEDBACK("Rolledback");

  private final String value;

  TxStatus(String value) {
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
  public static TxStatus fromValue(String value) {
    for (TxStatus b : TxStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
