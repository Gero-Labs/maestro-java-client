package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for updating a DRep's credentials.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UpdateDRepCert {

  /**
   * Default constructor.
   */
  public UpdateDRepCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param anchor the anchor for off-chain metadata
   * @param certIndex the index of the certificate in the transaction
   * @param drepCredential the DRep credential being updated
   */
  public UpdateDRepCert(Anchor anchor, Long certIndex, DRepCredential drepCredential) {
    this.anchor = anchor;
    this.certIndex = certIndex;
    this.drepCredential = drepCredential;
  }

  /**
   * The anchor for off-chain metadata.
   */
  @Valid
  private Anchor anchor;

  /**
   * The index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The DRep credential being updated.
   */
  @NotNull
  @Valid
  private DRepCredential drepCredential;

  /**
   * Gets the anchor for off-chain metadata.
   *
   * @return the anchor
   */
  public Anchor getAnchor() {
    return anchor;
  }

  /**
   * Sets the anchor for off-chain metadata.
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
   * Gets the DRep credential being updated.
   *
   * @return the DRep credential
   */
  public DRepCredential getDrepCredential() {
    return drepCredential;
  }

  /**
   * Sets the DRep credential being updated.
   *
   * @param drepCredential the DRep credential
   */
  public void setDrepCredential(DRepCredential drepCredential) {
    this.drepCredential = drepCredential;
  }

  /**
   * Returns a string representation of this UpdateDRepCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "UpdateDRepCert{" +
        "anchor=" + anchor +
        ", certIndex=" + certIndex +
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
    UpdateDRepCert that = (UpdateDRepCert) o;
    return java.util.Objects.equals(anchor, that.anchor) &&
        java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(drepCredential, that.drepCredential);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(anchor, certIndex, drepCredential);
  }
}
