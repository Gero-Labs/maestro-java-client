package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.api.script.model.Time;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents the end details of an era.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class End {

  /**
   * Epoch number at the end.
   */
  @NotNull
  private Long epoch;

  /**
   * Slot number at the end.
   */
  @NotNull
  private Long slot;

  /**
   * Time at the end.
   */
  @NotNull
  @Valid
  private Time time;
}
