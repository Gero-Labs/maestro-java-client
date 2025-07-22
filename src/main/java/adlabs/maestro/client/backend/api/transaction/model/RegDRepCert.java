package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Registers DRep's credentials.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RegDRepCert {

  /**
   * Anchor for the DRep certificate.
   */
  @Valid
  private Anchor anchor;

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Deposit amount.
   */
  @NotNull
  private String deposit;

  /**
   * DRep credential.
   */
  @NotNull
  @Valid
  private DRepCredential drepCredential;
}
