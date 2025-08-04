package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Payment credential, the payment part of a Cardano address.
 */
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

  /**
   * Default constructor.
   */
  public PaymentCredential() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bech32 Bech32-encoding of the credential key hash or script hash
   * @param hex Hex-encoding of the script or key credential
   * @param kind Kind of payment credential
   */
  public PaymentCredential(String bech32, String hex, PaymentCredKind kind) {
    this.bech32 = bech32;
    this.hex = hex;
    this.kind = kind;
  }

  /**
   * Gets the Bech32-encoding of the credential key hash or script hash.
   *
   * @return the bech32 encoding
   */
  public String getBech32() {
    return bech32;
  }

  /**
   * Sets the Bech32-encoding of the credential key hash or script hash.
   *
   * @param bech32 the bech32 encoding
   */
  public void setBech32(String bech32) {
    this.bech32 = bech32;
  }

  /**
   * Gets the hex-encoding of the script or key credential.
   *
   * @return the hex encoding
   */
  public String getHex() {
    return hex;
  }

  /**
   * Sets the hex-encoding of the script or key credential.
   *
   * @param hex the hex encoding
   */
  public void setHex(String hex) {
    this.hex = hex;
  }

  /**
   * Gets the kind of payment credential.
   *
   * @return the payment credential kind
   */
  public PaymentCredKind getKind() {
    return kind;
  }

  /**
   * Sets the kind of payment credential.
   *
   * @param kind the payment credential kind
   */
  public void setKind(PaymentCredKind kind) {
    this.kind = kind;
  }

  @Override
  public String toString() {
    return "PaymentCredential{" +
        "bech32='" + bech32 + '\'' +
        ", hex='" + hex + '\'' +
        ", kind=" + kind +
        '}';
  }
}
