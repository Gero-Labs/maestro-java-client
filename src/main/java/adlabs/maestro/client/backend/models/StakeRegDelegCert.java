package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Registers stake credentials and delegates to a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeRegDelegCert {

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Deposit amount for registration.
   */
  @NotNull
  private String deposit;

  /**
   * Bech32 pool ID to which the stake key is being delegated.
   */
  @NotNull
  private String poolId;

  /**
   * Stake address corresponding to stake key being registered and delegated.
   */
  @NotNull
  private String stakeAddress;
}
