package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.models.Version;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents protocol parameters V6.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProtocolParametersV6 {

  /**
   * Coins per UTXO byte.
   */
  @NotNull
  @Min(0L)
  private Long coinsPerUtxoByte;

  /**
   * Collateral percentage.
   */
  @NotNull
  @Min(0)
  private Integer collateralPercentage;

  /**
   * Delegate representative deposit (introduced in Conway).
   */
  @NotNull
  @Valid
  private DelegateRepresentativeDeposit delegateRepresentativeDeposit;

  /**
   * Delegate representative voting thresholds (introduced in Conway).
   */
  @NotNull
  @Valid
  private DelegateRepresentativeVotingThresholds delegateRepresentativeVotingThresholds;

  /**
   * Desired number of stake pools.
   */
  @NotNull
  @Min(0L)
  private Long desiredNumberOfStakePools;

  /**
   * Governance action deposit (introduced in Conway).
   */
  @NotNull
  @Valid
  private GovernanceActionDeposit governanceActionDeposit;

  /**
   * Maximum block body size.
   */
  @NotNull
  @Valid
  private MaxBlockBodySize maxBlockBodySize;

  /**
   * Maximum block header size.
   */
  @NotNull
  @Valid
  private MaxBlockHeaderSize maxBlockHeaderSize;

  /**
   * Maximum collateral inputs.
   */
  @NotNull
  @Min(0L)
  private Long maxCollateralInputs;

  /**
   * Maximum execution units.
   */
  @NotNull
  @Valid
  private MaxExecutionUnits maxExecutionUnits;

  /**
   * Maximum reference scripts size (introduced in Conway).
   */
  @NotNull
  @Valid
  private MaxReferenceScriptsSize maxReferenceScriptsSize;

  /**
   * Maximum transaction size.
   */
  @NotNull
  @Valid
  private MaxTransactionSize maxTransactionSize;

  /**
   * Maximum value size.
   */
  @NotNull
  @Valid
  private MaxValueSize maxValueSize;

  /**
   * Minimum ADA fee coefficient.
   */
  @NotNull
  @Min(0L)
  private Long minFeeCoefficient;

  /**
   * Minimum ADA fee constant.
   */
  @NotNull
  @Valid
  private MinFeeConstant minFeeConstant;

  /**
   * Minimum reference script fee parameters (introduced in Conway).
   */
  @NotNull
  @Valid
  private MinFeeReferenceScripts minFeeReferenceScripts;

  /**
   * Minimum stake pool cost.
   */
  @NotNull
  @Valid
  private MinStakePoolCost minStakePoolCost;

  /**
   * Minimum UTXO deposit coefficient.
   */
  @NotNull
  @Min(0L)
  private Long minUtxoDepositCoefficient;

  /**
   * Minimum UTXO deposit constant.
   */
  @NotNull
  @Valid
  private MinUtxoDepositConstant minUtxoDepositConstant;

  /**
   * Monetary expansion.
   */
  @NotNull
  private String monetaryExpansion;

  /**
   * Plutus cost models.
   */
  @NotNull
  @Valid
  private PlutusCostModels plutusCostModels;

  /**
   * Script execution prices.
   */
  @NotNull
  @Valid
  private ScriptExecutionPrices scriptExecutionPrices;

  /**
   * Stake credential deposit (introduced in Conway).
   */
  @NotNull
  @Valid
  private StakeDeposit stakeCredentialDeposit;

  /**
   * Stake pool deposit.
   */
  @NotNull
  @Valid
  private StakeDeposit stakePoolDeposit;

  /**
   * Stake pool pledge influence.
   */
  @NotNull
  private String stakePoolPledgeInfluence;

  /**
   * Stake pool retirement epoch bound.
   */
  @NotNull
  @Min(0L)
  private Long stakePoolRetirementEpochBound;

  /**
   * Stake pool voting thresholds (introduced in Conway).
   */
  @NotNull
  @Valid
  private StakePoolVotingThresholds stakePoolVotingThresholds;

  /**
   * Treasury expansion.
   */
  @NotNull
  private String treasuryExpansion;

  /**
   * Protocol version.
   */
  @NotNull
  @Valid
  private Version version;

  /**
   * Default constructor.
   */
  public ProtocolParametersV6() {
  }

  /**
   * All arguments constructor.
   * 
   * @param coinsPerUtxoByte coins per UTXO byte
   * @param collateralPercentage collateral percentage
   * @param delegateRepresentativeDeposit delegate representative deposit (introduced in Conway)
   * @param delegateRepresentativeVotingThresholds delegate representative voting thresholds (introduced in Conway)
   * @param desiredNumberOfStakePools desired number of stake pools
   * @param governanceActionDeposit governance action deposit (introduced in Conway)
   * @param maxBlockBodySize maximum block body size
   * @param maxBlockHeaderSize maximum block header size
   * @param maxCollateralInputs maximum collateral inputs
   * @param maxExecutionUnits maximum execution units
   * @param maxReferenceScriptsSize maximum reference scripts size (introduced in Conway)
   * @param maxTransactionSize maximum transaction size
   * @param maxValueSize maximum value size
   * @param minFeeCoefficient minimum ADA fee coefficient
   * @param minFeeConstant minimum ADA fee constant
   * @param minFeeReferenceScripts minimum reference script fee parameters (introduced in Conway)
   * @param minStakePoolCost minimum stake pool cost
   * @param minUtxoDepositCoefficient minimum UTXO deposit coefficient
   * @param minUtxoDepositConstant minimum UTXO deposit constant
   * @param monetaryExpansion monetary expansion
   * @param plutusCostModels Plutus cost models
   * @param scriptExecutionPrices script execution prices
   * @param stakeCredentialDeposit stake credential deposit (introduced in Conway)
   * @param stakePoolDeposit stake pool deposit
   * @param stakePoolPledgeInfluence stake pool pledge influence
   * @param stakePoolRetirementEpochBound stake pool retirement epoch bound
   * @param stakePoolVotingThresholds stake pool voting thresholds (introduced in Conway)
   * @param treasuryExpansion treasury expansion
   * @param version protocol version
   */
  public ProtocolParametersV6(Long coinsPerUtxoByte, Integer collateralPercentage,
                             DelegateRepresentativeDeposit delegateRepresentativeDeposit,
                             DelegateRepresentativeVotingThresholds delegateRepresentativeVotingThresholds,
                             Long desiredNumberOfStakePools, GovernanceActionDeposit governanceActionDeposit,
                             MaxBlockBodySize maxBlockBodySize, MaxBlockHeaderSize maxBlockHeaderSize,
                             Long maxCollateralInputs, MaxExecutionUnits maxExecutionUnits,
                             MaxReferenceScriptsSize maxReferenceScriptsSize, MaxTransactionSize maxTransactionSize,
                             MaxValueSize maxValueSize, Long minFeeCoefficient, MinFeeConstant minFeeConstant,
                             MinFeeReferenceScripts minFeeReferenceScripts, MinStakePoolCost minStakePoolCost,
                             Long minUtxoDepositCoefficient, MinUtxoDepositConstant minUtxoDepositConstant,
                             String monetaryExpansion, PlutusCostModels plutusCostModels,
                             ScriptExecutionPrices scriptExecutionPrices, StakeDeposit stakeCredentialDeposit,
                             StakeDeposit stakePoolDeposit, String stakePoolPledgeInfluence,
                             Long stakePoolRetirementEpochBound, StakePoolVotingThresholds stakePoolVotingThresholds,
                             String treasuryExpansion, Version version) {
    this.coinsPerUtxoByte = coinsPerUtxoByte;
    this.collateralPercentage = collateralPercentage;
    this.delegateRepresentativeDeposit = delegateRepresentativeDeposit;
    this.delegateRepresentativeVotingThresholds = delegateRepresentativeVotingThresholds;
    this.desiredNumberOfStakePools = desiredNumberOfStakePools;
    this.governanceActionDeposit = governanceActionDeposit;
    this.maxBlockBodySize = maxBlockBodySize;
    this.maxBlockHeaderSize = maxBlockHeaderSize;
    this.maxCollateralInputs = maxCollateralInputs;
    this.maxExecutionUnits = maxExecutionUnits;
    this.maxReferenceScriptsSize = maxReferenceScriptsSize;
    this.maxTransactionSize = maxTransactionSize;
    this.maxValueSize = maxValueSize;
    this.minFeeCoefficient = minFeeCoefficient;
    this.minFeeConstant = minFeeConstant;
    this.minFeeReferenceScripts = minFeeReferenceScripts;
    this.minStakePoolCost = minStakePoolCost;
    this.minUtxoDepositCoefficient = minUtxoDepositCoefficient;
    this.minUtxoDepositConstant = minUtxoDepositConstant;
    this.monetaryExpansion = monetaryExpansion;
    this.plutusCostModels = plutusCostModels;
    this.scriptExecutionPrices = scriptExecutionPrices;
    this.stakeCredentialDeposit = stakeCredentialDeposit;
    this.stakePoolDeposit = stakePoolDeposit;
    this.stakePoolPledgeInfluence = stakePoolPledgeInfluence;
    this.stakePoolRetirementEpochBound = stakePoolRetirementEpochBound;
    this.stakePoolVotingThresholds = stakePoolVotingThresholds;
    this.treasuryExpansion = treasuryExpansion;
    this.version = version;
  }

  /**
   * Gets the coins per UTXO byte.
   * @return coins per UTXO byte
   */
  public Long getCoinsPerUtxoByte() {
    return coinsPerUtxoByte;
  }

  /**
   * Sets the coins per UTXO byte.
   * @param coinsPerUtxoByte the coins per UTXO byte to set
   */
  public void setCoinsPerUtxoByte(Long coinsPerUtxoByte) {
    this.coinsPerUtxoByte = coinsPerUtxoByte;
  }

  /**
   * Gets the collateral percentage.
   * @return collateral percentage
   */
  public Integer getCollateralPercentage() {
    return collateralPercentage;
  }

  /**
   * Sets the collateral percentage.
   * @param collateralPercentage the collateral percentage to set
   */
  public void setCollateralPercentage(Integer collateralPercentage) {
    this.collateralPercentage = collateralPercentage;
  }

  /**
   * Gets the delegate representative deposit (introduced in Conway).
   * @return delegate representative deposit (introduced in Conway)
   */
  public DelegateRepresentativeDeposit getDelegateRepresentativeDeposit() {
    return delegateRepresentativeDeposit;
  }

  /**
   * Sets the delegate representative deposit (introduced in Conway).
   * @param delegateRepresentativeDeposit the delegate representative deposit (introduced in Conway) to set
   */
  public void setDelegateRepresentativeDeposit(DelegateRepresentativeDeposit delegateRepresentativeDeposit) {
    this.delegateRepresentativeDeposit = delegateRepresentativeDeposit;
  }

  /**
   * Gets the delegate representative voting thresholds (introduced in Conway).
   * @return delegate representative voting thresholds (introduced in Conway)
   */
  public DelegateRepresentativeVotingThresholds getDelegateRepresentativeVotingThresholds() {
    return delegateRepresentativeVotingThresholds;
  }

  /**
   * Sets the delegate representative voting thresholds (introduced in Conway).
   * @param delegateRepresentativeVotingThresholds the delegate representative voting thresholds (introduced in Conway) to set
   */
  public void setDelegateRepresentativeVotingThresholds(DelegateRepresentativeVotingThresholds delegateRepresentativeVotingThresholds) {
    this.delegateRepresentativeVotingThresholds = delegateRepresentativeVotingThresholds;
  }

  /**
   * Gets the desired number of stake pools.
   * @return desired number of stake pools
   */
  public Long getDesiredNumberOfStakePools() {
    return desiredNumberOfStakePools;
  }

  /**
   * Sets the desired number of stake pools.
   * @param desiredNumberOfStakePools the desired number of stake pools to set
   */
  public void setDesiredNumberOfStakePools(Long desiredNumberOfStakePools) {
    this.desiredNumberOfStakePools = desiredNumberOfStakePools;
  }

  /**
   * Gets the governance action deposit (introduced in Conway).
   * @return governance action deposit (introduced in Conway)
   */
  public GovernanceActionDeposit getGovernanceActionDeposit() {
    return governanceActionDeposit;
  }

  /**
   * Sets the governance action deposit (introduced in Conway).
   * @param governanceActionDeposit the governance action deposit (introduced in Conway) to set
   */
  public void setGovernanceActionDeposit(GovernanceActionDeposit governanceActionDeposit) {
    this.governanceActionDeposit = governanceActionDeposit;
  }

  /**
   * Gets the maximum block body size.
   * @return maximum block body size
   */
  public MaxBlockBodySize getMaxBlockBodySize() {
    return maxBlockBodySize;
  }

  /**
   * Sets the maximum block body size.
   * @param maxBlockBodySize the maximum block body size to set
   */
  public void setMaxBlockBodySize(MaxBlockBodySize maxBlockBodySize) {
    this.maxBlockBodySize = maxBlockBodySize;
  }

  /**
   * Gets the maximum block header size.
   * @return maximum block header size
   */
  public MaxBlockHeaderSize getMaxBlockHeaderSize() {
    return maxBlockHeaderSize;
  }

  /**
   * Sets the maximum block header size.
   * @param maxBlockHeaderSize the maximum block header size to set
   */
  public void setMaxBlockHeaderSize(MaxBlockHeaderSize maxBlockHeaderSize) {
    this.maxBlockHeaderSize = maxBlockHeaderSize;
  }

  /**
   * Gets the maximum collateral inputs.
   * @return maximum collateral inputs
   */
  public Long getMaxCollateralInputs() {
    return maxCollateralInputs;
  }

  /**
   * Sets the maximum collateral inputs.
   * @param maxCollateralInputs the maximum collateral inputs to set
   */
  public void setMaxCollateralInputs(Long maxCollateralInputs) {
    this.maxCollateralInputs = maxCollateralInputs;
  }

  /**
   * Gets the maximum execution units.
   * @return maximum execution units
   */
  public MaxExecutionUnits getMaxExecutionUnits() {
    return maxExecutionUnits;
  }

  /**
   * Sets the maximum execution units.
   * @param maxExecutionUnits the maximum execution units to set
   */
  public void setMaxExecutionUnits(MaxExecutionUnits maxExecutionUnits) {
    this.maxExecutionUnits = maxExecutionUnits;
  }

  /**
   * Gets the maximum reference scripts size (introduced in Conway).
   * @return maximum reference scripts size (introduced in Conway)
   */
  public MaxReferenceScriptsSize getMaxReferenceScriptsSize() {
    return maxReferenceScriptsSize;
  }

  /**
   * Sets the maximum reference scripts size (introduced in Conway).
   * @param maxReferenceScriptsSize the maximum reference scripts size (introduced in Conway) to set
   */
  public void setMaxReferenceScriptsSize(MaxReferenceScriptsSize maxReferenceScriptsSize) {
    this.maxReferenceScriptsSize = maxReferenceScriptsSize;
  }

  /**
   * Gets the maximum transaction size.
   * @return maximum transaction size
   */
  public MaxTransactionSize getMaxTransactionSize() {
    return maxTransactionSize;
  }

  /**
   * Sets the maximum transaction size.
   * @param maxTransactionSize the maximum transaction size to set
   */
  public void setMaxTransactionSize(MaxTransactionSize maxTransactionSize) {
    this.maxTransactionSize = maxTransactionSize;
  }

  /**
   * Gets the maximum value size.
   * @return maximum value size
   */
  public MaxValueSize getMaxValueSize() {
    return maxValueSize;
  }

  /**
   * Sets the maximum value size.
   * @param maxValueSize the maximum value size to set
   */
  public void setMaxValueSize(MaxValueSize maxValueSize) {
    this.maxValueSize = maxValueSize;
  }

  /**
   * Gets the minimum ADA fee coefficient.
   * @return minimum ADA fee coefficient
   */
  public Long getMinFeeCoefficient() {
    return minFeeCoefficient;
  }

  /**
   * Sets the minimum ADA fee coefficient.
   * @param minFeeCoefficient the minimum ADA fee coefficient to set
   */
  public void setMinFeeCoefficient(Long minFeeCoefficient) {
    this.minFeeCoefficient = minFeeCoefficient;
  }

  /**
   * Gets the minimum ADA fee constant.
   * @return minimum ADA fee constant
   */
  public MinFeeConstant getMinFeeConstant() {
    return minFeeConstant;
  }

  /**
   * Sets the minimum ADA fee constant.
   * @param minFeeConstant the minimum ADA fee constant to set
   */
  public void setMinFeeConstant(MinFeeConstant minFeeConstant) {
    this.minFeeConstant = minFeeConstant;
  }

  /**
   * Gets the minimum reference script fee parameters (introduced in Conway).
   * @return minimum reference script fee parameters (introduced in Conway)
   */
  public MinFeeReferenceScripts getMinFeeReferenceScripts() {
    return minFeeReferenceScripts;
  }

  /**
   * Sets the minimum reference script fee parameters (introduced in Conway).
   * @param minFeeReferenceScripts the minimum reference script fee parameters (introduced in Conway) to set
   */
  public void setMinFeeReferenceScripts(MinFeeReferenceScripts minFeeReferenceScripts) {
    this.minFeeReferenceScripts = minFeeReferenceScripts;
  }

  /**
   * Gets the minimum stake pool cost.
   * @return minimum stake pool cost
   */
  public MinStakePoolCost getMinStakePoolCost() {
    return minStakePoolCost;
  }

  /**
   * Sets the minimum stake pool cost.
   * @param minStakePoolCost the minimum stake pool cost to set
   */
  public void setMinStakePoolCost(MinStakePoolCost minStakePoolCost) {
    this.minStakePoolCost = minStakePoolCost;
  }

  /**
   * Gets the minimum UTXO deposit coefficient.
   * @return minimum UTXO deposit coefficient
   */
  public Long getMinUtxoDepositCoefficient() {
    return minUtxoDepositCoefficient;
  }

  /**
   * Sets the minimum UTXO deposit coefficient.
   * @param minUtxoDepositCoefficient the minimum UTXO deposit coefficient to set
   */
  public void setMinUtxoDepositCoefficient(Long minUtxoDepositCoefficient) {
    this.minUtxoDepositCoefficient = minUtxoDepositCoefficient;
  }

  /**
   * Gets the minimum UTXO deposit constant.
   * @return minimum UTXO deposit constant
   */
  public MinUtxoDepositConstant getMinUtxoDepositConstant() {
    return minUtxoDepositConstant;
  }

  /**
   * Sets the minimum UTXO deposit constant.
   * @param minUtxoDepositConstant the minimum UTXO deposit constant to set
   */
  public void setMinUtxoDepositConstant(MinUtxoDepositConstant minUtxoDepositConstant) {
    this.minUtxoDepositConstant = minUtxoDepositConstant;
  }

  /**
   * Gets the monetary expansion.
   * @return monetary expansion
   */
  public String getMonetaryExpansion() {
    return monetaryExpansion;
  }

  /**
   * Sets the monetary expansion.
   * @param monetaryExpansion the monetary expansion to set
   */
  public void setMonetaryExpansion(String monetaryExpansion) {
    this.monetaryExpansion = monetaryExpansion;
  }

  /**
   * Gets the Plutus cost models.
   * @return Plutus cost models
   */
  public PlutusCostModels getPlutusCostModels() {
    return plutusCostModels;
  }

  /**
   * Sets the Plutus cost models.
   * @param plutusCostModels the Plutus cost models to set
   */
  public void setPlutusCostModels(PlutusCostModels plutusCostModels) {
    this.plutusCostModels = plutusCostModels;
  }

  /**
   * Gets the script execution prices.
   * @return script execution prices
   */
  public ScriptExecutionPrices getScriptExecutionPrices() {
    return scriptExecutionPrices;
  }

  /**
   * Sets the script execution prices.
   * @param scriptExecutionPrices the script execution prices to set
   */
  public void setScriptExecutionPrices(ScriptExecutionPrices scriptExecutionPrices) {
    this.scriptExecutionPrices = scriptExecutionPrices;
  }

  /**
   * Gets the stake credential deposit (introduced in Conway).
   * @return stake credential deposit (introduced in Conway)
   */
  public StakeDeposit getStakeCredentialDeposit() {
    return stakeCredentialDeposit;
  }

  /**
   * Sets the stake credential deposit (introduced in Conway).
   * @param stakeCredentialDeposit the stake credential deposit (introduced in Conway) to set
   */
  public void setStakeCredentialDeposit(StakeDeposit stakeCredentialDeposit) {
    this.stakeCredentialDeposit = stakeCredentialDeposit;
  }

  /**
   * Gets the stake pool deposit.
   * @return stake pool deposit
   */
  public StakeDeposit getStakePoolDeposit() {
    return stakePoolDeposit;
  }

  /**
   * Sets the stake pool deposit.
   * @param stakePoolDeposit the stake pool deposit to set
   */
  public void setStakePoolDeposit(StakeDeposit stakePoolDeposit) {
    this.stakePoolDeposit = stakePoolDeposit;
  }

  /**
   * Gets the stake pool pledge influence.
   * @return stake pool pledge influence
   */
  public String getStakePoolPledgeInfluence() {
    return stakePoolPledgeInfluence;
  }

  /**
   * Sets the stake pool pledge influence.
   * @param stakePoolPledgeInfluence the stake pool pledge influence to set
   */
  public void setStakePoolPledgeInfluence(String stakePoolPledgeInfluence) {
    this.stakePoolPledgeInfluence = stakePoolPledgeInfluence;
  }

  /**
   * Gets the stake pool retirement epoch bound.
   * @return stake pool retirement epoch bound
   */
  public Long getStakePoolRetirementEpochBound() {
    return stakePoolRetirementEpochBound;
  }

  /**
   * Sets the stake pool retirement epoch bound.
   * @param stakePoolRetirementEpochBound the stake pool retirement epoch bound to set
   */
  public void setStakePoolRetirementEpochBound(Long stakePoolRetirementEpochBound) {
    this.stakePoolRetirementEpochBound = stakePoolRetirementEpochBound;
  }

  /**
   * Gets the stake pool voting thresholds (introduced in Conway).
   * @return stake pool voting thresholds (introduced in Conway)
   */
  public StakePoolVotingThresholds getStakePoolVotingThresholds() {
    return stakePoolVotingThresholds;
  }

  /**
   * Sets the stake pool voting thresholds (introduced in Conway).
   * @param stakePoolVotingThresholds the stake pool voting thresholds (introduced in Conway) to set
   */
  public void setStakePoolVotingThresholds(StakePoolVotingThresholds stakePoolVotingThresholds) {
    this.stakePoolVotingThresholds = stakePoolVotingThresholds;
  }

  /**
   * Gets the treasury expansion.
   * @return treasury expansion
   */
  public String getTreasuryExpansion() {
    return treasuryExpansion;
  }

  /**
   * Sets the treasury expansion.
   * @param treasuryExpansion the treasury expansion to set
   */
  public void setTreasuryExpansion(String treasuryExpansion) {
    this.treasuryExpansion = treasuryExpansion;
  }

  /**
   * Gets the protocol version.
   * @return protocol version
   */
  public Version getVersion() {
    return version;
  }

  /**
   * Sets the protocol version.
   * @param version the protocol version to set
   */
  public void setVersion(Version version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return "ProtocolParametersV6{" +
        "coinsPerUtxoByte=" + coinsPerUtxoByte +
        ", collateralPercentage=" + collateralPercentage +
        ", delegateRepresentativeDeposit=" + delegateRepresentativeDeposit +
        ", delegateRepresentativeVotingThresholds=" + delegateRepresentativeVotingThresholds +
        ", desiredNumberOfStakePools=" + desiredNumberOfStakePools +
        ", governanceActionDeposit=" + governanceActionDeposit +
        ", maxBlockBodySize=" + maxBlockBodySize +
        ", maxBlockHeaderSize=" + maxBlockHeaderSize +
        ", maxCollateralInputs=" + maxCollateralInputs +
        ", maxExecutionUnits=" + maxExecutionUnits +
        ", maxReferenceScriptsSize=" + maxReferenceScriptsSize +
        ", maxTransactionSize=" + maxTransactionSize +
        ", maxValueSize=" + maxValueSize +
        ", minFeeCoefficient=" + minFeeCoefficient +
        ", minFeeConstant=" + minFeeConstant +
        ", minFeeReferenceScripts=" + minFeeReferenceScripts +
        ", minStakePoolCost=" + minStakePoolCost +
        ", minUtxoDepositCoefficient=" + minUtxoDepositCoefficient +
        ", minUtxoDepositConstant=" + minUtxoDepositConstant +
        ", monetaryExpansion='" + monetaryExpansion + '\'' +
        ", plutusCostModels=" + plutusCostModels +
        ", scriptExecutionPrices=" + scriptExecutionPrices +
        ", stakeCredentialDeposit=" + stakeCredentialDeposit +
        ", stakePoolDeposit=" + stakePoolDeposit +
        ", stakePoolPledgeInfluence='" + stakePoolPledgeInfluence + '\'' +
        ", stakePoolRetirementEpochBound=" + stakePoolRetirementEpochBound +
        ", stakePoolVotingThresholds=" + stakePoolVotingThresholds +
        ", treasuryExpansion='" + treasuryExpansion + '\'' +
        ", version=" + version +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProtocolParametersV6 that = (ProtocolParametersV6) o;
    return Objects.equals(coinsPerUtxoByte, that.coinsPerUtxoByte) &&
        Objects.equals(collateralPercentage, that.collateralPercentage) &&
        Objects.equals(delegateRepresentativeDeposit, that.delegateRepresentativeDeposit) &&
        Objects.equals(delegateRepresentativeVotingThresholds, that.delegateRepresentativeVotingThresholds) &&
        Objects.equals(desiredNumberOfStakePools, that.desiredNumberOfStakePools) &&
        Objects.equals(governanceActionDeposit, that.governanceActionDeposit) &&
        Objects.equals(maxBlockBodySize, that.maxBlockBodySize) &&
        Objects.equals(maxBlockHeaderSize, that.maxBlockHeaderSize) &&
        Objects.equals(maxCollateralInputs, that.maxCollateralInputs) &&
        Objects.equals(maxExecutionUnits, that.maxExecutionUnits) &&
        Objects.equals(maxReferenceScriptsSize, that.maxReferenceScriptsSize) &&
        Objects.equals(maxTransactionSize, that.maxTransactionSize) &&
        Objects.equals(maxValueSize, that.maxValueSize) &&
        Objects.equals(minFeeCoefficient, that.minFeeCoefficient) &&
        Objects.equals(minFeeConstant, that.minFeeConstant) &&
        Objects.equals(minFeeReferenceScripts, that.minFeeReferenceScripts) &&
        Objects.equals(minStakePoolCost, that.minStakePoolCost) &&
        Objects.equals(minUtxoDepositCoefficient, that.minUtxoDepositCoefficient) &&
        Objects.equals(minUtxoDepositConstant, that.minUtxoDepositConstant) &&
        Objects.equals(monetaryExpansion, that.monetaryExpansion) &&
        Objects.equals(plutusCostModels, that.plutusCostModels) &&
        Objects.equals(scriptExecutionPrices, that.scriptExecutionPrices) &&
        Objects.equals(stakeCredentialDeposit, that.stakeCredentialDeposit) &&
        Objects.equals(stakePoolDeposit, that.stakePoolDeposit) &&
        Objects.equals(stakePoolPledgeInfluence, that.stakePoolPledgeInfluence) &&
        Objects.equals(stakePoolRetirementEpochBound, that.stakePoolRetirementEpochBound) &&
        Objects.equals(stakePoolVotingThresholds, that.stakePoolVotingThresholds) &&
        Objects.equals(treasuryExpansion, that.treasuryExpansion) &&
        Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coinsPerUtxoByte, collateralPercentage, delegateRepresentativeDeposit,
        delegateRepresentativeVotingThresholds, desiredNumberOfStakePools, governanceActionDeposit,
        maxBlockBodySize, maxBlockHeaderSize, maxCollateralInputs, maxExecutionUnits,
        maxReferenceScriptsSize, maxTransactionSize, maxValueSize, minFeeCoefficient,
        minFeeConstant, minFeeReferenceScripts, minStakePoolCost, minUtxoDepositCoefficient,
        minUtxoDepositConstant, monetaryExpansion, plutusCostModels, scriptExecutionPrices,
        stakeCredentialDeposit, stakePoolDeposit, stakePoolPledgeInfluence,
        stakePoolRetirementEpochBound, stakePoolVotingThresholds, treasuryExpansion, version);
  }
}