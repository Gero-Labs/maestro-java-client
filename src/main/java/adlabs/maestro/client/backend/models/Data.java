package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents a data entry with a hash and a dynamic value.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Data {

  /**
   * Hash value.
   */
  @NotNull
  private String hash;

  /**
   * Dynamic JSON content.
   */
  @NotNull
  private JsonNode value;
}
