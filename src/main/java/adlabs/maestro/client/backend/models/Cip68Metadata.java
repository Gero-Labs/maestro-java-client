package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * CIP-68 metadata structure containing asset metadata, purpose classification,
 * version information, and optional custom data.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Cip68Metadata {

  /** Custom user defined Plutus data CBOR bytes */
  private String extra;

  /** Asset CIP-68 metadata as dynamic JSON structure */
  @NotNull
  private JsonNode metadata;

  /** Asset type and purpose classification */
  @NotNull
  @Valid
  private Cip68AssetType purpose;

  /** CIP-68 version number */
  @NotNull
  @Min(0L)
  private Long version;
}