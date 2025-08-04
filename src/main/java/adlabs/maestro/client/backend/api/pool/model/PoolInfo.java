package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Information summary of a stake pool.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolInfo {

  /**
   * Epoch at which the pool is active.
   */
  @NotNull
  @Min(0L)
  private Long activeEpochNo;

  /**
   * Active stake in the pool.
   */
  @NotNull
  @Valid
  private String activeStake;

  /**
   * Number of blocks produced by the pool.
   */
  @Min(0L)
  private Long blockCount;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private String fixedCost;

  /**
   * Number of live delegators.
   */
  @NotNull
  private Long liveDelegators;

  /**
   * Live pledge of the pool.
   */
  @NotNull
  @Valid
  private String livePledge;

  /**
   * Live saturation percentage of the pool.
   */
  private String liveSaturation;

  /**
   * Live total stake in the pool.
   */
  @NotNull
  @Valid
  private String liveStake;

  /**
   * Live total stake percentage in the pool.
   */
  @NotNull
  private String liveStakePct;

  /**
   * Margin percentage for the pool.
   */
  @NotNull
  @Valid
  private String margin;

  /**
   * Metadata hash.
   */
  private String metaHash;

  /**
   * Metadata JSON.
   */
  private JsonNode metaJson;

  /**
   * Metadata URL.
   */
  private String metaUrl;

  /**
   * Operational certificate counter.
   */
  @NotNull
  @Min(0L)
  private Long opCertCounter;

  /**
   * Owner addresses.
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
   * Bech32 encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Hex encoded pool ID.
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
   * Epoch when the pool is retiring.
   */
  private Long retiringEpoch;

  /**
   * Bech32 encoded reward address.
   */
  @NotNull
  private String rewardAddr;

  /**
   * Sigma value.
   */
  @NotNull
  private String sigma;

  /**
   * VRF key hash.
   */
  @NotNull
  private String vrfKeyHash;

  /**
   * Default constructor.
   */
  public PoolInfo() {
  }

  /**
   * Constructor with all parameters.
   *
   * @param activeEpochNo    the epoch at which the pool is active
   * @param activeStake      the active stake in the pool
   * @param blockCount       the number of blocks produced by the pool
   * @param fixedCost        the fixed cost of the pool
   * @param liveDelegators   the number of live delegators
   * @param livePledge       the live pledge of the pool
   * @param liveSaturation   the live saturation percentage of the pool
   * @param liveStake        the live total stake in the pool
   * @param liveStakePct     the live total stake percentage in the pool
   * @param margin           the margin percentage for the pool
   * @param metaHash         the metadata hash
   * @param metaJson         the metadata JSON
   * @param metaUrl          the metadata URL
   * @param opCertCounter    the operational certificate counter
   * @param owners           the owner addresses
   * @param pledge           the pledge of the pool
   * @param poolIdBech32     the Bech32 encoded pool ID
   * @param poolIdHex        the hex encoded pool ID
   * @param poolStatus       the status of the pool
   * @param relays           the list of relays for the pool
   * @param retiringEpoch    the epoch when the pool is retiring
   * @param rewardAddr       the Bech32 encoded reward address
   * @param sigma            the sigma value
   * @param vrfKeyHash       the VRF key hash
   */
  public PoolInfo(Long activeEpochNo, String activeStake, Long blockCount, String fixedCost, Long liveDelegators,
                  String livePledge, String liveSaturation, String liveStake, String liveStakePct, String margin,
                  String metaHash, JsonNode metaJson, String metaUrl, Long opCertCounter, List<String> owners,
                  String pledge, String poolIdBech32, String poolIdHex, String poolStatus, List<Relay> relays,
                  Long retiringEpoch, String rewardAddr, String sigma, String vrfKeyHash) {
    this.activeEpochNo = activeEpochNo;
    this.activeStake = activeStake;
    this.blockCount = blockCount;
    this.fixedCost = fixedCost;
    this.liveDelegators = liveDelegators;
    this.livePledge = livePledge;
    this.liveSaturation = liveSaturation;
    this.liveStake = liveStake;
    this.liveStakePct = liveStakePct;
    this.margin = margin;
    this.metaHash = metaHash;
    this.metaJson = metaJson;
    this.metaUrl = metaUrl;
    this.opCertCounter = opCertCounter;
    this.owners = owners;
    this.pledge = pledge;
    this.poolIdBech32 = poolIdBech32;
    this.poolIdHex = poolIdHex;
    this.poolStatus = poolStatus;
    this.relays = relays;
    this.retiringEpoch = retiringEpoch;
    this.rewardAddr = rewardAddr;
    this.sigma = sigma;
    this.vrfKeyHash = vrfKeyHash;
  }

  /**
   * Gets the epoch at which the pool is active.
   *
   * @return the epoch at which the pool is active
   */
  public Long getActiveEpochNo() {
    return activeEpochNo;
  }

  /**
   * Sets the epoch at which the pool is active.
   *
   * @param activeEpochNo the epoch at which the pool is active to set
   */
  public void setActiveEpochNo(Long activeEpochNo) {
    this.activeEpochNo = activeEpochNo;
  }

  /**
   * Gets the active stake in the pool.
   *
   * @return the active stake in the pool
   */
  public String getActiveStake() {
    return activeStake;
  }

  /**
   * Sets the active stake in the pool.
   *
   * @param activeStake the active stake in the pool to set
   */
  public void setActiveStake(String activeStake) {
    this.activeStake = activeStake;
  }

  /**
   * Gets the number of blocks produced by the pool.
   *
   * @return the number of blocks produced by the pool
   */
  public Long getBlockCount() {
    return blockCount;
  }

  /**
   * Sets the number of blocks produced by the pool.
   *
   * @param blockCount the number of blocks produced by the pool to set
   */
  public void setBlockCount(Long blockCount) {
    this.blockCount = blockCount;
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
   * Gets the number of live delegators.
   *
   * @return the number of live delegators
   */
  public Long getLiveDelegators() {
    return liveDelegators;
  }

  /**
   * Sets the number of live delegators.
   *
   * @param liveDelegators the number of live delegators to set
   */
  public void setLiveDelegators(Long liveDelegators) {
    this.liveDelegators = liveDelegators;
  }

  /**
   * Gets the live pledge of the pool.
   *
   * @return the live pledge of the pool
   */
  public String getLivePledge() {
    return livePledge;
  }

  /**
   * Sets the live pledge of the pool.
   *
   * @param livePledge the live pledge of the pool to set
   */
  public void setLivePledge(String livePledge) {
    this.livePledge = livePledge;
  }

  /**
   * Gets the live saturation percentage of the pool.
   *
   * @return the live saturation percentage of the pool
   */
  public String getLiveSaturation() {
    return liveSaturation;
  }

  /**
   * Sets the live saturation percentage of the pool.
   *
   * @param liveSaturation the live saturation percentage of the pool to set
   */
  public void setLiveSaturation(String liveSaturation) {
    this.liveSaturation = liveSaturation;
  }

  /**
   * Gets the live total stake in the pool.
   *
   * @return the live total stake in the pool
   */
  public String getLiveStake() {
    return liveStake;
  }

  /**
   * Sets the live total stake in the pool.
   *
   * @param liveStake the live total stake in the pool to set
   */
  public void setLiveStake(String liveStake) {
    this.liveStake = liveStake;
  }

  /**
   * Gets the live total stake percentage in the pool.
   *
   * @return the live total stake percentage in the pool
   */
  public String getLiveStakePct() {
    return liveStakePct;
  }

  /**
   * Sets the live total stake percentage in the pool.
   *
   * @param liveStakePct the live total stake percentage in the pool to set
   */
  public void setLiveStakePct(String liveStakePct) {
    this.liveStakePct = liveStakePct;
  }

  /**
   * Gets the margin percentage for the pool.
   *
   * @return the margin percentage for the pool
   */
  public String getMargin() {
    return margin;
  }

  /**
   * Sets the margin percentage for the pool.
   *
   * @param margin the margin percentage for the pool to set
   */
  public void setMargin(String margin) {
    this.margin = margin;
  }

  /**
   * Gets the metadata hash.
   *
   * @return the metadata hash
   */
  public String getMetaHash() {
    return metaHash;
  }

  /**
   * Sets the metadata hash.
   *
   * @param metaHash the metadata hash to set
   */
  public void setMetaHash(String metaHash) {
    this.metaHash = metaHash;
  }

  /**
   * Gets the metadata JSON.
   *
   * @return the metadata JSON
   */
  public JsonNode getMetaJson() {
    return metaJson;
  }

  /**
   * Sets the metadata JSON.
   *
   * @param metaJson the metadata JSON to set
   */
  public void setMetaJson(JsonNode metaJson) {
    this.metaJson = metaJson;
  }

  /**
   * Gets the metadata URL.
   *
   * @return the metadata URL
   */
  public String getMetaUrl() {
    return metaUrl;
  }

  /**
   * Sets the metadata URL.
   *
   * @param metaUrl the metadata URL to set
   */
  public void setMetaUrl(String metaUrl) {
    this.metaUrl = metaUrl;
  }

  /**
   * Gets the operational certificate counter.
   *
   * @return the operational certificate counter
   */
  public Long getOpCertCounter() {
    return opCertCounter;
  }

  /**
   * Sets the operational certificate counter.
   *
   * @param opCertCounter the operational certificate counter to set
   */
  public void setOpCertCounter(Long opCertCounter) {
    this.opCertCounter = opCertCounter;
  }

  /**
   * Gets the owner addresses.
   *
   * @return the owner addresses
   */
  public List<String> getOwners() {
    return owners;
  }

  /**
   * Sets the owner addresses.
   *
   * @param owners the owner addresses to set
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
   * Gets the Bech32 encoded pool ID.
   *
   * @return the Bech32 encoded pool ID
   */
  public String getPoolIdBech32() {
    return poolIdBech32;
  }

  /**
   * Sets the Bech32 encoded pool ID.
   *
   * @param poolIdBech32 the Bech32 encoded pool ID to set
   */
  public void setPoolIdBech32(String poolIdBech32) {
    this.poolIdBech32 = poolIdBech32;
  }

  /**
   * Gets the hex encoded pool ID.
   *
   * @return the hex encoded pool ID
   */
  public String getPoolIdHex() {
    return poolIdHex;
  }

  /**
   * Sets the hex encoded pool ID.
   *
   * @param poolIdHex the hex encoded pool ID to set
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
   * Gets the epoch when the pool is retiring.
   *
   * @return the epoch when the pool is retiring
   */
  public Long getRetiringEpoch() {
    return retiringEpoch;
  }

  /**
   * Sets the epoch when the pool is retiring.
   *
   * @param retiringEpoch the epoch when the pool is retiring to set
   */
  public void setRetiringEpoch(Long retiringEpoch) {
    this.retiringEpoch = retiringEpoch;
  }

  /**
   * Gets the Bech32 encoded reward address.
   *
   * @return the Bech32 encoded reward address
   */
  public String getRewardAddr() {
    return rewardAddr;
  }

  /**
   * Sets the Bech32 encoded reward address.
   *
   * @param rewardAddr the Bech32 encoded reward address to set
   */
  public void setRewardAddr(String rewardAddr) {
    this.rewardAddr = rewardAddr;
  }

  /**
   * Gets the sigma value.
   *
   * @return the sigma value
   */
  public String getSigma() {
    return sigma;
  }

  /**
   * Sets the sigma value.
   *
   * @param sigma the sigma value to set
   */
  public void setSigma(String sigma) {
    this.sigma = sigma;
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
    return "PoolInfo{" +
        "activeEpochNo=" + activeEpochNo +
        ", activeStake='" + activeStake + '\'' +
        ", blockCount=" + blockCount +
        ", fixedCost='" + fixedCost + '\'' +
        ", liveDelegators=" + liveDelegators +
        ", livePledge='" + livePledge + '\'' +
        ", liveSaturation='" + liveSaturation + '\'' +
        ", liveStake='" + liveStake + '\'' +
        ", liveStakePct='" + liveStakePct + '\'' +
        ", margin='" + margin + '\'' +
        ", metaHash='" + metaHash + '\'' +
        ", metaJson=" + metaJson +
        ", metaUrl='" + metaUrl + '\'' +
        ", opCertCounter=" + opCertCounter +
        ", owners=" + owners +
        ", pledge='" + pledge + '\'' +
        ", poolIdBech32='" + poolIdBech32 + '\'' +
        ", poolIdHex='" + poolIdHex + '\'' +
        ", poolStatus='" + poolStatus + '\'' +
        ", relays=" + relays +
        ", retiringEpoch=" + retiringEpoch +
        ", rewardAddr='" + rewardAddr + '\'' +
        ", sigma='" + sigma + '\'' +
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
    PoolInfo poolInfo = (PoolInfo) o;
    return Objects.equals(activeEpochNo, poolInfo.activeEpochNo) &&
        Objects.equals(activeStake, poolInfo.activeStake) &&
        Objects.equals(blockCount, poolInfo.blockCount) &&
        Objects.equals(fixedCost, poolInfo.fixedCost) &&
        Objects.equals(liveDelegators, poolInfo.liveDelegators) &&
        Objects.equals(livePledge, poolInfo.livePledge) &&
        Objects.equals(liveSaturation, poolInfo.liveSaturation) &&
        Objects.equals(liveStake, poolInfo.liveStake) &&
        Objects.equals(liveStakePct, poolInfo.liveStakePct) &&
        Objects.equals(margin, poolInfo.margin) &&
        Objects.equals(metaHash, poolInfo.metaHash) &&
        Objects.equals(metaJson, poolInfo.metaJson) &&
        Objects.equals(metaUrl, poolInfo.metaUrl) &&
        Objects.equals(opCertCounter, poolInfo.opCertCounter) &&
        Objects.equals(owners, poolInfo.owners) &&
        Objects.equals(pledge, poolInfo.pledge) &&
        Objects.equals(poolIdBech32, poolInfo.poolIdBech32) &&
        Objects.equals(poolIdHex, poolInfo.poolIdHex) &&
        Objects.equals(poolStatus, poolInfo.poolStatus) &&
        Objects.equals(relays, poolInfo.relays) &&
        Objects.equals(retiringEpoch, poolInfo.retiringEpoch) &&
        Objects.equals(rewardAddr, poolInfo.rewardAddr) &&
        Objects.equals(sigma, poolInfo.sigma) &&
        Objects.equals(vrfKeyHash, poolInfo.vrfKeyHash);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(activeEpochNo, activeStake, blockCount, fixedCost, liveDelegators, livePledge,
        liveSaturation, liveStake, liveStakePct, margin, metaHash, metaJson, metaUrl, opCertCounter,
        owners, pledge, poolIdBech32, poolIdHex, poolStatus, relays, retiringEpoch, rewardAddr,
        sigma, vrfKeyHash);
  }

}
