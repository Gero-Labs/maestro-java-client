package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A paginated response for account history. Pass in the `next_cursor` in a subsequent request as the `cursor` query parameter to fetch the next page of results.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginatedAccountHistory {

  /**
   * Endpoint response data.
   */
  @NotNull
  @Valid
  private List<@Valid AccountHistory> data;

  /**
   * Last updated information.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;

  /**
   * Pagination cursor.
   */
  private String nextCursor;

  /**
   * Default constructor
   */
  public PaginatedAccountHistory() {
  }

  /**
   * Constructor with all fields
   *
   * @param data        Endpoint response data
   * @param lastUpdated Last updated information
   * @param nextCursor  Pagination cursor
   */
  public PaginatedAccountHistory(List<AccountHistory> data, LastUpdated lastUpdated, String nextCursor) {
    this.data = data;
    this.lastUpdated = lastUpdated;
    this.nextCursor = nextCursor;
  }

  /**
   * Gets the endpoint response data
   *
   * @return the data list
   */
  public List<AccountHistory> getData() {
    return data;
  }

  /**
   * Sets the endpoint response data
   *
   * @param data the data list
   */
  public void setData(List<AccountHistory> data) {
    this.data = data;
  }

  /**
   * Gets the last updated information
   *
   * @return the last updated information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last updated information
   *
   * @param lastUpdated the last updated information
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the pagination cursor
   *
   * @return the next cursor
   */
  public String getNextCursor() {
    return nextCursor;
  }

  /**
   * Sets the pagination cursor
   *
   * @param nextCursor the next cursor
   */
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  /**
   * Returns a string representation of the PaginatedAccountHistory
   *
   * @return string representation
   */
  @Override
  public String toString() {
    return "PaginatedAccountHistory{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        ", nextCursor='" + nextCursor + '\'' +
        '}';
  }
}
