package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Delegates to a stake pool and a DRep from the same certificate.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeVoteDelegCert {

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Delegated DRep.
   */
  @NotNull
  @Valid
  private DRep drep;

  /**
   * Bech32 pool ID to which the stake key is being delegated.
   */
  @NotNull
  private String poolId;

  /**
   * Stake address corresponding to stake key being delegated.
   */
  @NotNull
  private String stakeAddress;
}
