package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * UTXO reference (transaction hash and output index) for a spending redeemer.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SpendRedeemerInput {

  /**
   * UTXO transaction index.
   */
  @NotNull
  @Min(0L)
  private Long index;

  /**
   * UTXO transaction hash.
   */
  @NotNull
  private String txHash;
}
