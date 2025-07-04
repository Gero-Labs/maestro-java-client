package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Metadata associated with a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolMetadata {

  /**
   * Hex-encoded metadata hash.
   */
  private String metaHash;

  /**
   * JSON metadata associated with a stake pool.
   */
  @Valid
  private PoolMetaJson metaJson;

  /**
   * URL to the metadata.
   */
  private String metaUrl;

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;
}
