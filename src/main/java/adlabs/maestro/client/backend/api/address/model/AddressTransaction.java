package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a transaction that involved a specific address.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AddressTransaction {

  /**
   * Indicates if the address controlled at least one of the consumed UTxOs.
   */
  @NotNull
  private Boolean input;

  /**
   * Indicates if the address controlled at least one of the produced UTxOs.
   */
  @NotNull
  private Boolean output;

  /**
   * The absolute slot of the block containing the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * The transaction hash.
   */
  @NotNull
  private String txHash;
}
