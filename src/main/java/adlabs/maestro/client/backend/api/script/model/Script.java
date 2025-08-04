package adlabs.maestro.client.backend.api.script.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Details of a Native or Plutus script.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Script {

  /**
   * Hex-encoded script bytes.
   */
  @NotNull
  private String bytes;

  /**
   * Hex-encoded script hash.
   */
  @NotNull
  private String hash;

  /**
   * Script JSON.
   */
  private JsonNode json;

  /**
   * Type of the script.
   */
  @NotNull
  @Valid
  private ScriptType type;

  /**
   * Default constructor.
   */
  public Script() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bytes the hex-encoded script bytes
   * @param hash  the hex-encoded script hash
   * @param json  the script JSON
   * @param type  the type of the script
   */
  public Script(String bytes, String hash, JsonNode json, ScriptType type) {
    this.bytes = bytes;
    this.hash = hash;
    this.json = json;
    this.type = type;
  }

  /**
   * Gets the hex-encoded script bytes.
   *
   * @return the hex-encoded script bytes
   */
  public String getBytes() {
    return bytes;
  }

  /**
   * Sets the hex-encoded script bytes.
   *
   * @param bytes the hex-encoded script bytes to set
   */
  public void setBytes(String bytes) {
    this.bytes = bytes;
  }

  /**
   * Gets the hex-encoded script hash.
   *
   * @return the hex-encoded script hash
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the hex-encoded script hash.
   *
   * @param hash the hex-encoded script hash to set
   */
  public void setHash(String hash) {
    this.hash = hash;
  }

  /**
   * Gets the script JSON.
   *
   * @return the script JSON
   */
  public JsonNode getJson() {
    return json;
  }

  /**
   * Sets the script JSON.
   *
   * @param json the script JSON to set
   */
  public void setJson(JsonNode json) {
    this.json = json;
  }

  /**
   * Gets the type of the script.
   *
   * @return the type of the script
   */
  public ScriptType getType() {
    return type;
  }

  /**
   * Sets the type of the script.
   *
   * @param type the type of the script to set
   */
  public void setType(ScriptType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Script{" +
        "bytes='" + bytes + '\'' +
        ", hash='" + hash + '\'' +
        ", json=" + json +
        ", type=" + type +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Script script = (Script) o;
    return Objects.equals(bytes, script.bytes) && Objects.equals(hash, script.hash) && Objects.equals(json, script.json) && Objects.equals(type, script.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, hash, json, type);
  }
}
