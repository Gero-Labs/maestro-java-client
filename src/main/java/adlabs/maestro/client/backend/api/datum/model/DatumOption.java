package adlabs.maestro.client.backend.api.datum.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a Datum (inline or hash).
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DatumOption {

  /**
   * Hex encoded datum CBOR bytes (null if datum type is hash and corresponding datum bytes have not been seen on-chain).
   */
  private String bytes;

  /**
   * Datum hash.
   */
  @NotNull
  private String hash;

  /**
   * JSON representation of the datum (null if datum type is hash and corresponding datum bytes have not been seen on-chain).
   */
  private JsonNode json;

  /**
   * Datum type (inline datum or datum hash).
   */
  @NotNull
  @Valid
  private DatumOptionType type;
}
