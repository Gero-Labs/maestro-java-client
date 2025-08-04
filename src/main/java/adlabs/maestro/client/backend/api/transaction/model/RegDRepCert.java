package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Registers DRep's credentials.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RegDRepCert {

  /**
   * Default constructor.
   */
  public RegDRepCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param anchor the anchor for the DRep certificate
   * @param certIndex the index of the certificate in the transaction
   * @param deposit the deposit amount
   * @param drepCredential the DRep credential
   */
  public RegDRepCert(Anchor anchor, Long certIndex, String deposit, DRepCredential drepCredential) {
    this.anchor = anchor;
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.drepCredential = drepCredential;
  }

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

  /**
   * Gets the anchor for the DRep certificate.
   *
   * @return the anchor
   */
  public Anchor getAnchor() {
    return anchor;
  }

  /**
   * Sets the anchor for the DRep certificate.
   *
   * @param anchor the anchor
   */
  public void setAnchor(Anchor anchor) {
    this.anchor = anchor;
  }

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
   * @param certIndex the certificate index
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the deposit amount.
   *
   * @return the deposit
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the deposit amount.
   *
   * @param deposit the deposit
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the DRep credential.
   *
   * @return the DRep credential
   */
  public DRepCredential getDrepCredential() {
    return drepCredential;
  }

  /**
   * Sets the DRep credential.
   *
   * @param drepCredential the DRep credential
   */
  public void setDrepCredential(DRepCredential drepCredential) {
    this.drepCredential = drepCredential;
  }

  /**
   * Returns a string representation of this RegDRepCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "RegDRepCert{" +
        "anchor=" + anchor +
        ", certIndex=" + certIndex +
        ", deposit='" + deposit + '\'' +
        ", drepCredential=" + drepCredential +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegDRepCert that = (RegDRepCert) o;
    return java.util.Objects.equals(anchor, that.anchor) &&
        java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(drepCredential, that.drepCredential);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(anchor, certIndex, deposit, drepCredential);
  }
}
