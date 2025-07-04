package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Block created by a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolBlock {

  /**
   * Absolute slot of the block.
   */
  private Long absSlot;

  /**
   * Block hash.
   */
  @NotNull
  private String blockHash;

  /**
   * Block height.
   */
  @NotNull
  @Min(0)
  private Integer blockHeight;

  /**
   * UNIX timestamp of the block.
   */
  @NotNull
  private Integer blockTime;

  /**
   * Epoch number of the block.
   */
  private Integer epochNo;

  /**
   * Slot number within the epoch of the block.
   */
  private Integer epochSlot;
}
