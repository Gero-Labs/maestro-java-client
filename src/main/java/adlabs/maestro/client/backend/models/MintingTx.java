package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;

/**
 * Transaction which minted or burned a specific asset.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MintingTx {

  /**
   * UNIX timestamp of the block which included the transaction.
   */
  @NotNull
  private Integer blockTimestamp;

  /**
   * Transaction metadata.
   */
  @NotNull
  private JsonNode metadata;

  /**
   * Amount of the asset minted or burned (negative if burned).
   */
  @NotNull
  private Long mintAmount;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default no-argument constructor.
   */
  public MintingTx() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param blockTimestamp the UNIX timestamp of the block which included the transaction
   * @param metadata the transaction metadata
   * @param mintAmount the amount of the asset minted or burned (negative if burned)
   * @param txHash the transaction hash
   */
  public MintingTx(Integer blockTimestamp, JsonNode metadata, Long mintAmount, String txHash) {
    this.blockTimestamp = blockTimestamp;
    this.metadata = metadata;
    this.mintAmount = mintAmount;
    this.txHash = txHash;
  }

  /**
   * Gets the UNIX timestamp of the block which included the transaction.
   * 
   * @return the block timestamp
   */
  public Integer getBlockTimestamp() {
    return blockTimestamp;
  }

  /**
   * Sets the UNIX timestamp of the block which included the transaction.
   * 
   * @param blockTimestamp the block timestamp to set
   */
  public void setBlockTimestamp(Integer blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  /**
   * Gets the transaction metadata.
   * 
   * @return the metadata
   */
  public JsonNode getMetadata() {
    return metadata;
  }

  /**
   * Sets the transaction metadata.
   * 
   * @param metadata the metadata to set
   */
  public void setMetadata(JsonNode metadata) {
    this.metadata = metadata;
  }

  /**
   * Gets the amount of the asset minted or burned (negative if burned).
   * 
   * @return the mint amount
   */
  public Long getMintAmount() {
    return mintAmount;
  }

  /**
   * Sets the amount of the asset minted or burned (negative if burned).
   * 
   * @param mintAmount the mint amount to set
   */
  public void setMintAmount(Long mintAmount) {
    this.mintAmount = mintAmount;
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

  @Override
  public String toString() {
    return "MintingTx{" +
            "blockTimestamp=" + blockTimestamp +
            ", metadata=" + metadata +
            ", mintAmount=" + mintAmount +
            ", txHash='" + txHash + '\'' +
            '}';
  }
}
