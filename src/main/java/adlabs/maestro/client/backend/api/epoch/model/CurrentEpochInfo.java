package adlabs.maestro.client.backend.api.epoch.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Information summary of the current epoch.
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
public class CurrentEpochInfo {

  /**
   * Total blocks in the epoch so far.
   */
  @NotNull
  private Integer blkCount;

  /**
   * Epoch number.
   */
  @NotNull
  private Integer epochNo;

  /**
   * Total fees collected in the epoch so far.
   */
  @NotNull
  private String fees;

  /**
   * UNIX timestamp when the epoch began.
   */
  @NotNull
  private Long startTime;

  /**
   * Total transactions in the epoch so far.
   */
  @NotNull
  private Integer txCount;
}
