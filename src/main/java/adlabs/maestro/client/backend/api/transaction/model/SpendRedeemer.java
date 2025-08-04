package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a redeemer for a spending transaction.
 * 
 * <p>This class provides constructors for creating instances with or without initial values.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SpendRedeemer {

  /**
   * Datum associated with the redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * Execution units (CPU and memory) required for the redeemer.
   */
  @NotNull
  private List<@Min(0L)Long> exUnits;

  /**
   * UTXO input being spent.
   */
  @NotNull
  @Valid
  private SpendRedeemerInput input;

  /**
   * Index of the input being spent.
   */
  @NotNull
  private Integer inputIndex;

  /**
   * Hex-encoded script hash of the validator script.
   */
  @NotNull
  private String scriptHash;

  /**
   * Default constructor.
   */
  public SpendRedeemer() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the datum associated with the redeemer
   * @param exUnits the execution units (CPU and memory) required for the redeemer
   * @param input the UTXO input being spent
   * @param inputIndex the index of the input being spent
   * @param scriptHash the hex-encoded script hash of the validator script
   */
  public SpendRedeemer(Datum data, List<Long> exUnits, SpendRedeemerInput input, Integer inputIndex, String scriptHash) {
    this.data = data;
    this.exUnits = exUnits;
    this.input = input;
    this.inputIndex = inputIndex;
    this.scriptHash = scriptHash;
  }

  /**
   * Gets the datum associated with the redeemer.
   *
   * @return the datum associated with the redeemer
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the datum associated with the redeemer.
   *
   * @param data the datum associated with the redeemer
   */
  public void setData(Datum data) {
    this.data = data;
  }

  /**
   * Gets the execution units (CPU and memory) required for the redeemer.
   *
   * @return the execution units required for the redeemer
   */
  public List<Long> getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution units (CPU and memory) required for the redeemer.
   *
   * @param exUnits the execution units required for the redeemer
   */
  public void setExUnits(List<Long> exUnits) {
    this.exUnits = exUnits;
  }

  /**
   * Gets the UTXO input being spent.
   *
   * @return the UTXO input being spent
   */
  public SpendRedeemerInput getInput() {
    return input;
  }

  /**
   * Sets the UTXO input being spent.
   *
   * @param input the UTXO input being spent
   */
  public void setInput(SpendRedeemerInput input) {
    this.input = input;
  }

  /**
   * Gets the index of the input being spent.
   *
   * @return the index of the input being spent
   */
  public Integer getInputIndex() {
    return inputIndex;
  }

  /**
   * Sets the index of the input being spent.
   *
   * @param inputIndex the index of the input being spent
   */
  public void setInputIndex(Integer inputIndex) {
    this.inputIndex = inputIndex;
  }

  /**
   * Gets the hex-encoded script hash of the validator script.
   *
   * @return the hex-encoded script hash of the validator script
   */
  public String getScriptHash() {
    return scriptHash;
  }

  /**
   * Sets the hex-encoded script hash of the validator script.
   *
   * @param scriptHash the hex-encoded script hash of the validator script
   */
  public void setScriptHash(String scriptHash) {
    this.scriptHash = scriptHash;
  }

  /**
   * Returns a string representation of this SpendRedeemer.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "SpendRedeemer{" +
        "data=" + data +
        ", exUnits=" + exUnits +
        ", input=" + input +
        ", inputIndex=" + inputIndex +
        ", scriptHash='" + scriptHash + '\'' +
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
    SpendRedeemer that = (SpendRedeemer) o;
    return Objects.equals(data, that.data) && Objects.equals(exUnits, that.exUnits) && Objects.equals(input, that.input) && Objects.equals(inputIndex, that.inputIndex) && Objects.equals(scriptHash, that.scriptHash);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(data, exUnits, input, inputIndex, scriptHash);
  }
}
