package adlabs.maestro.client.backend.api.asset.model;

import adlabs.maestro.client.backend.models.Holders;
import adlabs.maestro.client.backend.models.MintTransaction;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.JsonNode;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Information about a specific Cardano native-asset
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInfo {

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
   * Number of transactions which burned some of the asset
   */
  @NotNull
  @Min(0L)
  private Long burnTxCount;

  /**
   * CIP-14 fingerprint of the asset
   */
  @NotNull
  private String fingerprint;

  /**
   * First transaction that minted this asset
   */
  @NotNull
  @Valid
  private MintTransaction firstMintTx;

  /**
   * Latest transaction that minted this asset
   */
  @NotNull
  @Valid
  private MintTransaction latestMintTx;

  /**
   * Metadata of the most recent transaction which minted or burned the asset
   */
  private JsonNode latestMintTxMetadata;

  /**
   * Number of transactions which minted some of the asset
   */
  @NotNull
  @Min(0L)
  private Long mintTxCount;

  /**
   * Token registry metadata information
   */
  @Valid
  private JsonNode tokenRegistryMetadata;

  /**
   * Total amount of the asset in existence currently
   */
  @NotNull
  private String totalSupply;

  /**
   * Number of unique holders of this asset
   */
  @NotNull
  @Valid
  private Holders uniqueHolders;

  /**
   * Default constructor
   */
  public AssetInfo() {
  }

  /**
   * Constructor with all fields
   *
   * @param assetName the hex encoding of the asset name
   * @param assetNameAscii the ASCII representation of the asset name
   * @param assetStandards the asset standards compliance information
   * @param burnTxCount the number of transactions which burned some of the asset
   * @param fingerprint the CIP-14 fingerprint of the asset
   * @param firstMintTx the first transaction that minted this asset
   * @param latestMintTx the latest transaction that minted this asset
   * @param latestMintTxMetadata the metadata of the most recent transaction which minted or burned the asset
   * @param mintTxCount the number of transactions which minted some of the asset
   * @param tokenRegistryMetadata the token registry metadata information
   * @param totalSupply the total amount of the asset in existence currently
   * @param uniqueHolders the number of unique holders of this asset
   */
  public AssetInfo(String assetName, String assetNameAscii, AssetStandards assetStandards,
                   Long burnTxCount, String fingerprint, MintTransaction firstMintTx,
                   MintTransaction latestMintTx, JsonNode latestMintTxMetadata, Long mintTxCount,
                   JsonNode tokenRegistryMetadata, String totalSupply, Holders uniqueHolders) {
    this.assetName = assetName;
    this.assetNameAscii = assetNameAscii;
    this.assetStandards = assetStandards;
    this.burnTxCount = burnTxCount;
    this.fingerprint = fingerprint;
    this.firstMintTx = firstMintTx;
    this.latestMintTx = latestMintTx;
    this.latestMintTxMetadata = latestMintTxMetadata;
    this.mintTxCount = mintTxCount;
    this.tokenRegistryMetadata = tokenRegistryMetadata;
    this.totalSupply = totalSupply;
    this.uniqueHolders = uniqueHolders;
  }

  /**
   * Gets the hex encoding of the asset name
   *
   * @return the hex encoding of the asset name
   */
  public String getAssetName() {
    return assetName;
  }

  /**
   * Sets the hex encoding of the asset name
   *
   * @param assetName the hex encoding of the asset name
   */
  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  /**
   * Gets the ASCII representation of the asset name
   *
   * @return the ASCII representation of the asset name
   */
  public String getAssetNameAscii() {
    return assetNameAscii;
  }

  /**
   * Sets the ASCII representation of the asset name
   *
   * @param assetNameAscii the ASCII representation of the asset name
   */
  public void setAssetNameAscii(String assetNameAscii) {
    this.assetNameAscii = assetNameAscii;
  }

  /**
   * Gets the asset standards compliance information
   *
   * @return the asset standards compliance information
   */
  public AssetStandards getAssetStandards() {
    return assetStandards;
  }

  /**
   * Sets the asset standards compliance information
   *
   * @param assetStandards the asset standards compliance information
   */
  public void setAssetStandards(AssetStandards assetStandards) {
    this.assetStandards = assetStandards;
  }

  /**
   * Gets the number of transactions which burned some of the asset
   *
   * @return the number of transactions which burned some of the asset
   */
  public Long getBurnTxCount() {
    return burnTxCount;
  }

  /**
   * Sets the number of transactions which burned some of the asset
   *
   * @param burnTxCount the number of transactions which burned some of the asset
   */
  public void setBurnTxCount(Long burnTxCount) {
    this.burnTxCount = burnTxCount;
  }

  /**
   * Gets the CIP-14 fingerprint of the asset
   *
   * @return the CIP-14 fingerprint of the asset
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * Sets the CIP-14 fingerprint of the asset
   *
   * @param fingerprint the CIP-14 fingerprint of the asset
   */
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  /**
   * Gets the first transaction that minted this asset
   *
   * @return the first transaction that minted this asset
   */
  public MintTransaction getFirstMintTx() {
    return firstMintTx;
  }

  /**
   * Sets the first transaction that minted this asset
   *
   * @param firstMintTx the first transaction that minted this asset
   */
  public void setFirstMintTx(MintTransaction firstMintTx) {
    this.firstMintTx = firstMintTx;
  }

  /**
   * Gets the latest transaction that minted this asset
   *
   * @return the latest transaction that minted this asset
   */
  public MintTransaction getLatestMintTx() {
    return latestMintTx;
  }

  /**
   * Sets the latest transaction that minted this asset
   *
   * @param latestMintTx the latest transaction that minted this asset
   */
  public void setLatestMintTx(MintTransaction latestMintTx) {
    this.latestMintTx = latestMintTx;
  }

  /**
   * Gets the metadata of the most recent transaction which minted or burned the asset
   *
   * @return the metadata of the most recent transaction which minted or burned the asset
   */
  public JsonNode getLatestMintTxMetadata() {
    return latestMintTxMetadata;
  }

  /**
   * Sets the metadata of the most recent transaction which minted or burned the asset
   *
   * @param latestMintTxMetadata the metadata of the most recent transaction which minted or burned the asset
   */
  public void setLatestMintTxMetadata(JsonNode latestMintTxMetadata) {
    this.latestMintTxMetadata = latestMintTxMetadata;
  }

  /**
   * Gets the number of transactions which minted some of the asset
   *
   * @return the number of transactions which minted some of the asset
   */
  public Long getMintTxCount() {
    return mintTxCount;
  }

  /**
   * Sets the number of transactions which minted some of the asset
   *
   * @param mintTxCount the number of transactions which minted some of the asset
   */
  public void setMintTxCount(Long mintTxCount) {
    this.mintTxCount = mintTxCount;
  }

  /**
   * Gets the token registry metadata information
   *
   * @return the token registry metadata information
   */
  public JsonNode getTokenRegistryMetadata() {
    return tokenRegistryMetadata;
  }

  /**
   * Sets the token registry metadata information
   *
   * @param tokenRegistryMetadata the token registry metadata information
   */
  public void setTokenRegistryMetadata(JsonNode tokenRegistryMetadata) {
    this.tokenRegistryMetadata = tokenRegistryMetadata;
  }

  /**
   * Gets the total amount of the asset in existence currently
   *
   * @return the total amount of the asset in existence currently
   */
  public String getTotalSupply() {
    return totalSupply;
  }

  /**
   * Sets the total amount of the asset in existence currently
   *
   * @param totalSupply the total amount of the asset in existence currently
   */
  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  /**
   * Gets the number of unique holders of this asset
   *
   * @return the number of unique holders of this asset
   */
  public Holders getUniqueHolders() {
    return uniqueHolders;
  }

  /**
   * Sets the number of unique holders of this asset
   *
   * @param uniqueHolders the number of unique holders of this asset
   */
  public void setUniqueHolders(Holders uniqueHolders) {
    this.uniqueHolders = uniqueHolders;
  }

  @Override
  public String toString() {
    return "AssetInfo{" +
        "assetName='" + assetName + '\'' +
        ", assetNameAscii='" + assetNameAscii + '\'' +
        ", assetStandards=" + assetStandards +
        ", burnTxCount=" + burnTxCount +
        ", fingerprint='" + fingerprint + '\'' +
        ", firstMintTx=" + firstMintTx +
        ", latestMintTx=" + latestMintTx +
        ", latestMintTxMetadata=" + latestMintTxMetadata +
        ", mintTxCount=" + mintTxCount +
        ", tokenRegistryMetadata=" + tokenRegistryMetadata +
        ", totalSupply='" + totalSupply + '\'' +
        ", uniqueHolders=" + uniqueHolders +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetInfo assetInfo = (AssetInfo) o;
    return Objects.equals(assetName, assetInfo.assetName) &&
        Objects.equals(assetNameAscii, assetInfo.assetNameAscii) &&
        Objects.equals(assetStandards, assetInfo.assetStandards) &&
        Objects.equals(burnTxCount, assetInfo.burnTxCount) &&
        Objects.equals(fingerprint, assetInfo.fingerprint) &&
        Objects.equals(firstMintTx, assetInfo.firstMintTx) &&
        Objects.equals(latestMintTx, assetInfo.latestMintTx) &&
        Objects.equals(latestMintTxMetadata, assetInfo.latestMintTxMetadata) &&
        Objects.equals(mintTxCount, assetInfo.mintTxCount) &&
        Objects.equals(tokenRegistryMetadata, assetInfo.tokenRegistryMetadata) &&
        Objects.equals(totalSupply, assetInfo.totalSupply) &&
        Objects.equals(uniqueHolders, assetInfo.uniqueHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetName, assetNameAscii, assetStandards, burnTxCount, fingerprint,
        firstMintTx, latestMintTx, latestMintTxMetadata, mintTxCount, tokenRegistryMetadata,
        totalSupply, uniqueHolders);
  }
}