package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Redeemer tag.
 */
@Getter
public enum RedeemerTag {

  SPEND("spend"),

  MINT("mint"),

  CERT("cert"),

  WDRL("wdrl"),

  VOTE("vote"),

  PROPOSE("propose");

  private String value;

  RedeemerTag(String value) {
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
  public static RedeemerTag fromValue(String value) {
    for (RedeemerTag b : RedeemerTag.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
