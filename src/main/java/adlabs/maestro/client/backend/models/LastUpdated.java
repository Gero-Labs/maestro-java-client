package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Details of the most recent block processed by the indexer (aka chain tip);
 * that is, the data returned is correct as of this block in time.
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
public class LastUpdated {

  /**
   * Hex-encoded hash of the most recently processed block (aka chain tip).
   */
  @NotNull
  private String blockHash;

  /**
   * Absolute slot of the most recently processed block (aka chain tip).
   */
  @NotNull
  @Min(0L)
  private Long blockSlot;

  /**
   * UTC timestamp of when the most recently processed block was minted.
   */
  @NotNull
  private String timestamp;
}
