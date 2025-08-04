package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CIP-68 asset type enumeration defining the purpose and classification
 * of assets following the CIP-68 standard.
 */
public enum Cip68AssetType {

  /** Reference NFT that holds metadata and other information */
  REFERENCE_NFT("reference_nft"),
  
  /** User-facing NFT (Non-Fungible Token) */
  USER_NFT("user_nft"),
  
  /** User-facing FT (Fungible Token) */
  USER_FT("user_ft");

  private final String value;

  Cip68AssetType(String value) {
    this.value = value;
  }

  /**
   * Returns the string value associated with this CIP-68 asset type.
   *
   * @return the string representation of this CIP-68 asset type
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
   * Converts a string value to the corresponding Cip68AssetType enum constant.
   *
   * @param value the string value to convert
   * @return the Cip68AssetType enum constant corresponding to the given string value
   * @throws IllegalArgumentException if the value does not match any enum constant
   */
  @JsonCreator
  public static Cip68AssetType fromValue(String value) {
    for (Cip68AssetType type : Cip68AssetType.values()) {
      if (type.value.equals(value)) {
        return type;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}