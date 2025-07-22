package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a DRep.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DRep {

  /**
   * DRep credential.
   */
  @Valid
  private DRepCredential credential;

  /**
   * Kind of DRep.
   */
  @NotNull
  @Valid
  private DRepKind kind;
}
