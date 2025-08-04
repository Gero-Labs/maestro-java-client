package adlabs.maestro.client.backend.api.policy.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.models.Holders;
import adlabs.maestro.client.backend.api.script.model.Script;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransaction;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Information about a Cardano native-asset policy ID.
 *
 * <p>This class uses manually generated constructors:
 * <ul>
 *   <li>{@code PolicyInfo()} - Creates a no-argument constructor</li>
 *   <li>{@code PolicyInfo(Long, TimestampedTransaction, TimestampedTransaction, String, Script, String, Holders)} - Creates a constructor with all fields</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PolicyInfo {

  /**
   * Number of assets of the policy.
   */
  @NotNull
  @Min(0L)
  private Long assetsOfPolicy;

  /**
   * The first transaction that minted an asset of the policy.
   */
  @NotNull
  @Valid
  private TimestampedTransaction firstMintTx;

  /**
   * The latest transaction that minted or burned an asset of the policy.
   */
  @NotNull
  @Valid
  private TimestampedTransaction latestMintTx;

  /**
   * Hex-encoded policy ID.
   */
  @NotNull
  private String policyId;

  /**
   * The script of the policy.
   */
  @NotNull
  @Valid
  private Script script;

  /**
   * Total supply of assets under this policy.
   */
  @NotNull
  private String totalSupply;

  /**
   * Number of unique holders of assets under this policy.
   */
  @NotNull
  @Valid
  private Holders uniqueHolders;

  /**
   * Default no-argument constructor.
   */
  public PolicyInfo() {
  }

  /**
   * Constructor with all fields.
   *
   * @param assetsOfPolicy the number of assets of the policy
   * @param firstMintTx the first transaction that minted an asset of the policy
   * @param latestMintTx the latest transaction that minted or burned an asset of the policy
   * @param policyId the hex-encoded policy ID
   * @param script the script of the policy
   * @param totalSupply the total supply of assets under this policy
   * @param uniqueHolders the number of unique holders of assets under this policy
   */
  public PolicyInfo(Long assetsOfPolicy, TimestampedTransaction firstMintTx, TimestampedTransaction latestMintTx,
                   String policyId, Script script, String totalSupply, Holders uniqueHolders) {
    this.assetsOfPolicy = assetsOfPolicy;
    this.firstMintTx = firstMintTx;
    this.latestMintTx = latestMintTx;
    this.policyId = policyId;
    this.script = script;
    this.totalSupply = totalSupply;
    this.uniqueHolders = uniqueHolders;
  }

  /**
   * Gets the number of assets of the policy.
   *
   * @return the number of assets of the policy
   */
  public Long getAssetsOfPolicy() {
    return assetsOfPolicy;
  }

  /**
   * Sets the number of assets of the policy.
   *
   * @param assetsOfPolicy the number of assets of the policy
   */
  public void setAssetsOfPolicy(Long assetsOfPolicy) {
    this.assetsOfPolicy = assetsOfPolicy;
  }

  /**
   * Gets the first transaction that minted an asset of the policy.
   *
   * @return the first transaction that minted an asset of the policy
   */
  public TimestampedTransaction getFirstMintTx() {
    return firstMintTx;
  }

  /**
   * Sets the first transaction that minted an asset of the policy.
   *
   * @param firstMintTx the first transaction that minted an asset of the policy
   */
  public void setFirstMintTx(TimestampedTransaction firstMintTx) {
    this.firstMintTx = firstMintTx;
  }

  /**
   * Gets the latest transaction that minted or burned an asset of the policy.
   *
   * @return the latest transaction that minted or burned an asset of the policy
   */
  public TimestampedTransaction getLatestMintTx() {
    return latestMintTx;
  }

  /**
   * Sets the latest transaction that minted or burned an asset of the policy.
   *
   * @param latestMintTx the latest transaction that minted or burned an asset of the policy
   */
  public void setLatestMintTx(TimestampedTransaction latestMintTx) {
    this.latestMintTx = latestMintTx;
  }

  /**
   * Gets the hex-encoded policy ID.
   *
   * @return the hex-encoded policy ID
   */
  public String getPolicyId() {
    return policyId;
  }

  /**
   * Sets the hex-encoded policy ID.
   *
   * @param policyId the hex-encoded policy ID
   */
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  /**
   * Gets the script of the policy.
   *
   * @return the script of the policy
   */
  public Script getScript() {
    return script;
  }

  /**
   * Sets the script of the policy.
   *
   * @param script the script of the policy
   */
  public void setScript(Script script) {
    this.script = script;
  }

  /**
   * Gets the total supply of assets under this policy.
   *
   * @return the total supply of assets under this policy
   */
  public String getTotalSupply() {
    return totalSupply;
  }

  /**
   * Sets the total supply of assets under this policy.
   *
   * @param totalSupply the total supply of assets under this policy
   */
  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }

  /**
   * Gets the number of unique holders of assets under this policy.
   *
   * @return the number of unique holders of assets under this policy
   */
  public Holders getUniqueHolders() {
    return uniqueHolders;
  }

  /**
   * Sets the number of unique holders of assets under this policy.
   *
   * @param uniqueHolders the number of unique holders of assets under this policy
   */
  public void setUniqueHolders(Holders uniqueHolders) {
    this.uniqueHolders = uniqueHolders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyInfo that = (PolicyInfo) o;
    return Objects.equals(assetsOfPolicy, that.assetsOfPolicy) &&
           Objects.equals(firstMintTx, that.firstMintTx) &&
           Objects.equals(latestMintTx, that.latestMintTx) &&
           Objects.equals(policyId, that.policyId) &&
           Objects.equals(script, that.script) &&
           Objects.equals(totalSupply, that.totalSupply) &&
           Objects.equals(uniqueHolders, that.uniqueHolders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetsOfPolicy, firstMintTx, latestMintTx, policyId, script, totalSupply, uniqueHolders);
  }

  @Override
  public String toString() {
    return "PolicyInfo{" +
           "assetsOfPolicy=" + assetsOfPolicy +
           ", firstMintTx=" + firstMintTx +
           ", latestMintTx=" + latestMintTx +
           ", policyId='" + policyId + '\'' +
           ", script=" + script +
           ", totalSupply='" + totalSupply + '\'' +
           ", uniqueHolders=" + uniqueHolders +
           '}';
  }
}
