package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Block created by a stake pool.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolBlock {

  /**
   * Absolute slot of the block.
   */
  private Long absSlot;

  /**
   * Block hash.
   */
  @NotNull
  private String blockHash;

  /**
   * Block height.
   */
  @NotNull
  @Min(0)
  private Integer blockHeight;

  /**
   * UNIX timestamp of the block.
   */
  @NotNull
  private Integer blockTime;

  /**
   * Epoch number of the block.
   */
  private Integer epochNo;

  /**
   * Slot number within the epoch of the block.
   */
  private Integer epochSlot;

  /**
   * Default constructor
   */
  public PoolBlock() {
  }

  /**
   * Constructor with all fields
   * @param absSlot Absolute slot of the block
   * @param blockHash Block hash
   * @param blockHeight Block height
   * @param blockTime UNIX timestamp of the block
   * @param epochNo Epoch number of the block
   * @param epochSlot Slot number within the epoch of the block
   */
  public PoolBlock(Long absSlot, String blockHash, Integer blockHeight, Integer blockTime, Integer epochNo, Integer epochSlot) {
    this.absSlot = absSlot;
    this.blockHash = blockHash;
    this.blockHeight = blockHeight;
    this.blockTime = blockTime;
    this.epochNo = epochNo;
    this.epochSlot = epochSlot;
  }

  /**
   * Gets the absolute slot of the block
   * @return absolute slot
   */
  public Long getAbsSlot() {
    return absSlot;
  }

  /**
   * Sets the absolute slot of the block
   * @param absSlot the absolute slot to set
   */
  public void setAbsSlot(Long absSlot) {
    this.absSlot = absSlot;
  }

  /**
   * Gets the block hash
   * @return block hash
   */
  public String getBlockHash() {
    return blockHash;
  }

  /**
   * Sets the block hash
   * @param blockHash the block hash to set
   */
  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  /**
   * Gets the block height
   * @return block height
   */
  public Integer getBlockHeight() {
    return blockHeight;
  }

  /**
   * Sets the block height
   * @param blockHeight the block height to set
   */
  public void setBlockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
  }

  /**
   * Gets the UNIX timestamp of the block
   * @return block time
   */
  public Integer getBlockTime() {
    return blockTime;
  }

  /**
   * Sets the UNIX timestamp of the block
   * @param blockTime the block time to set
   */
  public void setBlockTime(Integer blockTime) {
    this.blockTime = blockTime;
  }

  /**
   * Gets the epoch number of the block
   * @return epoch number
   */
  public Integer getEpochNo() {
    return epochNo;
  }

  /**
   * Sets the epoch number of the block
   * @param epochNo the epoch number to set
   */
  public void setEpochNo(Integer epochNo) {
    this.epochNo = epochNo;
  }

  /**
   * Gets the slot number within the epoch of the block
   * @return epoch slot
   */
  public Integer getEpochSlot() {
    return epochSlot;
  }

  /**
   * Sets the slot number within the epoch of the block
   * @param epochSlot the epoch slot to set
   */
  public void setEpochSlot(Integer epochSlot) {
    this.epochSlot = epochSlot;
  }

  @Override
  public String toString() {
    return "PoolBlock{" +
        "absSlot=" + absSlot +
        ", blockHash='" + blockHash + '\'' +
        ", blockHeight=" + blockHeight +
        ", blockTime=" + blockTime +
        ", epochNo=" + epochNo +
        ", epochSlot=" + epochSlot +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PoolBlock poolBlock = (PoolBlock) o;
    return Objects.equals(absSlot, poolBlock.absSlot) &&
           Objects.equals(blockHash, poolBlock.blockHash) &&
           Objects.equals(blockHeight, poolBlock.blockHeight) &&
           Objects.equals(blockTime, poolBlock.blockTime) &&
           Objects.equals(epochNo, poolBlock.epochNo) &&
           Objects.equals(epochSlot, poolBlock.epochSlot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absSlot, blockHash, blockHeight, blockTime, epochNo, epochSlot);
  }
}
