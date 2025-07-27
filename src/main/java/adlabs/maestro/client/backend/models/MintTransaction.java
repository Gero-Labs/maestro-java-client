package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Transaction hash with details of when that transaction appeared on-chain.
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
public class MintTransaction {

  /**
   * Amount of asset minted or burned (negative if burned).
   */
  @NotNull
  private String amount;

  /**
   * Absolute slot of the block which includes the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * UTC timestamp of the block which includes the transaction.
   */
  @NotNull
  private String timestamp;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;
}
