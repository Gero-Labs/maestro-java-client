package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Update to a stake pool.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolUpdate {

  /**
   * Active epoch number.
   */
  private Long activeEpochNo;

  /**
   * UNIX timestamp of the block.
   */
  private Integer blockTime;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private String fixedCost;

  /**
   * Margin of the pool.
   */
  @NotNull
  @Valid
  private String margin;

  /**
   * Hex-encoded metadata hash.
   */
  private String metaHash;

  /**
   * JSON metadata of the pool.
   */
  private JsonNode metaJson;

  /**
   * URL to the metadata.
   */
  private String metaUrl;

  /**
   * List of owner addresses.
   */
  @NotNull
  private List<String> owners;

  /**
   * Pledge of the pool.
   */
  @NotNull
  @Valid
  private String pledge;

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Hex-encoded pool ID.
   */
  @NotNull
  private String poolIdHex;

  /**
   * Status of the pool.
   */
  @NotNull
  private String poolStatus;

  /**
   * List of relays for the pool.
   */
  @NotNull
  @Valid
  private List<@Valid Relay> relays;

  /**
   * Epoch at which the pool is retiring.
   */
  private Long retiringEpoch;

  /**
   * Bech32-encoded reward address.
   */
  @NotNull
  private String rewardAddr;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * VRF key hash.
   */
  @NotNull
  private String vrfKeyHash;

  /**
   * Default constructor.
   */
  public PoolUpdate() {
  }

  /**
   * Constructor with all parameters.
   *
   * @param activeEpochNo  the active epoch number
   * @param blockTime      the UNIX timestamp of the block
   * @param fixedCost      the fixed cost of the pool
   * @param margin         the margin of the pool
   * @param metaHash       the hex-encoded metadata hash
   * @param metaJson       the JSON metadata of the pool
   * @param metaUrl        the URL to the metadata
   * @param owners         the list of owner addresses
   * @param pledge         the pledge of the pool
   * @param poolIdBech32   the Bech32-encoded pool ID
   * @param poolIdHex      the hex-encoded pool ID
   * @param poolStatus     the status of the pool
   * @param relays         the list of relays for the pool
   * @param retiringEpoch  the epoch at which the pool is retiring
   * @param rewardAddr     the Bech32-encoded reward address
   * @param txHash         the transaction hash
   * @param vrfKeyHash     the VRF key hash
   */
  public PoolUpdate(Long activeEpochNo, Integer blockTime, String fixedCost, String margin, String metaHash,
                    JsonNode metaJson, String metaUrl, List<String> owners, String pledge, String poolIdBech32,
                    String poolIdHex, String poolStatus, List<Relay> relays, Long retiringEpoch,
                    String rewardAddr, String txHash, String vrfKeyHash) {
    this.activeEpochNo = activeEpochNo;
    this.blockTime = blockTime;
    this.fixedCost = fixedCost;
    this.margin = margin;
    this.metaHash = metaHash;
    this.metaJson = metaJson;
    this.metaUrl = metaUrl;
    this.owners = owners;
    this.pledge = pledge;
    this.poolIdBech32 = poolIdBech32;
    this.poolIdHex = poolIdHex;
    this.poolStatus = poolStatus;
    this.relays = relays;
    this.retiringEpoch = retiringEpoch;
    this.rewardAddr = rewardAddr;
    this.txHash = txHash;
    this.vrfKeyHash = vrfKeyHash;
  }

  /**
   * Gets the active epoch number.
   *
   * @return the active epoch number
   */
  public Long getActiveEpochNo() {
    return activeEpochNo;
  }

  /**
   * Sets the active epoch number.
   *
   * @param activeEpochNo the active epoch number to set
   */
  public void setActiveEpochNo(Long activeEpochNo) {
    this.activeEpochNo = activeEpochNo;
  }

  /**
   * Gets the UNIX timestamp of the block.
   *
   * @return the UNIX timestamp of the block
   */
  public Integer getBlockTime() {
    return blockTime;
  }

  /**
   * Sets the UNIX timestamp of the block.
   *
   * @param blockTime the UNIX timestamp of the block to set
   */
  public void setBlockTime(Integer blockTime) {
    this.blockTime = blockTime;
  }

  /**
   * Gets the fixed cost of the pool.
   *
   * @return the fixed cost of the pool
   */
  public String getFixedCost() {
    return fixedCost;
  }

  /**
   * Sets the fixed cost of the pool.
   *
   * @param fixedCost the fixed cost of the pool to set
   */
  public void setFixedCost(String fixedCost) {
    this.fixedCost = fixedCost;
  }

  /**
   * Gets the margin of the pool.
   *
   * @return the margin of the pool
   */
  public String getMargin() {
    return margin;
  }

  /**
   * Sets the margin of the pool.
   *
   * @param margin the margin of the pool to set
   */
  public void setMargin(String margin) {
    this.margin = margin;
  }

  /**
   * Gets the hex-encoded metadata hash.
   *
   * @return the hex-encoded metadata hash
   */
  public String getMetaHash() {
    return metaHash;
  }

  /**
   * Sets the hex-encoded metadata hash.
   *
   * @param metaHash the hex-encoded metadata hash to set
   */
  public void setMetaHash(String metaHash) {
    this.metaHash = metaHash;
  }

  /**
   * Gets the JSON metadata of the pool.
   *
   * @return the JSON metadata of the pool
   */
  public JsonNode getMetaJson() {
    return metaJson;
  }

  /**
   * Sets the JSON metadata of the pool.
   *
   * @param metaJson the JSON metadata of the pool to set
   */
  public void setMetaJson(JsonNode metaJson) {
    this.metaJson = metaJson;
  }

  /**
   * Gets the URL to the metadata.
   *
   * @return the URL to the metadata
   */
  public String getMetaUrl() {
    return metaUrl;
  }

  /**
   * Sets the URL to the metadata.
   *
   * @param metaUrl the URL to the metadata to set
   */
  public void setMetaUrl(String metaUrl) {
    this.metaUrl = metaUrl;
  }

  /**
   * Gets the list of owner addresses.
   *
   * @return the list of owner addresses
   */
  public List<String> getOwners() {
    return owners;
  }

  /**
   * Sets the list of owner addresses.
   *
   * @param owners the list of owner addresses to set
   */
  public void setOwners(List<String> owners) {
    this.owners = owners;
  }

  /**
   * Gets the pledge of the pool.
   *
   * @return the pledge of the pool
   */
  public String getPledge() {
    return pledge;
  }

  /**
   * Sets the pledge of the pool.
   *
   * @param pledge the pledge of the pool to set
   */
  public void setPledge(String pledge) {
    this.pledge = pledge;
  }

  /**
   * Gets the Bech32-encoded pool ID.
   *
   * @return the Bech32-encoded pool ID
   */
  public String getPoolIdBech32() {
    return poolIdBech32;
  }

  /**
   * Sets the Bech32-encoded pool ID.
   *
   * @param poolIdBech32 the Bech32-encoded pool ID to set
   */
  public void setPoolIdBech32(String poolIdBech32) {
    this.poolIdBech32 = poolIdBech32;
  }

  /**
   * Gets the hex-encoded pool ID.
   *
   * @return the hex-encoded pool ID
   */
  public String getPoolIdHex() {
    return poolIdHex;
  }

  /**
   * Sets the hex-encoded pool ID.
   *
   * @param poolIdHex the hex-encoded pool ID to set
   */
  public void setPoolIdHex(String poolIdHex) {
    this.poolIdHex = poolIdHex;
  }

  /**
   * Gets the status of the pool.
   *
   * @return the status of the pool
   */
  public String getPoolStatus() {
    return poolStatus;
  }

  /**
   * Sets the status of the pool.
   *
   * @param poolStatus the status of the pool to set
   */
  public void setPoolStatus(String poolStatus) {
    this.poolStatus = poolStatus;
  }

  /**
   * Gets the list of relays for the pool.
   *
   * @return the list of relays for the pool
   */
  public List<Relay> getRelays() {
    return relays;
  }

  /**
   * Sets the list of relays for the pool.
   *
   * @param relays the list of relays for the pool to set
   */
  public void setRelays(List<Relay> relays) {
    this.relays = relays;
  }

  /**
   * Gets the epoch at which the pool is retiring.
   *
   * @return the epoch at which the pool is retiring
   */
  public Long getRetiringEpoch() {
    return retiringEpoch;
  }

  /**
   * Sets the epoch at which the pool is retiring.
   *
   * @param retiringEpoch the epoch at which the pool is retiring to set
   */
  public void setRetiringEpoch(Long retiringEpoch) {
    this.retiringEpoch = retiringEpoch;
  }

  /**
   * Gets the Bech32-encoded reward address.
   *
   * @return the Bech32-encoded reward address
   */
  public String getRewardAddr() {
    return rewardAddr;
  }

  /**
   * Sets the Bech32-encoded reward address.
   *
   * @param rewardAddr the Bech32-encoded reward address to set
   */
  public void setRewardAddr(String rewardAddr) {
    this.rewardAddr = rewardAddr;
  }

  /**
   * Gets the transaction hash.
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash.
   *
   * @param txHash the transaction hash to set
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
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

  /**
   * Returns a string representation of this object.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "PoolUpdate{" +
        "activeEpochNo=" + activeEpochNo +
        ", blockTime=" + blockTime +
        ", fixedCost='" + fixedCost + '\'' +
        ", margin='" + margin + '\'' +
        ", metaHash='" + metaHash + '\'' +
        ", metaJson=" + metaJson +
        ", metaUrl='" + metaUrl + '\'' +
        ", owners=" + owners +
        ", pledge='" + pledge + '\'' +
        ", poolIdBech32='" + poolIdBech32 + '\'' +
        ", poolIdHex='" + poolIdHex + '\'' +
        ", poolStatus='" + poolStatus + '\'' +
        ", relays=" + relays +
        ", retiringEpoch=" + retiringEpoch +
        ", rewardAddr='" + rewardAddr + '\'' +
        ", txHash='" + txHash + '\'' +
        ", vrfKeyHash='" + vrfKeyHash + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PoolUpdate that = (PoolUpdate) o;
    return Objects.equals(activeEpochNo, that.activeEpochNo) &&
        Objects.equals(blockTime, that.blockTime) &&
        Objects.equals(fixedCost, that.fixedCost) &&
        Objects.equals(margin, that.margin) &&
        Objects.equals(metaHash, that.metaHash) &&
        Objects.equals(metaJson, that.metaJson) &&
        Objects.equals(metaUrl, that.metaUrl) &&
        Objects.equals(owners, that.owners) &&
        Objects.equals(pledge, that.pledge) &&
        Objects.equals(poolIdBech32, that.poolIdBech32) &&
        Objects.equals(poolIdHex, that.poolIdHex) &&
        Objects.equals(poolStatus, that.poolStatus) &&
        Objects.equals(relays, that.relays) &&
        Objects.equals(retiringEpoch, that.retiringEpoch) &&
        Objects.equals(rewardAddr, that.rewardAddr) &&
        Objects.equals(txHash, that.txHash) &&
        Objects.equals(vrfKeyHash, that.vrfKeyHash);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(activeEpochNo, blockTime, fixedCost, margin, metaHash, metaJson, metaUrl,
        owners, pledge, poolIdBech32, poolIdHex, poolStatus, relays, retiringEpoch, rewardAddr,
        txHash, vrfKeyHash);
  }

}
