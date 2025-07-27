package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Summary of information regarding a stake account
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
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
}