package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Information about a specific Cardano native-asset
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInfoOld {

    /**
     * Hex encoding of the asset name
     */
    @NotNull
    private String assetName;

    /**
     * ASCII representation of the asset name
     */
    private String assetNameAscii;

    /**
     * Asset standards information
     */
    @NotNull
    @Valid
    private AssetStandards assetStandards;

    /**
     * Number of transactions which burned some of the asset
     */
    @NotNull
    private Long burnTxCount;

    /**
     * CIP-14 fingerprint of the asset
     */
    @NotNull
    private String fingerprint;

    /**
     * Time of the first transaction which minted some of a specific asset
     */
    @NotNull
    private Integer firstMintTime;

    /**
     * First transaction which minted some of a specific asset
     */
    @NotNull
    private String firstMintTx;

    /**
     * Metadata of the most recent transaction which minted the asset
     */
    @NotNull
    private JsonNode latestMintTxMetadata;

    /**
     * Number of transactions which minted some of the asset
     */
    @NotNull
    private Long mintTxCount;

    /**
     * Token registry metadata
     */
    @Valid
    private TokenRegistryMetadata tokenRegistryMetadata;

    /**
     * Total amount of the asset in existence currently
     */
    @NotNull
    @Min(0L)
    private Long totalSupply;

    /**
     * No-args constructor for AssetInfoOld.
     */
    public AssetInfoOld() {
    }

    /**
     * All-args constructor for AssetInfoOld.
     *
     * @param assetName               Hex encoding of the asset name
     * @param assetNameAscii          ASCII representation of the asset name
     * @param assetStandards          Asset standards information
     * @param burnTxCount             Number of transactions which burned some of the asset
     * @param fingerprint             CIP-14 fingerprint of the asset
     * @param firstMintTime           Time of the first transaction which minted some of a specific asset
     * @param firstMintTx             First transaction which minted some of a specific asset
     * @param latestMintTxMetadata    Metadata of the most recent transaction which minted the asset
     * @param mintTxCount             Number of transactions which minted some of the asset
     * @param tokenRegistryMetadata   Token registry metadata
     * @param totalSupply             Total amount of the asset in existence currently
     */
    public AssetInfoOld(String assetName, String assetNameAscii, AssetStandards assetStandards, Long burnTxCount, String fingerprint, Integer firstMintTime, String firstMintTx, JsonNode latestMintTxMetadata, Long mintTxCount, TokenRegistryMetadata tokenRegistryMetadata, Long totalSupply) {
        this.assetName = assetName;
        this.assetNameAscii = assetNameAscii;
        this.assetStandards = assetStandards;
        this.burnTxCount = burnTxCount;
        this.fingerprint = fingerprint;
        this.firstMintTime = firstMintTime;
        this.firstMintTx = firstMintTx;
        this.latestMintTxMetadata = latestMintTxMetadata;
        this.mintTxCount = mintTxCount;
        this.tokenRegistryMetadata = tokenRegistryMetadata;
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
     * Gets the asset standards information.
     *
     * @return the assetStandards
     */
    public AssetStandards getAssetStandards() {
        return assetStandards;
    }

    /**
     * Sets the asset standards information.
     *
     * @param assetStandards the assetStandards to set
     */
    public void setAssetStandards(AssetStandards assetStandards) {
        this.assetStandards = assetStandards;
    }

    /**
     * Gets the number of transactions which burned some of the asset.
     *
     * @return the burnTxCount
     */
    public Long getBurnTxCount() {
        return burnTxCount;
    }

    /**
     * Sets the number of transactions which burned some of the asset.
     *
     * @param burnTxCount the burnTxCount to set
     */
    public void setBurnTxCount(Long burnTxCount) {
        this.burnTxCount = burnTxCount;
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
     * Gets the time of the first transaction which minted some of a specific asset.
     *
     * @return the firstMintTime
     */
    public Integer getFirstMintTime() {
        return firstMintTime;
    }

    /**
     * Sets the time of the first transaction which minted some of a specific asset.
     *
     * @param firstMintTime the firstMintTime to set
     */
    public void setFirstMintTime(Integer firstMintTime) {
        this.firstMintTime = firstMintTime;
    }

    /**
     * Gets the first transaction which minted some of a specific asset.
     *
     * @return the firstMintTx
     */
    public String getFirstMintTx() {
        return firstMintTx;
    }

    /**
     * Sets the first transaction which minted some of a specific asset.
     *
     * @param firstMintTx the firstMintTx to set
     */
    public void setFirstMintTx(String firstMintTx) {
        this.firstMintTx = firstMintTx;
    }

    /**
     * Gets the metadata of the most recent transaction which minted the asset.
     *
     * @return the latestMintTxMetadata
     */
    public JsonNode getLatestMintTxMetadata() {
        return latestMintTxMetadata;
    }

    /**
     * Sets the metadata of the most recent transaction which minted the asset.
     *
     * @param latestMintTxMetadata the latestMintTxMetadata to set
     */
    public void setLatestMintTxMetadata(JsonNode latestMintTxMetadata) {
        this.latestMintTxMetadata = latestMintTxMetadata;
    }

    /**
     * Gets the number of transactions which minted some of the asset.
     *
     * @return the mintTxCount
     */
    public Long getMintTxCount() {
        return mintTxCount;
    }

    /**
     * Sets the number of transactions which minted some of the asset.
     *
     * @param mintTxCount the mintTxCount to set
     */
    public void setMintTxCount(Long mintTxCount) {
        this.mintTxCount = mintTxCount;
    }

    /**
     * Gets the token registry metadata.
     *
     * @return the tokenRegistryMetadata
     */
    public TokenRegistryMetadata getTokenRegistryMetadata() {
        return tokenRegistryMetadata;
    }

    /**
     * Sets the token registry metadata.
     *
     * @param tokenRegistryMetadata the tokenRegistryMetadata to set
     */
    public void setTokenRegistryMetadata(TokenRegistryMetadata tokenRegistryMetadata) {
        this.tokenRegistryMetadata = tokenRegistryMetadata;
    }

    /**
     * Gets the total amount of the asset in existence currently.
     *
     * @return the totalSupply
     */
    public Long getTotalSupply() {
        return totalSupply;
    }

    /**
     * Sets the total amount of the asset in existence currently.
     *
     * @param totalSupply the totalSupply to set
     */
    public void setTotalSupply(Long totalSupply) {
        this.totalSupply = totalSupply;
    }

    @Override
    public String toString() {
        return "AssetInfoOld{" +
            "assetName='" + assetName + '\'' +
            ", assetNameAscii='" + assetNameAscii + '\'' +
            ", assetStandards=" + assetStandards +
            ", burnTxCount=" + burnTxCount +
            ", fingerprint='" + fingerprint + '\'' +
            ", firstMintTime=" + firstMintTime +
            ", firstMintTx='" + firstMintTx + '\'' +
            ", latestMintTxMetadata=" + latestMintTxMetadata +
            ", mintTxCount=" + mintTxCount +
            ", tokenRegistryMetadata=" + tokenRegistryMetadata +
            ", totalSupply=" + totalSupply +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssetInfoOld that = (AssetInfoOld) o;
        return Objects.equals(assetName, that.assetName) && Objects.equals(assetNameAscii, that.assetNameAscii) && Objects.equals(assetStandards, that.assetStandards) && Objects.equals(burnTxCount, that.burnTxCount) && Objects.equals(fingerprint, that.fingerprint) && Objects.equals(firstMintTime, that.firstMintTime) && Objects.equals(firstMintTx, that.firstMintTx) && Objects.equals(latestMintTxMetadata, that.latestMintTxMetadata) && Objects.equals(mintTxCount, that.mintTxCount) && Objects.equals(tokenRegistryMetadata, that.tokenRegistryMetadata) && Objects.equals(totalSupply, that.totalSupply);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetName, assetNameAscii, assetStandards, burnTxCount, fingerprint, firstMintTime, firstMintTx, latestMintTxMetadata, mintTxCount, tokenRegistryMetadata, totalSupply);
    }
}