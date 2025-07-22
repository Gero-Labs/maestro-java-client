package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.api.script.model.Time;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Start
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Start {

  @NotNull
  private Long epoch;

  @NotNull
  private Long slot;

  @NotNull
  @Valid
  private Time time;
}