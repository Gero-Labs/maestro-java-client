package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for registering a stake credential and delegating to a DRep.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VoteRegDelegCert {

  /**
   * The index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The stake registration deposit.
   */
  @NotNull
  private String deposit;

  /**
   * The DRep to which the stake is delegated.
   */
  @NotNull
  @Valid
  private DRep drep;

  /**
   * The stake address corresponding to the stake key being updated.
   */
  @NotNull
  private String stakeAddress;
}
