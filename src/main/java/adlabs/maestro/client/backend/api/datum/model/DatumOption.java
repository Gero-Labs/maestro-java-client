package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a Datum (inline or hash).
 * 
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DatumOption {

  /**
   * Hex encoded datum CBOR bytes (null if datum type is hash and corresponding datum bytes have not been seen on-chain).
   */
  private String bytes;

  /**
   * Datum hash.
   */
  @NotNull
  private String hash;

  /**
   * JSON representation of the datum (null if datum type is hash and corresponding datum bytes have not been seen on-chain).
   */
  private JsonNode json;

  /**
   * Datum type (inline datum or datum hash).
   */
  @NotNull
  @Valid
  private DatumOptionType type;

  /**
   * Default constructor.
   */
  public DatumOption() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bytes Hex encoded datum CBOR bytes
   * @param hash Datum hash
   * @param json JSON representation of the datum
   * @param type Datum type (inline datum or datum hash)
   */
  public DatumOption(String bytes, String hash, JsonNode json, DatumOptionType type) {
    this.bytes = bytes;
    this.hash = hash;
    this.json = json;
    this.type = type;
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
   * Gets the datum hash.
   *
   * @return the datum hash
   */
  public String getHash() {
    return hash;
  }

  /**
   * Sets the datum hash.
   *
   * @param hash the datum hash
   */
  public void setHash(String hash) {
    this.hash = hash;
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

  /**
   * Gets the datum type.
   *
   * @return the datum type (inline datum or datum hash)
   */
  public DatumOptionType getType() {
    return type;
  }

  /**
   * Sets the datum type.
   *
   * @param type the datum type (inline datum or datum hash)
   */
  public void setType(DatumOptionType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "DatumOption{" +
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
    DatumOption that = (DatumOption) o;
    return Objects.equals(bytes, that.bytes) &&
      Objects.equals(hash, that.hash) &&
      Objects.equals(json, that.json) &&
      type == that.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, hash, json, type);
  }
}
