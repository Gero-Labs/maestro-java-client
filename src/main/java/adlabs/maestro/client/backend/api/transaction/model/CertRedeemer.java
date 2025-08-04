package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificate redeemer containing authentication data and execution units
 * for certificate-based smart contract interactions.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CertRedeemer {

  /**
   * No-argument constructor.
   */
  public CertRedeemer() {
  }

  /**
   * All-argument constructor.
   *
   * @param certIndex position of certificate redeemer attempting to authenticate in sorted certificates
   * @param data redeemer data for certificate authentication
   * @param exUnits execution unit budget (memory, steps)
   */
  public CertRedeemer(Integer certIndex, Datum data, List<@Min(0L) Long> exUnits) {
    this.certIndex = certIndex;
    this.data = data;
    this.exUnits = exUnits;
  }

  /** Position of certificate redeemer attempting to authenticate in sorted certificates */
  @NotNull
  @Min(0)
  private Integer certIndex;

  /** Redeemer data for certificate authentication */
  @NotNull
  @Valid
  private Datum data;

  /** Execution unit budget (memory, steps) */
  @NotNull
  private List<@Min(0L) Long> exUnits;

  /**
   * Gets the position of certificate redeemer attempting to authenticate in sorted certificates.
   *
   * @return the position of certificate redeemer attempting to authenticate in sorted certificates
   */
  public Integer getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the position of certificate redeemer attempting to authenticate in sorted certificates.
   *
   * @param certIndex the position of certificate redeemer attempting to authenticate in sorted certificates to set
   */
  public void setCertIndex(Integer certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the redeemer data for certificate authentication.
   *
   * @return the redeemer data for certificate authentication
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the redeemer data for certificate authentication.
   *
   * @param data the redeemer data for certificate authentication to set
   */
  public void setData(Datum data) {
    this.data = data;
  }

  /**
   * Gets the execution unit budget (memory, steps).
   *
   * @return the execution unit budget (memory, steps)
   */
  public List<@Min(0L) Long> getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution unit budget (memory, steps).
   *
   * @param exUnits the execution unit budget (memory, steps) to set
   */
  public void setExUnits(List<@Min(0L) Long> exUnits) {
    this.exUnits = exUnits;
  }

  @Override
  public String toString() {
    return "CertRedeemer{" +
        "certIndex=" + certIndex +
        ", data=" + data +
        ", exUnits=" + exUnits +
        '}';
  }
}