package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

/**
 * Authorizes the constitutional committee hot credential
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AuthCommitteeHotCert {

  /**
   * Index of the certificate in the transaction
   */
  private Long certIndex;

  /**
   * Committee cold credential
   */
  private String committeeColdCredential;

  /**
   * Committee hot credential
   */
  private String committeeHotCredential;

  /**
   * Default constructor.
   */
  public AuthCommitteeHotCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param committeeColdCredential the committee cold credential
   * @param committeeHotCredential the committee hot credential
   */
  public AuthCommitteeHotCert(Long certIndex, String committeeColdCredential, String committeeHotCredential) {
    this.certIndex = certIndex;
    this.committeeColdCredential = committeeColdCredential;
    this.committeeHotCredential = committeeHotCredential;
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
   * Gets the committee cold credential.
   *
   * @return the committee cold credential
   */
  public String getCommitteeColdCredential() {
    return committeeColdCredential;
  }

  /**
   * Sets the committee cold credential.
   *
   * @param committeeColdCredential the committee cold credential
   */
  public void setCommitteeColdCredential(String committeeColdCredential) {
    this.committeeColdCredential = committeeColdCredential;
  }

  /**
   * Gets the committee hot credential.
   *
   * @return the committee hot credential
   */
  public String getCommitteeHotCredential() {
    return committeeHotCredential;
  }

  /**
   * Sets the committee hot credential.
   *
   * @param committeeHotCredential the committee hot credential
   */
  public void setCommitteeHotCredential(String committeeHotCredential) {
    this.committeeHotCredential = committeeHotCredential;
  }

  /**
   * Returns a string representation of this AuthCommitteeHotCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "AuthCommitteeHotCert{" +
        "certIndex=" + certIndex +
        ", committeeColdCredential='" + committeeColdCredential + '\'' +
        ", committeeHotCredential='" + committeeHotCredential + '\'' +
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
    AuthCommitteeHotCert that = (AuthCommitteeHotCert) o;
    return Objects.equals(certIndex, that.certIndex) && Objects.equals(committeeColdCredential, that.committeeColdCredential) && Objects.equals(committeeHotCredential, that.committeeHotCredential);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(certIndex, committeeColdCredential, committeeHotCredential);
  }
}