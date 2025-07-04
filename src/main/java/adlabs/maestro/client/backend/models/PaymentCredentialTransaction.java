package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Transaction which involved a specific payment credential.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaymentCredentialTransaction {

  /**
   * True if payment credential is used as an input.
   */
  @NotNull
  private Boolean input;

  /**
   * True if payment credential is used as an output.
   */
  @NotNull
  private Boolean output;

  /**
   * True if payment credential is used as a required signer.
   */
  @NotNull
  private Boolean requiredSigner;

  /**
   * Absolute slot of the block which contains the transaction.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction hash.
   */
  @NotNull
  private String txHash;
}
