package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.Bound;
import adlabs.maestro.client.backend.models.EraParameters;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a summary of an era.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EraSummary {

  /**
   * End boundary of the era.
   */
  @Valid
  private Bound end;

  /**
   * Parameters of the era.
   */
  @NotNull
  @Valid
  private EraParameters parameters;

  /**
   * Start boundary of the era.
   */
  @NotNull
  @Valid
  private Bound start;
}
