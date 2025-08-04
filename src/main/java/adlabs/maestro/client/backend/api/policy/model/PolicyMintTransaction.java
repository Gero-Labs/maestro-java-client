package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicyMint;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Transaction hash with details of when that transaction appeared on-chain.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PolicyMintTransaction()} - Creates a no-argument constructor</li>
 *   <li>{@code PolicyMintTransaction(List<AssetInPolicyMint>, Long, String, String)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyMintTransaction {

  /**
   * Assets minted or burned in the transaction.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicyMint> assets;

  /**
   * Absolute slot of the block which contains the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * UTC timestamp of the block which contains the transaction.
   */
  @NotNull
  private String timestamp;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default no-argument constructor.
   */
  public PolicyMintTransaction() {
  }

  /**
   * Constructor with all fields.
   *
   * @param assets the assets minted or burned in the transaction
   * @param slot the absolute slot of the block which contains the transaction
   * @param timestamp the UTC timestamp of the block which contains the transaction
   * @param txHash the transaction hash
   */
  public PolicyMintTransaction(List<AssetInPolicyMint> assets, Long slot, String timestamp, String txHash) {
    this.assets = assets;
    this.slot = slot;
    this.timestamp = timestamp;
    this.txHash = txHash;
  }

  /**
   * Gets the assets minted or burned in the transaction.
   *
   * @return the assets minted or burned in the transaction
   */
  public List<AssetInPolicyMint> getAssets() {
    return assets;
  }

  /**
   * Sets the assets minted or burned in the transaction.
   *
   * @param assets the assets minted or burned in the transaction
   */
  public void setAssets(List<AssetInPolicyMint> assets) {
    this.assets = assets;
  }

  /**
   * Gets the absolute slot of the block which contains the transaction.
   *
   * @return the absolute slot of the block which contains the transaction
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block which contains the transaction.
   *
   * @param slot the absolute slot of the block which contains the transaction
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the UTC timestamp of the block which contains the transaction.
   *
   * @return the UTC timestamp of the block which contains the transaction
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the UTC timestamp of the block which contains the transaction.
   *
   * @param timestamp the UTC timestamp of the block which contains the transaction
   */
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyMintTransaction that = (PolicyMintTransaction) o;
    return Objects.equals(assets, that.assets) &&
           Objects.equals(slot, that.slot) &&
           Objects.equals(timestamp, that.timestamp) &&
           Objects.equals(txHash, that.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, slot, timestamp, txHash);
  }

  @Override
  public String toString() {
    return "PolicyMintTransaction{" +
           "assets=" + assets +
           ", slot=" + slot +
           ", timestamp='" + timestamp + '\'' +
           ", txHash='" + txHash + '\'' +
           '}';
  }
}
