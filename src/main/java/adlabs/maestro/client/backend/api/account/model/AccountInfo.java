package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Summary of information regarding a stake account
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountInfo {

    /**
     * Bech32 encoded stake address
     */
    private String stakeAddress;

    /**
     * True if the stake key is registered
     */
    private Boolean registered;

    /**
     * Bech32 pool ID that the stake key is delegated to
     */
    private String delegatedPool;

    /**
     * Total balance of the account
     */
    private String totalBalance;

    /**
     * Total UTxO balance of the account
     */
    private String utxoBalance;

    /**
     * Total rewards earned by the account
     */
    private String totalRewarded;

    /**
     * Total rewards withdrawn by the account
     */
    private String totalWithdrawn;

    /**
     * Total rewards available for withdrawal
     */
    private String rewardsAvailable;

    /**
     * Default constructor
     */
    public AccountInfo() {
    }

    /**
     * Constructor with all fields
     *
     * @param stakeAddress      Bech32 encoded stake address
     * @param registered        True if the stake key is registered
     * @param delegatedPool     Bech32 pool ID that the stake key is delegated to
     * @param totalBalance      Total balance of the account
     * @param utxoBalance       Total UTxO balance of the account
     * @param totalRewarded     Total rewards earned by the account
     * @param totalWithdrawn    Total rewards withdrawn by the account
     * @param rewardsAvailable  Total rewards available for withdrawal
     */
    public AccountInfo(String stakeAddress, Boolean registered, String delegatedPool, String totalBalance,
                      String utxoBalance, String totalRewarded, String totalWithdrawn, String rewardsAvailable) {
        this.stakeAddress = stakeAddress;
        this.registered = registered;
        this.delegatedPool = delegatedPool;
        this.totalBalance = totalBalance;
        this.utxoBalance = utxoBalance;
        this.totalRewarded = totalRewarded;
        this.totalWithdrawn = totalWithdrawn;
        this.rewardsAvailable = rewardsAvailable;
    }

    /**
     * Gets the Bech32 encoded stake address
     *
     * @return the stake address
     */
    public String getStakeAddress() {
        return stakeAddress;
    }

    /**
     * Sets the Bech32 encoded stake address
     *
     * @param stakeAddress the stake address
     */
    public void setStakeAddress(String stakeAddress) {
        this.stakeAddress = stakeAddress;
    }

    /**
     * Gets whether the stake key is registered
     *
     * @return true if the stake key is registered
     */
    public Boolean getRegistered() {
        return registered;
    }

    /**
     * Sets whether the stake key is registered
     *
     * @param registered true if the stake key is registered
     */
    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    /**
     * Gets the Bech32 pool ID that the stake key is delegated to
     *
     * @return the delegated pool ID
     */
    public String getDelegatedPool() {
        return delegatedPool;
    }

    /**
     * Sets the Bech32 pool ID that the stake key is delegated to
     *
     * @param delegatedPool the delegated pool ID
     */
    public void setDelegatedPool(String delegatedPool) {
        this.delegatedPool = delegatedPool;
    }

    /**
     * Gets the total balance of the account
     *
     * @return the total balance
     */
    public String getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the total balance of the account
     *
     * @param totalBalance the total balance
     */
    public void setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
    }

    /**
     * Gets the total UTxO balance of the account
     *
     * @return the UTxO balance
     */
    public String getUtxoBalance() {
        return utxoBalance;
    }

    /**
     * Sets the total UTxO balance of the account
     *
     * @param utxoBalance the UTxO balance
     */
    public void setUtxoBalance(String utxoBalance) {
        this.utxoBalance = utxoBalance;
    }

    /**
     * Gets the total rewards earned by the account
     *
     * @return the total rewards earned
     */
    public String getTotalRewarded() {
        return totalRewarded;
    }

    /**
     * Sets the total rewards earned by the account
     *
     * @param totalRewarded the total rewards earned
     */
    public void setTotalRewarded(String totalRewarded) {
        this.totalRewarded = totalRewarded;
    }

    /**
     * Gets the total rewards withdrawn by the account
     *
     * @return the total rewards withdrawn
     */
    public String getTotalWithdrawn() {
        return totalWithdrawn;
    }

    /**
     * Sets the total rewards withdrawn by the account
     *
     * @param totalWithdrawn the total rewards withdrawn
     */
    public void setTotalWithdrawn(String totalWithdrawn) {
        this.totalWithdrawn = totalWithdrawn;
    }

    /**
     * Gets the total rewards available for withdrawal
     *
     * @return the rewards available for withdrawal
     */
    public String getRewardsAvailable() {
        return rewardsAvailable;
    }

    /**
     * Sets the total rewards available for withdrawal
     *
     * @param rewardsAvailable the rewards available for withdrawal
     */
    public void setRewardsAvailable(String rewardsAvailable) {
        this.rewardsAvailable = rewardsAvailable;
    }

    /**
     * Returns a string representation of the AccountInfo
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return "AccountInfo{" +
            "stakeAddress='" + stakeAddress + '\'' +
            ", registered=" + registered +
            ", delegatedPool='" + delegatedPool + '\'' +
            ", totalBalance='" + totalBalance + '\'' +
            ", utxoBalance='" + utxoBalance + '\'' +
            ", totalRewarded='" + totalRewarded + '\'' +
            ", totalWithdrawn='" + totalWithdrawn + '\'' +
            ", rewardsAvailable='" + rewardsAvailable + '\'' +
            '}';
    }
}