package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Holder of a specific asset
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetHolder {

  /**
   * Address of the holder
   */
  @NotNull
  private String address;

  /**
   * Amount held by the address
   */
  @NotNull
  @Valid
  private String amount;

  /**
   * Default constructor
   */
  public AssetHolder() {
  }

  /**
   * Constructor with all fields
   *
   * @param address the address of the holder
   * @param amount the amount held by the address
   */
  public AssetHolder(String address, String amount) {
    this.address = address;
    this.amount = amount;
  }

  /**
   * Gets the address of the holder
   *
   * @return the address of the holder
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the address of the holder
   *
   * @param address the address of the holder
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Gets the amount held by the address
   *
   * @return the amount held by the address
   */
  public String getAmount() {
    return amount;
  }

  /**
   * Sets the amount held by the address
   *
   * @param amount the amount held by the address
   */
  public void setAmount(String amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "AssetHolder{" +
        "address='" + address + '\'' +
        ", amount='" + amount + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetHolder that = (AssetHolder) o;
    return Objects.equals(address, that.address) && Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount);
  }
}