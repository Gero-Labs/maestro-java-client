package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.models.NumOrString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Block information
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BlockInfo {

  /**
   * Absolute slot when block was minted
   */
  @NotNull
  private Long absoluteSlot;

  /**
   * Identifier of stake pool which minted the block
   */
  private String blockProducer;

  /**
   * Number of blocks which have been minted since the block
   */
  @NotNull
  private Long confirmations;

  /**
   * Epoch in which block was minted
   */
  @NotNull
  private Long epoch;

  /**
   * Epoch slot at which block was minted
   */
  @NotNull
  private Long epochSlot;

  /**
   * Ledger era
   */
  @NotNull
  @Valid
  private LedgerEra era;

  /**
   * Block hash
   */
  @NotNull
  private String hash;

  /**
   * Block height (number)
   */
  @NotNull
  private Long height;

  /**
   * Block hash of the next block
   */
  private String nextBlock;

  /**
   * Operational certificate
   */
  @Valid
  private OperationalCert operationalCertificate;

  /**
   * Block hash of the previous block
   */
  private String previousBlock;

  /**
   * Ledger protocol version (major, minor)
   */
  @NotNull
  @Valid
  private List<BlockInfoProtocolVersionInner> protocolVersion;

  /**
   * Number of script invocations
   */
  @NotNull
  private Integer scriptInvocations;

  /**
   * Size of the block body in bytes
   */
  @NotNull
  private Integer size;

  /**
   * UTC timestamp when the block was minted
   */
  @NotNull
  private String timestamp;

  /**
   * Total execution units used in the block
   */
  @NotNull
  @Valid
  private ExUnits totalExUnits;

  /**
   * Total fees collected in the block
   */
  @NotNull
  @Valid
  private NumOrString totalFees;

  /**
   * Total lovelace in outputs of transactions included in the block
   */
  @NotNull
  private String totalOutputLovelace;

  /**
   * Ordered transaction hashes for the transactions in the block
   */
  @NotNull
  @Valid
  private List<String> txHashes;

  /**
   * VRF key (null for Byron era)
   */
  private String vrfKey;
}