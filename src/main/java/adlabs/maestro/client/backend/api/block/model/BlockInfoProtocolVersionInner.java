package adlabs.maestro.client.backend.api.block.model;

import lombok.*;

/**
 * Protocol version component
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlockInfoProtocolVersionInner {

  /**
   * Protocol version number
   */
  private Integer version;
}