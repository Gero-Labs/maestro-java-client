package adlabs.maestro.client.backend.api.general.model;

import adlabs.maestro.client.backend.models.Version;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;
import adlabs.maestro.client.backend.api.block.model.ExUnit;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * ProtocolParametersV5.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
}
