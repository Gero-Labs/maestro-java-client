package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.Valid;

/**
 * Represents asset information corresponding to popular on-chain standards.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetStandards {

  /**
   * CIP-25 metadata for the asset.
   */
  private JsonNode cip25Metadata;

  /**
   * CIP-68 metadata for the asset.
   */
  @Valid
  private Cip68Metadata cip68Metadata;

  /**
   * Default constructor
   */
  public AssetStandards() {
  }

  /**
   * Constructor with all fields
   * @param cip25Metadata CIP-25 metadata for the asset
   * @param cip68Metadata CIP-68 metadata for the asset
   */
  public AssetStandards(JsonNode cip25Metadata, Cip68Metadata cip68Metadata) {
    this.cip25Metadata = cip25Metadata;
    this.cip68Metadata = cip68Metadata;
  }

  /**
   * Gets CIP-25 metadata for the asset
   * @return CIP-25 metadata
   */
  public JsonNode getCip25Metadata() {
    return cip25Metadata;
  }

  /**
   * Sets CIP-25 metadata for the asset
   * @param cip25Metadata the CIP-25 metadata to set
   */
  public void setCip25Metadata(JsonNode cip25Metadata) {
    this.cip25Metadata = cip25Metadata;
  }

  /**
   * Gets CIP-68 metadata for the asset
   * @return CIP-68 metadata
   */
  public Cip68Metadata getCip68Metadata() {
    return cip68Metadata;
  }

  /**
   * Sets CIP-68 metadata for the asset
   * @param cip68Metadata the CIP-68 metadata to set
   */
  public void setCip68Metadata(Cip68Metadata cip68Metadata) {
    this.cip68Metadata = cip68Metadata;
  }

  @Override
  public String toString() {
    return "AssetStandards{" +
        "cip25Metadata=" + cip25Metadata +
        ", cip68Metadata=" + cip68Metadata +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AssetStandards that = (AssetStandards) o;
    return Objects.equals(cip25Metadata, that.cip25Metadata) &&
           Objects.equals(cip68Metadata, that.cip68Metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cip25Metadata, cip68Metadata);
  }
}
