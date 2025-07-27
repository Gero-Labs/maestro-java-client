package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.api.script.model.Time;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents the end details of an era.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
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
