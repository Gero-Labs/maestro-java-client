package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents the on-chain status of a transaction.
 */
public enum TxStatus {
  /**
   * Transaction failed during execution.
   */
  FAILED("Failed"),
  
  /**
   * Transaction is confirmed on-chain.
   */
  ONCHAIN("Onchain"),
  
  /**
   * Transaction is pending confirmation.
   */
  PENDING("Pending"),
  
  /**
   * Transaction was rejected.
   */
  REJECTED("Rejected"),
  
  /**
   * Transaction was rolled back.
   */
  ROLLEDBACK("Rolledback");

  private final String value;

  TxStatus(String value) {
    this.value = value;
  }

  /**
   * Gets the string value of this transaction status.
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
   * Creates a TxStatus from its string value.
   *
   * @param value the string value to convert
   * @return the corresponding TxStatus
   * @throws IllegalArgumentException if the value is not recognized
   */
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
