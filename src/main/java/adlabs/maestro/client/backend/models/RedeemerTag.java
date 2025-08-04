package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Redeemer tag.
 */
public enum RedeemerTag {

  /**
   * Tag for spending redeemers.
   */
  SPEND("spend"),

  /**
   * Tag for minting/burning redeemers.
   */
  MINT("mint"),

  /**
   * Tag for certificate redeemers.
   */
  CERT("cert"),

  /**
   * Tag for withdrawal redeemers.
   */
  WDRL("wdrl"),

  /**
   * Tag for voting redeemers.
   */
  VOTE("vote"),

  /**
   * Tag for proposal redeemers.
   */
  PROPOSE("propose");

  private String value;

  RedeemerTag(String value) {
    this.value = value;
  }

  /**
   * Gets the string value of this redeemer tag.
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
   * Creates a RedeemerTag from its string value.
   *
   * @param value the string value to convert
   * @return the corresponding RedeemerTag
   * @throws IllegalArgumentException if the value is not recognized
   */
  @JsonCreator
  public static RedeemerTag fromValue(String value) {
    for (RedeemerTag b : RedeemerTag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
