package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Metadata associated with a stake pool.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolMetadata {

  /**
   * Hex-encoded metadata hash.
   */
  private String metaHash;

  /**
   * JSON metadata associated with a stake pool.
   */
  @Valid
  private PoolMetaJson metaJson;

  /**
   * URL to the metadata.
   */
  private String metaUrl;

  /**
   * Bech32-encoded pool ID.
   */
  @NotNull
  private String poolIdBech32;

  /**
   * Default constructor.
   */
  public PoolMetadata() {
  }

  /**
   * Constructor with all parameters.
   *
   * @param metaHash      the hex-encoded metadata hash
   * @param metaJson      the JSON metadata associated with a stake pool
   * @param metaUrl       the URL to the metadata
   * @param poolIdBech32  the Bech32-encoded pool ID
   */
  public PoolMetadata(String metaHash, PoolMetaJson metaJson, String metaUrl, String poolIdBech32) {
    this.metaHash = metaHash;
    this.metaJson = metaJson;
    this.metaUrl = metaUrl;
    this.poolIdBech32 = poolIdBech32;
  }

  /**
   * Gets the hex-encoded metadata hash.
   *
   * @return the hex-encoded metadata hash
   */
  public String getMetaHash() {
    return metaHash;
  }

  /**
   * Sets the hex-encoded metadata hash.
   *
   * @param metaHash the hex-encoded metadata hash to set
   */
  public void setMetaHash(String metaHash) {
    this.metaHash = metaHash;
  }

  /**
   * Gets the JSON metadata associated with a stake pool.
   *
   * @return the JSON metadata associated with a stake pool
   */
  public PoolMetaJson getMetaJson() {
    return metaJson;
  }

  /**
   * Sets the JSON metadata associated with a stake pool.
   *
   * @param metaJson the JSON metadata associated with a stake pool to set
   */
  public void setMetaJson(PoolMetaJson metaJson) {
    this.metaJson = metaJson;
  }

  /**
   * Gets the URL to the metadata.
   *
   * @return the URL to the metadata
   */
  public String getMetaUrl() {
    return metaUrl;
  }

  /**
   * Sets the URL to the metadata.
   *
   * @param metaUrl the URL to the metadata to set
   */
  public void setMetaUrl(String metaUrl) {
    this.metaUrl = metaUrl;
  }

  /**
   * Gets the Bech32-encoded pool ID.
   *
   * @return the Bech32-encoded pool ID
   */
  public String getPoolIdBech32() {
    return poolIdBech32;
  }

  /**
   * Sets the Bech32-encoded pool ID.
   *
   * @param poolIdBech32 the Bech32-encoded pool ID to set
   */
  public void setPoolIdBech32(String poolIdBech32) {
    this.poolIdBech32 = poolIdBech32;
  }

  /**
   * Returns a string representation of this object.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "PoolMetadata{" +
        "metaHash='" + metaHash + '\'' +
        ", metaJson=" + metaJson +
        ", metaUrl='" + metaUrl + '\'' +
        ", poolIdBech32='" + poolIdBech32 + '\'' +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PoolMetadata that = (PoolMetadata) o;
    return Objects.equals(metaHash, that.metaHash) &&
        Objects.equals(metaJson, that.metaJson) &&
        Objects.equals(metaUrl, that.metaUrl) &&
        Objects.equals(poolIdBech32, that.poolIdBech32);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(metaHash, metaJson, metaUrl, poolIdBech32);
  }

}
