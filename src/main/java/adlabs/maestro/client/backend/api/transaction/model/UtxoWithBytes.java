package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.api.script.model.Script;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.asset.model.Asset;
import adlabs.maestro.client.backend.api.datum.model.DatumOption;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a transaction output (UTxO) with an optional field for the CBOR bytes.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UtxoWithBytes {

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
  public UtxoWithBytes() {
  }

  /**
   * Constructor with all fields.
   *
   * @param address the address which controls the UTxO
   * @param assets a list of assets contained in the UTxO
   * @param datum the datum option associated with the UTxO, if any
   * @param index the UTxO transaction index
   * @param referenceScript the reference script, if any
   * @param txHash the UTxO transaction hash
   * @param txoutCbor hex-encoded transaction output CBOR bytes
   */
  public UtxoWithBytes(String address, List<Asset> assets, DatumOption datum, Integer index, Script referenceScript, String txHash, String txoutCbor) {
    this.address = address;
    this.assets = assets;
    this.datum = datum;
    this.index = index;
    this.referenceScript = referenceScript;
    this.txHash = txHash;
    this.txoutCbor = txoutCbor;
  }

  /**
   * Gets the address which controls the UTxO.
   *
   * @return the address which controls the UTxO
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address which controls the UTxO.
   *
   * @param address the address which controls the UTxO
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets a list of assets contained in the UTxO.
   *
   * @return a list of assets contained in the UTxO
   */
  public List<Asset> getAssets() {
    return assets;
  }

  /**
   * Sets a list of assets contained in the UTxO.
   *
   * @param assets a list of assets contained in the UTxO
   */
  public void setAssets(List<Asset> assets) {
    this.assets = assets;
  }

  /**
   * Gets the datum option associated with the UTxO, if any.
   *
   * @return the datum option associated with the UTxO
   */
  public DatumOption getDatum() {
    return datum;
  }

  /**
   * Sets the datum option associated with the UTxO, if any.
   *
   * @param datum the datum option associated with the UTxO
   */
  public void setDatum(DatumOption datum) {
    this.datum = datum;
  }

  /**
   * Gets the UTxO transaction index.
   *
   * @return the UTxO transaction index
   */
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the UTxO transaction index.
   *
   * @param index the UTxO transaction index
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
   * @param txHash the UTxO transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Gets the hex-encoded transaction output CBOR bytes.
   *
   * @return the hex-encoded transaction output CBOR bytes
   */
  public String getTxoutCbor() {
    return txoutCbor;
  }

  /**
   * Sets the hex-encoded transaction output CBOR bytes.
   *
   * @param txoutCbor the hex-encoded transaction output CBOR bytes
   */
  public void setTxoutCbor(String txoutCbor) {
    this.txoutCbor = txoutCbor;
  }

  /**
   * Returns a string representation of this UtxoWithBytes.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "UtxoWithBytes{" +
        "address='" + address + '\'' +
        ", assets=" + assets +
        ", datum=" + datum +
        ", index=" + index +
        ", referenceScript=" + referenceScript +
        ", txHash='" + txHash + '\'' +
        ", txoutCbor='" + txoutCbor + '\'' +
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
    UtxoWithBytes that = (UtxoWithBytes) o;
    return Objects.equals(address, that.address) && Objects.equals(assets, that.assets) && Objects.equals(datum, that.datum) && Objects.equals(index, that.index) && Objects.equals(referenceScript, that.referenceScript) && Objects.equals(txHash, that.txHash) && Objects.equals(txoutCbor, that.txoutCbor);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(address, assets, datum, index, referenceScript, txHash, txoutCbor);
  }
}
