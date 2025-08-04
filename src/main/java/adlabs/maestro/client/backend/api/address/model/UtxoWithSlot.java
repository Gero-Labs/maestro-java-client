package adlabs.maestro.client.backend.api.address.model;

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
 * Represents a transaction output (UTxO) with the slot information of the block that produced it.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UtxoWithSlot {

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
   * The UTxO transaction index.
   */
  @NotNull
  @Min(0)
  private Integer index;

  /**
   * The reference script, if any.
   */
  @Valid
  private Script referenceScript;

  /**
   * The absolute slot of the block which produced the UTxO.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * The UTxO transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Hex-encoded transaction output CBOR bytes.
   */
  private String txoutCbor;

  /**
   * Default constructor.
   */
  public UtxoWithSlot() {
  }

  /**
   * Constructor with all fields.
   *
   * @param address The address which controls the UTxO
   * @param assets A list of assets contained in the UTxO
   * @param datum The datum option associated with the UTxO, if any
   * @param index The UTxO transaction index
   * @param referenceScript The reference script, if any
   * @param slot The absolute slot of the block which produced the UTxO
   * @param txHash The UTxO transaction hash
   * @param txoutCbor Hex-encoded transaction output CBOR bytes
   */
  public UtxoWithSlot(String address, List<Asset> assets, DatumOption datum, Integer index, 
                      Script referenceScript, Long slot, String txHash, String txoutCbor) {
    this.address = address;
    this.assets = assets;
    this.datum = datum;
    this.index = index;
    this.referenceScript = referenceScript;
    this.slot = slot;
    this.txHash = txHash;
    this.txoutCbor = txoutCbor;
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
   * @param address the address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the list of assets contained in the UTxO.
   *
   * @return the assets list
   */
  public List<Asset> getAssets() {
    return assets;
  }

  /**
   * Sets the list of assets contained in the UTxO.
   *
   * @param assets the assets list
   */
  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

  /**
   * Gets the datum option associated with the UTxO, if any.
   *
   * @return the datum option
   */
  public DatumOption getDatum() {
    return datum;
  }

  /**
   * Sets the datum option associated with the UTxO, if any.
   *
   * @param datum the datum option
   */
  public void setDatum(DatumOption datum) {
    this.datum = datum;
  }

  /**
   * Gets the UTxO transaction index.
   *
   * @return the transaction index
   */
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the UTxO transaction index.
   *
   * @param index the transaction index
   */
  public void setIndex(Integer index) {
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
   * @param referenceScript the reference script
   */
  public void setReferenceScript(Script referenceScript) {
    this.referenceScript = referenceScript;
  }

  /**
   * Gets the absolute slot of the block which produced the UTxO.
   *
   * @return the slot number
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block which produced the UTxO.
   *
   * @param slot the slot number
   */
  public void setSlot(Long slot) {
    this.slot = slot;
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

  /**
   * Gets the hex-encoded transaction output CBOR bytes.
   *
   * @return the CBOR bytes
   */
  public String getTxoutCbor() {
    return txoutCbor;
  }

  /**
   * Sets the hex-encoded transaction output CBOR bytes.
   *
   * @param txoutCbor the CBOR bytes
   */
  public void setTxoutCbor(String txoutCbor) {
    this.txoutCbor = txoutCbor;
  }

  @Override
  public String toString() {
    return "UtxoWithSlot{" +
        "address='" + address + '\'' +
        ", assets=" + assets +
        ", datum=" + datum +
        ", index=" + index +
        ", referenceScript=" + referenceScript +
        ", slot=" + slot +
        ", txHash='" + txHash + '\'' +
        ", txoutCbor='" + txoutCbor + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UtxoWithSlot that = (UtxoWithSlot) o;
    return java.util.Objects.equals(address, that.address) &&
        java.util.Objects.equals(assets, that.assets) &&
        java.util.Objects.equals(datum, that.datum) &&
        java.util.Objects.equals(index, that.index) &&
        java.util.Objects.equals(referenceScript, that.referenceScript) &&
        java.util.Objects.equals(slot, that.slot) &&
        java.util.Objects.equals(txHash, that.txHash) &&
        java.util.Objects.equals(txoutCbor, that.txoutCbor);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(address, assets, datum, index, referenceScript, slot, txHash, txoutCbor);
  }
}
