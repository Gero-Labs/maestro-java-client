package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.MirSource;
import adlabs.maestro.client.backend.models.MirTarget;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificate for sending an instantaneous reward (moving funds from treasury or reserves pot to the other pot or to stake accounts).
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MirCert {

  /**
   * No-argument constructor.
   */
  public MirCert() {
  }

  /**
   * All-argument constructor.
   *
   * @param accounts list of stake accounts with corresponding reward amounts (null if `to` is 'reserves' or 'treasury')
   * @param certIndex index of the certificate in the transaction
   * @param from the pot from which an MIR reward is being funded by
   * @param otherPot amount transfered to the other pot (null if `to` is 'accounts')
   * @param to where the MIR reward(s) are being sent
   */
  public MirCert(List<@Valid Withdrawal> accounts, Long certIndex, MirSource from, Long otherPot, MirTarget to) {
    this.accounts = accounts;
    this.certIndex = certIndex;
    this.from = from;
    this.otherPot = otherPot;
    this.to = to;
  }

  /**
   * List of stake accounts with corresponding reward amounts (null if `to` is 'reserves' or 'treasury').
   */
  @Valid
  private List<@Valid Withdrawal> accounts;

  /**
   * Index of the certificate in the transaction.
   */
  @NotNull
  @Min(0L)
  private Long certIndex;

  /**
   * The pot from which an MIR reward is being funded by.
   */
  @NotNull
  @Valid
  private MirSource from;

  /**
   * Amount transfered to the other pot (null if `to` is 'accounts').
   */
  @Min(0L)
  private Long otherPot;

  /**
   * Where the MIR reward(s) are being sent.
   */
  @NotNull
  @Valid
  private MirTarget to;

  /**
   * Gets the list of stake accounts with corresponding reward amounts.
   *
   * @return the list of stake accounts with corresponding reward amounts
   */
  public List<@Valid Withdrawal> getAccounts() {
    return accounts;
  }

  /**
   * Sets the list of stake accounts with corresponding reward amounts.
   *
   * @param accounts the list of stake accounts with corresponding reward amounts to set
   */
  public void setAccounts(List<@Valid Withdrawal> accounts) {
    this.accounts = accounts;
  }

  /**
   * Gets the index of the certificate in the transaction.
   *
   * @return the index of the certificate in the transaction
   */
  public Long getCertIndex() {
    return certIndex;
  }

  /**
   * Sets the index of the certificate in the transaction.
   *
   * @param certIndex the index of the certificate in the transaction to set
   */
  public void setCertIndex(Long certIndex) {
    this.certIndex = certIndex;
  }

  /**
   * Gets the pot from which an MIR reward is being funded by.
   *
   * @return the pot from which an MIR reward is being funded by
   */
  public MirSource getFrom() {
    return from;
  }

  /**
   * Sets the pot from which an MIR reward is being funded by.
   *
   * @param from the pot from which an MIR reward is being funded by to set
   */
  public void setFrom(MirSource from) {
    this.from = from;
  }

  /**
   * Gets the amount transfered to the other pot.
   *
   * @return the amount transfered to the other pot
   */
  public Long getOtherPot() {
    return otherPot;
  }

  /**
   * Sets the amount transfered to the other pot.
   *
   * @param otherPot the amount transfered to the other pot to set
   */
  public void setOtherPot(Long otherPot) {
    this.otherPot = otherPot;
  }

  /**
   * Gets where the MIR reward(s) are being sent.
   *
   * @return where the MIR reward(s) are being sent
   */
  public MirTarget getTo() {
    return to;
  }

  /**
   * Sets where the MIR reward(s) are being sent.
   *
   * @param to where the MIR reward(s) are being sent to set
   */
  public void setTo(MirTarget to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return "MirCert{" +
        "accounts=" + accounts +
        ", certIndex=" + certIndex +
        ", from=" + from +
        ", otherPot=" + otherPot +
        ", to=" + to +
        '}';
  }
}
