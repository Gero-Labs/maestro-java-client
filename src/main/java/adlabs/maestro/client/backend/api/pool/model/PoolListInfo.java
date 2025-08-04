package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * Stake pool identifier.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolListInfo {

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Pool ticker.
   */
  private String ticker;

  /**
   * Creates a new PoolListInfo instance.
   */
  public PoolListInfo() {
  }

  /**
   * Creates a new PoolListInfo instance with all fields.
   *
   * @param poolIdBech32 the Bech32-encoded pool ID
   * @param ticker the pool ticker
   */
  public PoolListInfo(String poolIdBech32, String ticker) {
    this.poolIdBech32 = poolIdBech32;
    this.ticker = ticker;
  }

  /**
   * Gets the Bech32-encoded pool ID.
   *
   * @return the pool ID
   */
  public String getPoolIdBech32() {
    return poolIdBech32;
  }

  /**
   * Sets the Bech32-encoded pool ID.
   *
   * @param poolIdBech32 the pool ID
   */
  public void setPoolIdBech32(String poolIdBech32) {
    this.poolIdBech32 = poolIdBech32;
  }

  /**
   * Gets the pool ticker.
   *
   * @return the ticker
   */
  public String getTicker() {
    return ticker;
  }

  /**
   * Sets the pool ticker.
   *
   * @param ticker the ticker
   */
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  /**
   * Returns a string representation of this PoolListInfo.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "PoolListInfo{" +
        "poolIdBech32='" + poolIdBech32 + '\'' +
        ", ticker='" + ticker + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is \"equal to\" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the o argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PoolListInfo that = (PoolListInfo) o;
    return Objects.equals(poolIdBech32, that.poolIdBech32) &&
        Objects.equals(ticker, that.ticker);
  }

  /**
   * Returns a hash code value for this object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(poolIdBech32, ticker);
  }
}
