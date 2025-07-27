package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * A timestamped response containing transaction information. This includes the data
 * and the chain-tip of the indexer, indicating the point in the chain's history
 * at which the data was current.
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
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedTransactionInfo {

  /**
   * The transaction information data.
   */
  @NotNull
  @Valid
  private TransactionInfo data;

  /**
   * The last update details, indicating the chain-tip.
   */
  @NotNull
  @Valid
  private LastUpdated lastUpdated;
}
