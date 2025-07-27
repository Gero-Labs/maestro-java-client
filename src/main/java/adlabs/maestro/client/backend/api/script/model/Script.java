package adlabs.maestro.client.backend.api.script.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Details of a Native or Plutus script.
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
public class Script {

  /**
   * Hex-encoded script bytes.
   */
  @NotNull
  private String bytes;

  /**
   * Hex-encoded script hash.
   */
  @NotNull
  private String hash;

  /**
   * Script JSON.
   */
  private JsonNode json;

  /**
   * Type of the script.
   */
  @NotNull
  @Valid
  private ScriptType type;
}
