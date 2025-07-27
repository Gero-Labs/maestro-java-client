package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of staking-related action
 */
public enum AccountAction {

  /** Stake key registration action */
  REGISTRATION("registration"),
  
  /** Stake key deregistration action */
  DEREGISTRATION("deregistration"),
  
  /** Stake delegation to a pool action */
  DELEGATION("delegation"),
  
  /** Reward withdrawal action */
  WITHDRAWAL("withdrawal");

  private final String value;

  AccountAction(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this account action.
   *
   * @return the string representation of this account action
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
   * Converts a string value to the corresponding AccountAction enum constant.
   *
   * @param value the string value to convert
   * @return the AccountAction enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
  @JsonCreator
  public static AccountAction fromValue(String value) {
    for (AccountAction action : AccountAction.values()) {
      if (action.value.equals(value)) {
        return action;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}