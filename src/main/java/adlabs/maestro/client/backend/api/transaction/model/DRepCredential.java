package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Payment credential, the payment part of a Cardano address.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
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

  /**
   * Creates a no-argument constructor.
   */
  public DRepCredential() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param bech32 Bech32-encoding of the credential key hash or script hash
   * @param hex Hex-encoding of the script or key credential
   * @param kind Kind of DRep credential
   */
  public DRepCredential(String bech32, String hex, DRepCredKind kind) {
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
   * @param bech32 the bech32 encoding to set
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
   * @param hex the hex encoding to set
   */
  public void setHex(String hex) {
    this.hex = hex;
  }

  /**
   * Gets the kind of DRep credential.
   *
   * @return the credential kind
   */
  public DRepCredKind getKind() {
    return kind;
  }

  /**
   * Sets the kind of DRep credential.
   *
   * @param kind the credential kind to set
   */
  public void setKind(DRepCredKind kind) {
    this.kind = kind;
  }

  @Override
  public String toString() {
    return "DRepCredential{" +
        "bech32='" + bech32 + '\'' +
        ", hex='" + hex + '\'' +
        ", kind=" + kind +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DRepCredential that = (DRepCredential) o;
    return java.util.Objects.equals(bech32, that.bech32) &&
        java.util.Objects.equals(hex, that.hex) &&
        java.util.Objects.equals(kind, that.kind);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(bech32, hex, kind);
  }
}
