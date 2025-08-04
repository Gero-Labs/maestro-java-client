package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * LedgerEra represents the era of the Cardano ledger.
 */
public enum LedgerEra {
  /** Byron era - the first era of Cardano */
  BYRON("byron"),
  
  /** Shelley era - introduced staking and delegation */
  SHELLEY("shelley"),
  
  /** Allegra era - introduced native tokens */
  ALLEGRA("allegra"),
  
  /** Mary era - enhanced native token support */
  MARY("mary"),
  
  /** Alonzo era - introduced smart contracts (Plutus) */
  ALONZO("alonzo"),
  
  /** Babbage era - enhanced Plutus capabilities */
  BABBAGE("babbage"),
  
  /** Conway era - introduced governance features */
  CONWAY("conway"),
  
  /** Era not recognized or unknown */
  NOTRECOGNIZED("notrecognised");

  private final String value;

  LedgerEra(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this ledger era.
   *
   * @return the string representation of this ledger era
   */
  @JsonValue
  public String getValue() {
    return value;
  }

  /**
   * Converts a string value to the corresponding LedgerEra enum constant.
   *
   * @param value the string value to convert
   * @return the LedgerEra enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
  @JsonCreator
  public static LedgerEra fromValue(String value) {
    for (LedgerEra e : LedgerEra.values()) {
      if (e.value.equals(value)) return e;
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
