package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Per-epoch history of a stake pool.
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
public class PoolHistory {

  /**
   * Active stake in the pool for the epoch.
   */
  private String activeStake;

  /**
   * Active stake percentage in the pool for the epoch.
   */
  private String activeStakePct;

  /**
   * Number of blocks produced by the pool in the epoch.
   */
  private Long blockCnt;

  /**
   * Delegator rewards for the epoch.
   */
  @NotNull
  @Valid
  private String delegRewards;

  /**
   * Number of delegators to the pool in the epoch.
   */
  private Long delegatorCnt;

  /**
   * Epoch number.
   */
  @NotNull
  private Long epochNo;

  /**
   * Return on stake for the epoch.
   */
  @NotNull
  private String epochRos;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private String fixedCost;

  /**
   * Margin percentage for the pool.
   */
  private String margin;

  /**
   * Pool fees for the epoch.
   */
  @NotNull
  @Valid
  private String poolFees;

  /**
   * Saturation percentage of the pool.
   */
  private String saturationPct;
}
