package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Information about the status of a transaction.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TxStatusInfo {

  /**
   * The transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * The status of the transaction.
   */
  @NotNull
  @Valid
  private TxStatus txStatus;
}
