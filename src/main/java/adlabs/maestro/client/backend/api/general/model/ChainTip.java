package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Blockchain chain-tip representing the most recently adopted block
 * with its hash, height, and slot information.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ChainTip {

  /** Block hash of the most recent block */
  @NotNull
  private String blockHash;

  /** Height (number) of the most recent block */
  @NotNull
  @Min(0L)
  private Long height;

  /** Absolute slot of the most recent block */
  @NotNull
  @Min(0L)
  private Long slot;
}