package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * A paginated response for policy holders. Pass in the `next_cursor` in a subsequent request as the `cursor` query parameter to fetch the next page of results.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PaginatedPolicyHolder()} - Creates a no-argument constructor</li>
 *   <li>{@code PaginatedPolicyHolder(List<PolicyHolder>, LastUpdated, String)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginatedPolicyHolder {

  /**
   * Endpoint response data.
   */
  @NotNull
  @Valid
  private List<@Valid PolicyHolder> data;

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
   * Default no-argument constructor.
   */
  public PaginatedPolicyHolder() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the endpoint response data
   * @param lastUpdated the last updated information
   * @param nextCursor the pagination cursor
   */
  public PaginatedPolicyHolder(List<PolicyHolder> data, LastUpdated lastUpdated, String nextCursor) {
    this.data = data;
    this.lastUpdated = lastUpdated;
    this.nextCursor = nextCursor;
  }

  /**
   * Gets the endpoint response data.
   *
   * @return the endpoint response data
   */
  public List<PolicyHolder> getData() {
    return data;
  }

  /**
   * Sets the endpoint response data.
   *
   * @param data the endpoint response data
   */
  public void setData(List<PolicyHolder> data) {
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
   * @param lastUpdated the last updated information
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
   * @param nextCursor the pagination cursor
   */
  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaginatedPolicyHolder that = (PaginatedPolicyHolder) o;
    return Objects.equals(data, that.data) &&
           Objects.equals(lastUpdated, that.lastUpdated) &&
           Objects.equals(nextCursor, that.nextCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated, nextCursor);
  }

  @Override
  public String toString() {
    return "PaginatedPolicyHolder{" +
           "data=" + data +
           ", lastUpdated=" + lastUpdated +
           ", nextCursor='" + nextCursor + '\'' +
           '}';
  }
}
