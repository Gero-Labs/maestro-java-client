package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Represents a datum with hex encoded bytes and an optional JSON representation.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Datum {

  /**
   * Hex encoded datum CBOR bytes.
   */
  @NotNull
  private String bytes;

  /**
   * JSON representation of the datum.
   */
  private JsonNode json;
}
