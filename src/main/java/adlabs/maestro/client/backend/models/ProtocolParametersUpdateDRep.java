package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents DRep protocol parameters update (introduced in Conway).
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProtocolParametersUpdateDRep {

  /**
   * Economic parameters.
   */
  @NotNull
  private String economic;

  /**
   * Governance parameters.
   */
  @NotNull
  private String governance;

  /**
   * Network parameters.
   */
  @NotNull
  private String network;

  /**
   * Technical parameters.
   */
  @NotNull
  private String technical;
}
