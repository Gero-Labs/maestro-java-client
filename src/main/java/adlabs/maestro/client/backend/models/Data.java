package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;

/**
 * Represents a data entry with a hash and a dynamic value.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Data {

  /**
   * Hash value.
   */
  @NotNull
  private String hash;

  /**
   * Dynamic JSON content.
   */
  @NotNull
  private JsonNode value;

  /**
   * Default no-argument constructor.
   */
  public Data() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param hash the hash value
   * @param value the dynamic JSON content
   */
  public Data(String hash, JsonNode value) {
    this.hash = hash;
    this.value = value;
  }

  /**
   * Gets the hash value.
   * 
   * @return the hash value
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the hash value.
   * 
   * @param hash the hash value to set
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Gets the dynamic JSON content.
   * 
   * @return the dynamic JSON content
   */
  public JsonNode getValue() {
    return value;
  }

  /**
   * Sets the dynamic JSON content.
   * 
   * @param value the dynamic JSON content to set
   */
  public void setValue(JsonNode value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Data{" +
            "hash='" + hash + '\'' +
            ", value=" + value +
            '}';
  }
}
