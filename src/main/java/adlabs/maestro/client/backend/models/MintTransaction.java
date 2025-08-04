package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Transaction hash with details of when that transaction appeared on-chain.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MintTransaction {

  /**
   * Amount of asset minted or burned (negative if burned).
   */
  @NotNull
  private String amount;

  /**
   * Absolute slot of the block which includes the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * UTC timestamp of the block which includes the transaction.
   */
  @NotNull
  private String timestamp;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default no-argument constructor.
   */
  public MintTransaction() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param amount the amount of asset minted or burned (negative if burned)
   * @param slot the absolute slot of the block which includes the transaction
   * @param timestamp the UTC timestamp of the block which includes the transaction
   * @param txHash the transaction hash
   */
  public MintTransaction(String amount, Long slot, String timestamp, String txHash) {
    this.amount = amount;
    this.slot = slot;
    this.timestamp = timestamp;
    this.txHash = txHash;
  }

  /**
   * Gets the amount of asset minted or burned (negative if burned).
   * 
   * @return the amount
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount of asset minted or burned (negative if burned).
   * 
   * @param amount the amount to set
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the absolute slot of the block which includes the transaction.
   * 
   * @return the slot
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block which includes the transaction.
   * 
   * @param slot the slot to set
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the UTC timestamp of the block which includes the transaction.
   * 
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the UTC timestamp of the block which includes the transaction.
   * 
   * @param timestamp the timestamp to set
   */
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
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
    return "MintTransaction{" +
            "amount='" + amount + '\'' +
            ", slot=" + slot +
            ", timestamp='" + timestamp + '\'' +
            ", txHash='" + txHash + '\'' +
            '}';
  }
}
