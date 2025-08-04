package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A paginated response for pool list information. Pass in the `next_cursor` in a subsequent request as the `cursor` query parameter to fetch the next page of results.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginatedPoolListInfo {

  /**
   * Endpoint response data.
   */
  @NotNull
  @Valid
  private List<@Valid PoolListInfo> data;

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
   * Default constructor.
   */
  public PaginatedPoolListInfo() {
  }

  /**
   * Constructor with all parameters.
   *
   * @param data        the endpoint response data
   * @param lastUpdated the last updated information
   * @param nextCursor  the pagination cursor
   */
  public PaginatedPoolListInfo(List<PoolListInfo> data, LastUpdated lastUpdated, String nextCursor) {
    this.data = data;
    this.lastUpdated = lastUpdated;
    this.nextCursor = nextCursor;
  }

  /**
   * Gets the endpoint response data.
   *
   * @return the endpoint response data
   */
  public List<PoolListInfo> getData() {
    return data;
  }

  /**
   * Sets the endpoint response data.
   *
   * @param data the endpoint response data to set
   */
  public void setData(List<PoolListInfo> data) {
    this.data = data;
  }

  /**
   * Gets the last updated information.
   *
   * @return the last updated information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last updated information.
   *
   * @param lastUpdated the last updated information to set
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the pagination cursor.
   *
   * @return the pagination cursor
   */
  public String getNextCursor() {
    return nextCursor;
  }

  /**
   * Sets the pagination cursor.
   *
   * @param nextCursor the pagination cursor to set
   */
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  /**
   * Returns a string representation of this object.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "PaginatedPoolListInfo{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        ", nextCursor='" + nextCursor + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaginatedPoolListInfo that = (PaginatedPoolListInfo) o;
    return Objects.equals(data, that.data) &&
        Objects.equals(lastUpdated, that.lastUpdated) &&
        Objects.equals(nextCursor, that.nextCursor);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated, nextCursor);
  }

}
