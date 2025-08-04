package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import javax.validation.constraints.NotNull;

/**
 * Represents a datum with hex encoded bytes and an optional JSON representation.
 * 
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Datum {

  /**
   * Hex encoded datum CBOR bytes.
   */
  @NotNull
  private String bytes;

  /**
   * JSON representation of the datum.
   */
  private JsonNode json;

  /**
   * Default constructor.
   */
  public Datum() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bytes Hex encoded datum CBOR bytes
   * @param json JSON representation of the datum
   */
  public Datum(String bytes, JsonNode json) {
    this.bytes = bytes;
    this.json = json;
  }

  /**
   * Gets the hex encoded datum CBOR bytes.
   *
   * @return the hex encoded datum CBOR bytes
   */
  public String getBytes() {
    return bytes;
  }

  /**
   * Sets the hex encoded datum CBOR bytes.
   *
   * @param bytes the hex encoded datum CBOR bytes
   */
  public void setBytes(String bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the JSON representation of the datum.
   *
   * @return the JSON representation of the datum
   */
  public JsonNode getJson() {
    return json;
  }

  /**
   * Sets the JSON representation of the datum.
   *
   * @param json the JSON representation of the datum
   */
  public void setJson(JsonNode json) {
    this.json = json;
  }

  @Override
  public String toString() {
    return "Datum{" +
      "bytes='" + bytes + '\'' +
      ", json=" + json +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Datum datum = (Datum) o;
    return Objects.equals(bytes, datum.bytes) &&
      Objects.equals(json, datum.json);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, json);
  }
}
