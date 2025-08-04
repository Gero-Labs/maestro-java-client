package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import adlabs.maestro.client.backend.models.Relay;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Relay declared by a stake pool.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolRelay {

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Relays declared by the pool.
   */
  @NotNull
  @Valid
  private List<@Valid Relay> relays;

  /**
   * Default constructor
   */
  public PoolRelay() {
  }

  /**
   * Constructor with all fields
   * @param poolIdBech32 Bech32-encoded pool ID
   * @param relays Relays declared by the pool
   */
  public PoolRelay(String poolIdBech32, List<Relay> relays) {
    this.poolIdBech32 = poolIdBech32;
    this.relays = relays;
  }

  /**
   * Gets the Bech32-encoded pool ID
   * @return pool ID
   */
  public String getPoolIdBech32() {
    return poolIdBech32;
  }

  /**
   * Sets the Bech32-encoded pool ID
   * @param poolIdBech32 the pool ID to set
   */
  public void setPoolIdBech32(String poolIdBech32) {
    this.poolIdBech32 = poolIdBech32;
  }

  /**
   * Gets the relays declared by the pool
   * @return relays
   */
  public List<Relay> getRelays() {
    return relays;
  }

  /**
   * Sets the relays declared by the pool
   * @param relays the relays to set
   */
  public void setRelays(List<Relay> relays) {
    this.relays = relays;
  }

  @Override
  public String toString() {
    return "PoolRelay{" +
        "poolIdBech32='" + poolIdBech32 + '\'' +
        ", relays=" + relays +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PoolRelay poolRelay = (PoolRelay) o;
    return Objects.equals(poolIdBech32, poolRelay.poolIdBech32) &&
           Objects.equals(relays, poolRelay.relays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolIdBech32, relays);
  }
}
