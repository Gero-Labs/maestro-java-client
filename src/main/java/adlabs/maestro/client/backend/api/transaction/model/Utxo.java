package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.api.script.model.Script;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.asset.model.Asset;
import adlabs.maestro.client.backend.api.datum.model.DatumOption;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a transaction output (UTxO).
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Utxo {

  /**
   * The address which controls the UTxO.
   */
  @NotNull
  private String address;

  /**
   * A list of assets contained in the UTxO.
   */
  @NotNull
  @Valid
  private List<Asset> assets;

  /**
   * The datum option associated with the UTxO, if any.
   */
  @Valid
  private DatumOption datum;

  /**
   * The transaction index of the UTxO.
   */
  @NotNull
  @Min(0L)
  private Long index;

  /**
   * The reference script, if any.
   */
  @Valid
  private Script referenceScript;

  /**
   * The transaction hash of the UTxO.
   */
  @NotNull
  private String txHash;

  /**
   * Creates a no-argument constructor.
   */
  public Utxo() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param address The address which controls the UTxO
   * @param assets A list of assets contained in the UTxO
   * @param datum The datum option associated with the UTxO, if any
   * @param index The transaction index of the UTxO
   * @param referenceScript The reference script, if any
   * @param txHash The transaction hash of the UTxO
   */
  public Utxo(String address, List<Asset> assets, DatumOption datum, Long index, Script referenceScript, String txHash) {
    this.address = address;
    this.assets = assets;
    this.datum = datum;
    this.index = index;
    this.referenceScript = referenceScript;
    this.txHash = txHash;
  }

  /**
   * Gets the address which controls the UTxO.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address which controls the UTxO.
   *
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the list of assets contained in the UTxO.
   *
   * @return the assets
   */
  public List<Asset> getAssets() {
    return assets;
  }

  /**
   * Sets the list of assets contained in the UTxO.
   *
   * @param assets the assets to set
   */
  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

  /**
   * Gets the datum option associated with the UTxO, if any.
   *
   * @return the datum
   */
  public DatumOption getDatum() {
    return datum;
  }

  /**
   * Sets the datum option associated with the UTxO, if any.
   *
   * @param datum the datum to set
   */
  public void setDatum(DatumOption datum) {
    this.datum = datum;
  }

  /**
   * Gets the transaction index of the UTxO.
   *
   * @return the index
   */
  public Long getIndex() {
    return index;
  }

  /**
   * Sets the transaction index of the UTxO.
   *
   * @param index the index to set
   */
  public void setIndex(Long index) {
    this.index = index;
  }

  /**
   * Gets the reference script, if any.
   *
   * @return the reference script
   */
  public Script getReferenceScript() {
    return referenceScript;
  }

  /**
   * Sets the reference script, if any.
   *
   * @param referenceScript the reference script to set
   */
  public void setReferenceScript(Script referenceScript) {
    this.referenceScript = referenceScript;
  }

  /**
   * Gets the transaction hash of the UTxO.
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash of the UTxO.
   *
   * @param txHash the transaction hash to set
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  @Override
  public String toString() {
    return "Utxo{" +
        "address='" + address + '\'' +
        ", assets=" + assets +
        ", datum=" + datum +
        ", index=" + index +
        ", referenceScript=" + referenceScript +
        ", txHash='" + txHash + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Utxo utxo = (Utxo) o;
    return java.util.Objects.equals(address, utxo.address) &&
        java.util.Objects.equals(assets, utxo.assets) &&
        java.util.Objects.equals(datum, utxo.datum) &&
        java.util.Objects.equals(index, utxo.index) &&
        java.util.Objects.equals(referenceScript, utxo.referenceScript) &&
        java.util.Objects.equals(txHash, utxo.txHash);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(address, assets, datum, index, referenceScript, txHash);
  }
}
