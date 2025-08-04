package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Represents the network ID (mainnet or testnet).
 */
public enum NetworkId {

  /** The Cardano mainnet network */
  MAINNET("mainnet"),

  /** The Cardano testnet network */
  TESTNET("testnet");

  private String value;

  NetworkId(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this network ID.
   *
   * @return the string representation of this network ID
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
   * Converts a string value to the corresponding NetworkId enum constant.
   *
   * @param value the string value to convert
   * @return the corresponding NetworkId enum constant
   * @throws IllegalArgumentException if the value doesn't match any enum constant
   */
  @JsonCreator
  public static NetworkId fromValue(String value) {
    for (NetworkId b : NetworkId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
