package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Update to a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolUpdate {

  /**
   * Active epoch number.
   */
  private Long activeEpochNo;

  /**
   * UNIX timestamp of the block.
   */
  private Integer blockTime;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private String fixedCost;

  /**
   * Margin of the pool.
   */
  @NotNull
  @Valid
  private String margin;

  /**
   * Hex-encoded metadata hash.
   */
  private String metaHash;

  /**
   * JSON metadata of the pool.
   */
  private JsonNode metaJson;

  /**
   * URL to the metadata.
   */
  private String metaUrl;

  /**
   * List of owner addresses.
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
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Hex-encoded pool ID.
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
   * Epoch at which the pool is retiring.
   */
  private Long retiringEpoch;

  /**
   * Bech32-encoded reward address.
   */
  @NotNull
  private String rewardAddr;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * VRF key hash.
   */
  @NotNull
  private String vrfKeyHash;
}
