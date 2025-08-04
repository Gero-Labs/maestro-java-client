package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicy;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Account which controls some assets of a specific policy.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PolicyHolderAccount()} - Creates a no-argument constructor</li>
 *   <li>{@code PolicyHolderAccount(String, List<AssetInPolicy>)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyHolderAccount {

  /**
   * Bech32-encoded stake address (reward address) or payment address.
   */
  @NotNull
  private String account;

  /**
   * List of assets owned by the holder belonging to the policy.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicy> assets;

  /**
   * Default no-argument constructor.
   */
  public PolicyHolderAccount() {
  }

  /**
   * Constructor with all fields.
   *
   * @param account the Bech32-encoded stake address (reward address) or payment address
   * @param assets the list of assets owned by the holder belonging to the policy
   */
  public PolicyHolderAccount(String account, List<AssetInPolicy> assets) {
    this.account = account;
    this.assets = assets;
  }

  /**
   * Gets the Bech32-encoded stake address (reward address) or payment address.
   *
   * @return the Bech32-encoded stake address (reward address) or payment address
   */
  public String getAccount() {
    return account;
  }

  /**
   * Sets the Bech32-encoded stake address (reward address) or payment address.
   *
   * @param account the Bech32-encoded stake address (reward address) or payment address
   */
  public void setAccount(String account) {
    this.account = account;
  }

  /**
   * Gets the list of assets owned by the holder belonging to the policy.
   *
   * @return the list of assets owned by the holder belonging to the policy
   */
  public List<AssetInPolicy> getAssets() {
    return assets;
  }

  /**
   * Sets the list of assets owned by the holder belonging to the policy.
   *
   * @param assets the list of assets owned by the holder belonging to the policy
   */
  public void setAssets(List<AssetInPolicy> assets) {
    this.assets = assets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyHolderAccount that = (PolicyHolderAccount) o;
    return Objects.equals(account, that.account) &&
           Objects.equals(assets, that.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, assets);
  }

  @Override
  public String toString() {
    return "PolicyHolderAccount{" +
           "account='" + account + '\'' +
           ", assets=" + assets +
           '}';
  }
}
