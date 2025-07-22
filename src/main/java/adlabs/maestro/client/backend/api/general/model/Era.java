package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents an era with start, end, and parameters.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Era {

  /**
   * End details of the era.
   */
  @NotNull
  @Valid
  private End end;

  /**
   * Parameters of the era.
   */
  @NotNull
  @Valid
  private Parameters parameters;

  /**
   * Start details of the era.
   */
  @NotNull
  @Valid
  private Start start;
}
