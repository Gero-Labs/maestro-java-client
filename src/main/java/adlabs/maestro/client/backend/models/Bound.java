package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Bound information for epoch, slot, and time
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Bound {

  /**
   * Epoch number
   */
  @NotNull
  private Long epoch;

  /**
   * Slot number
   */
  @NotNull
  private Long slot;

  /**
   * Time value
   */
  @NotNull
  private Long time;
}