package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a UTxO that may not be on-chain yet but is used in transaction inputs.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AdditionalUtxo {

  /**
   * The UTxO transaction index.
   */
  @NotNull
  @Min(0L)
  private Long index;

  /**
   * The UTxO transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * The CBOR encoding of the UTxO.
   */
  @NotNull
  private String txoutCbor;
}
