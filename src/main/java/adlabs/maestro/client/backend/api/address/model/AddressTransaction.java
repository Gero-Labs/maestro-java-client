package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a transaction that involved a specific address.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AddressTransaction {

  /**
   * Indicates if the address controlled at least one of the consumed UTxOs.
   */
  @NotNull
  private Boolean input;

  /**
   * Indicates if the address controlled at least one of the produced UTxOs.
   */
  @NotNull
  private Boolean output;

  /**
   * The absolute slot of the block containing the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * The transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default constructor.
   */
  public AddressTransaction() {
  }

  /**
   * Constructor with all fields.
   *
   * @param input Indicates if the address controlled at least one of the consumed UTxOs
   * @param output Indicates if the address controlled at least one of the produced UTxOs
   * @param slot The absolute slot of the block containing the transaction
   * @param txHash The transaction hash
   */
  public AddressTransaction(Boolean input, Boolean output, Long slot, String txHash) {
    this.input = input;
    this.output = output;
    this.slot = slot;
    this.txHash = txHash;
  }

  /**
   * Gets whether the address controlled at least one of the consumed UTxOs.
   *
   * @return true if the address controlled consumed UTxOs
   */
  public Boolean getInput() {
    return input;
  }

  /**
   * Sets whether the address controlled at least one of the consumed UTxOs.
   *
   * @param input true if the address controlled consumed UTxOs
   */
  public void setInput(Boolean input) {
    this.input = input;
  }

  /**
   * Gets whether the address controlled at least one of the produced UTxOs.
   *
   * @return true if the address controlled produced UTxOs
   */
  public Boolean getOutput() {
    return output;
  }

  /**
   * Sets whether the address controlled at least one of the produced UTxOs.
   *
   * @param output true if the address controlled produced UTxOs
   */
  public void setOutput(Boolean output) {
    this.output = output;
  }

  /**
   * Gets the absolute slot of the block containing the transaction.
   *
   * @return the slot number
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block containing the transaction.
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
    return "AddressTransaction{" +
        "input=" + input +
        ", output=" + output +
        ", slot=" + slot +
        ", txHash='" + txHash + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddressTransaction that = (AddressTransaction) o;
    return java.util.Objects.equals(input, that.input) &&
        java.util.Objects.equals(output, that.output) &&
        java.util.Objects.equals(slot, that.slot) &&
        java.util.Objects.equals(txHash, that.txHash);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(input, output, slot, txHash);
  }
}
