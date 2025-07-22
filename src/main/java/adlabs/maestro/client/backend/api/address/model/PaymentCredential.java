package adlabs.maestro.client.backend.api.address.model;

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
public class PaymentCredential {

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
   * Kind of payment credential.
   */
  @NotNull
  @Valid
  private PaymentCredKind kind;
}
