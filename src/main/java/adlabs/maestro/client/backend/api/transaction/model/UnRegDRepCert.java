package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for unregistering (retiring) DRep credentials.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UnRegDRepCert {

  /**
   * The index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The registration deposit to be returned.
   */
  @NotNull
  private String deposit;

  /**
   * The DRep credential being unregistered.
   */
  @NotNull
  @Valid
  private DRepCredential drepCredential;
}
