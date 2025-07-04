package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import java.util.Map;

/**
 * Payment credential balance information
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
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
}