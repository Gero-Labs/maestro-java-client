package adlabs.maestro.client.backend.api.pool.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Objects;

import javax.validation.constraints.NotNull;

/**
 * JSON metadata associated with a stake pool.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PoolMetaJson {

  /**
   * Description of the stake pool.
   */
  private String description;

  /**
   * Homepage URL of the stake pool.
   */
  private String homepage;

  /**
   * Name of the stake pool.
   */
  @NotNull
  private String name;

  /**
   * Ticker of the stake pool.
   */
  private String ticker;

  /**
   * Default constructor.
   */
  public PoolMetaJson() {
  }

  /**
   * Constructor with all parameters.
   *
   * @param description the description of the stake pool
   * @param homepage    the homepage URL of the stake pool
   * @param name        the name of the stake pool
   * @param ticker      the ticker of the stake pool
   */
  public PoolMetaJson(String description, String homepage, String name, String ticker) {
    this.description = description;
    this.homepage = homepage;
    this.name = name;
    this.ticker = ticker;
  }

  /**
   * Gets the description of the stake pool.
   *
   * @return the description of the stake pool
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description of the stake pool.
   *
   * @param description the description of the stake pool to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets the homepage URL of the stake pool.
   *
   * @return the homepage URL of the stake pool
   */
  public String getHomepage() {
    return homepage;
  }

  /**
   * Sets the homepage URL of the stake pool.
   *
   * @param homepage the homepage URL of the stake pool to set
   */
  public void setHomepage(String homepage) {
    this.homepage = homepage;
  }

  /**
   * Gets the name of the stake pool.
   *
   * @return the name of the stake pool
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name of the stake pool.
   *
   * @param name the name of the stake pool to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the ticker of the stake pool.
   *
   * @return the ticker of the stake pool
   */
  public String getTicker() {
    return ticker;
  }

  /**
   * Sets the ticker of the stake pool.
   *
   * @param ticker the ticker of the stake pool to set
   */
  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  /**
   * Returns a string representation of this object.
   *
   * @return a string representation of this object
   */
  @Override
  public String toString() {
    return "PoolMetaJson{" +
        "description='" + description + '\'' +
        ", homepage='" + homepage + '\'' +
        ", name='" + name + '\'' +
        ", ticker='" + ticker + '\'' +
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
    PoolMetaJson that = (PoolMetaJson) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(homepage, that.homepage) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ticker, that.ticker);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(description, homepage, name, ticker);
  }

}
