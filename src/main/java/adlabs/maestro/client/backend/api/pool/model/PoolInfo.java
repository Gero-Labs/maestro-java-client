package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Information summary of a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolInfo {

  /**
   * Epoch at which the pool is active.
   */
  @NotNull
  @Min(0L)
  private Long activeEpochNo;

  /**
   * Active stake in the pool.
   */
  @NotNull
  @Valid
  private String activeStake;

  /**
   * Number of blocks produced by the pool.
   */
  @Min(0L)
  private Long blockCount;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private String fixedCost;

  /**
   * Number of live delegators.
   */
  @NotNull
  private Long liveDelegators;

  /**
   * Live pledge of the pool.
   */
  @NotNull
  @Valid
  private String livePledge;

  /**
   * Live saturation percentage of the pool.
   */
  private String liveSaturation;

  /**
   * Live total stake in the pool.
   */
  @NotNull
  @Valid
  private String liveStake;

  /**
   * Live total stake percentage in the pool.
   */
  @NotNull
  private String liveStakePct;

  /**
   * Margin percentage for the pool.
   */
  @NotNull
  @Valid
  private String margin;

  /**
   * Metadata hash.
   */
  private String metaHash;

  /**
   * Metadata JSON.
   */
  private JsonNode metaJson;

  /**
   * Metadata URL.
   */
  private String metaUrl;

  /**
   * Operational certificate counter.
   */
  @NotNull
  @Min(0L)
  private Long opCertCounter;

  /**
   * Owner addresses.
   */
  @NotNull
  private List<String> owners;

  /**
   * Pledge of the pool.
   */
  @NotNull
  @Valid
  private String pledge;

  /**
   * Bech32 encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Hex encoded pool ID.
   */
  @NotNull
  private String poolIdHex;

  /**
   * Status of the pool.
   */
  @NotNull
  private String poolStatus;

  /**
   * List of relays for the pool.
   */
  @NotNull
  @Valid
  private List<@Valid Relay> relays;

  /**
   * Epoch when the pool is retiring.
   */
  private Long retiringEpoch;

  /**
   * Bech32 encoded reward address.
   */
  @NotNull
  private String rewardAddr;

  /**
   * Sigma value.
   */
  @NotNull
  private String sigma;

  /**
   * VRF key hash.
   */
  @NotNull
  private String vrfKeyHash;
}
