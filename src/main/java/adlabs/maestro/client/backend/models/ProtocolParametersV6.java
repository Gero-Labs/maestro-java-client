package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents protocol parameters V6.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
  @Min(0L)
  private Long stakePoolDeposit;

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
}
