package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a UTxO reference, containing the transaction hash and output index.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UtxoRef {

  /**
   * The UTxO transaction index.
   */
  @NotNull
  @Min(0L)
  private Long index;

  /**
   * The UTxO transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default constructor.
   */
  public UtxoRef() {
  }

  /**
   * Constructor with all fields.
   *
   * @param index The UTxO transaction index
   * @param txHash The UTxO transaction hash
   */
  public UtxoRef(Long index, String txHash) {
    this.index = index;
    this.txHash = txHash;
  }

  /**
   * Gets the UTxO transaction index.
   *
   * @return the transaction index
   */
  public Long getIndex() {
    return index;
  }

  /**
   * Sets the UTxO transaction index.
   *
   * @param index the transaction index
   */
  public void setIndex(Long index) {
    this.index = index;
  }

  /**
   * Gets the UTxO transaction hash.
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the UTxO transaction hash.
   *
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  @Override
  public String toString() {
    return "UtxoRef{" +
        "index=" + index +
        ", txHash='" + txHash + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UtxoRef utxoRef = (UtxoRef) o;
    return java.util.Objects.equals(index, utxoRef.index) &&
        java.util.Objects.equals(txHash, utxoRef.txHash);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(index, txHash);
  }
}
