package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Blockchain chain-tip representing the most recently adopted block
 * with its hash, height, and slot information.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ChainTip {

  /** Block hash of the most recent block */
  @NotNull
  private String blockHash;

  /** Height (number) of the most recent block */
  @NotNull
  @Min(0L)
  private Long height;

  /** Absolute slot of the most recent block */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Creates a new instance of ChainTip.
   */
  public ChainTip() {
  }

  /**
   * Creates a new instance of ChainTip with all fields.
   *
   * @param blockHash the block hash of the most recent block
   * @param height the height (number) of the most recent block
   * @param slot the absolute slot of the most recent block
   */
  public ChainTip(String blockHash, Long height, Long slot) {
    this.blockHash = blockHash;
    this.height = height;
    this.slot = slot;
  }

  /**
   * Gets the block hash of the most recent block.
   *
   * @return the block hash of the most recent block
   */
  public String getBlockHash() {
    return blockHash;
  }

  /**
   * Sets the block hash of the most recent block.
   *
   * @param blockHash the block hash of the most recent block
   */
  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  /**
   * Gets the height (number) of the most recent block.
   *
   * @return the height (number) of the most recent block
   */
  public Long getHeight() {
    return height;
  }

  /**
   * Sets the height (number) of the most recent block.
   *
   * @param height the height (number) of the most recent block
   */
  public void setHeight(Long height) {
    this.height = height;
  }

  /**
   * Gets the absolute slot of the most recent block.
   *
   * @return the absolute slot of the most recent block
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the most recent block.
   *
   * @param slot the absolute slot of the most recent block
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Returns a string representation of this ChainTip object.
   *
   * @return a string representation of this ChainTip object
   */
  @Override
  public String toString() {
    return "ChainTip{" +
           "blockHash='" + blockHash + '\'' +
           ", height=" + height +
           ", slot=" + slot +
           '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the o argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChainTip chainTip = (ChainTip) o;
    return Objects.equals(blockHash, chainTip.blockHash) &&
           Objects.equals(height, chainTip.height) &&
           Objects.equals(slot, chainTip.slot);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(blockHash, height, slot);
  }
}