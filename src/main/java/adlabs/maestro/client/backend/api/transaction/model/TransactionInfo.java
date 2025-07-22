package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.api.script.model.Script;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Detailed information about a specific transaction.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransactionInfo {

  /**
   * A list of additional required signers for the transaction.
   */
  @NotNull
  @Valid
  private List<String> additionalSigners;

  /**
   * The absolute slot of the block which includes the transaction.
   */
  @NotNull
  @Min(0L)
  private Long blockAbsoluteSlot;

  /**
   * The epoch in which the block was minted.
   */
  @NotNull
  @Min(0L)
  private Long blockEpoch;

  /**
   * The hash of the block which includes the transaction.
   */
  @NotNull
  private String blockHash;

  /**
   * The block height (number) of the block which includes the transaction.
   */
  @NotNull
  @Min(0L)
  private Long blockHeight;

  /**
   * The UNIX timestamp of the block which includes the transaction.
   */
  @NotNull
  @Min(0L)
  private Long blockTimestamp;

  /**
   * The transaction's position within the block.
   */
  @NotNull
  @Min(0)
  private Integer blockTxIndex;

  /**
   * Certificates included in the transaction.
   */
  @NotNull
  @Valid
  private Certificates certificates;

  /**
   * Collateral inputs, to be taken if Plutus scripts are not successful.
   */
  @NotNull
  @Valid
  private List<Utxo> collateralInputs;

  /**
   * The collateral return output, if any.
   */
  @Valid
  private Utxo collateralReturn;

  /**
   * The amount of lovelace used for deposits (negative if being returned).
   */
  @NotNull
  private Long deposit;

  /**
   * The fee specified in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long fee;

  /**
   * Transaction inputs, lexicographically sorted.
   */
  @NotNull
  @Valid
  private List<Utxo> inputs;

  /**
   * The slot before which the transaction is invalid.
   */
  @Min(0L)
  private Long invalidBefore;

  /**
   * The slot after which the transaction is invalid.
   */
  @Min(0L)
  private Long invalidHereafter;

  /**
   * Transaction metadata as a JSON object.
   */
  private JsonNode metadata;

  /**
   * Native assets minted or burned by the transaction.
   */
  @NotNull
  @Valid
  private List<MintAsset> mint;

  /**
   * Transaction outputs.
   */
  @NotNull
  @Valid
  private List<Utxo> outputs;

  /**
   * Redeemers for Plutus scripts.
   */
  @NotNull
  @Valid
  private Redeemers redeemers;

  /**
   * Reference inputs for Plutus scripts.
   */
  @NotNull
  @Valid
  private List<Utxo> referenceInputs;

  /**
   * Native and Plutus scripts which were executed while processing the transaction.
   */
  @NotNull
  @Valid
  private List<Script> scriptsExecuted;

  /**
   * Indicates if Plutus scripts executed successfully. False means collateral was processed.
   */
  @NotNull
  private Boolean scriptsSuccessful;

  /**
   * The size of the transaction in bytes.
   */
  @NotNull
  @Min(0L)
  private Long size;

  /**
   * The transaction hash (identifier).
   */
  @NotNull
  private String txHash;

  /**
   * Stake account withdrawals included in the transaction.
   */
  @NotNull
  @Valid
  private List<Withdrawal> withdrawals;
}
