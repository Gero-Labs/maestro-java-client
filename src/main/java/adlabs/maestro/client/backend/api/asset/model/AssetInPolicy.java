package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Asset of a specific policy
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInPolicy {

  /**
   * Amount of the asset
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * Hex encoded asset name
   */
  @NotNull
  private String name;

  /**
   * Default constructor
   */
  public AssetInPolicy() {
  }

  /**
   * Constructor with all fields
   *
   * @param amount the amount of the asset
   * @param name the hex encoded asset name
   */
  public AssetInPolicy(String amount, String name) {
    this.amount = amount;
    this.name = name;
  }

  /**
   * Gets the amount of the asset
   *
   * @return the amount of the asset
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the asset
   *
   * @param amount the amount of the asset
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Gets the hex encoded asset name
   *
   * @return the hex encoded asset name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the hex encoded asset name
   *
   * @param name the hex encoded asset name
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "AssetInPolicy{" +
        "amount='" + amount + '\'' +
        ", name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetInPolicy that = (AssetInPolicy) o;
    return Objects.equals(amount, that.amount) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, name);
  }
}