package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.LastUpdated;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedPoolInfo {

  private PoolInfo data;

  private LastUpdated lastUpdated;
}

