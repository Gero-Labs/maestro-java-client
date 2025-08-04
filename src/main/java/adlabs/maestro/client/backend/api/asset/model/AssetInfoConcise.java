package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Concise information about a specific Cardano native-asset
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInfoConcise {

  /**
   * Hex encoding of the asset name
   */
  @NotNull
  private String assetName;

  /**
   * ASCII representation of the asset name
   */
  @NotNull
  private String assetNameAscii;

  /**
   * Asset standards compliance information
   */
  @NotNull
  @Valid
  private AssetStandards assetStandards;

  /**
   * CIP-14 fingerprint of the asset
   */
  @NotNull
  private String fingerprint;

  /**
   * Current amount of the asset minted
   */
  @NotNull
  private String totalSupply;

  /**
   * No-args constructor for AssetInfoConcise.
   */
  public AssetInfoConcise() {
  }

  /**
   * All-args constructor for AssetInfoConcise.
   *
   * @param assetName      Hex encoding of the asset name
   * @param assetNameAscii ASCII representation of the asset name
   * @param assetStandards Asset standards compliance information
   * @param fingerprint    CIP-14 fingerprint of the asset
   * @param totalSupply    Current amount of the asset minted
   */
  public AssetInfoConcise(String assetName, String assetNameAscii, AssetStandards assetStandards, String fingerprint, String totalSupply) {
    this.assetName = assetName;
    this.assetNameAscii = assetNameAscii;
    this.assetStandards = assetStandards;
    this.fingerprint = fingerprint;
    this.totalSupply = totalSupply;
  }

  /**
   * Gets the hex encoding of the asset name.
   *
   * @return the assetName
   */
  public String getAssetName() {
    return assetName;
  }

  /**
   * Sets the hex encoding of the asset name.
   *
   * @param assetName the assetName to set
   */
  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  /**
   * Gets the ASCII representation of the asset name.
   *
   * @return the assetNameAscii
   */
  public String getAssetNameAscii() {
    return assetNameAscii;
  }

  /**
   * Sets the ASCII representation of the asset name.
   *
   * @param assetNameAscii the assetNameAscii to set
   */
  public void setAssetNameAscii(String assetNameAscii) {
    this.assetNameAscii = assetNameAscii;
  }

  /**
   * Gets the asset standards compliance information.
   *
   * @return the assetStandards
   */
  public AssetStandards getAssetStandards() {
    return assetStandards;
  }

  /**
   * Sets the asset standards compliance information.
   *
   * @param assetStandards the assetStandards to set
   */
  public void setAssetStandards(AssetStandards assetStandards) {
    this.assetStandards = assetStandards;
  }

  /**
   * Gets the CIP-14 fingerprint of the asset.
   *
   * @return the fingerprint
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * Sets the CIP-14 fingerprint of the asset.
   *
   * @param fingerprint the fingerprint to set
   */
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  /**
   * Gets the current amount of the asset minted.
   *
   * @return the totalSupply
   */
  public String getTotalSupply() {
    return totalSupply;
  }

  /**
   * Sets the current amount of the asset minted.
   *
   * @param totalSupply the totalSupply to set
   */
  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  @Override
  public String toString() {
    return "AssetInfoConcise{" +
        "assetName='" + assetName + '\'' +
        ", assetNameAscii='" + assetNameAscii + '\'' +
        ", assetStandards=" + assetStandards +
        ", fingerprint='" + fingerprint + '\'' +
        ", totalSupply='" + totalSupply + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetInfoConcise that = (AssetInfoConcise) o;
    return Objects.equals(assetName, that.assetName) && Objects.equals(assetNameAscii, that.assetNameAscii) && Objects.equals(assetStandards, that.assetStandards) && Objects.equals(fingerprint, that.fingerprint) && Objects.equals(totalSupply, that.totalSupply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetName, assetNameAscii, assetStandards, fingerprint, totalSupply);
  }
}