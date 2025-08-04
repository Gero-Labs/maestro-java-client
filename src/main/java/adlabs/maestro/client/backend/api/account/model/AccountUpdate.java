package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Stake account related update
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountUpdate {

  /**
   * Absolute slot of the block which contained the transaction
   */
  private Integer absSlot;

  /**
   * Type of action performed
   */
  private AccountAction action;

  /**
   * Deposit in lovelace if action is Registration
   */
  private String deposit;

  /**
   * Epoch number in which the transaction occurred
   */
  private Integer epochNo;

  /**
   * Transaction hash of the transaction which performed the action
   */
  private String txHash;

  /**
   * Default constructor
   */
  public AccountUpdate() {
  }

  /**
   * Constructor with all fields
   *
   * @param absSlot  Absolute slot of the block which contained the transaction
   * @param action   Type of action performed
   * @param deposit  Deposit in lovelace if action is Registration
   * @param epochNo  Epoch number in which the transaction occurred
   * @param txHash   Transaction hash of the transaction which performed the action
   */
  public AccountUpdate(Integer absSlot, AccountAction action, String deposit, Integer epochNo, String txHash) {
    this.absSlot = absSlot;
    this.action = action;
    this.deposit = deposit;
    this.epochNo = epochNo;
    this.txHash = txHash;
  }

  /**
   * Gets the absolute slot of the block which contained the transaction
   *
   * @return the absolute slot
   */
  public Integer getAbsSlot() {
    return absSlot;
  }

  /**
   * Sets the absolute slot of the block which contained the transaction
   *
   * @param absSlot the absolute slot
   */
  public void setAbsSlot(Integer absSlot) {
    this.absSlot = absSlot;
  }

  /**
   * Gets the type of action performed
   *
   * @return the account action
   */
  public AccountAction getAction() {
    return action;
  }

  /**
   * Sets the type of action performed
   *
   * @param action the account action
   */
  public void setAction(AccountAction action) {
    this.action = action;
  }

  /**
   * Gets the deposit in lovelace if action is Registration
   *
   * @return the deposit amount
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the deposit in lovelace if action is Registration
   *
   * @param deposit the deposit amount
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the epoch number in which the transaction occurred
   *
   * @return the epoch number
   */
  public Integer getEpochNo() {
    return epochNo;
  }

  /**
   * Sets the epoch number in which the transaction occurred
   *
   * @param epochNo the epoch number
   */
  public void setEpochNo(Integer epochNo) {
    this.epochNo = epochNo;
  }

  /**
   * Gets the transaction hash of the transaction which performed the action
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash of the transaction which performed the action
   *
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Returns a string representation of the AccountUpdate
   *
   * @return string representation
   */
  @Override
  public String toString() {
    return "AccountUpdate{" +
        "absSlot=" + absSlot +
        ", action=" + action +
        ", deposit='" + deposit + '\'' +
        ", epochNo=" + epochNo +
        ", txHash='" + txHash + '\'' +
        '}';
  }
}