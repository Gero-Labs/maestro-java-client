package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of staking-related action
 */
public enum AccountAction {

  REGISTRATION("registration"),
  DEREGISTRATION("deregistration"),
  DELEGATION("delegation"),
  WITHDRAWAL("withdrawal");

  private final String value;

  AccountAction(String value) {
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
  public static AccountAction fromValue(String value) {
    for (AccountAction action : AccountAction.values()) {
      if (action.value.equals(value)) {
        return action;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}