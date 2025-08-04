package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Number of holders of at least one of a specific asset or assets of a specific policy, by address or address staking part.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Holders {

  /**
   * Number of unique staking keys used in addresses which control at least one of an asset of the policy ID.
   */
  @NotNull
  @Min(0L)
  private Long byAccount;

  /**
   * Number of unique addresses which control at least one of an asset of the policy ID.
   */
  @NotNull
  @Min(0L)
  private Long byAddress;

  /**
   * Default no-argument constructor.
   */
  public Holders() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param byAccount the number of unique staking keys
   * @param byAddress the number of unique addresses
   */
  public Holders(Long byAccount, Long byAddress) {
    this.byAccount = byAccount;
    this.byAddress = byAddress;
  }

  /**
   * Gets the number of unique staking keys used in addresses which control at least one of an asset of the policy ID.
   * 
   * @return the number of unique staking keys
   */
  public Long getByAccount() {
    return byAccount;
  }

  /**
   * Sets the number of unique staking keys used in addresses which control at least one of an asset of the policy ID.
   * 
   * @param byAccount the number of unique staking keys to set
   */
  public void setByAccount(Long byAccount) {
    this.byAccount = byAccount;
  }

  /**
   * Gets the number of unique addresses which control at least one of an asset of the policy ID.
   * 
   * @return the number of unique addresses
   */
  public Long getByAddress() {
    return byAddress;
  }

  /**
   * Sets the number of unique addresses which control at least one of an asset of the policy ID.
   * 
   * @param byAddress the number of unique addresses to set
   */
  public void setByAddress(Long byAddress) {
    this.byAddress = byAddress;
  }

  @Override
  public String toString() {
    return "Holders{" +
            "byAccount=" + byAccount +
            ", byAddress=" + byAddress +
            '}';
  }
}
