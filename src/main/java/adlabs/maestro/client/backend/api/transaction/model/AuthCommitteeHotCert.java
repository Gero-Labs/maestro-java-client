package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Authorizes the constitutional committee hot credential
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AuthCommitteeHotCert {

  /**
   * Index of the certificate in the transaction
   */
  private Long certIndex;

  /**
   * Committee cold credential
   */
  private String committeeColdCredential;

  /**
   * Committee hot credential
   */
  private String committeeHotCredential;
}