package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Registers stake credentials, delegates to a pool, and to a DRep
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakeVoteRegDelegCert {

  @NotNull
  private Long certIndex;

  @NotNull
  private String deposit;

  @NotNull
  @Valid
  private DRep drep;

  @NotNull
  private String poolId;

  @NotNull
  private String stakeAddress;
}