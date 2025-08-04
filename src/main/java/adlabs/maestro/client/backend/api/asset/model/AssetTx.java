package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

/**
 * Transaction which moved or minted a specific asset
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetTx {

  /**
   * The height of the block which included the transaction
   */
  private Integer blockHeight;

  /**
   * Epoch in which the transaction occurred
   */
  private Integer epochNo;

  /**
   * Transaction hash
   */
  private String txHash;

  /**
   * Default constructor
   */
  public AssetTx() {
  }

  /**
   * Constructor with all fields
   * @param blockHeight The height of the block which included the transaction
   * @param epochNo Epoch in which the transaction occurred
   * @param txHash Transaction hash
   */
  public AssetTx(Integer blockHeight, Integer epochNo, String txHash) {
    this.blockHeight = blockHeight;
    this.epochNo = epochNo;
    this.txHash = txHash;
  }

  /**
   * Gets the height of the block which included the transaction
   * @return block height
   */
  public Integer getBlockHeight() {
    return blockHeight;
  }

  /**
   * Sets the height of the block which included the transaction
   * @param blockHeight the block height to set
   */
  public void setBlockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
  }

  /**
   * Gets the epoch in which the transaction occurred
   * @return epoch number
   */
  public Integer getEpochNo() {
    return epochNo;
  }

  /**
   * Sets the epoch in which the transaction occurred
   * @param epochNo the epoch number to set
   */
  public void setEpochNo(Integer epochNo) {
    this.epochNo = epochNo;
  }

  /**
   * Gets the transaction hash
   * @return transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash
   * @param txHash the transaction hash to set
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  @Override
  public String toString() {
    return "AssetTx{" +
        "blockHeight=" + blockHeight +
        ", epochNo=" + epochNo +
        ", txHash='" + txHash + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetTx assetTx = (AssetTx) o;
    return Objects.equals(blockHeight, assetTx.blockHeight) &&
        Objects.equals(epochNo, assetTx.epochNo) &&
        Objects.equals(txHash, assetTx.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHeight, epochNo, txHash);
  }
}