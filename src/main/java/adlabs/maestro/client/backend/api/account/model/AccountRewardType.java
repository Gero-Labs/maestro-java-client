package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of stake account reward
 */
public enum AccountRewardType {

  /** Reward distributed to a stake pool member */
  MEMBER("member"),
  
  /** Reward distributed to a stake pool leader */
  LEADER("leader"),
  
  /** Reward from the treasury pot */
  TREASURY("treasury"),
  
  /** Reward from the reserves pot */
  RESERVES("reserves"),
  
  /** Refund of deposits */
  REFUND("refund");

  private final String value;

  AccountRewardType(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this account reward type.
   *
   * @return the string representation of this account reward type
   */
  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

  /**
   * Converts a string value to the corresponding AccountRewardType enum constant.
   *
   * @param value the string value to convert
   * @return the AccountRewardType enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
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