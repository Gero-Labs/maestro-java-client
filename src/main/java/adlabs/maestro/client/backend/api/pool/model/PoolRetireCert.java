package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Certificate for retiring a stake pool.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolRetireCert {

  /**
   * Epoch at the end of which the pool will be retired.
   */
  @NotNull
  @Min(0)
  private Integer afterEpoch;

  /**
   * Index of the certificate.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Bech32 pool ID of the pool being retired.
   */
  @NotNull
  private String poolId;
}
