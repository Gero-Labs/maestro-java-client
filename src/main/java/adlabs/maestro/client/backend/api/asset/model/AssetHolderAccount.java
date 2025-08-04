package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Account which controls some of a specific asset
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetHolderAccount {

  /**
   * Stake/reward address for stake credential
   */
  @NotNull
  private String account;

  /**
   * Amount controlled by the account
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * Default constructor
   */
  public AssetHolderAccount() {
  }

  /**
   * Constructor with all fields
   *
   * @param account the stake/reward address for stake credential
   * @param amount the amount controlled by the account
   */
  public AssetHolderAccount(String account, String amount) {
    this.account = account;
    this.amount = amount;
  }

  /**
   * Gets the stake/reward address for stake credential
   *
   * @return the stake/reward address for stake credential
   */
  public String getAccount() {
    return account;
  }

  /**
   * Sets the stake/reward address for stake credential
   *
   * @param account the stake/reward address for stake credential
   */
  public void setAccount(String account) {
    this.account = account;
  }

  /**
   * Gets the amount controlled by the account
   *
   * @return the amount controlled by the account
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount controlled by the account
   *
   * @param amount the amount controlled by the account
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "AssetHolderAccount{" +
        "account='" + account + '\'' +
        ", amount='" + amount + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetHolderAccount that = (AssetHolderAccount) o;
    return Objects.equals(account, that.account) && Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount);
  }
}