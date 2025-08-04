package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Block information
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BlockInfo {

  /**
   * Absolute slot when block was minted
   */
  @NotNull
  private Long absoluteSlot;

  /**
   * Identifier of stake pool which minted the block
   */
  private String blockProducer;

  /**
   * Number of blocks which have been minted since the block
   */
  @NotNull
  private Long confirmations;

  /**
   * Epoch in which block was minted
   */
  @NotNull
  private Long epoch;

  /**
   * Epoch slot at which block was minted
   */
  @NotNull
  private Long epochSlot;

  /**
   * Ledger era
   */
  @NotNull
  @Valid
  private LedgerEra era;

  /**
   * Block hash
   */
  @NotNull
  private String hash;

  /**
   * Block height (number)
   */
  @NotNull
  private Long height;

  /**
   * Block hash of the next block
   */
  private String nextBlock;

  /**
   * Operational certificate
   */
  @Valid
  private OperationalCert operationalCertificate;

  /**
   * Block hash of the previous block
   */
  private String previousBlock;

  /**
   * Ledger protocol version (major, minor)
   */
  @NotNull
  @Valid
  private List<Integer> protocolVersion;

  /**
   * Number of script invocations
   */
  @NotNull
  private Integer scriptInvocations;

  /**
   * Size of the block body in bytes
   */
  @NotNull
  private Integer size;

  /**
   * UTC timestamp when the block was minted
   */
  @NotNull
  private String timestamp;

  /**
   * Total execution units used in the block
   */
  @NotNull
  @Valid
  private ExUnits totalExUnits;

  /**
   * Total fees collected in the block
   */
  @NotNull
  @Valid
  private String totalFees;

  /**
   * Total lovelace in outputs of transactions included in the block
   */
  @NotNull
  private String totalOutputLovelace;

  /**
   * Ordered transaction hashes for the transactions in the block
   */
  @NotNull
  @Valid
  private List<String> txHashes;

  /**
   * VRF key (null for Byron era)
   */
  private String vrfKey;

  /**
   * Default constructor.
   */
  public BlockInfo() {
  }

  /**
   * Constructor with all fields as parameters.
   *
   * @param absoluteSlot Absolute slot when block was minted
   * @param blockProducer Identifier of stake pool which minted the block
   * @param confirmations Number of blocks which have been minted since the block
   * @param epoch Epoch in which block was minted
   * @param epochSlot Epoch slot at which block was minted
   * @param era Ledger era
   * @param hash Block hash
   * @param height Block height (number)
   * @param nextBlock Block hash of the next block
   * @param operationalCertificate Operational certificate
   * @param previousBlock Block hash of the previous block
   * @param protocolVersion Ledger protocol version (major, minor)
   * @param scriptInvocations Number of script invocations
   * @param size Size of the block body in bytes
   * @param timestamp UTC timestamp when the block was minted
   * @param totalExUnits Total execution units used in the block
   * @param totalFees Total fees collected in the block
   * @param totalOutputLovelace Total lovelace in outputs of transactions included in the block
   * @param txHashes Ordered transaction hashes for the transactions in the block
   * @param vrfKey VRF key (null for Byron era)
   */
  public BlockInfo(Long absoluteSlot, String blockProducer, Long confirmations, Long epoch, Long epochSlot, LedgerEra era, String hash, Long height, String nextBlock, OperationalCert operationalCertificate, String previousBlock, List<Integer> protocolVersion, Integer scriptInvocations, Integer size, String timestamp, ExUnits totalExUnits, String totalFees, String totalOutputLovelace, List<String> txHashes, String vrfKey) {
    this.absoluteSlot = absoluteSlot;
    this.blockProducer = blockProducer;
    this.confirmations = confirmations;
    this.epoch = epoch;
    this.epochSlot = epochSlot;
    this.era = era;
    this.hash = hash;
    this.height = height;
    this.nextBlock = nextBlock;
    this.operationalCertificate = operationalCertificate;
    this.previousBlock = previousBlock;
    this.protocolVersion = protocolVersion;
    this.scriptInvocations = scriptInvocations;
    this.size = size;
    this.timestamp = timestamp;
    this.totalExUnits = totalExUnits;
    this.totalFees = totalFees;
    this.totalOutputLovelace = totalOutputLovelace;
    this.txHashes = txHashes;
    this.vrfKey = vrfKey;
  }

  /**
   * Gets the absolute slot when block was minted.
   *
   * @return the absolute slot when block was minted
   */
  public Long getAbsoluteSlot() {
    return absoluteSlot;
  }

  /**
   * Sets the absolute slot when block was minted.
   *
   * @param absoluteSlot the absolute slot when block was minted
   */
  public void setAbsoluteSlot(Long absoluteSlot) {
    this.absoluteSlot = absoluteSlot;
  }

  /**
   * Gets the identifier of stake pool which minted the block.
   *
   * @return the identifier of stake pool which minted the block
   */
  public String getBlockProducer() {
    return blockProducer;
  }

  /**
   * Sets the identifier of stake pool which minted the block.
   *
   * @param blockProducer the identifier of stake pool which minted the block
   */
  public void setBlockProducer(String blockProducer) {
    this.blockProducer = blockProducer;
  }

  /**
   * Gets the number of blocks which have been minted since the block.
   *
   * @return the number of blocks which have been minted since the block
   */
  public Long getConfirmations() {
    return confirmations;
  }

  /**
   * Sets the number of blocks which have been minted since the block.
   *
   * @param confirmations the number of blocks which have been minted since the block
   */
  public void setConfirmations(Long confirmations) {
    this.confirmations = confirmations;
  }

  /**
   * Gets the epoch in which block was minted.
   *
   * @return the epoch in which block was minted
   */
  public Long getEpoch() {
    return epoch;
  }

  /**
   * Sets the epoch in which block was minted.
   *
   * @param epoch the epoch in which block was minted
   */
  public void setEpoch(Long epoch) {
    this.epoch = epoch;
  }

  /**
   * Gets the epoch slot at which block was minted.
   *
   * @return the epoch slot at which block was minted
   */
  public Long getEpochSlot() {
    return epochSlot;
  }

  /**
   * Sets the epoch slot at which block was minted.
   *
   * @param epochSlot the epoch slot at which block was minted
   */
  public void setEpochSlot(Long epochSlot) {
    this.epochSlot = epochSlot;
  }

  /**
   * Gets the ledger era.
   *
   * @return the ledger era
   */
  public LedgerEra getEra() {
    return era;
  }

  /**
   * Sets the ledger era.
   *
   * @param era the ledger era
   */
  public void setEra(LedgerEra era) {
    this.era = era;
  }

  /**
   * Gets the block hash.
   *
   * @return the block hash
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the block hash.
   *
   * @param hash the block hash
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Gets the block height (number).
   *
   * @return the block height (number)
   */
  public Long getHeight() {
    return height;
  }

  /**
   * Sets the block height (number).
   *
   * @param height the block height (number)
   */
  public void setHeight(Long height) {
    this.height = height;
  }

  /**
   * Gets the block hash of the next block.
   *
   * @return the block hash of the next block
   */
  public String getNextBlock() {
    return nextBlock;
  }

  /**
   * Sets the block hash of the next block.
   *
   * @param nextBlock the block hash of the next block
   */
  public void setNextBlock(String nextBlock) {
    this.nextBlock = nextBlock;
  }

  /**
   * Gets the operational certificate.
   *
   * @return the operational certificate
   */
  public OperationalCert getOperationalCertificate() {
    return operationalCertificate;
  }

  /**
   * Sets the operational certificate.
   *
   * @param operationalCertificate the operational certificate
   */
  public void setOperationalCertificate(OperationalCert operationalCertificate) {
    this.operationalCertificate = operationalCertificate;
  }

  /**
   * Gets the block hash of the previous block.
   *
   * @return the block hash of the previous block
   */
  public String getPreviousBlock() {
    return previousBlock;
  }

  /**
   * Sets the block hash of the previous block.
   *
   * @param previousBlock the block hash of the previous block
   */
  public void setPreviousBlock(String previousBlock) {
    this.previousBlock = previousBlock;
  }

  /**
   * Gets the ledger protocol version (major, minor).
   *
   * @return the ledger protocol version (major, minor)
   */
  public List<Integer> getProtocolVersion() {
    return protocolVersion;
  }

  /**
   * Sets the ledger protocol version (major, minor).
   *
   * @param protocolVersion the ledger protocol version (major, minor)
   */
  public void setProtocolVersion(List<Integer> protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  /**
   * Gets the number of script invocations.
   *
   * @return the number of script invocations
   */
  public Integer getScriptInvocations() {
    return scriptInvocations;
  }

  /**
   * Sets the number of script invocations.
   *
   * @param scriptInvocations the number of script invocations
   */
  public void setScriptInvocations(Integer scriptInvocations) {
    this.scriptInvocations = scriptInvocations;
  }

  /**
   * Gets the size of the block body in bytes.
   *
   * @return the size of the block body in bytes
   */
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the size of the block body in bytes.
   *
   * @param size the size of the block body in bytes
   */
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Gets the UTC timestamp when the block was minted.
   *
   * @return the UTC timestamp when the block was minted
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the UTC timestamp when the block was minted.
   *
   * @param timestamp the UTC timestamp when the block was minted
   */
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Gets the total execution units used in the block.
   *
   * @return the total execution units used in the block
   */
  public ExUnits getTotalExUnits() {
    return totalExUnits;
  }

  /**
   * Sets the total execution units used in the block.
   *
   * @param totalExUnits the total execution units used in the block
   */
  public void setTotalExUnits(ExUnits totalExUnits) {
    this.totalExUnits = totalExUnits;
  }

  /**
   * Gets the total fees collected in the block.
   *
   * @return the total fees collected in the block
   */
  public String getTotalFees() {
    return totalFees;
  }

  /**
   * Sets the total fees collected in the block.
   *
   * @param totalFees the total fees collected in the block
   */
  public void setTotalFees(String totalFees) {
    this.totalFees = totalFees;
  }

  /**
   * Gets the total lovelace in outputs of transactions included in the block.
   *
   * @return the total lovelace in outputs of transactions included in the block
   */
  public String getTotalOutputLovelace() {
    return totalOutputLovelace;
  }

  /**
   * Sets the total lovelace in outputs of transactions included in the block.
   *
   * @param totalOutputLovelace the total lovelace in outputs of transactions included in the block
   */
  public void setTotalOutputLovelace(String totalOutputLovelace) {
    this.totalOutputLovelace = totalOutputLovelace;
  }

  /**
   * Gets the ordered transaction hashes for the transactions in the block.
   *
   * @return the ordered transaction hashes for the transactions in the block
   */
  public List<String> getTxHashes() {
    return txHashes;
  }

  /**
   * Sets the ordered transaction hashes for the transactions in the block.
   *
   * @param txHashes the ordered transaction hashes for the transactions in the block
   */
  public void setTxHashes(List<String> txHashes) {
    this.txHashes = txHashes;
  }

  /**
   * Gets the VRF key (null for Byron era).
   *
   * @return the VRF key (null for Byron era)
   */
  public String getVrfKey() {
    return vrfKey;
  }

  /**
   * Sets the VRF key (null for Byron era).
   *
   * @param vrfKey the VRF key (null for Byron era)
   */
  public void setVrfKey(String vrfKey) {
    this.vrfKey = vrfKey;
  }

  /**
   * Returns a string representation of this BlockInfo.
   *
   * @return a string representation of this BlockInfo
   */
  @Override
  public String toString() {
    return "BlockInfo{" +
            "absoluteSlot=" + absoluteSlot +
            ", blockProducer='" + blockProducer + '\'' +
            ", confirmations=" + confirmations +
            ", epoch=" + epoch +
            ", epochSlot=" + epochSlot +
            ", era=" + era +
            ", hash='" + hash + '\'' +
            ", height=" + height +
            ", nextBlock='" + nextBlock + '\'' +
            ", operationalCertificate=" + operationalCertificate +
            ", previousBlock='" + previousBlock + '\'' +
            ", protocolVersion=" + protocolVersion +
            ", scriptInvocations=" + scriptInvocations +
            ", size=" + size +
            ", timestamp='" + timestamp + '\'' +
            ", totalExUnits=" + totalExUnits +
            ", totalFees='" + totalFees + '\'' +
            ", totalOutputLovelace='" + totalOutputLovelace + '\'' +
            ", txHashes=" + txHashes +
            ", vrfKey='" + vrfKey + '\'' +
            '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param obj the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    BlockInfo blockInfo = (BlockInfo) obj;
    return Objects.equals(absoluteSlot, blockInfo.absoluteSlot) &&
            Objects.equals(blockProducer, blockInfo.blockProducer) &&
            Objects.equals(confirmations, blockInfo.confirmations) &&
            Objects.equals(epoch, blockInfo.epoch) &&
            Objects.equals(epochSlot, blockInfo.epochSlot) &&
            Objects.equals(era, blockInfo.era) &&
            Objects.equals(hash, blockInfo.hash) &&
            Objects.equals(height, blockInfo.height) &&
            Objects.equals(nextBlock, blockInfo.nextBlock) &&
            Objects.equals(operationalCertificate, blockInfo.operationalCertificate) &&
            Objects.equals(previousBlock, blockInfo.previousBlock) &&
            Objects.equals(protocolVersion, blockInfo.protocolVersion) &&
            Objects.equals(scriptInvocations, blockInfo.scriptInvocations) &&
            Objects.equals(size, blockInfo.size) &&
            Objects.equals(timestamp, blockInfo.timestamp) &&
            Objects.equals(totalExUnits, blockInfo.totalExUnits) &&
            Objects.equals(totalFees, blockInfo.totalFees) &&
            Objects.equals(totalOutputLovelace, blockInfo.totalOutputLovelace) &&
            Objects.equals(txHashes, blockInfo.txHashes) &&
            Objects.equals(vrfKey, blockInfo.vrfKey);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(absoluteSlot, blockProducer, confirmations, epoch, epochSlot, era, hash, height, nextBlock, operationalCertificate, previousBlock, protocolVersion, scriptInvocations, size, timestamp, totalExUnits, totalFees, totalOutputLovelace, txHashes, vrfKey);
  }
}