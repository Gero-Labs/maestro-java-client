package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicyMint;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Transaction hash with details of when that transaction appeared on-chain.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyMintTransaction {

  /**
   * Assets minted or burned in the transaction.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicyMint> assets;

  /**
   * Absolute slot of the block which contains the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * UTC timestamp of the block which contains the transaction.
   */
  @NotNull
  private String timestamp;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;
}
