package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents an evaluation request for a transaction.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EvaluateRequest {

  /**
   * Additional UTXOs for evaluation.
   */
  @Valid
  private List<@Valid AdditionalUtxo> additionalUtxos;

  /**
   * Transaction CBOR.
   */
  @NotNull
  private String cbor;
}
