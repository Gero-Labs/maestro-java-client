package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.Script;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.asset.model.Asset;
import adlabs.maestro.client.backend.api.datum.model.DatumOption;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a transaction output (UTxO) with an optional field for the CBOR bytes.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UtxoWithBytes {

  /**
   * The address which controls the UTxO.
   */
  @NotNull
  private String address;

  /**
   * A list of assets contained in the UTxO.
   */
  @NotNull
  @Valid
  private List<Asset> assets;

  /**
   * The datum option associated with the UTxO, if any.
   */
  @Valid
  private DatumOption datum;

  /**
   * The UTxO transaction index.
   */
  @NotNull
  @Min(0)
  private Integer index;

  /**
   * The reference script, if any.
   */
  @Valid
  private Script referenceScript;

  /**
   * The UTxO transaction hash.
   */
  @NotNull
  private String txHash;

  /**
   * Hex-encoded transaction output CBOR bytes.
   */
  private String txoutCbor;
}
