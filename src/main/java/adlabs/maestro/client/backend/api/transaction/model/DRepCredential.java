package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Payment credential, the payment part of a Cardano address.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DRepCredential {

  /**
   * Bech32-encoding of the credential key hash or script hash.
   */
  @NotNull
  private String bech32;

  /**
   * Hex-encoding of the script or key credential.
   */
  @NotNull
  private String hex;

  /**
   * Kind of DRep credential.
   */
  @NotNull
  @Valid
  private DRepCredKind kind;
}
