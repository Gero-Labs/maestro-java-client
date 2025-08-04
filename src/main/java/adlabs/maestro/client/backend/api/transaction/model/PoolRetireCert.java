package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Certificate for retiring a stake pool.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolRetireCert {

  /**
   * No-argument constructor.
   */
  public PoolRetireCert() {
  }

  /**
   * All-argument constructor.
   *
   * @param afterEpoch epoch at the end of which the pool will be retired
   * @param certIndex index of the certificate
   * @param poolId Bech32 pool ID of the pool being retired
   */
  public PoolRetireCert(Integer afterEpoch, Long certIndex, String poolId) {
    this.afterEpoch = afterEpoch;
    this.certIndex = certIndex;
    this.poolId = poolId;
  }

  /**
   * Epoch at the end of which the pool will be retired.
   */
  @NotNull
  @Min(0)
  private Integer afterEpoch;

  /**
   * Index of the certificate.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * Bech32 pool ID of the pool being retired.
   */
  @NotNull
  private String poolId;

  /**
   * Gets the epoch at the end of which the pool will be retired.
   *
   * @return the epoch at the end of which the pool will be retired
   */
  public Integer getAfterEpoch() {
    return afterEpoch;
  }

  /**
   * Sets the epoch at the end of which the pool will be retired.
   *
   * @param afterEpoch the epoch at the end of which the pool will be retired to set
   */
  public void setAfterEpoch(Integer afterEpoch) {
    this.afterEpoch = afterEpoch;
  }

  /**
   * Gets the index of the certificate.
   *
   * @return the index of the certificate
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate.
   *
   * @param certIndex the index of the certificate to set
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the Bech32 pool ID of the pool being retired.
   *
   * @return the Bech32 pool ID of the pool being retired
   */
  public String getPoolId() {
    return poolId;
  }

  /**
   * Sets the Bech32 pool ID of the pool being retired.
   *
   * @param poolId the Bech32 pool ID of the pool being retired to set
   */
  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }

  @Override
  public String toString() {
    return "PoolRetireCert{" +
        "afterEpoch=" + afterEpoch +
        ", certIndex=" + certIndex +
        ", poolId='" + poolId + '\'' +
        '}';
  }
}
