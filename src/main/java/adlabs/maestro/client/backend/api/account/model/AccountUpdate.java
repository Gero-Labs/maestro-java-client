package adlabs.maestro.client.backend.api.account.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Stake account related update
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
public class AccountUpdate {

  /**
   * Absolute slot of the block which contained the transaction
   */
  private Integer absSlot;

  /**
   * Type of action performed
   */
  private AccountAction action;

  /**
   * Deposit in lovelace if action is Registration
   */
  private String deposit;

  /**
   * Epoch number in which the transaction occurred
   */
  private Integer epochNo;

  /**
   * Transaction hash of the transaction which performed the action
   */
  private String txHash;
}