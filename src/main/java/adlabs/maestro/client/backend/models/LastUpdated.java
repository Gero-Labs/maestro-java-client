package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Details of the most recent block processed by the indexer (aka chain tip);
 * that is, the data returned is correct as of this block in time.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LastUpdated {

  /**
   * Hex-encoded hash of the most recently processed block (aka chain tip).
   */
  @NotNull
  private String blockHash;

  /**
   * Absolute slot of the most recently processed block (aka chain tip).
   */
  @NotNull
  @Min(0L)
  private Long blockSlot;

  /**
   * UTC timestamp of when the most recently processed block was minted.
   */
  @NotNull
  private String timestamp;

  /**
   * Default no-argument constructor.
   */
  public LastUpdated() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param blockHash the hex-encoded hash of the most recently processed block
   * @param blockSlot the absolute slot of the most recently processed block
   * @param timestamp the UTC timestamp of when the most recently processed block was minted
   */
  public LastUpdated(String blockHash, Long blockSlot, String timestamp) {
    this.blockHash = blockHash;
    this.blockSlot = blockSlot;
    this.timestamp = timestamp;
  }

  /**
   * Gets the hex-encoded hash of the most recently processed block (aka chain tip).
   * 
   * @return the block hash
   */
  public String getBlockHash() {
    return blockHash;
  }

  /**
   * Sets the hex-encoded hash of the most recently processed block (aka chain tip).
   * 
   * @param blockHash the block hash to set
   */
  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  /**
   * Gets the absolute slot of the most recently processed block (aka chain tip).
   * 
   * @return the block slot
   */
  public Long getBlockSlot() {
    return blockSlot;
  }

  /**
   * Sets the absolute slot of the most recently processed block (aka chain tip).
   * 
   * @param blockSlot the block slot to set
   */
  public void setBlockSlot(Long blockSlot) {
    this.blockSlot = blockSlot;
  }

  /**
   * Gets the UTC timestamp of when the most recently processed block was minted.
   * 
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the UTC timestamp of when the most recently processed block was minted.
   * 
   * @param timestamp the timestamp to set
   */
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return "LastUpdated{" +
            "blockHash='" + blockHash + '\'' +
            ", blockSlot=" + blockSlot +
            ", timestamp='" + timestamp + '\'' +
            '}';
  }
}
