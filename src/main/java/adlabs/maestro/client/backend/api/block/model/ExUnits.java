package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Execution unit budget for executing a redeemer.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ExUnits {

  /**
   * Memory budget.
   */
  @NotNull
  @Min(0L)
  private Long mem;

  /**
   * Steps budget.
   */
  @NotNull
  @Min(0L)
  private Long steps;
}
