package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents an operational certificate.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OperationalCert {

  /**
   * Hot key verification key.
   */
  @NotNull
  private String hotVkey;

  /**
   * KES period.
   */
  @NotNull
  @Min(0L)
  private Long kesPeriod;

  /**
   * KES signature.
   */
  @NotNull
  private String kesSignature;

  /**
   * Sequence number.
   */
  @NotNull
  @Min(0L)
  private Long sequenceNumber;
}
