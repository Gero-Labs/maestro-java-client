package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents DRep protocol parameters update (introduced in Conway).
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProtocolParametersUpdateDRep {

  /**
   * Economic parameters.
   */
  @NotNull
  private String economic;

  /**
   * Governance parameters.
   */
  @NotNull
  private String governance;

  /**
   * Network parameters.
   */
  @NotNull
  private String network;

  /**
   * Technical parameters.
   */
  @NotNull
  private String technical;

  /**
   * Default constructor.
   */
  public ProtocolParametersUpdateDRep() {
  }

  /**
   * All arguments constructor.
   *
   * @param economic the economic parameters
   * @param governance the governance parameters
   * @param network the network parameters
   * @param technical the technical parameters
   */
  public ProtocolParametersUpdateDRep(String economic, String governance, String network, String technical) {
    this.economic = economic;
    this.governance = governance;
    this.network = network;
    this.technical = technical;
  }

  /**
   * Gets the economic parameters.
   *
   * @return the economic parameters
   */
  public String getEconomic() {
    return economic;
  }

  /**
   * Sets the economic parameters.
   *
   * @param economic the economic parameters
   */
  public void setEconomic(String economic) {
    this.economic = economic;
  }

  /**
   * Gets the governance parameters.
   *
   * @return the governance parameters
   */
  public String getGovernance() {
    return governance;
  }

  /**
   * Sets the governance parameters.
   *
   * @param governance the governance parameters
   */
  public void setGovernance(String governance) {
    this.governance = governance;
  }

  /**
   * Gets the network parameters.
   *
   * @return the network parameters
   */
  public String getNetwork() {
    return network;
  }

  /**
   * Sets the network parameters.
   *
   * @param network the network parameters
   */
  public void setNetwork(String network) {
    this.network = network;
  }

  /**
   * Gets the technical parameters.
   *
   * @return the technical parameters
   */
  public String getTechnical() {
    return technical;
  }

  /**
   * Sets the technical parameters.
   *
   * @param technical the technical parameters
   */
  public void setTechnical(String technical) {
    this.technical = technical;
  }

  @Override
  public String toString() {
    return "ProtocolParametersUpdateDRep{" +
        "economic='" + economic + '\'' +
        ", governance='" + governance + '\'' +
        ", network='" + network + '\'' +
        ", technical='" + technical + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProtocolParametersUpdateDRep that = (ProtocolParametersUpdateDRep) o;
    return Objects.equals(economic, that.economic) &&
        Objects.equals(governance, that.governance) &&
        Objects.equals(network, that.network) &&
        Objects.equals(technical, that.technical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(economic, governance, network, technical);
  }
}
