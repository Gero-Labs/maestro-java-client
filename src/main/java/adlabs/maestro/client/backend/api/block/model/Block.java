package adlabs.maestro.client.backend.api.block.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

/**
 * Block
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
public class Block {

    /**
     * Hash of the block
     */
    private String hash = null;

    /**
     * Epoch number of the block
     */
    private Integer epochNo = null;

    /**
     * Absolute slot number of the block
     */
    private Integer absSlot = null;

    /**
     * Slot number of the block in epoch
     */
    private Integer epochSlot = null;

    /**
     * Block Height
     */
    private Integer blockHeight = null;

    /**
     * Block size in bytes
     */
    private Integer blockSize = null;

    /**
     * UNIX timestamp of the block
     */
    private Long blockTime = null;

    /**
     * Number of transactions in the block
     */
    private Integer txCount = null;

    /**
     * VRF key of the block producer
     */
    private String vrfKey = null;

    /**
     * Pool ID in bech32 format
     */
    private String pool = null;

    /**
     * Counter value of the operational certificate used to create this block
     */
    private Integer opCertCounter = null;

    /**
     * The protocol major version
     */
    private Integer protoMajor;

    /**
     * The protocol minor version
     */
    private Integer protoMinor;

    /**
     * Previous Hash of the current block
     */
    private String parentHash;
}
