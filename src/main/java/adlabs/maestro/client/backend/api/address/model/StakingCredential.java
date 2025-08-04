package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Staking credential, the delegation part of a Cardano address
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StakingCredential {

  /**
   * Bech32-encoding of the credential key hash or script hash
   */
  private String bech32;

  private String hex;

  @NotNull
  @Valid
  private StakingCredKind kind;

  @Valid
  private Pointer pointer;

  private String rewardAddress;

  /**
   * Default constructor.
   */
  public StakingCredential() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bech32 Bech32-encoding of the credential key hash or script hash
   * @param hex Hex encoding
   * @param kind Kind of staking credential
   * @param pointer Pointer for pointer-based credentials
   * @param rewardAddress Reward address
   */
  public StakingCredential(String bech32, String hex, StakingCredKind kind, Pointer pointer, String rewardAddress) {
    this.bech32 = bech32;
    this.hex = hex;
    this.kind = kind;
    this.pointer = pointer;
    this.rewardAddress = rewardAddress;
  }

  /**
   * Gets the Bech32-encoding of the credential key hash or script hash.
   *
   * @return the bech32 encoding
   */
  public String getBech32() {
    return bech32;
  }

  /**
   * Sets the Bech32-encoding of the credential key hash or script hash.
   *
   * @param bech32 the bech32 encoding
   */
  public void setBech32(String bech32) {
    this.bech32 = bech32;
  }

  /**
   * Gets the hex encoding.
   *
   * @return the hex encoding
   */
  public String getHex() {
    return hex;
  }

  /**
   * Sets the hex encoding.
   *
   * @param hex the hex encoding
   */
  public void setHex(String hex) {
    this.hex = hex;
  }

  /**
   * Gets the kind of staking credential.
   *
   * @return the staking credential kind
   */
  public StakingCredKind getKind() {
    return kind;
  }

  /**
   * Sets the kind of staking credential.
   *
   * @param kind the staking credential kind
   */
  public void setKind(StakingCredKind kind) {
    this.kind = kind;
  }

  /**
   * Gets the pointer for pointer-based credentials.
   *
   * @return the pointer
   */
  public Pointer getPointer() {
    return pointer;
  }

  /**
   * Sets the pointer for pointer-based credentials.
   *
   * @param pointer the pointer
   */
  public void setPointer(Pointer pointer) {
    this.pointer = pointer;
  }

  /**
   * Gets the reward address.
   *
   * @return the reward address
   */
  public String getRewardAddress() {
    return rewardAddress;
  }

  /**
   * Sets the reward address.
   *
   * @param rewardAddress the reward address
   */
  public void setRewardAddress(String rewardAddress) {
    this.rewardAddress = rewardAddress;
  }

  @Override
  public String toString() {
    return "StakingCredential{" +
        "bech32='" + bech32 + '\'' +
        ", hex='" + hex + '\'' +
        ", kind=" + kind +
        ", pointer=" + pointer +
        ", rewardAddress='" + rewardAddress + '\'' +
        '}';
  }
}