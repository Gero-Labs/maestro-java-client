package adlabs.maestro.client.backend.api.script.model;

import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransaction;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Details of a Native or Plutus script, including when it was first seen.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScriptFirstSeen {

  /**
   * Hex-encoded script bytes.
   */
  @NotNull
  private String bytes;

  /**
   * Details of the transaction where the script was first seen.
   */
  @NotNull
  @Valid
  private TimestampedTransaction firstSeen;

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
  public ScriptFirstSeen() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bytes     the hex-encoded script bytes
   * @param firstSeen the details of the transaction where the script was first seen
   * @param hash      the hex-encoded script hash
   * @param json      the script JSON
   * @param type      the type of the script
   */
  public ScriptFirstSeen(String bytes, TimestampedTransaction firstSeen, String hash, JsonNode json, ScriptType type) {
    this.bytes = bytes;
    this.firstSeen = firstSeen;
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
   * Gets the details of the transaction where the script was first seen.
   *
   * @return the details of the transaction where the script was first seen
   */
  public TimestampedTransaction getFirstSeen() {
    return firstSeen;
  }

  /**
   * Sets the details of the transaction where the script was first seen.
   *
   * @param firstSeen the details of the transaction where the script was first seen to set
   */
  public void setFirstSeen(TimestampedTransaction firstSeen) {
    this.firstSeen = firstSeen;
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
    return "ScriptFirstSeen{" +
        "bytes='" + bytes + '\'' +
        ", firstSeen=" + firstSeen +
        ", hash='" + hash + '\'' +
        ", json=" + json +
        ", type=" + type +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ScriptFirstSeen that = (ScriptFirstSeen) o;
    return Objects.equals(bytes, that.bytes) && Objects.equals(firstSeen, that.firstSeen) && Objects.equals(hash, that.hash) && Objects.equals(json, that.json) && Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, firstSeen, hash, json, type);
  }
}
