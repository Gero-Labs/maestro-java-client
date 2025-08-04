package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicy;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * Holder of assets of a specific policy.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PolicyHolder()} - Creates a no-argument constructor</li>
 *   <li>{@code PolicyHolder(String, List<AssetInPolicy>)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyHolder {

  /**
   * Address of the holder.
   */
  @NotNull
  private String address;

  /**
   * List of assets owned by the holder belonging to the policy.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicy> assets;

  /**
   * Default no-argument constructor.
   */
  public PolicyHolder() {
  }

  /**
   * Constructor with all fields.
   *
   * @param address the address of the holder
   * @param assets the list of assets owned by the holder belonging to the policy
   */
  public PolicyHolder(String address, List<AssetInPolicy> assets) {
    this.address = address;
    this.assets = assets;
  }

  /**
   * Gets the address of the holder.
   *
   * @return the address of the holder
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address of the holder.
   *
   * @param address the address of the holder
   */
  public void setAddress(String address) {
    this.address = address;
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
    PolicyHolder that = (PolicyHolder) o;
    return Objects.equals(address, that.address) &&
           Objects.equals(assets, that.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, assets);
  }

  @Override
  public String toString() {
    return "PolicyHolder{" +
           "address='" + address + '\'' +
           ", assets=" + assets +
           '}';
  }
}
