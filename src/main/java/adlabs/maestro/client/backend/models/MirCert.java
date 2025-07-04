package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Certificate for sending an instantaneous reward (moving funds from treasury or reserves pot to the other pot or to stake accounts).
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class MirCert {

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
}
