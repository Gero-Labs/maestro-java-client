package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a pointer with certificate index, slot, and transaction index.
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
public class Pointer {

  /**
   * Certificate index.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Slot number.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction index.
   */
  @NotNull
  @Min(0L)
  private Long txIndex;
}
