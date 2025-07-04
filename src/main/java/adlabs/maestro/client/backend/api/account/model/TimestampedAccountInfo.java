package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.LastUpdated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip
 * of the indexer, which details at which point in the chain's history the data was correct as-of.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
}