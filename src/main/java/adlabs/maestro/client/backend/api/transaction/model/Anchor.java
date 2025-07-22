package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents an anchor, which links to off-chain data.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Anchor {

  /**
   * The hash of the data at the URL.
   */
  @NotNull
  private String contentHash;

  /**
   * The URL of the off-chain data.
   */
  @NotNull
  private String url;
}
