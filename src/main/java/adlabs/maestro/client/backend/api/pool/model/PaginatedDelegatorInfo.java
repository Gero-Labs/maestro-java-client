package adlabs.maestro.client.backend.api.pool.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * A paginated response for delegator information. Pass in the `next_cursor` in a subsequent request as the `cursor` query parameter to fetch the next page of results.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaginatedDelegatorInfo {

  /**
   * Endpoint response data.
   */
  @NotNull
  @Valid
  private List<@Valid DelegatorInfo> data;

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
}
