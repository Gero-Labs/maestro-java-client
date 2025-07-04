package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.asset.model.AssetInPolicy;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * UTxO which contains assets of a specific policy.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyUtxo {

  /**
   * Bech32-encoded address of the UTXO.
   */
  @NotNull
  private String address;

  /**
   * Assets contained in the UTXO belonging to the policy.
   */
  @NotNull
  @Valid
  private List<@Valid AssetInPolicy> assets;

  /**
   * UTXO index.
   */
  @NotNull
  @Min(0)
  private Integer index;

  /**
   * Absolute slot of the block which contains the UTXO.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction hash of the UTXO.
   */
  @NotNull
  private String txHash;
}
