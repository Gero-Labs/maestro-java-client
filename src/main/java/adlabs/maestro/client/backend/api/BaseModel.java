package adlabs.maestro.client.backend.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Base model class that provides common blockchain-related fields.
 * This class provides constructors and utility methods.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BaseModel {
    private String blockHash;

    private Long blockSlot;

    private String timestamp;

    /**
     * Default no-argument constructor.
     */
    public BaseModel() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param blockHash the block hash
     * @param blockSlot the block slot
     * @param timestamp the timestamp
     */
    public BaseModel(String blockHash, Long blockSlot, String timestamp) {
        this.blockHash = blockHash;
        this.blockSlot = blockSlot;
        this.timestamp = timestamp;
    }

    /**
     * Gets the block hash.
     * 
     * @return the block hash
     */
    public String getBlockHash() {
        return blockHash;
    }

    /**
     * Sets the block hash.
     * 
     * @param blockHash the block hash to set
     */
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    /**
     * Gets the block slot.
     * 
     * @return the block slot
     */
    public Long getBlockSlot() {
        return blockSlot;
    }

    /**
     * Sets the block slot.
     * 
     * @param blockSlot the block slot to set
     */
    public void setBlockSlot(Long blockSlot) {
        this.blockSlot = blockSlot;
    }

    /**
     * Gets the timestamp.
     * 
     * @return the timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp.
     * 
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "blockHash='" + blockHash + '\'' +
                ", blockSlot=" + blockSlot +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
