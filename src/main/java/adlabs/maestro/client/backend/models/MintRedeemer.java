package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a redeemer for minting operations.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MintRedeemer {

  /**
   * Datum for the redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * Execution unit budget (memory, steps).
   */
  @NotNull
  private List<@Min(0L)Long> exUnits;

  /**
   * Asset policy (hash of script being executed).
   */
  @NotNull
  private String policy;
}
