package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Transaction which involved a specific payment credential.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaymentCredentialTransaction {

  /**
   * True if payment credential is used as an input.
   */
  @NotNull
  private Boolean input;

  /**
   * True if payment credential is used as an output.
   */
  @NotNull
  private Boolean output;

  /**
   * True if payment credential is used as a required signer.
   */
  @NotNull
  private Boolean requiredSigner;

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
  public PaymentCredentialTransaction() {
  }

  /**
   * Constructor with all fields.
   *
   * @param input True if payment credential is used as an input
   * @param output True if payment credential is used as an output
   * @param requiredSigner True if payment credential is used as a required signer
   * @param slot Absolute slot of the block which contains the transaction
   * @param txHash Transaction hash
   */
  public PaymentCredentialTransaction(Boolean input, Boolean output, Boolean requiredSigner, Long slot, String txHash) {
    this.input = input;
    this.output = output;
    this.requiredSigner = requiredSigner;
    this.slot = slot;
    this.txHash = txHash;
  }

  /**
   * Gets whether payment credential is used as an input.
   *
   * @return true if used as input
   */
  public Boolean getInput() {
    return input;
  }

  /**
   * Sets whether payment credential is used as an input.
   *
   * @param input true if used as input
   */
  public void setInput(Boolean input) {
    this.input = input;
  }

  /**
   * Gets whether payment credential is used as an output.
   *
   * @return true if used as output
   */
  public Boolean getOutput() {
    return output;
  }

  /**
   * Sets whether payment credential is used as an output.
   *
   * @param output true if used as output
   */
  public void setOutput(Boolean output) {
    this.output = output;
  }

  /**
   * Gets whether payment credential is used as a required signer.
   *
   * @return true if used as required signer
   */
  public Boolean getRequiredSigner() {
    return requiredSigner;
  }

  /**
   * Sets whether payment credential is used as a required signer.
   *
   * @param requiredSigner true if used as required signer
   */
  public void setRequiredSigner(Boolean requiredSigner) {
    this.requiredSigner = requiredSigner;
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
    return "PaymentCredentialTransaction{" +
        "input=" + input +
        ", output=" + output +
        ", requiredSigner=" + requiredSigner +
        ", slot=" + slot +
        ", txHash='" + txHash + '\'' +
        '}';
  }
}
