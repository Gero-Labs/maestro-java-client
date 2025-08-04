package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A paginated response for minting transactions. Pass in the `next_cursor` in a subsequent request as the `cursor` query parameter to fetch the next page of results.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginatedMintingTx {

  /**
   * Endpoint response data.
   */
  @NotNull
  @Valid
  private List<@Valid MintingTx> data;

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
  public PaginatedMintingTx() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param data the endpoint response data
   * @param lastUpdated the last updated information
   * @param nextCursor the pagination cursor
   */
  public PaginatedMintingTx(List<MintingTx> data, LastUpdated lastUpdated, String nextCursor) {
    this.data = data;
    this.lastUpdated = lastUpdated;
    this.nextCursor = nextCursor;
  }

  /**
   * Gets the endpoint response data.
   * 
   * @return the data
   */
  public List<MintingTx> getData() {
    return data;
  }

  /**
   * Sets the endpoint response data.
   * 
   * @param data the data to set
   */
  public void setData(List<MintingTx> data) {
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
    return "PaginatedMintingTx{" +
            "data=" + data +
            ", lastUpdated=" + lastUpdated +
            ", nextCursor='" + nextCursor + '\'' +
            '}';
  }
}
