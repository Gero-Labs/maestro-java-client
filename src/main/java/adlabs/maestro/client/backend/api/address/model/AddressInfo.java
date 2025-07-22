package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NetworkId;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents decoded information from a Cardano address.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AddressInfo {

  /**
   * The Bech32 representation of the address.
   */
  private String bech32;

  /**
   * The hex representation of the address.
   */
  @NotNull
  private String hex;

  /**
   * The network identifier.
   */
  @Valid
  private NetworkId network;

  /**
   * The payment credential.
   */
  @Valid
  private PaymentCredential paymentCred;

  /**
   * The staking credential.
   */
  @Valid
  private StakingCredential stakingCred;
}
