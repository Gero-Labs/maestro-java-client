package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an operational certificate.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class OperationalCert {

  /**
   * Hot key verification key.
   */
  @NotNull
  private String hotVkey;

  /**
   * KES period.
   */
  @NotNull
  @Min(0L)
  private Long kesPeriod;

  /**
   * KES signature.
   */
  @NotNull
  private String kesSignature;

  /**
   * Sequence number.
   */
  @NotNull
  @Min(0L)
  private Long sequenceNumber;

  /**
   * Default constructor.
   */
  public OperationalCert() {
  }

  /**
   * Constructor with all fields as parameters.
   *
   * @param hotVkey Hot key verification key
   * @param kesPeriod KES period
   * @param kesSignature KES signature
   * @param sequenceNumber Sequence number
   */
  public OperationalCert(String hotVkey, Long kesPeriod, String kesSignature, Long sequenceNumber) {
    this.hotVkey = hotVkey;
    this.kesPeriod = kesPeriod;
    this.kesSignature = kesSignature;
    this.sequenceNumber = sequenceNumber;
  }

  /**
   * Gets the hot key verification key.
   *
   * @return the hot key verification key
   */
  public String getHotVkey() {
    return hotVkey;
  }

  /**
   * Sets the hot key verification key.
   *
   * @param hotVkey the hot key verification key
   */
  public void setHotVkey(String hotVkey) {
    this.hotVkey = hotVkey;
  }

  /**
   * Gets the KES period.
   *
   * @return the KES period
   */
  public Long getKesPeriod() {
    return kesPeriod;
  }

  /**
   * Sets the KES period.
   *
   * @param kesPeriod the KES period
   */
  public void setKesPeriod(Long kesPeriod) {
    this.kesPeriod = kesPeriod;
  }

  /**
   * Gets the KES signature.
   *
   * @return the KES signature
   */
  public String getKesSignature() {
    return kesSignature;
  }

  /**
   * Sets the KES signature.
   *
   * @param kesSignature the KES signature
   */
  public void setKesSignature(String kesSignature) {
    this.kesSignature = kesSignature;
  }

  /**
   * Gets the sequence number.
   *
   * @return the sequence number
   */
  public Long getSequenceNumber() {
    return sequenceNumber;
  }

  /**
   * Sets the sequence number.
   *
   * @param sequenceNumber the sequence number
   */
  public void setSequenceNumber(Long sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  /**
   * Returns a string representation of this OperationalCert.
   *
   * @return a string representation of this OperationalCert
   */
  @Override
  public String toString() {
    return "OperationalCert{" +
            "hotVkey='" + hotVkey + '\'' +
            ", kesPeriod=" + kesPeriod +
            ", kesSignature='" + kesSignature + '\'' +
            ", sequenceNumber=" + sequenceNumber +
            '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param obj the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    OperationalCert that = (OperationalCert) obj;
    return Objects.equals(hotVkey, that.hotVkey) &&
            Objects.equals(kesPeriod, that.kesPeriod) &&
            Objects.equals(kesSignature, that.kesSignature) &&
            Objects.equals(sequenceNumber, that.sequenceNumber);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(hotVkey, kesPeriod, kesSignature, sequenceNumber);
  }
}
