package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a redeemer for a proposal.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProposalRedeemer {

  /**
   * Datum for the redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * Execution units for the redeemer.
   */
  @NotNull
  private List<@Min(0L)Long> exUnits;

  /**
   * Index of the relevant proposal.
   */
  @NotNull
  @Min(0)
  private Integer proposalIndex;
}
