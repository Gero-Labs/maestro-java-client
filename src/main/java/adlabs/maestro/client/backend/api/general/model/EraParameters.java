package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents the parameters of an era.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EraParameters {

  /**
   * Length of the epoch.
   */
  @NotNull
  private Long epochLength;

  /**
   * Safe zone.
   */
  private Long safeZone;

  /**
   * Length of the slot.
   */
  @NotNull
  private Long slotLength;
}
