package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.LastUpdated;
import java.util.Objects;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code TimestampedPolicyInfo()} - Creates a no-argument constructor</li>
 *   <li>{@code TimestampedPolicyInfo(PolicyInfo, LastUpdated)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedPolicyInfo {

  private PolicyInfo data;

  private LastUpdated lastUpdated;

  /**
   * Default no-argument constructor.
   */
  public TimestampedPolicyInfo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data the policy information data
   * @param lastUpdated the last updated information
   */
  public TimestampedPolicyInfo(PolicyInfo data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the policy information data.
   *
   * @return the policy information data
   */
  public PolicyInfo getData() {
    return data;
  }

  /**
   * Sets the policy information data.
   *
   * @param data the policy information data
   */
  public void setData(PolicyInfo data) {
    this.data = data;
  }

  /**
   * Gets the last updated information.
   *
   * @return the last updated information
   */
  public LastUpdated getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Sets the last updated information.
   *
   * @param lastUpdated the last updated information
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedPolicyInfo that = (TimestampedPolicyInfo) o;
    return Objects.equals(data, that.data) &&
           Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }

  @Override
  public String toString() {
    return "TimestampedPolicyInfo{" +
           "data=" + data +
           ", lastUpdated=" + lastUpdated +
           '}';
  }
}

