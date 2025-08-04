package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CIP-68 metadata structure containing asset metadata, purpose classification,
 * version information, and optional custom data.
 *
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Cip68Metadata {

  /** Custom user defined Plutus data CBOR bytes */
  private String extra;

  /** Asset CIP-68 metadata as dynamic JSON structure */
  @NotNull
  private JsonNode metadata;

  /** Asset type and purpose classification */
  @NotNull
  @Valid
  private Cip68AssetType purpose;

  /** CIP-68 version number */
  @NotNull
  @Min(0L)
  private Long version;

  /**
   * Default constructor
   */
  public Cip68Metadata() {
  }

  /**
   * Constructor with all fields
   * @param extra Custom user defined Plutus data CBOR bytes
   * @param metadata Asset CIP-68 metadata as dynamic JSON structure
   * @param purpose Asset type and purpose classification
   * @param version CIP-68 version number
   */
  public Cip68Metadata(String extra, JsonNode metadata, Cip68AssetType purpose, Long version) {
    this.extra = extra;
    this.metadata = metadata;
    this.purpose = purpose;
    this.version = version;
  }

  /**
   * Gets custom user-defined Plutus data CBOR bytes
   * @return extra data
   */
  public String getExtra() {
    return extra;
  }

  /**
   * Sets custom user defined Plutus data CBOR bytes
   * @param extra the extra data to set
   */
  public void setExtra(String extra) {
    this.extra = extra;
  }

  /**
   * Gets asset CIP-68 metadata as dynamic JSON structure
   * @return metadata
   */
  public JsonNode getMetadata() {
    return metadata;
  }

  /**
   * Sets asset CIP-68 metadata as dynamic JSON structure
   * @param metadata the metadata to set
   */
  public void setMetadata(JsonNode metadata) {
    this.metadata = metadata;
  }

  /**
   * Gets asset type and purpose classification
   * @return purpose
   */
  public Cip68AssetType getPurpose() {
    return purpose;
  }

  /**
   * Sets asset type and purpose classification
   * @param purpose the purpose to set
   */
  public void setPurpose(Cip68AssetType purpose) {
    this.purpose = purpose;
  }

  /**
   * Gets CIP-68 version number
   * @return version
   */
  public Long getVersion() {
    return version;
  }

  /**
   * Sets CIP-68 version number
   * @param version the version to set
   */
  public void setVersion(Long version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return "Cip68Metadata{" +
        "extra='" + extra + '\'' +
        ", metadata=" + metadata +
        ", purpose=" + purpose +
        ", version=" + version +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cip68Metadata that = (Cip68Metadata) o;
    return Objects.equals(extra, that.extra) &&
        Objects.equals(metadata, that.metadata) &&
        Objects.equals(purpose, that.purpose) &&
        Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, metadata, purpose, version);
  }
}
