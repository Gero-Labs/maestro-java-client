package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents parameters for an era.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Parameters {

  /**
   * Length of the epoch.
   */
  @NotNull
  private Long epochLength;

  /**
   * Safe zone.
   */
  @NotNull
  private Long safeZone;

  /**
   * Length of the slot.
   */
  @NotNull
  @Valid
  private SlotLength slotLength;
}
