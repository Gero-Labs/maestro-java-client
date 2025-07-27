package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NumOrString;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificate for registering or updating a stake pool.
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
public class PoolRegCert {

  /**
   * Index of the certificate.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Fixed cost of the pool.
   */
  @NotNull
  @Valid
  private NumOrString fixedCost;

  /**
   * Epoch from which the pool is registered.
   */
  @NotNull
  @Min(0L)
  private Long fromEpoch;

  /**
   * Margin of the pool.
   */
  @NotNull
  @Valid
  private NumOrString margin;

  /**
   * Hex-encoded metadata hash.
   */
  private String metadataHash;

  /**
   * URL to the metadata.
   */
  private String metadataUrl;

  /**
   * List of owner addresses.
   */
  @NotNull
  private List<String> ownerAddresses;

  /**
   * Pledge of the pool.
   */
  @NotNull
  @Valid
  private NumOrString pledge;

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolId;

  /**
   * List of relays for the pool.
   */
  @NotNull
  @Valid
  private List<@Valid Relay> relays;

  /**
   * Bech32-encoded reward address.
   */
  @NotNull
  private String rewardAddress;

  /**
   * VRF key hash.
   */
  @NotNull
  private String vrfKeyHash;
}
