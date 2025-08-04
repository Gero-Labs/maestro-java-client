package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.NumOrString;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a withdrawal from a stake address.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Withdrawal {

  /**
   * No-argument constructor.
   */
  public Withdrawal() {
  }

  /**
   * All-argument constructor.
   *
   * @param amount the amount of the withdrawal
   * @param stakeAddress the stake address from which the withdrawal is made
   */
  public Withdrawal(NumOrString amount, String stakeAddress) {
    this.amount = amount;
    this.stakeAddress = stakeAddress;
  }

  /**
   * The amount of the withdrawal.
   */
  @NotNull
  @Valid
  private NumOrString amount;

  /**
   * The stake address from which the withdrawal is made.
   */
  @NotNull
  private String stakeAddress;

  /**
   * Gets the amount of the withdrawal.
   *
   * @return the withdrawal amount
   */
  public NumOrString getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the withdrawal.
   *
   * @param amount the withdrawal amount to set
   */
  public void setAmount(NumOrString amount) {
    this.amount = amount;
  }

  /**
   * Gets the stake address from which the withdrawal is made.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address from which the withdrawal is made.
   *
   * @param stakeAddress the stake address to set
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Withdrawal that = (Withdrawal) o;
    return java.util.Objects.equals(amount, that.amount) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(amount, stakeAddress);
  }

  @Override
  public String toString() {
    return "Withdrawal{" +
        "amount=" + amount +
        ", stakeAddress='" + stakeAddress + '\'' +
        '}';
  }
}
