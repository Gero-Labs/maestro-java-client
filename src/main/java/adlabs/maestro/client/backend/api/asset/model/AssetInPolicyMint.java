package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

/**
 * Name of asset of a specific policy and amount minted or burned
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInPolicyMint {

  /**
   * Amount of asset minted (negative if burned)
   */
  private String amount;

  /**
   * Asset name
   */
  private String name;

  /**
   * No-args constructor for AssetInPolicyMint.
   */
  public AssetInPolicyMint() {
  }

  /**
   * All-args constructor for AssetInPolicyMint.
   *
   * @param amount Amount of asset minted (negative if burned)
   * @param name   Asset name
   */
  public AssetInPolicyMint(String amount, String name) {
    this.amount = amount;
    this.name = name;
  }

  /**
   * Gets the amount of asset minted (negative if burned).
   *
   * @return the amount
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount of asset minted (negative if burned).
   *
   * @param amount the amount to set
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the asset name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the asset name.
   *
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "AssetInPolicyMint{" +
        "amount='" + amount + '\'' +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetInPolicyMint that = (AssetInPolicyMint) o;
    return Objects.equals(amount, that.amount) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, name);
  }
}