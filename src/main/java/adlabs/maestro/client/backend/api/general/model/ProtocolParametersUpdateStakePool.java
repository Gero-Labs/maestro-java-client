package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a stake pool protocol parameters update (introduced in Conway).
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProtocolParametersUpdateStakePool {

  /**
   * Security parameters.
   */
  @NotNull
  private String security;

  /**
   * Default constructor.
   */
  public ProtocolParametersUpdateStakePool() {
  }

  /**
   * All arguments constructor.
   *
   * @param security the security parameters
   */
  public ProtocolParametersUpdateStakePool(String security) {
    this.security = security;
  }

  /**
   * Gets the security parameters.
   *
   * @return the security parameters
   */
  public String getSecurity() {
    return security;
  }

  /**
   * Sets the security parameters.
   *
   * @param security the security parameters
   */
  public void setSecurity(String security) {
    this.security = security;
  }

  @Override
  public String toString() {
    return "ProtocolParametersUpdateStakePool{" +
        "security='" + security + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProtocolParametersUpdateStakePool that = (ProtocolParametersUpdateStakePool) o;
    return Objects.equals(security, that.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security);
  }
}
