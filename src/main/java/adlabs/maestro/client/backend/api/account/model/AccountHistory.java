package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Per-epoch information about a stake account
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountHistory {

  /**
   * Active stake amount
   */
  private String activeStake;

  /**
   * Epoch number
   */
  private Integer epochNo;

  /**
   * Bech32 encoded pool ID the account was delegated to
   */
  private String poolId;
}