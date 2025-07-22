package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.RedeemerTag;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.block.model.ExUnits;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Identifier of an evaluated redeemer and the execution units required to execute it.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EvaluatedRedeemer {

  /**
   * Execution units for the redeemer.
   */
  @NotNull
  @Valid
  private ExUnits exUnits;

  /**
   * Index for the redeemer tag (which input, policy, etc).
   */
  @NotNull
  @Min(0)
  private Integer redeemerIndex;

  /**
   * Tag for the redeemer.
   */
  @NotNull
  @Valid
  private RedeemerTag redeemerTag;
}
