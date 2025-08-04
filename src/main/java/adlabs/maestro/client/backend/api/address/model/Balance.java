package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.Map;

/**
 * Payment credential balance information
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Balance {

  /**
   * Total amount of different native assets in controlled UTxOs
   */
  private Map<String, Map<String, String>> assets;

  /**
   * Total amount of lovelace in controlled UTxOs
   */
  private String lovelace;

  /**
   * Default constructor.
   */
  public Balance() {
  }

  /**
   * Constructor with all fields.
   *
   * @param assets Total amount of different native assets in controlled UTxOs
   * @param lovelace Total amount of lovelace in controlled UTxOs
   */
  public Balance(Map<String, Map<String, String>> assets, String lovelace) {
    this.assets = assets;
    this.lovelace = lovelace;
  }

  /**
   * Gets the total amount of different native assets in controlled UTxOs.
   *
   * @return the assets map
   */
  public Map<String, Map<String, String>> getAssets() {
    return assets;
  }

  /**
   * Sets the total amount of different native assets in controlled UTxOs.
   *
   * @param assets the assets map
   */
  public void setAssets(Map<String, Map<String, String>> assets) {
    this.assets = assets;
  }

  /**
   * Gets the total amount of lovelace in controlled UTxOs.
   *
   * @return the lovelace amount
   */
  public String getLovelace() {
    return lovelace;
  }

  /**
   * Sets the total amount of lovelace in controlled UTxOs.
   *
   * @param lovelace the lovelace amount
   */
  public void setLovelace(String lovelace) {
    this.lovelace = lovelace;
  }

  @Override
  public String toString() {
    return "Balance{" +
        "assets=" + assets +
        ", lovelace='" + lovelace + '\'' +
        '}';
  }
}