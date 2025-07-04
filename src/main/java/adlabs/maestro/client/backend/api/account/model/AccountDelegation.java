package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Stake account related update
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountDelegation {

  /**
   * Epoch number in which the delegation becomes active
   */
  private Long activeEpochNo;

  /**
   * Bech32 encoded pool ID the account is delegating to
   */
  private String poolId;

  /**
   * Absolute slot of the block which contained the transaction
   */
  private Long slot;
}