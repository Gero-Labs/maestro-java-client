package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a withdrawal redeemer.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class WdrlRedeemer {

  /**
   * The datum associated with the withdrawal.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * The execution unit budget (memory, steps).
   */
  @NotNull
  @Valid
  private List<@Min(0L) Long> exUnits;

  /**
   * The stake account from which the redeemer is attempting to withdraw rewards.
   */
  @NotNull
  private String stakeAddress;
}
