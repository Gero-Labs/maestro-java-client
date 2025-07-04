package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.TokenRegistryMetadata;

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
public class AssetInfoOld {

    /**
     * Hex encoding of the asset name
     */
    @NotNull
    private String assetName;

    /**
     * ASCII representation of the asset name
     */
    private String assetNameAscii;

    /**
     * Asset standards information
     */
    @NotNull
    @Valid
    private AssetStandards assetStandards;

    /**
     * Number of transactions which burned some of the asset
     */
    @NotNull
    private Long burnTxCount;

    /**
     * CIP-14 fingerprint of the asset
     */
    @NotNull
    private String fingerprint;

    /**
     * Time of the first transaction which minted some of a specific asset
     */
    @NotNull
    private Integer firstMintTime;

    /**
     * First transaction which minted some of a specific asset
     */
    @NotNull
    private String firstMintTx;

    /**
     * Metadata of the most recent transaction which minted the asset
     */
    @NotNull
    private JsonNode latestMintTxMetadata;

    /**
     * Number of transactions which minted some of the asset
     */
    @NotNull
    private Long mintTxCount;

    /**
     * Token registry metadata
     */
    @Valid
    private TokenRegistryMetadata tokenRegistryMetadata;

    /**
     * Total amount of the asset in existence currently
     */
    @NotNull
    @Min(0L)
    private Long totalSupply;

}