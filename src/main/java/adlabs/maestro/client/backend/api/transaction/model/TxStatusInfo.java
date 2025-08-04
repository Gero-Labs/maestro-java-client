package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Information about the status of a transaction.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TxStatusInfo {

  /**
   * Default constructor.
   */
  public TxStatusInfo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param txHash the transaction hash
   * @param txStatus the status of the transaction
   */
  public TxStatusInfo(String txHash, TxStatus txStatus) {
    this.txHash = txHash;
    this.txStatus = txStatus;
  }

  /**
   * The transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * The status of the transaction.
   */
  @NotNull
  @Valid
  private TxStatus txStatus;

  /**
   * Gets the transaction hash.
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash.
   *
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Gets the status of the transaction.
   *
   * @return the transaction status
   */
  public TxStatus getTxStatus() {
    return txStatus;
  }

  /**
   * Sets the status of the transaction.
   *
   * @param txStatus the transaction status
   */
  public void setTxStatus(TxStatus txStatus) {
    this.txStatus = txStatus;
  }

  /**
   * Returns a string representation of this TxStatusInfo.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "TxStatusInfo{" +
        "txHash='" + txHash + '\'' +
        ", txStatus=" + txStatus +
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
    TxStatusInfo that = (TxStatusInfo) o;
    return java.util.Objects.equals(txHash, that.txHash) &&
        java.util.Objects.equals(txStatus, that.txStatus);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(txHash, txStatus);
  }
}
