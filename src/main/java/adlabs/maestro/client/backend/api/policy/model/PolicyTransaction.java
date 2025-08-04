package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * A transaction which moves assets of a specific policy.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PolicyTransaction()} - Creates a no-argument constructor</li>
 *   <li>{@code PolicyTransaction(List<String>, Long, String)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyTransaction {

  /**
   * Assets involved in the transaction, belonging to the policy.
   */
  @NotNull
  private List<String> assets;

  /**
   * Absolute slot of the block which contains the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Default no-argument constructor.
   */
  public PolicyTransaction() {
  }

  /**
   * Constructor with all fields.
   *
   * @param assets the assets involved in the transaction, belonging to the policy
   * @param slot the absolute slot of the block which contains the transaction
   * @param txHash the transaction hash
   */
  public PolicyTransaction(List<String> assets, Long slot, String txHash) {
    this.assets = assets;
    this.slot = slot;
    this.txHash = txHash;
  }

  /**
   * Gets the assets involved in the transaction, belonging to the policy.
   *
   * @return the assets involved in the transaction, belonging to the policy
   */
  public List<String> getAssets() {
    return assets;
  }

  /**
   * Sets the assets involved in the transaction, belonging to the policy.
   *
   * @param assets the assets involved in the transaction, belonging to the policy
   */
  public void setAssets(List<String> assets) {
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
    PolicyTransaction that = (PolicyTransaction) o;
    return Objects.equals(assets, that.assets) &&
           Objects.equals(slot, that.slot) &&
           Objects.equals(txHash, that.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, slot, txHash);
  }

  @Override
  public String toString() {
    return "PolicyTransaction{" +
           "assets=" + assets +
           ", slot=" + slot +
           ", txHash='" + txHash + '\'' +
           '}';
  }
}
