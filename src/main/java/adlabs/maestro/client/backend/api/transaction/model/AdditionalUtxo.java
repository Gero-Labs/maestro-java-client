package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a UTxO that may not be on-chain yet but is used in transaction inputs.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AdditionalUtxo {

  /**
   * No-argument constructor.
   */
  public AdditionalUtxo() {
  }

  /**
   * All-argument constructor.
   *
   * @param index the UTxO transaction index
   * @param txHash the UTxO transaction hash
   * @param txoutCbor the CBOR encoding of the UTxO
   */
  public AdditionalUtxo(Long index, String txHash, String txoutCbor) {
    this.index = index;
    this.txHash = txHash;
    this.txoutCbor = txoutCbor;
  }

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
   * The CBOR encoding of the UTxO.
   */
  @NotNull
  private String txoutCbor;

  /**
   * Gets the UTxO transaction index.
   *
   * @return the UTxO transaction index
   */
  public Long getIndex() {
    return index;
  }

  /**
   * Sets the UTxO transaction index.
   *
   * @param index the UTxO transaction index to set
   */
  public void setIndex(Long index) {
    this.index = index;
  }

  /**
   * Gets the UTxO transaction hash.
   *
   * @return the UTxO transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the UTxO transaction hash.
   *
   * @param txHash the UTxO transaction hash to set
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Gets the CBOR encoding of the UTxO.
   *
   * @return the CBOR encoding of the UTxO
   */
  public String getTxoutCbor() {
    return txoutCbor;
  }

  /**
   * Sets the CBOR encoding of the UTxO.
   *
   * @param txoutCbor the CBOR encoding of the UTxO to set
   */
  public void setTxoutCbor(String txoutCbor) {
    this.txoutCbor = txoutCbor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AdditionalUtxo that = (AdditionalUtxo) o;
    return java.util.Objects.equals(index, that.index) &&
        java.util.Objects.equals(txHash, that.txHash) &&
        java.util.Objects.equals(txoutCbor, that.txoutCbor);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(index, txHash, txoutCbor);
  }

  @Override
  public String toString() {
    return "AdditionalUtxo{" +
        "index=" + index +
        ", txHash='" + txHash + '\'' +
        ", txoutCbor='" + txoutCbor + '\'' +
        '}';
  }
}
