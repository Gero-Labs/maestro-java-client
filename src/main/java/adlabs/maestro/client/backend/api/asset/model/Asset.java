package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Lovelace or native asset
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Asset {

  /**
   * Amount of the asset
   */
  @NotNull
  @Valid
  private Long amount;

  /**
   * Asset (either `lovelace` or concatenation of hex encoded policy ID and asset name for native asset)
   */
  @NotNull
  private String unit;

  /**
   * Default constructor
   */
  public Asset() {
  }

  /**
   * Constructor with all fields
   *
   * @param amount the amount of the asset
   * @param unit the asset unit
   */
  public Asset(Long amount, String unit) {
    this.amount = amount;
    this.unit = unit;
  }

  /**
   * Gets the amount of the asset
   *
   * @return the amount of the asset
   */
  public Long getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the asset
   *
   * @param amount the amount of the asset
   */
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   * Gets the asset unit
   *
   * @return the asset unit
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the asset unit
   *
   * @param unit the asset unit
   */
  public void setUnit(String unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "Asset{" +
        "amount=" + amount +
        ", unit='" + unit + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Asset asset = (Asset) o;
    return Objects.equals(amount, asset.amount) && Objects.equals(unit, asset.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }
}