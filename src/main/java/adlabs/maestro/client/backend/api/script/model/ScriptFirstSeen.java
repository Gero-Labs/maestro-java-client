package adlabs.maestro.client.backend.api.script.model;

import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransaction;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Details of a Native or Plutus script, including when it was first seen.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ScriptFirstSeen {

  /**
   * Hex-encoded script bytes.
   */
  @NotNull
  private String bytes;

  /**
   * Details of the transaction where the script was first seen.
   */
  @NotNull
  @Valid
  private TimestampedTransaction firstSeen;

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
