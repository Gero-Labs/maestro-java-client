package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents an evaluation request for a transaction.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EvaluateRequest {

  /**
   * Additional UTXOs for evaluation.
   */
  @Valid
  private List<@Valid AdditionalUtxo> additionalUtxos;

  /**
   * Transaction CBOR.
   */
  @NotNull
  private String cbor;

  /**
   * Creates a no-argument constructor.
   */
  public EvaluateRequest() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param additionalUtxos Additional UTXOs for evaluation
   * @param cbor Transaction CBOR
   */
  public EvaluateRequest(List<AdditionalUtxo> additionalUtxos, String cbor) {
    this.additionalUtxos = additionalUtxos;
    this.cbor = cbor;
  }

  /**
   * Gets the additional UTXOs for evaluation.
   *
   * @return the additional UTXOs
   */
  public List<AdditionalUtxo> getAdditionalUtxos() {
    return additionalUtxos;
  }

  /**
   * Sets the additional UTXOs for evaluation.
   *
   * @param additionalUtxos the additional UTXOs to set
   */
  public void setAdditionalUtxos(List<AdditionalUtxo> additionalUtxos) {
    this.additionalUtxos = additionalUtxos;
  }

  /**
   * Gets the transaction CBOR.
   *
   * @return the transaction CBOR
   */
  public String getCbor() {
    return cbor;
  }

  /**
   * Sets the transaction CBOR.
   *
   * @param cbor the transaction CBOR to set
   */
  public void setCbor(String cbor) {
    this.cbor = cbor;
  }

  @Override
  public String toString() {
    return "EvaluateRequest{" +
        "additionalUtxos=" + additionalUtxos +
        ", cbor='" + cbor + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EvaluateRequest that = (EvaluateRequest) o;
    return java.util.Objects.equals(additionalUtxos, that.additionalUtxos) &&
        java.util.Objects.equals(cbor, that.cbor);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(additionalUtxos, cbor);
  }
}
