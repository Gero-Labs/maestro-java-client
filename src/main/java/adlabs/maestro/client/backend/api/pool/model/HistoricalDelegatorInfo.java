package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Information summary of a historical delegator.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class HistoricalDelegatorInfo {

  /**
   * Delegator live stake.
   */
  private String amount;

  /**
   * Bech32 encoded stake address (reward address).
   */
  private String stakeAddress;
}
