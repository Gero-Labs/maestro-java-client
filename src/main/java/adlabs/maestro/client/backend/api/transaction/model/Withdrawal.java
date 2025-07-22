package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.NumOrString;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a withdrawal from a stake address.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Withdrawal {

  /**
   * The amount of the withdrawal.
   */
  @NotNull
  @Valid
  private NumOrString amount;

  /**
   * The stake address from which the withdrawal is made.
   */
  @NotNull
  private String stakeAddress;
}
