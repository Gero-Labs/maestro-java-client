package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents token registry metadata for a native asset.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TokenRegistryMetadata {

  /**
   * Recommended value for decimal places for the asset.
   */
  private Long decimals;

  /**
   * A description of the asset.
   */
  @NotNull
  private String description;

  /**
   * Base64 encoded PNG logo associated with the asset.
   */
  private String logo;

  /**
   * The name of the asset.
   */
  @NotNull
  private String name;

  /**
   * The ticker symbol for the asset.
   */
  private String ticker;

  /**
   * A URL associated with the asset.
   */
  private String url;
}
