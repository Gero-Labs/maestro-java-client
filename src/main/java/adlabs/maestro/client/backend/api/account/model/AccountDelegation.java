package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Stake account related update
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountDelegation {

  /**
   * Epoch number in which the delegation becomes active
   */
  private Long activeEpochNo;

  /**
   * Bech32 encoded pool ID the account is delegating to
   */
  private String poolId;

  /**
   * Absolute slot of the block which contained the transaction
   */
  private Long slot;

  /**
   * Default constructor
   */
  public AccountDelegation() {
  }

  /**
   * Constructor with all fields
   *
   * @param activeEpochNo Epoch number in which the delegation becomes active
   * @param poolId        Bech32 encoded pool ID the account is delegating to
   * @param slot          Absolute slot of the block which contained the transaction
   */
  public AccountDelegation(Long activeEpochNo, String poolId, Long slot) {
    this.activeEpochNo = activeEpochNo;
    this.poolId = poolId;
    this.slot = slot;
  }

  /**
   * Gets the epoch number in which the delegation becomes active
   *
   * @return the active epoch number
   */
  public Long getActiveEpochNo() {
    return activeEpochNo;
  }

  /**
   * Sets the epoch number in which the delegation becomes active
   *
   * @param activeEpochNo the active epoch number
   */
  public void setActiveEpochNo(Long activeEpochNo) {
    this.activeEpochNo = activeEpochNo;
  }

  /**
   * Gets the Bech32 encoded pool ID the account is delegating to
   *
   * @return the pool ID
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the Bech32 encoded pool ID the account is delegating to
   *
   * @param poolId the pool ID
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  /**
   * Gets the absolute slot of the block which contained the transaction
   *
   * @return the slot
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the absolute slot of the block which contained the transaction
   *
   * @param slot the slot
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Returns a string representation of the AccountDelegation
   *
   * @return string representation
   */
  @Override
  public String toString() {
    return "AccountDelegation{" +
        "activeEpochNo=" + activeEpochNo +
        ", poolId='" + poolId + '\'' +
        ", slot=" + slot +
        '}';
  }
}
