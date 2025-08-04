package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Authorizes the constitutional committee hot credential.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ResignCommitteeColdCert {

  /**
   * Anchor for the certificate.
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
   * Hex-encoded committee cold credential.
   */
  @NotNull
  private String committeeColdCredential;

  /**
   * Default constructor.
   */
  public ResignCommitteeColdCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param anchor the anchor for the certificate
   * @param certIndex the index of the certificate in the transaction
   * @param committeeColdCredential the hex-encoded committee cold credential
   */
  public ResignCommitteeColdCert(Anchor anchor, Long certIndex, String committeeColdCredential) {
    this.anchor = anchor;
    this.certIndex = certIndex;
    this.committeeColdCredential = committeeColdCredential;
  }

  /**
   * Gets the anchor for the certificate.
   *
   * @return the anchor for the certificate
   */
  public Anchor getAnchor() {
    return anchor;
  }

  /**
   * Sets the anchor for the certificate.
   *
   * @param anchor the anchor for the certificate
   */
  public void setAnchor(Anchor anchor) {
    this.anchor = anchor;
  }

  /**
   * Gets the index of the certificate in the transaction.
   *
   * @return the index of the certificate in the transaction
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate in the transaction.
   *
   * @param certIndex the index of the certificate in the transaction
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the hex-encoded committee cold credential.
   *
   * @return the hex-encoded committee cold credential
   */
  public String getCommitteeColdCredential() {
    return committeeColdCredential;
  }

  /**
   * Sets the hex-encoded committee cold credential.
   *
   * @param committeeColdCredential the hex-encoded committee cold credential
   */
  public void setCommitteeColdCredential(String committeeColdCredential) {
    this.committeeColdCredential = committeeColdCredential;
  }

  /**
   * Returns a string representation of this ResignCommitteeColdCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "ResignCommitteeColdCert{" +
        "anchor=" + anchor +
        ", certIndex=" + certIndex +
        ", committeeColdCredential='" + committeeColdCredential + '\'' +
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
    ResignCommitteeColdCert that = (ResignCommitteeColdCert) o;
    return Objects.equals(anchor, that.anchor) && Objects.equals(certIndex, that.certIndex) && Objects.equals(committeeColdCredential, that.committeeColdCredential);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchor, certIndex, committeeColdCredential);
  }
}
