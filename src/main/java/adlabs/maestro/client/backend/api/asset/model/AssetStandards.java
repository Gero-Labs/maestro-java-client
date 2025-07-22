package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;

/**
 * Represents asset information corresponding to popular on-chain standards.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetStandards {

  /**
   * CIP-25 metadata for the asset.
   */
  private JsonNode cip25Metadata;

  /**
   * CIP-68 metadata for the asset.
   */
  @Valid
  private Cip68Metadata cip68Metadata;
}
