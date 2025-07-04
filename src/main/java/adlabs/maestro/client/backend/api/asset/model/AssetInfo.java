package adlabs.maestro.client.backend.api.asset.model;

import adlabs.maestro.client.backend.models.Holders;
import adlabs.maestro.client.backend.models.MintTransaction;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import com.fasterxml.jackson.databind.JsonNode;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Information about a specific Cardano native-asset
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AssetInfo {

  /**
   * Hex encoding of the asset name
   */
  @NotNull
  private String assetName;

  /**
   * ASCII representation of the asset name
   */
  @NotNull
  private String assetNameAscii;

  /**
   * Asset standards compliance information
   */
  @NotNull
  @Valid
  private AssetStandards assetStandards;

  /**
   * Number of transactions which burned some of the asset
   */
  @NotNull
  @Min(0L)
  private Long burnTxCount;

  /**
   * CIP-14 fingerprint of the asset
   */
  @NotNull
  private String fingerprint;

  /**
   * First transaction that minted this asset
   */
  @NotNull
  @Valid
  private MintTransaction firstMintTx;

  /**
   * Latest transaction that minted this asset
   */
  @NotNull
  @Valid
  private MintTransaction latestMintTx;

  /**
   * Metadata of the most recent transaction which minted or burned the asset
   */
  private JsonNode latestMintTxMetadata;

  /**
   * Number of transactions which minted some of the asset
   */
  @NotNull
  @Min(0L)
  private Long mintTxCount;

  /**
   * Token registry metadata information
   */
  @Valid
  private JsonNode tokenRegistryMetadata;

  /**
   * Total amount of the asset in existence currently
   */
  @NotNull
  private String totalSupply;

  /**
   * Number of unique holders of this asset
   */
  @NotNull
  @Valid
  private Holders uniqueHolders;
}