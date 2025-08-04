package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip
 * of the indexer, which details at which point in the chain's history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedAccountInfo {

  /**
   * Account information data
   */
  @NotNull
  @Valid
  private AccountInfo data;

  /**
   * Details of when this data was last updated at the chain tip
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Default constructor
   */
  public TimestampedAccountInfo() {
  }

  /**
   * Constructor with all fields
   *
   * @param data        Account information data
   * @param lastUpdated Details of when this data was last updated at the chain tip
   */
  public TimestampedAccountInfo(AccountInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the account information data
   *
   * @return the account information data
   */
  public AccountInfo getData() {
    return data;
  }

  /**
   * Sets the account information data
   *
   * @param data the account information data
   */
  public void setData(AccountInfo data) {
    this.data = data;
  }

  /**
   * Gets the details of when this data was last updated at the chain tip
   *
   * @return the last updated details
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the details of when this data was last updated at the chain tip
   *
   * @param lastUpdated the last updated details
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Returns a string representation of the TimestampedAccountInfo
   *
   * @return string representation
   */
  @Override
  public String toString() {
    return "TimestampedAccountInfo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }
}