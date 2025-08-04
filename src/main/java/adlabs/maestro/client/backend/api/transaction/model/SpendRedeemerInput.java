package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * UTXO reference (transaction hash and output index) for a spending redeemer.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SpendRedeemerInput {

  /**
   * Default constructor.
   */
  public SpendRedeemerInput() {
  }

  /**
   * Constructor with all fields.
   *
   * @param index the UTXO transaction index
   * @param txHash the UTXO transaction hash
   */
  public SpendRedeemerInput(Long index, String txHash) {
    this.index = index;
    this.txHash = txHash;
  }

  /**
   * UTXO transaction index.
   */
  @NotNull
  @Min(0L)
  private Long index;

  /**
   * UTXO transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Gets the UTXO transaction index.
   *
   * @return the index
   */
  public Long getIndex() {
    return index;
  }

  /**
   * Sets the UTXO transaction index.
   *
   * @param index the index
   */
  public void setIndex(Long index) {
    this.index = index;
  }

  /**
   * Gets the UTXO transaction hash.
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the UTXO transaction hash.
   *
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Returns a string representation of this SpendRedeemerInput.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "SpendRedeemerInput{" +
        "index=" + index +
        ", txHash='" + txHash + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SpendRedeemerInput that = (SpendRedeemerInput) o;
    return java.util.Objects.equals(index, that.index) &&
        java.util.Objects.equals(txHash, that.txHash);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(index, txHash);
  }
}
