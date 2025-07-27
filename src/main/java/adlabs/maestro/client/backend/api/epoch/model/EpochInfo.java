package adlabs.maestro.client.backend.api.epoch.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Information summary of an epoch.
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
public class EpochInfo {

  /**
   * Total active stake for the epoch.
   */
  private String activeStake;

  /**
   * Average reward for block producers during the epoch.
   */
  private String averageReward;

  /**
   * Total blocks in the epoch.
   */
  @NotNull
  private Integer blkCount;

  /**
   * UNIX timestamp when the epoch ended.
   */
  @NotNull
  private Long endTime;

  /**
   * Epoch number.
   */
  @NotNull
  private Integer epochNo;

  /**
   * Total fees collected in the epoch.
   */
  @NotNull
  private String fees;

  /**
   * UNIX timestamp when the epoch began.
   */
  @NotNull
  private Long startTime;

  /**
   * Total rewards earned by block producers during the epoch.
   */
  private String totalRewards;

  /**
   * Total transactions in the epoch.
   */
  @NotNull
  private Integer txCount;
}
