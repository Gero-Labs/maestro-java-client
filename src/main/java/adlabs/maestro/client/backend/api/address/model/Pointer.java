package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents a pointer with certificate index, slot, and transaction index.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Pointer {

  /**
   * Certificate index.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Slot number.
   */
  @NotNull
  @Min(0L)
  private Long slot;

  /**
   * Transaction index.
   */
  @NotNull
  @Min(0L)
  private Long txIndex;

  /**
   * Default constructor.
   */
  public Pointer() {
  }

  /**
   * Constructor with all fields.
   *
   * @param certIndex Certificate index
   * @param slot Slot number
   * @param txIndex Transaction index
   */
  public Pointer(Long certIndex, Long slot, Long txIndex) {
    this.certIndex = certIndex;
    this.slot = slot;
    this.txIndex = txIndex;
  }

  /**
   * Gets the certificate index.
   *
   * @return the certificate index
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the certificate index.
   *
   * @param certIndex the certificate index
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the slot number.
   *
   * @return the slot number
   */
  public Long getSlot() {
    return slot;
  }

  /**
   * Sets the slot number.
   *
   * @param slot the slot number
   */
  public void setSlot(Long slot) {
    this.slot = slot;
  }

  /**
   * Gets the transaction index.
   *
   * @return the transaction index
   */
  public Long getTxIndex() {
    return txIndex;
  }

  /**
   * Sets the transaction index.
   *
   * @param txIndex the transaction index
   */
  public void setTxIndex(Long txIndex) {
    this.txIndex = txIndex;
  }

  @Override
  public String toString() {
    return "Pointer{" +
        "certIndex=" + certIndex +
        ", slot=" + slot +
        ", txIndex=" + txIndex +
        '}';
  }
}
