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
 * Represents a redeemer for a spending transaction.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SpendRedeemer {

  /**
   * Datum associated with the redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * Execution units (CPU and memory) required for the redeemer.
   */
  @NotNull
  private List<@Min(0L)Long> exUnits;

  /**
   * UTXO input being spent.
   */
  @NotNull
  @Valid
  private SpendRedeemerInput input;

  /**
   * Index of the input being spent.
   */
  @NotNull
  private Integer inputIndex;

  /**
   * Hex-encoded script hash of the validator script.
   */
  @NotNull
  private String scriptHash;
}
