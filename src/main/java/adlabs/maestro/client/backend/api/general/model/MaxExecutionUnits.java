package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Maximum execution units.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MaxExecutionUnits {

  /**
   * Maximum execution CPU units.
   */
  @NotNull
  private Long cpu;

  /**
   * Maximum execution memory units.
   */
  @NotNull
  private Long memory;
}
