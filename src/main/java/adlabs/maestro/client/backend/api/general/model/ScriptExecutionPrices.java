package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Script execution prices.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScriptExecutionPrices {

  /**
   * Script execution CPU price.
   */
  @NotNull
  private String cpu;

  /**
   * Script execution memory price.
   */
  @NotNull
  private String memory;
}
