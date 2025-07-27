package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Transaction which minted or burned a specific asset.
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
public class MintingTx {

  /**
   * UNIX timestamp of the block which included the transaction.
   */
  @NotNull
  private Integer blockTimestamp;

  /**
   * Transaction metadata.
   */
  @NotNull
  private JsonNode metadata;

  /**
   * Amount of the asset minted or burned (negative if burned).
   */
  @NotNull
  private Long mintAmount;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;
}
