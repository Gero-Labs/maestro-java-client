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
 * Represents a vote redeemer.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VoteRedeemer {

  /**
   * The datum associated with the vote redeemer.
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
   * The index of the relevant vote in sorted votes.
   */
  @NotNull
  @Min(0)
  private Integer voteIndex;
}
