package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicy;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * UTxO which contains assets of a specific policy.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PolicyUtxo()} - Creates a no-argument constructor</li>
 *   <li>{@code PolicyUtxo(String, List<AssetInPolicy>, Integer, Long, String)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyUtxo {

  /**
   * Bech32-encoded address of the UTXO.
   */
  @NotNull
  private String address;

  /**
   * Assets contained in the UTXO belonging to the policy.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicy> assets;

  /**
   * UTXO index.
   */
  @NotNull
  @Min(0)
  private Integer index;

  /**
   * Absolute slot of the block which contains the UTXO.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction hash of the UTXO.
   */
  @NotNull
  private String txHash;

  /**
   * Default no-argument constructor.
   */
  public PolicyUtxo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param address the Bech32-encoded address of the UTXO
   * @param assets the assets contained in the UTXO belonging to the policy
   * @param index the UTXO index
   * @param slot the absolute slot of the block which contains the UTXO
   * @param txHash the transaction hash of the UTXO
   */
  public PolicyUtxo(String address, List<AssetInPolicy> assets, Integer index, Long slot, String txHash) {
    this.address = address;
    this.assets = assets;
    this.index = index;
    this.slot = slot;
    this.txHash = txHash;
  }

  /**
   * Gets the Bech32-encoded address of the UTXO.
   *
   * @return the Bech32-encoded address of the UTXO
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the Bech32-encoded address of the UTXO.
   *
   * @param address the Bech32-encoded address of the UTXO
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the assets contained in the UTXO belonging to the policy.
   *
   * @return the assets contained in the UTXO belonging to the policy
   */
  public List<AssetInPolicy> getAssets() {
    return assets;
  }

  /**
   * Sets the assets contained in the UTXO belonging to the policy.
   *
   * @param assets the assets contained in the UTXO belonging to the policy
   */
  public void setAssets(List<AssetInPolicy> assets) {
    this.assets = assets;
  }

  /**
   * Gets the UTXO index.
   *
   * @return the UTXO index
   */
  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the UTXO index.
   *
   * @param index the UTXO index
   */
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Gets the absolute slot of the block which contains the UTXO.
   *
   * @return the absolute slot of the block which contains the UTXO
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block which contains the UTXO.
   *
   * @param slot the absolute slot of the block which contains the UTXO
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the transaction hash of the UTXO.
   *
   * @return the transaction hash of the UTXO
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash of the UTXO.
   *
   * @param txHash the transaction hash of the UTXO
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyUtxo that = (PolicyUtxo) o;
    return Objects.equals(address, that.address) &&
           Objects.equals(assets, that.assets) &&
           Objects.equals(index, that.index) &&
           Objects.equals(slot, that.slot) &&
           Objects.equals(txHash, that.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, assets, index, slot, txHash);
  }

  @Override
  public String toString() {
    return "PolicyUtxo{" +
           "address='" + address + '\'' +
           ", assets=" + assets +
           ", index=" + index +
           ", slot=" + slot +
           ", txHash='" + txHash + '\'' +
           '}';
  }
}
