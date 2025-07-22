package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.Holders;
import adlabs.maestro.client.backend.api.script.model.Script;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransaction;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Information about a Cardano native-asset policy ID.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyInfo {

  /**
   * Number of assets of the policy.
   */
  @NotNull
  @Min(0L)
  private Long assetsOfPolicy;

  /**
   * The first transaction that minted an asset of the policy.
   */
  @NotNull
  @Valid
  private TimestampedTransaction firstMintTx;

  /**
   * The latest transaction that minted or burned an asset of the policy.
   */
  @NotNull
  @Valid
  private TimestampedTransaction latestMintTx;

  /**
   * Hex-encoded policy ID.
   */
  @NotNull
  private String policyId;

  /**
   * The script of the policy.
   */
  @NotNull
  @Valid
  private Script script;

  /**
   * Total supply of assets under this policy.
   */
  @NotNull
  private String totalSupply;

  /**
   * Number of unique holders of assets under this policy.
   */
  @NotNull
  @Valid
  private Holders uniqueHolders;
}
