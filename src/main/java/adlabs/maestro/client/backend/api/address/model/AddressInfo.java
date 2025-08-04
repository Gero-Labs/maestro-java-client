package adlabs.maestro.client.backend.api.address.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.NetworkId;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents decoded information from a Cardano address.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AddressInfo {

  /**
   * The Bech32 representation of the address.
   */
  private String bech32;

  /**
   * The hex representation of the address.
   */
  @NotNull
  private String hex;

  /**
   * The network identifier.
   */
  @Valid
  private NetworkId network;

  /**
   * The payment credential.
   */
  @Valid
  private PaymentCredential paymentCred;

  /**
   * The staking credential.
   */
  @Valid
  private StakingCredential stakingCred;

  /**
   * Default constructor.
   */
  public AddressInfo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param bech32 The Bech32 representation of the address
   * @param hex The hex representation of the address
   * @param network The network identifier
   * @param paymentCred The payment credential
   * @param stakingCred The staking credential
   */
  public AddressInfo(String bech32, String hex, NetworkId network, PaymentCredential paymentCred, StakingCredential stakingCred) {
    this.bech32 = bech32;
    this.hex = hex;
    this.network = network;
    this.paymentCred = paymentCred;
    this.stakingCred = stakingCred;
  }

  /**
   * Gets the Bech32 representation of the address.
   *
   * @return the Bech32 representation
   */
  public String getBech32() {
    return bech32;
  }

  /**
   * Sets the Bech32 representation of the address.
   *
   * @param bech32 the Bech32 representation
   */
  public void setBech32(String bech32) {
    this.bech32 = bech32;
  }

  /**
   * Gets the hex representation of the address.
   *
   * @return the hex representation
   */
  public String getHex() {
    return hex;
  }

  /**
   * Sets the hex representation of the address.
   *
   * @param hex the hex representation
   */
  public void setHex(String hex) {
    this.hex = hex;
  }

  /**
   * Gets the network identifier.
   *
   * @return the network identifier
   */
  public NetworkId getNetwork() {
    return network;
  }

  /**
   * Sets the network identifier.
   *
   * @param network the network identifier
   */
  public void setNetwork(NetworkId network) {
    this.network = network;
  }

  /**
   * Gets the payment credential.
   *
   * @return the payment credential
   */
  public PaymentCredential getPaymentCred() {
    return paymentCred;
  }

  /**
   * Sets the payment credential.
   *
   * @param paymentCred the payment credential
   */
  public void setPaymentCred(PaymentCredential paymentCred) {
    this.paymentCred = paymentCred;
  }

  /**
   * Gets the staking credential.
   *
   * @return the staking credential
   */
  public StakingCredential getStakingCred() {
    return stakingCred;
  }

  /**
   * Sets the staking credential.
   *
   * @param stakingCred the staking credential
   */
  public void setStakingCred(StakingCredential stakingCred) {
    this.stakingCred = stakingCred;
  }

  @Override
  public String toString() {
    return "AddressInfo{" +
        "bech32='" + bech32 + '\'' +
        ", hex='" + hex + '\'' +
        ", network=" + network +
        ", paymentCred=" + paymentCred +
        ", stakingCred=" + stakingCred +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddressInfo that = (AddressInfo) o;
    return java.util.Objects.equals(bech32, that.bech32) &&
        java.util.Objects.equals(hex, that.hex) &&
        java.util.Objects.equals(network, that.network) &&
        java.util.Objects.equals(paymentCred, that.paymentCred) &&
        java.util.Objects.equals(stakingCred, that.stakingCred);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(bech32, hex, network, paymentCred, stakingCred);
  }
}
