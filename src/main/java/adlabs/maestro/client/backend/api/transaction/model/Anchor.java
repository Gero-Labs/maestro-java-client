package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;

/**
 * Represents an anchor, which links to off-chain data.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Anchor {

  /**
   * No-argument constructor.
   */
  public Anchor() {
  }

  /**
   * All-argument constructor.
   *
   * @param contentHash the hash of the data at the URL
   * @param url the URL of the off-chain data
   */
  public Anchor(String contentHash, String url) {
    this.contentHash = contentHash;
    this.url = url;
  }

  /**
   * The hash of the data at the URL.
   */
  @NotNull
  private String contentHash;

  /**
   * The URL of the off-chain data.
   */
  @NotNull
  private String url;

  /**
   * Gets the hash of the data at the URL.
   *
   * @return the hash of the data at the URL
   */
  public String getContentHash() {
    return contentHash;
  }

  /**
   * Sets the hash of the data at the URL.
   *
   * @param contentHash the hash of the data at the URL to set
   */
  public void setContentHash(String contentHash) {
    this.contentHash = contentHash;
  }

  /**
   * Gets the URL of the off-chain data.
   *
   * @return the URL of the off-chain data
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the URL of the off-chain data.
   *
   * @param url the URL of the off-chain data to set
   */
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Anchor anchor = (Anchor) o;
    return java.util.Objects.equals(contentHash, anchor.contentHash) &&
        java.util.Objects.equals(url, anchor.url);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(contentHash, url);
  }

  @Override
  public String toString() {
    return "Anchor{" +
        "contentHash='" + contentHash + '\'' +
        ", url='" + url + '\'' +
        '}';
  }
}
