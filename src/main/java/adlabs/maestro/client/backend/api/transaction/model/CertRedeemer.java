package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.*;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificate redeemer containing authentication data and execution units
 * for certificate-based smart contract interactions.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CertRedeemer {

  /** Position of certificate redeemer attempting to authenticate in sorted certificates */
  @NotNull
  @Min(0)
  private Integer certIndex;

  /** Redeemer data for certificate authentication */
  @NotNull
  @Valid
  private Datum data;

  /** Execution unit budget (memory, steps) */
  @NotNull
  private List<@Min(0L) Long> exUnits;
}