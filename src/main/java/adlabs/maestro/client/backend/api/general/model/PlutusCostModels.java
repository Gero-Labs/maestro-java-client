package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Plutus script execution cost models.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PlutusCostModels {

  /**
   * Plutus V1 cost model parameters.
   */
  @NotNull
  private List<Long> plutusV1;

  /**
   * Plutus V2 cost model parameters.
   */
  @NotNull
  private List<Long> plutusV2;

  /**
   * Plutus V3 cost model parameters.
   */
  private List<Long> plutusV3;
}
