package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents a Constitutional Committee with a default value and a state of no confidence.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ConstitutionalCommittee {

  /**
   * Default value.
   */
  @NotNull
  private String _default;

  /**
   * State of no confidence.
   */
  @NotNull
  private String stateOfNoConfidence;
}
