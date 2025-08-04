package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Asset
 *
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Asset {

    /**
     * Asset Policy ID (hex)
     */
    private String policyId;

    /**
     * Asset Name (hex) (hex for policy + assetname)
     */
    private String assetName;

    /**
     * The CIP14 fingerprint of the asset
     */
    private String fingerprint;

    /**
     * Asset decimals
     */
    private Integer decimals;

    /**
     * Sum of assets for output UTxO
     */
    private String quantity;

    /**
     * Default no-argument constructor.
     */
    public Asset() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param policyId the asset policy ID (hex)
     * @param assetName the asset name (hex)
     * @param fingerprint the CIP14 fingerprint of the asset
     * @param decimals the asset decimals
     * @param quantity the sum of assets for output UTxO
     */
    public Asset(String policyId, String assetName, String fingerprint, Integer decimals, String quantity) {
        this.policyId = policyId;
        this.assetName = assetName;
        this.fingerprint = fingerprint;
        this.decimals = decimals;
        this.quantity = quantity;
    }

    /**
     * Gets the asset policy ID.
     * 
     * @return the asset policy ID (hex)
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * Sets the asset policy ID.
     * 
     * @param policyId the asset policy ID (hex) to set
     */
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * Gets the asset name.
     * 
     * @return the asset name (hex)
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Sets the asset name.
     * 
     * @param assetName the asset name (hex) to set
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * Gets the CIP14 fingerprint of the asset.
     * 
     * @return the CIP14 fingerprint of the asset
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * Sets the CIP14 fingerprint of the asset.
     * 
     * @param fingerprint the CIP14 fingerprint of the asset to set
     */
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * Gets the asset decimals.
     * 
     * @return the asset decimals
     */
    public Integer getDecimals() {
        return decimals;
    }

    /**
     * Sets the asset decimals.
     * 
     * @param decimals the asset decimals to set
     */
    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }

    /**
     * Gets the sum of assets for output UTxO.
     * 
     * @return the sum of assets for output UTxO
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the sum of assets for output UTxO.
     * 
     * @param quantity the sum of assets for output UTxO to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "policyId='" + policyId + '\'' +
                ", assetName='" + assetName + '\'' +
                ", fingerprint='" + fingerprint + '\'' +
                ", decimals=" + decimals +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
