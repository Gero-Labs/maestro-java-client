package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NumOrString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Per-epoch history of a stake pool.
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
  private NumOrString activeStake;

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
  private NumOrString delegRewards;

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
  private NumOrString fixedCost;

  /**
   * Margin percentage for the pool.
   */
  private NumOrString margin;

  /**
   * Pool fees for the epoch.
   */
  @NotNull
  @Valid
  private NumOrString poolFees;

  /**
   * Saturation percentage of the pool.
   */
  private String saturationPct;
}
