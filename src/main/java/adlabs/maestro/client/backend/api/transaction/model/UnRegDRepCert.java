package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for unregistering (retiring) DRep credentials.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UnRegDRepCert {

  /**
   * No-argument constructor.
   */
  public UnRegDRepCert() {
  }

  /**
   * All-argument constructor.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param deposit the registration deposit to be returned
   * @param drepCredential the DRep credential being unregistered
   */
  public UnRegDRepCert(Long certIndex, String deposit, DRepCredential drepCredential) {
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.drepCredential = drepCredential;
  }

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

  /**
   * Gets the index of the certificate in the transaction.
   *
   * @return the certificate index
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate in the transaction.
   *
   * @param certIndex the certificate index to set
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the registration deposit to be returned.
   *
   * @return the deposit
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the registration deposit to be returned.
   *
   * @param deposit the deposit to set
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the DRep credential being unregistered.
   *
   * @return the DRep credential
   */
  public DRepCredential getDrepCredential() {
    return drepCredential;
  }

  /**
   * Sets the DRep credential being unregistered.
   *
   * @param drepCredential the DRep credential to set
   */
  public void setDrepCredential(DRepCredential drepCredential) {
    this.drepCredential = drepCredential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UnRegDRepCert that = (UnRegDRepCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(drepCredential, that.drepCredential);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(certIndex, deposit, drepCredential);
  }

  @Override
  public String toString() {
    return "UnRegDRepCert{" +
        "certIndex=" + certIndex +
        ", deposit='" + deposit + '\'' +
        ", drepCredential=" + drepCredential +
        '}';
  }
}
