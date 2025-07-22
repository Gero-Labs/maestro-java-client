package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CIP-68 asset type enumeration defining the purpose and classification
 * of assets following the CIP-68 standard.
 */
public enum Cip68AssetType {

  REFERENCE_NFT("reference_nft"),
  USER_NFT("user_nft"),
  USER_FT("user_ft");

  private final String value;

  Cip68AssetType(String value) {
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
  public static Cip68AssetType fromValue(String value) {
    for (Cip68AssetType type : Cip68AssetType.values()) {
      if (type.value.equals(value)) {
        return type;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}