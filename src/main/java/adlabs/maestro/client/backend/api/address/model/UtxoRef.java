package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a UTxO reference, containing the transaction hash and output index.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UtxoRef {

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
}
