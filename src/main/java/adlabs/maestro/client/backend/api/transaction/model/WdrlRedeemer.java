package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a withdrawal redeemer.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class WdrlRedeemer {

  /**
   * The datum associated with the withdrawal.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * The execution unit budget (memory, steps).
   */
  @NotNull
  @Valid
  private List<@Min(0L) Long> exUnits;

  /**
   * The stake account from which the redeemer is attempting to withdraw rewards.
   */
  @NotNull
  private String stakeAddress;

  /**
   * Creates a no-argument constructor.
   */
  public WdrlRedeemer() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param data The datum associated with the withdrawal
   * @param exUnits The execution unit budget (memory, steps)
   * @param stakeAddress The stake account from which the redeemer is attempting to withdraw rewards
   */
  public WdrlRedeemer(Datum data, List<Long> exUnits, String stakeAddress) {
    this.data = data;
    this.exUnits = exUnits;
    this.stakeAddress = stakeAddress;
  }

  /**
   * Gets the datum associated with the withdrawal.
   *
   * @return the datum
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the datum associated with the withdrawal.
   *
   * @param data the datum to set
   */
  public void setData(Datum data) {
    this.data = data;
  }

  /**
   * Gets the execution unit budget (memory, steps).
   *
   * @return the execution units
   */
  public List<Long> getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution unit budget (memory, steps).
   *
   * @param exUnits the execution units to set
   */
  public void setExUnits(List<Long> exUnits) {
    this.exUnits = exUnits;
  }

  /**
   * Gets the stake account from which the redeemer is attempting to withdraw rewards.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake account from which the redeemer is attempting to withdraw rewards.
   *
   * @param stakeAddress the stake address to set
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  @Override
  public String toString() {
    return "WdrlRedeemer{" +
        "data=" + data +
        ", exUnits=" + exUnits +
        ", stakeAddress='" + stakeAddress + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WdrlRedeemer that = (WdrlRedeemer) o;
    return java.util.Objects.equals(data, that.data) &&
        java.util.Objects.equals(exUnits, that.exUnits) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, exUnits, stakeAddress);
  }
}
