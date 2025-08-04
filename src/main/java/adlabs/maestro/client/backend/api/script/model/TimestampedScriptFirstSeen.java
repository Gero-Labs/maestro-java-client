package adlabs.maestro.client.backend.api.script.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Objects;

/**
 * Timestamped response. Returns the endpoint response data along with the chain-tip of the indexer, which details at which point in the chain&#39;s history the data was correct as-of.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedScriptFirstSeen {

  private ScriptFirstSeen data;

  private LastUpdated lastUpdated;

  /**
   * Default constructor.
   */
  public TimestampedScriptFirstSeen() {
  }

  /**
   * Constructor with all fields.
   *
   * @param data        the script first seen data
   * @param lastUpdated the last updated information
   */
  public TimestampedScriptFirstSeen(ScriptFirstSeen data, LastUpdated lastUpdated) {
    this.data = data;
    this.lastUpdated = lastUpdated;
  }

  /**
   * Gets the script first seen data.
   *
   * @return the script first seen data
   */
  public ScriptFirstSeen getData() {
    return data;
  }

  /**
   * Sets the script first seen data.
   *
   * @param data the script first seen data to set
   */
  public void setData(ScriptFirstSeen data) {
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
   * @param lastUpdated the last updated information to set
   */
  public void setLastUpdated(LastUpdated lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @Override
  public String toString() {
    return "TimestampedScriptFirstSeen{" +
        "data=" + data +
        ", lastUpdated=" + lastUpdated +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimestampedScriptFirstSeen that = (TimestampedScriptFirstSeen) o;
    return Objects.equals(data, that.data) && Objects.equals(lastUpdated, that.lastUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, lastUpdated);
  }
}

