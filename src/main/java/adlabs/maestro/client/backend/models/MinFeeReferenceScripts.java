package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Parameters for reference script fee calculation (introduced in Conway).
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MinFeeReferenceScripts {

  /**
   * Base value for fee calculation.
   */
  @NotNull
  private Double base;

  /**
   * Multiplier value for fee calculation.
   */
  @NotNull
  private Double multiplier;

  /**
   * Range value for fee calculation.
   */
  @NotNull
  private Long range;
}
