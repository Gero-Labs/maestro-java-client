package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of stake account reward
 */
public enum AccountRewardType {

  MEMBER("member"),
  LEADER("leader"),
  TREASURY("treasury"),
  RESERVES("reserves"),
  REFUND("refund");

  private final String value;

  AccountRewardType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

  @JsonCreator
  public static AccountRewardType fromValue(String value) {
    for (AccountRewardType type : AccountRewardType.values()) {
      if (type.value.equals(value)) {
        return type;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}