package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.api.script.model.Script;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Detailed information about a specific transaction.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransactionInfo {

  /**
   * Default constructor.
   */
  public TransactionInfo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param additionalSigners additional required signers for the transaction
   * @param blockAbsoluteSlot the absolute slot of the block which includes the transaction
   * @param blockEpoch the epoch in which the block was minted
   * @param blockHash the hash of the block which includes the transaction
   * @param blockHeight the block height (number) of the block which includes the transaction
   * @param blockTimestamp the UNIX timestamp of the block which includes the transaction
   * @param blockTxIndex the transaction's position within the block
   * @param certificates certificates included in the transaction
   * @param collateralInputs collateral inputs, to be taken if Plutus scripts are not successful
   * @param collateralReturn the collateral return output, if any
   * @param deposit the amount of lovelace used for deposits (negative if being returned)
   * @param fee the fee specified in the transaction
   * @param inputs transaction inputs, lexicographically sorted
   * @param invalidBefore the slot before which the transaction is invalid
   * @param invalidHereafter the slot after which the transaction is invalid
   * @param metadata transaction metadata as a JSON object
   * @param mint native assets minted or burned by the transaction
   * @param outputs transaction outputs
   * @param redeemers redeemers for Plutus scripts
   * @param referenceInputs reference inputs for Plutus scripts
   * @param scriptsExecuted native and Plutus scripts which were executed while processing the transaction
   * @param scriptsSuccessful indicates if Plutus scripts executed successfully. False means collateral was processed
   * @param size the size of the transaction in bytes
   * @param txHash the transaction hash (identifier)
   * @param withdrawals stake account withdrawals included in the transaction
   */
  public TransactionInfo(List<String> additionalSigners, Long blockAbsoluteSlot, Long blockEpoch,
                        String blockHash, Long blockHeight, Long blockTimestamp, Integer blockTxIndex,
                        Certificates certificates, List<Utxo> collateralInputs, Utxo collateralReturn,
                        Long deposit, Long fee, List<Utxo> inputs, Long invalidBefore, Long invalidHereafter,
                        JsonNode metadata, List<MintAsset> mint, List<Utxo> outputs, Redeemers redeemers,
                        List<Utxo> referenceInputs, List<Script> scriptsExecuted, Boolean scriptsSuccessful,
                        Long size, String txHash, List<Withdrawal> withdrawals) {
    this.additionalSigners = additionalSigners;
    this.blockAbsoluteSlot = blockAbsoluteSlot;
    this.blockEpoch = blockEpoch;
    this.blockHash = blockHash;
    this.blockHeight = blockHeight;
    this.blockTimestamp = blockTimestamp;
    this.blockTxIndex = blockTxIndex;
    this.certificates = certificates;
    this.collateralInputs = collateralInputs;
    this.collateralReturn = collateralReturn;
    this.deposit = deposit;
    this.fee = fee;
    this.inputs = inputs;
    this.invalidBefore = invalidBefore;
    this.invalidHereafter = invalidHereafter;
    this.metadata = metadata;
    this.mint = mint;
    this.outputs = outputs;
    this.redeemers = redeemers;
    this.referenceInputs = referenceInputs;
    this.scriptsExecuted = scriptsExecuted;
    this.scriptsSuccessful = scriptsSuccessful;
    this.size = size;
    this.txHash = txHash;
    this.withdrawals = withdrawals;
  }

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

  /**
   * Gets the list of additional required signers for the transaction.
   *
   * @return the additional signers
   */
  public List<String> getAdditionalSigners() {
    return additionalSigners;
  }

  /**
   * Sets the list of additional required signers for the transaction.
   *
   * @param additionalSigners the additional signers
   */
  public void setAdditionalSigners(List<String> additionalSigners) {
    this.additionalSigners = additionalSigners;
  }

  /**
   * Gets the absolute slot of the block which includes the transaction.
   *
   * @return the block absolute slot
   */
  public Long getBlockAbsoluteSlot() {
    return blockAbsoluteSlot;
  }

  /**
   * Sets the absolute slot of the block which includes the transaction.
   *
   * @param blockAbsoluteSlot the block absolute slot
   */
  public void setBlockAbsoluteSlot(Long blockAbsoluteSlot) {
    this.blockAbsoluteSlot = blockAbsoluteSlot;
  }

  /**
   * Gets the epoch in which the block was minted.
   *
   * @return the block epoch
   */
  public Long getBlockEpoch() {
    return blockEpoch;
  }

  /**
   * Sets the epoch in which the block was minted.
   *
   * @param blockEpoch the block epoch
   */
  public void setBlockEpoch(Long blockEpoch) {
    this.blockEpoch = blockEpoch;
  }

  /**
   * Gets the hash of the block which includes the transaction.
   *
   * @return the block hash
   */
  public String getBlockHash() {
    return blockHash;
  }

  /**
   * Sets the hash of the block which includes the transaction.
   *
   * @param blockHash the block hash
   */
  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  /**
   * Gets the block height (number) of the block which includes the transaction.
   *
   * @return the block height
   */
  public Long getBlockHeight() {
    return blockHeight;
  }

  /**
   * Sets the block height (number) of the block which includes the transaction.
   *
   * @param blockHeight the block height
   */
  public void setBlockHeight(Long blockHeight) {
    this.blockHeight = blockHeight;
  }

  /**
   * Gets the UNIX timestamp of the block which includes the transaction.
   *
   * @return the block timestamp
   */
  public Long getBlockTimestamp() {
    return blockTimestamp;
  }

  /**
   * Sets the UNIX timestamp of the block which includes the transaction.
   *
   * @param blockTimestamp the block timestamp
   */
  public void setBlockTimestamp(Long blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  /**
   * Gets the transaction's position within the block.
   *
   * @return the block transaction index
   */
  public Integer getBlockTxIndex() {
    return blockTxIndex;
  }

  /**
   * Sets the transaction's position within the block.
   *
   * @param blockTxIndex the block transaction index
   */
  public void setBlockTxIndex(Integer blockTxIndex) {
    this.blockTxIndex = blockTxIndex;
  }

  /**
   * Gets the certificates included in the transaction.
   *
   * @return the certificates
   */
  public Certificates getCertificates() {
    return certificates;
  }

  /**
   * Sets the certificates included in the transaction.
   *
   * @param certificates the certificates
   */
  public void setCertificates(Certificates certificates) {
    this.certificates = certificates;
  }

  /**
   * Gets the collateral inputs, to be taken if Plutus scripts are not successful.
   *
   * @return the collateral inputs
   */
  public List<Utxo> getCollateralInputs() {
    return collateralInputs;
  }

  /**
   * Sets the collateral inputs, to be taken if Plutus scripts are not successful.
   *
   * @param collateralInputs the collateral inputs
   */
  public void setCollateralInputs(List<Utxo> collateralInputs) {
    this.collateralInputs = collateralInputs;
  }

  /**
   * Gets the collateral return output, if any.
   *
   * @return the collateral return
   */
  public Utxo getCollateralReturn() {
    return collateralReturn;
  }

  /**
   * Sets the collateral return output, if any.
   *
   * @param collateralReturn the collateral return
   */
  public void setCollateralReturn(Utxo collateralReturn) {
    this.collateralReturn = collateralReturn;
  }

  /**
   * Gets the amount of lovelace used for deposits (negative if being returned).
   *
   * @return the deposit
   */
  public Long getDeposit() {
    return deposit;
  }

  /**
   * Sets the amount of lovelace used for deposits (negative if being returned).
   *
   * @param deposit the deposit
   */
  public void setDeposit(Long deposit) {
    this.deposit = deposit;
  }

  /**
   * Gets the fee specified in the transaction.
   *
   * @return the fee
   */
  public Long getFee() {
    return fee;
  }

  /**
   * Sets the fee specified in the transaction.
   *
   * @param fee the fee
   */
  public void setFee(Long fee) {
    this.fee = fee;
  }

  /**
   * Gets the transaction inputs, lexicographically sorted.
   *
   * @return the inputs
   */
  public List<Utxo> getInputs() {
    return inputs;
  }

  /**
   * Sets the transaction inputs, lexicographically sorted.
   *
   * @param inputs the inputs
   */
  public void setInputs(List<Utxo> inputs) {
    this.inputs = inputs;
  }

  /**
   * Gets the slot before which the transaction is invalid.
   *
   * @return the invalid before slot
   */
  public Long getInvalidBefore() {
    return invalidBefore;
  }

  /**
   * Sets the slot before which the transaction is invalid.
   *
   * @param invalidBefore the invalid before slot
   */
  public void setInvalidBefore(Long invalidBefore) {
    this.invalidBefore = invalidBefore;
  }

  /**
   * Gets the slot after which the transaction is invalid.
   *
   * @return the invalid hereafter slot
   */
  public Long getInvalidHereafter() {
    return invalidHereafter;
  }

  /**
   * Sets the slot after which the transaction is invalid.
   *
   * @param invalidHereafter the invalid hereafter slot
   */
  public void setInvalidHereafter(Long invalidHereafter) {
    this.invalidHereafter = invalidHereafter;
  }

  /**
   * Gets the transaction metadata as a JSON object.
   *
   * @return the metadata
   */
  public JsonNode getMetadata() {
    return metadata;
  }

  /**
   * Sets the transaction metadata as a JSON object.
   *
   * @param metadata the metadata
   */
  public void setMetadata(JsonNode metadata) {
    this.metadata = metadata;
  }

  /**
   * Gets the native assets minted or burned by the transaction.
   *
   * @return the mint assets
   */
  public List<MintAsset> getMint() {
    return mint;
  }

  /**
   * Sets the native assets minted or burned by the transaction.
   *
   * @param mint the mint assets
   */
  public void setMint(List<MintAsset> mint) {
    this.mint = mint;
  }

  /**
   * Gets the transaction outputs.
   *
   * @return the outputs
   */
  public List<Utxo> getOutputs() {
    return outputs;
  }

  /**
   * Sets the transaction outputs.
   *
   * @param outputs the outputs
   */
  public void setOutputs(List<Utxo> outputs) {
    this.outputs = outputs;
  }

  /**
   * Gets the redeemers for Plutus scripts.
   *
   * @return the redeemers
   */
  public Redeemers getRedeemers() {
    return redeemers;
  }

  /**
   * Sets the redeemers for Plutus scripts.
   *
   * @param redeemers the redeemers
   */
  public void setRedeemers(Redeemers redeemers) {
    this.redeemers = redeemers;
  }

  /**
   * Gets the reference inputs for Plutus scripts.
   *
   * @return the reference inputs
   */
  public List<Utxo> getReferenceInputs() {
    return referenceInputs;
  }

  /**
   * Sets the reference inputs for Plutus scripts.
   *
   * @param referenceInputs the reference inputs
   */
  public void setReferenceInputs(List<Utxo> referenceInputs) {
    this.referenceInputs = referenceInputs;
  }

  /**
   * Gets the native and Plutus scripts which were executed while processing the transaction.
   *
   * @return the scripts executed
   */
  public List<Script> getScriptsExecuted() {
    return scriptsExecuted;
  }

  /**
   * Sets the native and Plutus scripts which were executed while processing the transaction.
   *
   * @param scriptsExecuted the scripts executed
   */
  public void setScriptsExecuted(List<Script> scriptsExecuted) {
    this.scriptsExecuted = scriptsExecuted;
  }

  /**
   * Gets whether Plutus scripts executed successfully. False means collateral was processed.
   *
   * @return the scripts successful status
   */
  public Boolean getScriptsSuccessful() {
    return scriptsSuccessful;
  }

  /**
   * Sets whether Plutus scripts executed successfully. False means collateral was processed.
   *
   * @param scriptsSuccessful the scripts successful status
   */
  public void setScriptsSuccessful(Boolean scriptsSuccessful) {
    this.scriptsSuccessful = scriptsSuccessful;
  }

  /**
   * Gets the size of the transaction in bytes.
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Sets the size of the transaction in bytes.
   *
   * @param size the size
   */
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   * Gets the transaction hash (identifier).
   *
   * @return the transaction hash
   */
  public String getTxHash() {
    return txHash;
  }

  /**
   * Sets the transaction hash (identifier).
   *
   * @param txHash the transaction hash
   */
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  /**
   * Gets the stake account withdrawals included in the transaction.
   *
   * @return the withdrawals
   */
  public List<Withdrawal> getWithdrawals() {
    return withdrawals;
  }

  /**
   * Sets the stake account withdrawals included in the transaction.
   *
   * @param withdrawals the withdrawals
   */
  public void setWithdrawals(List<Withdrawal> withdrawals) {
    this.withdrawals = withdrawals;
  }

  /**
   * Returns a string representation of this TransactionInfo.
   *
   * @return a string representation of the object
   */
  @Override
  public String toString() {
    return "TransactionInfo{" +
        "additionalSigners=" + additionalSigners +
        ", blockAbsoluteSlot=" + blockAbsoluteSlot +
        ", blockEpoch=" + blockEpoch +
        ", blockHash='" + blockHash + '\'' +
        ", blockHeight=" + blockHeight +
        ", blockTimestamp=" + blockTimestamp +
        ", blockTxIndex=" + blockTxIndex +
        ", certificates=" + certificates +
        ", collateralInputs=" + collateralInputs +
        ", collateralReturn=" + collateralReturn +
        ", deposit=" + deposit +
        ", fee=" + fee +
        ", inputs=" + inputs +
        ", invalidBefore=" + invalidBefore +
        ", invalidHereafter=" + invalidHereafter +
        ", metadata=" + metadata +
        ", mint=" + mint +
        ", outputs=" + outputs +
        ", redeemers=" + redeemers +
        ", referenceInputs=" + referenceInputs +
        ", scriptsExecuted=" + scriptsExecuted +
        ", scriptsSuccessful=" + scriptsSuccessful +
        ", size=" + size +
        ", txHash='" + txHash + '\'' +
        ", withdrawals=" + withdrawals +
        '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the obj argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransactionInfo that = (TransactionInfo) o;
    return java.util.Objects.equals(additionalSigners, that.additionalSigners) &&
        java.util.Objects.equals(blockAbsoluteSlot, that.blockAbsoluteSlot) &&
        java.util.Objects.equals(blockEpoch, that.blockEpoch) &&
        java.util.Objects.equals(blockHash, that.blockHash) &&
        java.util.Objects.equals(blockHeight, that.blockHeight) &&
        java.util.Objects.equals(blockTimestamp, that.blockTimestamp) &&
        java.util.Objects.equals(blockTxIndex, that.blockTxIndex) &&
        java.util.Objects.equals(certificates, that.certificates) &&
        java.util.Objects.equals(collateralInputs, that.collateralInputs) &&
        java.util.Objects.equals(collateralReturn, that.collateralReturn) &&
        java.util.Objects.equals(deposit, that.deposit) &&
        java.util.Objects.equals(fee, that.fee) &&
        java.util.Objects.equals(inputs, that.inputs) &&
        java.util.Objects.equals(invalidBefore, that.invalidBefore) &&
        java.util.Objects.equals(invalidHereafter, that.invalidHereafter) &&
        java.util.Objects.equals(metadata, that.metadata) &&
        java.util.Objects.equals(mint, that.mint) &&
        java.util.Objects.equals(outputs, that.outputs) &&
        java.util.Objects.equals(redeemers, that.redeemers) &&
        java.util.Objects.equals(referenceInputs, that.referenceInputs) &&
        java.util.Objects.equals(scriptsExecuted, that.scriptsExecuted) &&
        java.util.Objects.equals(scriptsSuccessful, that.scriptsSuccessful) &&
        java.util.Objects.equals(size, that.size) &&
        java.util.Objects.equals(txHash, that.txHash) &&
        java.util.Objects.equals(withdrawals, that.withdrawals);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return java.util.Objects.hash(additionalSigners, blockAbsoluteSlot, blockEpoch, blockHash,
        blockHeight, blockTimestamp, blockTxIndex, certificates, collateralInputs,
        collateralReturn, deposit, fee, inputs, invalidBefore, invalidHereafter, metadata,
        mint, outputs, redeemers, referenceInputs, scriptsExecuted, scriptsSuccessful,
        size, txHash, withdrawals);
  }
}
