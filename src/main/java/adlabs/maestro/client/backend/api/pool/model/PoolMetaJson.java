package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * JSON metadata associated with a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolMetaJson {

  /**
   * Description of the stake pool.
   */
  private String description;

  /**
   * Homepage URL of the stake pool.
   */
  private String homepage;

  /**
   * Name of the stake pool.
   */
  @NotNull
  private String name;

  /**
   * Ticker of the stake pool.
   */
  private String ticker;
}
