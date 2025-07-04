package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * LedgerEra represents the era of the Cardano ledger.
 */
public enum LedgerEra {
  BYRON("byron"),
  SHELLEY("shelley"),
  ALLEGRA("allegra"),
  MARY("mary"),
  ALONZO("alonzo"),
  BABBAGE("babbage"),
  CONWAY("conway");

  private final String value;

  LedgerEra(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @JsonCreator
  public static LedgerEra fromValue(String value) {
    for (LedgerEra e : LedgerEra.values()) {
      if (e.value.equals(value)) return e;
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
