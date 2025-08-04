package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a Lovelace or native asset.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MintAsset {

  /**
   * No-argument constructor.
   */
  public MintAsset() {
  }

  /**
   * All-argument constructor.
   *
   * @param amount the amount of the asset
   * @param unit the asset (represented as concatenation of hex encoded policy ID and asset name)
   */
  public MintAsset(String amount, String unit) {
    this.amount = amount;
    this.unit = unit;
  }

  /**
   * Amount of the asset.
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * Asset (represented as concatenation of hex encoded policy ID and asset name).
   */
  @NotNull
  private String unit;

  /**
   * Gets the amount of the asset.
   *
   * @return the amount of the asset
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the asset.
   *
   * @param amount the amount of the asset to set
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the asset (represented as concatenation of hex encoded policy ID and asset name).
   *
   * @return the asset (represented as concatenation of hex encoded policy ID and asset name)
   */
  public String getUnit() {
    return unit;
  }

  /**
   * Sets the asset (represented as concatenation of hex encoded policy ID and asset name).
   *
   * @param unit the asset (represented as concatenation of hex encoded policy ID and asset name) to set
   */
  public void setUnit(String unit) {
    this.unit = unit;
  }

  @Override
  public String toString() {
    return "MintAsset{" +
        "amount='" + amount + '\'' +
        ", unit='" + unit + '\'' +
        '}';
  }
}
