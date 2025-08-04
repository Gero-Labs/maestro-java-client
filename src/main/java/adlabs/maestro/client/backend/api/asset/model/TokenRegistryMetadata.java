package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;

import java.util.Objects;

/**
 * Represents token registry metadata for a native asset.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TokenRegistryMetadata {

  /**
   * Recommended value for decimal places for the asset.
   */
  private Long decimals;

  /**
   * A description of the asset.
   */
  @NotNull
  private String description;

  /**
   * Base64 encoded PNG logo associated with the asset.
   */
  private String logo;

  /**
   * The name of the asset.
   */
  @NotNull
  private String name;

  /**
   * The ticker symbol for the asset.
   */
  private String ticker;

  /**
   * A URL associated with the asset.
   */
  private String url;

  /**
   * Default constructor
   */
  public TokenRegistryMetadata() {
  }

  /**
   * Constructor with all fields
   *
   * @param decimals the recommended value for decimal places for the asset
   * @param description the description of the asset
   * @param logo the base64 encoded PNG logo associated with the asset
   * @param name the name of the asset
   * @param ticker the ticker symbol for the asset
   * @param url the URL associated with the asset
   */
  public TokenRegistryMetadata(Long decimals, String description, String logo, String name, String ticker, String url) {
    this.decimals = decimals;
    this.description = description;
    this.logo = logo;
    this.name = name;
    this.ticker = ticker;
    this.url = url;
  }

  /**
   * Gets the recommended value for decimal places for the asset
   *
   * @return the recommended value for decimal places for the asset
   */
  public Long getDecimals() {
    return decimals;
  }

  /**
   * Sets the recommended value for decimal places for the asset
   *
   * @param decimals the recommended value for decimal places for the asset
   */
  public void setDecimals(Long decimals) {
    this.decimals = decimals;
  }

  /**
   * Gets the description of the asset
   *
   * @return the description of the asset
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description of the asset
   *
   * @param description the description of the asset
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets the base64 encoded PNG logo associated with the asset
   *
   * @return the base64 encoded PNG logo associated with the asset
   */
  public String getLogo() {
    return logo;
  }

  /**
   * Sets the base64 encoded PNG logo associated with the asset
   *
   * @param logo the base64 encoded PNG logo associated with the asset
   */
  public void setLogo(String logo) {
    this.logo = logo;
  }

  /**
   * Gets the name of the asset
   *
   * @return the name of the asset
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the asset
   *
   * @param name the name of the asset
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the ticker symbol for the asset
   *
   * @return the ticker symbol for the asset
   */
  public String getTicker() {
    return ticker;
  }

  /**
   * Sets the ticker symbol for the asset
   *
   * @param ticker the ticker symbol for the asset
   */
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  /**
   * Gets the URL associated with the asset
   *
   * @return the URL associated with the asset
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the URL associated with the asset
   *
   * @param url the URL associated with the asset
   */
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "TokenRegistryMetadata{" +
        "decimals=" + decimals +
        ", description='" + description + '\'' +
        ", logo='" + logo + '\'' +
        ", name='" + name + '\'' +
        ", ticker='" + ticker + '\'' +
        ", url='" + url + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenRegistryMetadata that = (TokenRegistryMetadata) o;
    return Objects.equals(decimals, that.decimals) &&
        Objects.equals(description, that.description) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ticker, that.ticker) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decimals, description, logo, name, ticker, url);
  }
}
