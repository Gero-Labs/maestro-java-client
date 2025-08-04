package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A paginated response for UTXOs with bytes. Pass in the `next_cursor` in a subsequent request as the `cursor` query parameter to fetch the next page of results.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginatedUtxoWithBytes {

  /**
   * Endpoint response data.
   */
  @NotNull
  @Valid
  private List<@Valid UtxoWithBytes> data;

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
   * Creates a no-argument constructor.
   */
  public PaginatedUtxoWithBytes() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param data Endpoint response data
   * @param lastUpdated Last updated information
   * @param nextCursor Pagination cursor
   */
  public PaginatedUtxoWithBytes(List<UtxoWithBytes> data, LastUpdated lastUpdated, String nextCursor) {
    this.data = data;
    this.lastUpdated = lastUpdated;
    this.nextCursor = nextCursor;
  }

  /**
   * Gets the endpoint response data.
   *
   * @return the data
   */
  public List<UtxoWithBytes> getData() {
    return data;
  }

  /**
   * Sets the endpoint response data.
   *
   * @param data the data to set
   */
  public void setData(List<UtxoWithBytes> data) {
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
   * @return the next cursor
   */
  public String getNextCursor() {
    return nextCursor;
  }

  /**
   * Sets the pagination cursor.
   *
   * @param nextCursor the next cursor to set
   */
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  @Override
  public String toString() {
    return "PaginatedUtxoWithBytes{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        ", nextCursor='" + nextCursor + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaginatedUtxoWithBytes that = (PaginatedUtxoWithBytes) o;
    return java.util.Objects.equals(data, that.data) &&
        java.util.Objects.equals(lastUpdated, that.lastUpdated) &&
        java.util.Objects.equals(nextCursor, that.nextCursor);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, lastUpdated, nextCursor);
  }
}
