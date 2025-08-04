package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

/**
 * UTxO which contains a specific asset
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetUtxo {

  /**
   * Address which controls the UTxO
   */
  private String address;

  /**
   * Amount of the asset in the UTxO
   */
  private String amount;

  /**
   * UTxO transaction index
   */
  private Long index;

  /**
   * Absolute slot of block which produced the UTxO
   */
  private Long slot;

  /**
   * UTxO transaction hash
   */
  private String txHash;

  /**
   * Default constructor
   */
  public AssetUtxo() {
  }

  /**
   * Constructor with all fields
   * @param address Address which controls the UTxO
   * @param amount Amount of the asset in the UTxO
   * @param index UTxO transaction index
   * @param slot Absolute slot of block which produced the UTxO
   * @param txHash UTxO transaction hash
   */
  public AssetUtxo(String address, String amount, Long index, Long slot, String txHash) {
    this.address = address;
    this.amount = amount;
    this.index = index;
    this.slot = slot;
    this.txHash = txHash;
  }

  /**
   * Gets the address which controls the UTxO
   * @return address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address which controls the UTxO
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the amount of the asset in the UTxO
   * @return amount
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the asset in the UTxO
   * @param amount the amount to set
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the UTxO transaction index
   * @return index
   */
  public Long getIndex() {
    return index;
  }

  /**
   * Sets the UTxO transaction index
   * @param index the index to set
   */
  public void setIndex(Long index) {
    this.index = index;
  }

  /**
   * Gets the absolute slot of block which produced the UTxO
   * @return slot
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of block which produced the UTxO
   * @param slot the slot to set
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the UTxO transaction hash
   * @return transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the UTxO transaction hash
   * @param txHash the transaction hash to set
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  @Override
  public String toString() {
    return "AssetUtxo{" +
        "address='" + address + '\'' +
        ", amount='" + amount + '\'' +
        ", index=" + index +
        ", slot=" + slot +
        ", txHash='" + txHash + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetUtxo assetUtxo = (AssetUtxo) o;
    return Objects.equals(address, assetUtxo.address) &&
        Objects.equals(amount, assetUtxo.amount) &&
        Objects.equals(index, assetUtxo.index) &&
        Objects.equals(slot, assetUtxo.slot) &&
        Objects.equals(txHash, assetUtxo.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount, index, slot, txHash);
  }
}