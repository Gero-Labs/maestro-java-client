package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Transaction Hash
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TxHash {

    /**
     * Transaction Hash
     */
    private String txHash;

    /**
     * Epoch number of the block
     */
    private Integer epochNo;

    /**
     * Block Height
     */
    private Integer blockHeight;

    /**
     * UNIX timestamp of the block
     */
    private Integer blockTime;

    /**
     * Default no-argument constructor.
     */
    public TxHash() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param txHash the transaction hash
     * @param epochNo the epoch number of the block
     * @param blockHeight the block height
     * @param blockTime the UNIX timestamp of the block
     */
    public TxHash(String txHash, Integer epochNo, Integer blockHeight, Integer blockTime) {
        this.txHash = txHash;
        this.epochNo = epochNo;
        this.blockHeight = blockHeight;
        this.blockTime = blockTime;
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
     * @param epochNo the epoch number of the block to set
     */
    public void setEpochNo(Integer epochNo) {
        this.epochNo = epochNo;
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
     * @param blockHeight the block height to set
     */
    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
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

    @Override
    public String toString() {
        return "TxHash{" +
                "txHash='" + txHash + '\'' +
                ", epochNo=" + epochNo +
                ", blockHeight=" + blockHeight +
                ", blockTime=" + blockTime +
                '}';
    }
}
