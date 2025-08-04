package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.NumOrString;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificate for registering or updating a stake pool.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolRegCert {

  /**
   * No-argument constructor.
   */
  public PoolRegCert() {
  }

  /**
   * All-argument constructor.
   *
   * @param certIndex index of the certificate
   * @param fixedCost fixed cost of the pool
   * @param fromEpoch epoch from which the pool is registered
   * @param margin margin of the pool
   * @param metadataHash hex-encoded metadata hash
   * @param metadataUrl URL to the metadata
   * @param ownerAddresses list of owner addresses
   * @param pledge pledge of the pool
   * @param poolId Bech32-encoded pool ID
   * @param relays list of relays for the pool
   * @param rewardAddress Bech32-encoded reward address
   * @param vrfKeyHash VRF key hash
   */
  public PoolRegCert(Long certIndex, NumOrString fixedCost, Long fromEpoch, NumOrString margin, String metadataHash, String metadataUrl, List<String> ownerAddresses, NumOrString pledge, String poolId, List<@Valid Relay> relays, String rewardAddress, String vrfKeyHash) {
    this.certIndex = certIndex;
    this.fixedCost = fixedCost;
    this.fromEpoch = fromEpoch;
    this.margin = margin;
    this.metadataHash = metadataHash;
    this.metadataUrl = metadataUrl;
    this.ownerAddresses = ownerAddresses;
    this.pledge = pledge;
    this.poolId = poolId;
    this.relays = relays;
    this.rewardAddress = rewardAddress;
    this.vrfKeyHash = vrfKeyHash;
  }

  /**
   * Index of the certificate.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private NumOrString fixedCost;

  /**
   * Epoch from which the pool is registered.
   */
  @NotNull
  @Min(0L)
  private Long fromEpoch;

  /**
   * Margin of the pool.
   */
  @NotNull
  @Valid
  private NumOrString margin;

  /**
   * Hex-encoded metadata hash.
   */
  private String metadataHash;

  /**
   * URL to the metadata.
   */
  private String metadataUrl;

  /**
   * List of owner addresses.
   */
  @NotNull
  private List<String> ownerAddresses;

  /**
   * Pledge of the pool.
   */
  @NotNull
  @Valid
  private NumOrString pledge;

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolId;

  /**
   * List of relays for the pool.
   */
  @NotNull
  @Valid
  private List<@Valid Relay> relays;

  /**
   * Bech32-encoded reward address.
   */
  @NotNull
  private String rewardAddress;

  /**
   * VRF key hash.
   */
  @NotNull
  private String vrfKeyHash;

  /**
   * Gets the index of the certificate.
   *
   * @return the index of the certificate
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate.
   *
   * @param certIndex the index of the certificate to set
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the fixed cost of the pool.
   *
   * @return the fixed cost of the pool
   */
  public NumOrString getFixedCost() {
    return fixedCost;
  }

  /**
   * Sets the fixed cost of the pool.
   *
   * @param fixedCost the fixed cost of the pool to set
   */
  public void setFixedCost(NumOrString fixedCost) {
    this.fixedCost = fixedCost;
  }

  /**
   * Gets the epoch from which the pool is registered.
   *
   * @return the epoch from which the pool is registered
   */
  public Long getFromEpoch() {
    return fromEpoch;
  }

  /**
   * Sets the epoch from which the pool is registered.
   *
   * @param fromEpoch the epoch from which the pool is registered to set
   */
  public void setFromEpoch(Long fromEpoch) {
    this.fromEpoch = fromEpoch;
  }

  /**
   * Gets the margin of the pool.
   *
   * @return the margin of the pool
   */
  public NumOrString getMargin() {
    return margin;
  }

  /**
   * Sets the margin of the pool.
   *
   * @param margin the margin of the pool to set
   */
  public void setMargin(NumOrString margin) {
    this.margin = margin;
  }

  /**
   * Gets the hex-encoded metadata hash.
   *
   * @return the hex-encoded metadata hash
   */
  public String getMetadataHash() {
    return metadataHash;
  }

  /**
   * Sets the hex-encoded metadata hash.
   *
   * @param metadataHash the hex-encoded metadata hash to set
   */
  public void setMetadataHash(String metadataHash) {
    this.metadataHash = metadataHash;
  }

  /**
   * Gets the URL to the metadata.
   *
   * @return the URL to the metadata
   */
  public String getMetadataUrl() {
    return metadataUrl;
  }

  /**
   * Sets the URL to the metadata.
   *
   * @param metadataUrl the URL to the metadata to set
   */
  public void setMetadataUrl(String metadataUrl) {
    this.metadataUrl = metadataUrl;
  }

  /**
   * Gets the list of owner addresses.
   *
   * @return the list of owner addresses
   */
  public List<String> getOwnerAddresses() {
    return ownerAddresses;
  }

  /**
   * Sets the list of owner addresses.
   *
   * @param ownerAddresses the list of owner addresses to set
   */
  public void setOwnerAddresses(List<String> ownerAddresses) {
    this.ownerAddresses = ownerAddresses;
  }

  /**
   * Gets the pledge of the pool.
   *
   * @return the pledge of the pool
   */
  public NumOrString getPledge() {
    return pledge;
  }

  /**
   * Sets the pledge of the pool.
   *
   * @param pledge the pledge of the pool to set
   */
  public void setPledge(NumOrString pledge) {
    this.pledge = pledge;
  }

  /**
   * Gets the Bech32-encoded pool ID.
   *
   * @return the Bech32-encoded pool ID
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the Bech32-encoded pool ID.
   *
   * @param poolId the Bech32-encoded pool ID to set
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   * Gets the list of relays for the pool.
   *
   * @return the list of relays for the pool
   */
  public List<@Valid Relay> getRelays() {
    return relays;
  }

  /**
   * Sets the list of relays for the pool.
   *
   * @param relays the list of relays for the pool to set
   */
  public void setRelays(List<@Valid Relay> relays) {
    this.relays = relays;
  }

  /**
   * Gets the Bech32-encoded reward address.
   *
   * @return the Bech32-encoded reward address
   */
  public String getRewardAddress() {
    return rewardAddress;
  }

  /**
   * Sets the Bech32-encoded reward address.
   *
   * @param rewardAddress the Bech32-encoded reward address to set
   */
  public void setRewardAddress(String rewardAddress) {
    this.rewardAddress = rewardAddress;
  }

  /**
   * Gets the VRF key hash.
   *
   * @return the VRF key hash
   */
  public String getVrfKeyHash() {
    return vrfKeyHash;
  }

  /**
   * Sets the VRF key hash.
   *
   * @param vrfKeyHash the VRF key hash to set
   */
  public void setVrfKeyHash(String vrfKeyHash) {
    this.vrfKeyHash = vrfKeyHash;
  }

  @Override
  public String toString() {
    return "PoolRegCert{" +
        "certIndex=" + certIndex +
        ", fixedCost=" + fixedCost +
        ", fromEpoch=" + fromEpoch +
        ", margin=" + margin +
        ", metadataHash='" + metadataHash + '\'' +
        ", metadataUrl='" + metadataUrl + '\'' +
        ", ownerAddresses=" + ownerAddresses +
        ", pledge=" + pledge +
        ", poolId='" + poolId + '\'' +
        ", relays=" + relays +
        ", rewardAddress='" + rewardAddress + '\'' +
        ", vrfKeyHash='" + vrfKeyHash + '\'' +
        '}';
  }
}
