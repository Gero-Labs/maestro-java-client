package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Transaction Hash
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TxHash {

    /**
     * Transaction Hash
     */
    private String txHash;

    /**
     * Epoch number of the block
     */
    private Integer epochNo;

    /**
     * Block Height
     */
    private Integer blockHeight;

    /**
     * UNIX timestamp of the block
     */
    private Integer blockTime;
}
