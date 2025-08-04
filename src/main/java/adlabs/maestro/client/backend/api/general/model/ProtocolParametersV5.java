package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.models.Version;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.block.model.ExUnit;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.Objects;

/**
 * ProtocolParametersV5.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProtocolParametersV5 {

  /**
   * Coins per UTXO byte.
   */
  @NotNull
  private Long coinsPerUtxoByte;

  /**
   * Collateral percentage.
   */
  @NotNull
  private Long collateralPercentage;

  /**
   * Cost models.
   */
  @NotNull
  private Map<String, Map<String, Long>> costModels;

  /**
   * Desired number of pools.
   */
  @NotNull
  private Long desiredNumberOfPools;

  /**
   * Maximum block body size.
   */
  @NotNull
  private Long maxBlockBodySize;

  /**
   * Maximum block header size.
   */
  @NotNull
  private Long maxBlockHeaderSize;

  /**
   * Maximum collateral inputs.
   */
  @NotNull
  private Long maxCollateralInputs;

  /**
   * Maximum execution units per block.
   */
  @NotNull
  @Valid
  private ExUnit maxExecutionUnitsPerBlock;

  /**
   * Maximum execution units per transaction.
   */
  @NotNull
  @Valid
  private ExUnit maxExecutionUnitsPerTransaction;

  /**
   * Maximum transaction size.
   */
  @NotNull
  private Long maxTxSize;

  /**
   * Maximum value size.
   */
  @NotNull
  private Long maxValueSize;

  /**
   * Minimum fee coefficient.
   */
  @NotNull
  private Long minFeeCoefficient;

  /**
   * Minimum fee constant.
   */
  @NotNull
  private Long minFeeConstant;

  /**
   * Minimum pool cost.
   */
  @NotNull
  private Long minPoolCost;

  /**
   * Monetary expansion.
   */
  @NotNull
  private String monetaryExpansion;

  /**
   * Pool deposit.
   */
  @NotNull
  private Long poolDeposit;

  /**
   * Pool influence.
   */
  @NotNull
  private String poolInfluence;

  /**
   * Pool retirement epoch bound.
   */
  @NotNull
  private Long poolRetirementEpochBound;

  /**
   * Prices.
   */
  @NotNull
  @Valid
  private Prices prices;

  /**
   * Protocol version.
   */
  @NotNull
  @Valid
  private Version protocolVersion;

  /**
   * Stake key deposit.
   */
  @NotNull
  private Long stakeKeyDeposit;

  /**
   * Treasury expansion.
   */
  @NotNull
  private String treasuryExpansion;

  /**
   * Default constructor.
   */
  public ProtocolParametersV5() {
  }

  /**
   * All arguments constructor.
   * @param coinsPerUtxoByte Coins per UTXO byte
   * @param collateralPercentage Collateral percentage
   * @param costModels Cost models
   * @param desiredNumberOfPools Desired number of pools
   * @param maxBlockBodySize Maximum block body size
   * @param maxBlockHeaderSize Maximum block header size
   * @param maxCollateralInputs Maximum collateral inputs
   * @param maxExecutionUnitsPerBlock Maximum execution units per block
   * @param maxExecutionUnitsPerTransaction Maximum execution units per transaction
   * @param maxTxSize Maximum transaction size
   * @param maxValueSize Maximum value size
   * @param minFeeCoefficient Minimum fee coefficient
   * @param minFeeConstant Minimum fee constant
   * @param minPoolCost Minimum pool cost
   * @param monetaryExpansion Monetary expansion
   * @param poolDeposit Pool deposit
   * @param poolInfluence Pool influence
   * @param poolRetirementEpochBound Pool retirement epoch bound
   * @param prices Prices
   * @param protocolVersion Protocol version
   * @param stakeKeyDeposit Stake key deposit
   * @param treasuryExpansion Treasury expansion
   */
  public ProtocolParametersV5(Long coinsPerUtxoByte, Long collateralPercentage, Map<String, Map<String, Long>> costModels,
                             Long desiredNumberOfPools, Long maxBlockBodySize, Long maxBlockHeaderSize, Long maxCollateralInputs,
                             ExUnit maxExecutionUnitsPerBlock, ExUnit maxExecutionUnitsPerTransaction, Long maxTxSize,
                             Long maxValueSize, Long minFeeCoefficient, Long minFeeConstant, Long minPoolCost,
                             String monetaryExpansion, Long poolDeposit, String poolInfluence, Long poolRetirementEpochBound,
                             Prices prices, Version protocolVersion, Long stakeKeyDeposit, String treasuryExpansion) {
    this.coinsPerUtxoByte = coinsPerUtxoByte;
    this.collateralPercentage = collateralPercentage;
    this.costModels = costModels;
    this.desiredNumberOfPools = desiredNumberOfPools;
    this.maxBlockBodySize = maxBlockBodySize;
    this.maxBlockHeaderSize = maxBlockHeaderSize;
    this.maxCollateralInputs = maxCollateralInputs;
    this.maxExecutionUnitsPerBlock = maxExecutionUnitsPerBlock;
    this.maxExecutionUnitsPerTransaction = maxExecutionUnitsPerTransaction;
    this.maxTxSize = maxTxSize;
    this.maxValueSize = maxValueSize;
    this.minFeeCoefficient = minFeeCoefficient;
    this.minFeeConstant = minFeeConstant;
    this.minPoolCost = minPoolCost;
    this.monetaryExpansion = monetaryExpansion;
    this.poolDeposit = poolDeposit;
    this.poolInfluence = poolInfluence;
    this.poolRetirementEpochBound = poolRetirementEpochBound;
    this.prices = prices;
    this.protocolVersion = protocolVersion;
    this.stakeKeyDeposit = stakeKeyDeposit;
    this.treasuryExpansion = treasuryExpansion;
  }

  /**
   * Gets the coins per UTXO byte
   * @return coins per UTXO byte
   */
  public Long getCoinsPerUtxoByte() {
    return coinsPerUtxoByte;
  }

  /**
   * Sets the coins per UTXO byte
   * @param coinsPerUtxoByte the coins per UTXO byte to set
   */
  public void setCoinsPerUtxoByte(Long coinsPerUtxoByte) {
    this.coinsPerUtxoByte = coinsPerUtxoByte;
  }

  /**
   * Gets the collateral percentage
   * @return collateral percentage
   */
  public Long getCollateralPercentage() {
    return collateralPercentage;
  }

  /**
   * Sets the collateral percentage
   * @param collateralPercentage the collateral percentage to set
   */
  public void setCollateralPercentage(Long collateralPercentage) {
    this.collateralPercentage = collateralPercentage;
  }

  /**
   * Gets the cost models
   * @return cost models
   */
  public Map<String, Map<String, Long>> getCostModels() {
    return costModels;
  }

  /**
   * Sets the cost models
   * @param costModels the cost models to set
   */
  public void setCostModels(Map<String, Map<String, Long>> costModels) {
    this.costModels = costModels;
  }

  /**
   * Gets the desired number of pools
   * @return desired number of pools
   */
  public Long getDesiredNumberOfPools() {
    return desiredNumberOfPools;
  }

  /**
   * Sets the desired number of pools
   * @param desiredNumberOfPools the desired number of pools to set
   */
  public void setDesiredNumberOfPools(Long desiredNumberOfPools) {
    this.desiredNumberOfPools = desiredNumberOfPools;
  }

  /**
   * Gets the maximum block body size
   * @return maximum block body size
   */
  public Long getMaxBlockBodySize() {
    return maxBlockBodySize;
  }

  /**
   * Sets the maximum block body size
   * @param maxBlockBodySize the maximum block body size to set
   */
  public void setMaxBlockBodySize(Long maxBlockBodySize) {
    this.maxBlockBodySize = maxBlockBodySize;
  }

  /**
   * Gets the maximum block header size
   * @return maximum block header size
   */
  public Long getMaxBlockHeaderSize() {
    return maxBlockHeaderSize;
  }

  /**
   * Sets the maximum block header size
   * @param maxBlockHeaderSize the maximum block header size to set
   */
  public void setMaxBlockHeaderSize(Long maxBlockHeaderSize) {
    this.maxBlockHeaderSize = maxBlockHeaderSize;
  }

  /**
   * Gets the maximum collateral inputs
   * @return maximum collateral inputs
   */
  public Long getMaxCollateralInputs() {
    return maxCollateralInputs;
  }

  /**
   * Sets the maximum collateral inputs
   * @param maxCollateralInputs the maximum collateral inputs to set
   */
  public void setMaxCollateralInputs(Long maxCollateralInputs) {
    this.maxCollateralInputs = maxCollateralInputs;
  }

  /**
   * Gets the maximum execution units per block
   * @return maximum execution units per block
   */
  public ExUnit getMaxExecutionUnitsPerBlock() {
    return maxExecutionUnitsPerBlock;
  }

  /**
   * Sets the maximum execution units per block
   * @param maxExecutionUnitsPerBlock the maximum execution units per block to set
   */
  public void setMaxExecutionUnitsPerBlock(ExUnit maxExecutionUnitsPerBlock) {
    this.maxExecutionUnitsPerBlock = maxExecutionUnitsPerBlock;
  }

  /**
   * Gets the maximum execution units per transaction
   * @return maximum execution units per transaction
   */
  public ExUnit getMaxExecutionUnitsPerTransaction() {
    return maxExecutionUnitsPerTransaction;
  }

  /**
   * Sets the maximum execution units per transaction
   * @param maxExecutionUnitsPerTransaction the maximum execution units per transaction to set
   */
  public void setMaxExecutionUnitsPerTransaction(ExUnit maxExecutionUnitsPerTransaction) {
    this.maxExecutionUnitsPerTransaction = maxExecutionUnitsPerTransaction;
  }

  /**
   * Gets the maximum transaction size
   * @return maximum transaction size
   */
  public Long getMaxTxSize() {
    return maxTxSize;
  }

  /**
   * Sets the maximum transaction size
   * @param maxTxSize the maximum transaction size to set
   */
  public void setMaxTxSize(Long maxTxSize) {
    this.maxTxSize = maxTxSize;
  }

  /**
   * Gets the maximum value size
   * @return maximum value size
   */
  public Long getMaxValueSize() {
    return maxValueSize;
  }

  /**
   * Sets the maximum value size
   * @param maxValueSize the maximum value size to set
   */
  public void setMaxValueSize(Long maxValueSize) {
    this.maxValueSize = maxValueSize;
  }

  /**
   * Gets the minimum fee coefficient
   * @return minimum fee coefficient
   */
  public Long getMinFeeCoefficient() {
    return minFeeCoefficient;
  }

  /**
   * Sets the minimum fee coefficient
   * @param minFeeCoefficient the minimum fee coefficient to set
   */
  public void setMinFeeCoefficient(Long minFeeCoefficient) {
    this.minFeeCoefficient = minFeeCoefficient;
  }

  /**
   * Gets the minimum fee constant
   * @return minimum fee constant
   */
  public Long getMinFeeConstant() {
    return minFeeConstant;
  }

  /**
   * Sets the minimum fee constant
   * @param minFeeConstant the minimum fee constant to set
   */
  public void setMinFeeConstant(Long minFeeConstant) {
    this.minFeeConstant = minFeeConstant;
  }

  /**
   * Gets the minimum pool cost
   * @return minimum pool cost
   */
  public Long getMinPoolCost() {
    return minPoolCost;
  }

  /**
   * Sets the minimum pool cost
   * @param minPoolCost the minimum pool cost to set
   */
  public void setMinPoolCost(Long minPoolCost) {
    this.minPoolCost = minPoolCost;
  }

  /**
   * Gets the monetary expansion
   * @return monetary expansion
   */
  public String getMonetaryExpansion() {
    return monetaryExpansion;
  }

  /**
   * Sets the monetary expansion
   * @param monetaryExpansion the monetary expansion to set
   */
  public void setMonetaryExpansion(String monetaryExpansion) {
    this.monetaryExpansion = monetaryExpansion;
  }

  /**
   * Gets the pool deposit
   * @return pool deposit
   */
  public Long getPoolDeposit() {
    return poolDeposit;
  }

  /**
   * Sets the pool deposit
   * @param poolDeposit the pool deposit to set
   */
  public void setPoolDeposit(Long poolDeposit) {
    this.poolDeposit = poolDeposit;
  }

  /**
   * Gets the pool influence
   * @return pool influence
   */
  public String getPoolInfluence() {
    return poolInfluence;
  }

  /**
   * Sets the pool influence
   * @param poolInfluence the pool influence to set
   */
  public void setPoolInfluence(String poolInfluence) {
    this.poolInfluence = poolInfluence;
  }

  /**
   * Gets the pool retirement epoch bound
   * @return pool retirement epoch bound
   */
  public Long getPoolRetirementEpochBound() {
    return poolRetirementEpochBound;
  }

  /**
   * Sets the pool retirement epoch bound
   * @param poolRetirementEpochBound the pool retirement epoch bound to set
   */
  public void setPoolRetirementEpochBound(Long poolRetirementEpochBound) {
    this.poolRetirementEpochBound = poolRetirementEpochBound;
  }

  /**
   * Gets the prices
   * @return prices
   */
  public Prices getPrices() {
    return prices;
  }

  /**
   * Sets the prices
   * @param prices the prices to set
   */
  public void setPrices(Prices prices) {
    this.prices = prices;
  }

  /**
   * Gets the protocol version
   * @return protocol version
   */
  public Version getProtocolVersion() {
    return protocolVersion;
  }

  /**
   * Sets the protocol version
   * @param protocolVersion the protocol version to set
   */
  public void setProtocolVersion(Version protocolVersion) {
    this.protocolVersion = protocolVersion;
  }

  /**
   * Gets the stake key deposit
   * @return stake key deposit
   */
  public Long getStakeKeyDeposit() {
    return stakeKeyDeposit;
  }

  /**
   * Sets the stake key deposit
   * @param stakeKeyDeposit the stake key deposit to set
   */
  public void setStakeKeyDeposit(Long stakeKeyDeposit) {
    this.stakeKeyDeposit = stakeKeyDeposit;
  }

  /**
   * Gets the treasury expansion
   * @return treasury expansion
   */
  public String getTreasuryExpansion() {
    return treasuryExpansion;
  }

  /**
   * Sets the treasury expansion
   * @param treasuryExpansion the treasury expansion to set
   */
  public void setTreasuryExpansion(String treasuryExpansion) {
    this.treasuryExpansion = treasuryExpansion;
  }

  @Override
  public String toString() {
    return "ProtocolParametersV5{" +
        "coinsPerUtxoByte=" + coinsPerUtxoByte +
        ", collateralPercentage=" + collateralPercentage +
        ", costModels=" + costModels +
        ", desiredNumberOfPools=" + desiredNumberOfPools +
        ", maxBlockBodySize=" + maxBlockBodySize +
        ", maxBlockHeaderSize=" + maxBlockHeaderSize +
        ", maxCollateralInputs=" + maxCollateralInputs +
        ", maxExecutionUnitsPerBlock=" + maxExecutionUnitsPerBlock +
        ", maxExecutionUnitsPerTransaction=" + maxExecutionUnitsPerTransaction +
        ", maxTxSize=" + maxTxSize +
        ", maxValueSize=" + maxValueSize +
        ", minFeeCoefficient=" + minFeeCoefficient +
        ", minFeeConstant=" + minFeeConstant +
        ", minPoolCost=" + minPoolCost +
        ", monetaryExpansion='" + monetaryExpansion + '\'' +
        ", poolDeposit=" + poolDeposit +
        ", poolInfluence='" + poolInfluence + '\'' +
        ", poolRetirementEpochBound=" + poolRetirementEpochBound +
        ", prices=" + prices +
        ", protocolVersion=" + protocolVersion +
        ", stakeKeyDeposit=" + stakeKeyDeposit +
        ", treasuryExpansion='" + treasuryExpansion + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProtocolParametersV5 that = (ProtocolParametersV5) o;
    return Objects.equals(coinsPerUtxoByte, that.coinsPerUtxoByte) &&
        Objects.equals(collateralPercentage, that.collateralPercentage) &&
        Objects.equals(costModels, that.costModels) &&
        Objects.equals(desiredNumberOfPools, that.desiredNumberOfPools) &&
        Objects.equals(maxBlockBodySize, that.maxBlockBodySize) &&
        Objects.equals(maxBlockHeaderSize, that.maxBlockHeaderSize) &&
        Objects.equals(maxCollateralInputs, that.maxCollateralInputs) &&
        Objects.equals(maxExecutionUnitsPerBlock, that.maxExecutionUnitsPerBlock) &&
        Objects.equals(maxExecutionUnitsPerTransaction, that.maxExecutionUnitsPerTransaction) &&
        Objects.equals(maxTxSize, that.maxTxSize) &&
        Objects.equals(maxValueSize, that.maxValueSize) &&
        Objects.equals(minFeeCoefficient, that.minFeeCoefficient) &&
        Objects.equals(minFeeConstant, that.minFeeConstant) &&
        Objects.equals(minPoolCost, that.minPoolCost) &&
        Objects.equals(monetaryExpansion, that.monetaryExpansion) &&
        Objects.equals(poolDeposit, that.poolDeposit) &&
        Objects.equals(poolInfluence, that.poolInfluence) &&
        Objects.equals(poolRetirementEpochBound, that.poolRetirementEpochBound) &&
        Objects.equals(prices, that.prices) &&
        Objects.equals(protocolVersion, that.protocolVersion) &&
        Objects.equals(stakeKeyDeposit, that.stakeKeyDeposit) &&
        Objects.equals(treasuryExpansion, that.treasuryExpansion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coinsPerUtxoByte, collateralPercentage, costModels, desiredNumberOfPools,
        maxBlockBodySize, maxBlockHeaderSize, maxCollateralInputs, maxExecutionUnitsPerBlock,
        maxExecutionUnitsPerTransaction, maxTxSize, maxValueSize, minFeeCoefficient, minFeeConstant,
        minPoolCost, monetaryExpansion, poolDeposit, poolInfluence, poolRetirementEpochBound,
        prices, protocolVersion, stakeKeyDeposit, treasuryExpansion);
  }
}