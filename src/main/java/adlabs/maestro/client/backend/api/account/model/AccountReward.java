package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Stake account related reward
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
public class AccountReward {

  /**
   * Amount of the reward
   */
  private String amount;

  /**
   * Epoch in which the reward was earned
   */
  private Integer earnedEpoch;

  /**
   * Bech32 encoded pool ID (if relevant to reward type)
   */
  private String poolId;

  /**
   * Epoch at which the reward is spendable
   */
  private Integer spendableEpoch;

  /**
   * Type of reward
   */
  private AccountRewardType type;
}