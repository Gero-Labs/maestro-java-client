package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Transaction which moved or minted a specific asset
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetTx {

  /**
   * The height of the block which included the transaction
   */
  private Integer blockHeight;

  /**
   * Epoch in which the transaction occurred
   */
  private Integer epochNo;

  /**
   * Transaction hash
   */
  private String txHash;
}