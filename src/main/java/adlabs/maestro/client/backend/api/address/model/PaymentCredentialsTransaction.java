package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Transaction which involved one or more specific payment credentials.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaymentCredentialsTransaction {

  /**
   * Absolute slot of the block which contains the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default constructor.
   */
  public PaymentCredentialsTransaction() {
  }

  /**
   * Constructor with all fields.
   *
   * @param slot Absolute slot of the block which contains the transaction
   * @param txHash Transaction hash
   */
  public PaymentCredentialsTransaction(Long slot, String txHash) {
    this.slot = slot;
    this.txHash = txHash;
  }

  /**
   * Gets the absolute slot of the block which contains the transaction.
   *
   * @return the slot number
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block which contains the transaction.
   *
   * @param slot the slot number
   */
  public void setSlot(Long slot) {
    this.slot = slot;
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
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  @Override
  public String toString() {
    return "PaymentCredentialsTransaction{" +
        "slot=" + slot +
        ", txHash='" + txHash + '\'' +
        '}';
  }
}
