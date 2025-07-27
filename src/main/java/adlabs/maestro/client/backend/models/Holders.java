package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Number of holders of at least one of a specific asset or assets of a specific policy, by address or address staking part.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Holders {

  /**
   * Number of unique staking keys used in addresses which control at least one of an asset of the policy ID.
   */
  @NotNull
  @Min(0L)
  private Long byAccount;

  /**
   * Number of unique addresses which control at least one of an asset of the policy ID.
   */
  @NotNull
  @Min(0L)
  private Long byAddress;
}
