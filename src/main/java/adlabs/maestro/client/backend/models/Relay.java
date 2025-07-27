package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Stake pool relay.
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
public class Relay {

  /**
   * DNS name.
   */
  private String dns;

  /**
   * IPv4 address.
   */
  private String ipv4;

  /**
   * IPv6 address.
   */
  private String ipv6;

  /**
   * Port number.
   */
  private Integer port;

  /**
   * SRV record.
   */
  private String srv;
}
