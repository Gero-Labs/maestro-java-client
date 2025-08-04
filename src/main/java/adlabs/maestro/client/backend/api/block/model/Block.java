package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

/**
 * Block
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Block {

    /**
     * Hash of the block
     */
    private String hash = null;

    /**
     * Epoch number of the block
     */
    private Integer epochNo = null;

    /**
     * Absolute slot number of the block
     */
    private Integer absSlot = null;

    /**
     * Slot number of the block in epoch
     */
    private Integer epochSlot = null;

    /**
     * Block Height
     */
    private Integer blockHeight = null;

    /**
     * Block size in bytes
     */
    private Integer blockSize = null;

    /**
     * UNIX timestamp of the block
     */
    private Long blockTime = null;

    /**
     * Number of transactions in the block
     */
    private Integer txCount = null;

    /**
     * VRF key of the block producer
     */
    private String vrfKey = null;

    /**
     * Pool ID in bech32 format
     */
    private String pool = null;

    /**
     * Counter value of the operational certificate used to create this block
     */
    private Integer opCertCounter = null;

    /**
     * The protocol major version
     */
    private Integer protoMajor;

    /**
     * The protocol minor version
     */
    private Integer protoMinor;

    /**
     * Previous Hash of the current block
     */
    private String parentHash;

    /**
     * Default constructor.
     */
    public Block() {
    }

    /**
     * Constructor with all fields as parameters.
     *
     * @param hash Hash of the block
     * @param epochNo Epoch number of the block
     * @param absSlot Absolute slot number of the block
     * @param epochSlot Slot number of the block in epoch
     * @param blockHeight Block Height
     * @param blockSize Block size in bytes
     * @param blockTime UNIX timestamp of the block
     * @param txCount Number of transactions in the block
     * @param vrfKey VRF key of the block producer
     * @param pool Pool ID in bech32 format
     * @param opCertCounter Counter value of the operational certificate used to create this block
     * @param protoMajor The protocol major version
     * @param protoMinor The protocol minor version
     * @param parentHash Previous Hash of the current block
     */
    public Block(String hash, Integer epochNo, Integer absSlot, Integer epochSlot, Integer blockHeight, Integer blockSize, Long blockTime, Integer txCount, String vrfKey, String pool, Integer opCertCounter, Integer protoMajor, Integer protoMinor, String parentHash) {
        this.hash = hash;
        this.epochNo = epochNo;
        this.absSlot = absSlot;
        this.epochSlot = epochSlot;
        this.blockHeight = blockHeight;
        this.blockSize = blockSize;
        this.blockTime = blockTime;
        this.txCount = txCount;
        this.vrfKey = vrfKey;
        this.pool = pool;
        this.opCertCounter = opCertCounter;
        this.protoMajor = protoMajor;
        this.protoMinor = protoMinor;
        this.parentHash = parentHash;
    }

    /**
     * Gets the hash of the block.
     *
     * @return the hash of the block
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the hash of the block.
     *
     * @param hash the hash of the block
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets the epoch number of the block.
     *
     * @return the epoch number of the block
     */
    public Integer getEpochNo() {
        return epochNo;
    }

    /**
     * Sets the epoch number of the block.
     *
     * @param epochNo the epoch number of the block
     */
    public void setEpochNo(Integer epochNo) {
        this.epochNo = epochNo;
    }

    /**
     * Gets the absolute slot number of the block.
     *
     * @return the absolute slot number of the block
     */
    public Integer getAbsSlot() {
        return absSlot;
    }

    /**
     * Sets the absolute slot number of the block.
     *
     * @param absSlot the absolute slot number of the block
     */
    public void setAbsSlot(Integer absSlot) {
        this.absSlot = absSlot;
    }

    /**
     * Gets the slot number of the block in epoch.
     *
     * @return the slot number of the block in epoch
     */
    public Integer getEpochSlot() {
        return epochSlot;
    }

    /**
     * Sets the slot number of the block in epoch.
     *
     * @param epochSlot the slot number of the block in epoch
     */
    public void setEpochSlot(Integer epochSlot) {
        this.epochSlot = epochSlot;
    }

    /**
     * Gets the block height.
     *
     * @return the block height
     */
    public Integer getBlockHeight() {
        return blockHeight;
    }

    /**
     * Sets the block height.
     *
     * @param blockHeight the block height
     */
    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    /**
     * Gets the block size in bytes.
     *
     * @return the block size in bytes
     */
    public Integer getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the block size in bytes.
     *
     * @param blockSize the block size in bytes
     */
    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * Gets the UNIX timestamp of the block.
     *
     * @return the UNIX timestamp of the block
     */
    public Long getBlockTime() {
        return blockTime;
    }

    /**
     * Sets the UNIX timestamp of the block.
     *
     * @param blockTime the UNIX timestamp of the block
     */
    public void setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * Gets the number of transactions in the block.
     *
     * @return the number of transactions in the block
     */
    public Integer getTxCount() {
        return txCount;
    }

    /**
     * Sets the number of transactions in the block.
     *
     * @param txCount the number of transactions in the block
     */
    public void setTxCount(Integer txCount) {
        this.txCount = txCount;
    }

    /**
     * Gets the VRF key of the block producer.
     *
     * @return the VRF key of the block producer
     */
    public String getVrfKey() {
        return vrfKey;
    }

    /**
     * Sets the VRF key of the block producer.
     *
     * @param vrfKey the VRF key of the block producer
     */
    public void setVrfKey(String vrfKey) {
        this.vrfKey = vrfKey;
    }

    /**
     * Gets the pool ID in bech32 format.
     *
     * @return the pool ID in bech32 format
     */
    public String getPool() {
        return pool;
    }

    /**
     * Sets the pool ID in bech32 format.
     *
     * @param pool the pool ID in bech32 format
     */
    public void setPool(String pool) {
        this.pool = pool;
    }

    /**
     * Gets the counter value of the operational certificate used to create this block.
     *
     * @return the counter value of the operational certificate used to create this block
     */
    public Integer getOpCertCounter() {
        return opCertCounter;
    }

    /**
     * Sets the counter value of the operational certificate used to create this block.
     *
     * @param opCertCounter the counter value of the operational certificate used to create this block
     */
    public void setOpCertCounter(Integer opCertCounter) {
        this.opCertCounter = opCertCounter;
    }

    /**
     * Gets the protocol major version.
     *
     * @return the protocol major version
     */
    public Integer getProtoMajor() {
        return protoMajor;
    }

    /**
     * Sets the protocol major version.
     *
     * @param protoMajor the protocol major version
     */
    public void setProtoMajor(Integer protoMajor) {
        this.protoMajor = protoMajor;
    }

    /**
     * Gets the protocol minor version.
     *
     * @return the protocol minor version
     */
    public Integer getProtoMinor() {
        return protoMinor;
    }

    /**
     * Sets the protocol minor version.
     *
     * @param protoMinor the protocol minor version
     */
    public void setProtoMinor(Integer protoMinor) {
        this.protoMinor = protoMinor;
    }

    /**
     * Gets the previous hash of the current block.
     *
     * @return the previous hash of the current block
     */
    public String getParentHash() {
        return parentHash;
    }

    /**
     * Sets the previous hash of the current block.
     *
     * @param parentHash the previous hash of the current block
     */
    public void setParentHash(String parentHash) {
        this.parentHash = parentHash;
    }

    /**
     * Returns a string representation of this Block.
     *
     * @return a string representation of this Block
     */
    @Override
    public String toString() {
        return "Block{" +
                "hash='" + hash + '\'' +
                ", epochNo=" + epochNo +
                ", absSlot=" + absSlot +
                ", epochSlot=" + epochSlot +
                ", blockHeight=" + blockHeight +
                ", blockSize=" + blockSize +
                ", blockTime=" + blockTime +
                ", txCount=" + txCount +
                ", vrfKey='" + vrfKey + '\'' +
                ", pool='" + pool + '\'' +
                ", opCertCounter=" + opCertCounter +
                ", protoMajor=" + protoMajor +
                ", protoMinor=" + protoMinor +
                ", parentHash='" + parentHash + '\'' +
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
        Block block = (Block) obj;
        return Objects.equals(hash, block.hash) &&
                Objects.equals(epochNo, block.epochNo) &&
                Objects.equals(absSlot, block.absSlot) &&
                Objects.equals(epochSlot, block.epochSlot) &&
                Objects.equals(blockHeight, block.blockHeight) &&
                Objects.equals(blockSize, block.blockSize) &&
                Objects.equals(blockTime, block.blockTime) &&
                Objects.equals(txCount, block.txCount) &&
                Objects.equals(vrfKey, block.vrfKey) &&
                Objects.equals(pool, block.pool) &&
                Objects.equals(opCertCounter, block.opCertCounter) &&
                Objects.equals(protoMajor, block.protoMajor) &&
                Objects.equals(protoMinor, block.protoMinor) &&
                Objects.equals(parentHash, block.parentHash);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(hash, epochNo, absSlot, epochSlot, blockHeight, blockSize, blockTime, txCount, vrfKey, pool, opCertCounter, protoMajor, protoMinor, parentHash);
    }
}
