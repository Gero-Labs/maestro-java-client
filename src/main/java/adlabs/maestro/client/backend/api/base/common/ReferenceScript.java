package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Reference Script
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReferenceScript {

    /**
     * Hash of referenced script
     */
    private String hash;

    /**
     * Size in bytes
     */
    private Integer size;

    /**
     * Type of script
     */
    private String type;

    /**
     * Script bytes (hex)
     */
    private String bytes;

    /**
     * Value (json)
     */
    private JsonNode value;

    /**
     * Default no-argument constructor.
     */
    public ReferenceScript() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param hash the hash of referenced script
     * @param size the size in bytes
     * @param type the type of script
     * @param bytes the script bytes (hex)
     * @param value the value (json)
     */
    public ReferenceScript(String hash, Integer size, String type, String bytes, JsonNode value) {
        this.hash = hash;
        this.size = size;
        this.type = type;
        this.bytes = bytes;
        this.value = value;
    }

    /**
     * Gets the hash of referenced script.
     * 
     * @return the hash of referenced script
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the hash of referenced script.
     * 
     * @param hash the hash of referenced script to set
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets the size in bytes.
     * 
     * @return the size in bytes
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the size in bytes.
     * 
     * @param size the size in bytes to set
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Gets the type of script.
     * 
     * @return the type of script
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of script.
     * 
     * @param type the type of script to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the script bytes.
     * 
     * @return the script bytes (hex)
     */
    public String getBytes() {
        return bytes;
    }

    /**
     * Sets the script bytes.
     * 
     * @param bytes the script bytes (hex) to set
     */
    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    /**
     * Gets the value.
     * 
     * @return the value (json)
     */
    public JsonNode getValue() {
        return value;
    }

    /**
     * Sets the value.
     * 
     * @param value the value (json) to set
     */
    public void setValue(JsonNode value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReferenceScript{" +
                "hash='" + hash + '\'' +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", bytes='" + bytes + '\'' +
                ", value=" + value +
                '}';
    }
}
