package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a certificate for registering a stake credential and delegating to a DRep.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VoteRegDelegCert {

  /**
   * Default constructor.
   */
  public VoteRegDelegCert() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex the index of the certificate in the transaction
   * @param deposit the stake registration deposit
   * @param drep the DRep to which the stake is delegated
   * @param stakeAddress the stake address corresponding to the stake key being updated
   */
  public VoteRegDelegCert(Long certIndex, String deposit, DRep drep, String stakeAddress) {
    this.certIndex = certIndex;
    this.deposit = deposit;
    this.drep = drep;
    this.stakeAddress = stakeAddress;
  }

  /**
   * The index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The stake registration deposit.
   */
  @NotNull
  private String deposit;

  /**
   * The DRep to which the stake is delegated.
   */
  @NotNull
  @Valid
  private DRep drep;

  /**
   * The stake address corresponding to the stake key being updated.
   */
  @NotNull
  private String stakeAddress;

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
   * Gets the stake registration deposit.
   *
   * @return the deposit
   */
  public String getDeposit() {
    return deposit;
  }

  /**
   * Sets the stake registration deposit.
   *
   * @param deposit the deposit
   */
  public void setDeposit(String deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the DRep to which the stake is delegated.
   *
   * @return the DRep
   */
  public DRep getDrep() {
    return drep;
  }

  /**
   * Sets the DRep to which the stake is delegated.
   *
   * @param drep the DRep
   */
  public void setDrep(DRep drep) {
    this.drep = drep;
  }

  /**
   * Gets the stake address corresponding to the stake key being updated.
   *
   * @return the stake address
   */
  public String getStakeAddress() {
    return stakeAddress;
  }

  /**
   * Sets the stake address corresponding to the stake key being updated.
   *
   * @param stakeAddress the stake address
   */
  public void setStakeAddress(String stakeAddress) {
    this.stakeAddress = stakeAddress;
  }

  /**
   * Returns a string representation of this VoteRegDelegCert.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "VoteRegDelegCert{" +
        "certIndex=" + certIndex +
        ", deposit='" + deposit + '\'' +
        ", drep=" + drep +
        ", stakeAddress='" + stakeAddress + '\'' +
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
    VoteRegDelegCert that = (VoteRegDelegCert) o;
    return java.util.Objects.equals(certIndex, that.certIndex) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(drep, that.drep) &&
        java.util.Objects.equals(stakeAddress, that.stakeAddress);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(certIndex, deposit, drep, stakeAddress);
  }
}
