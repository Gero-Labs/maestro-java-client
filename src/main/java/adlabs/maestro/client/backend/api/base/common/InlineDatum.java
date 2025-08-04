package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Inline Datum
 *
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class InlineDatum {

    /**
     * Datum bytes (hex)
     */
    private String bytes;

    /**
     * Value (json)
     */
    private JsonNode value;

    /**
     * Default no-argument constructor.
     */
    public InlineDatum() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param bytes the datum bytes (hex)
     * @param value the value (json)
     */
    public InlineDatum(String bytes, JsonNode value) {
        this.bytes = bytes;
        this.value = value;
    }

    /**
     * Gets the datum bytes.
     * 
     * @return the datum bytes (hex)
     */
    public String getBytes() {
        return bytes;
    }

    /**
     * Sets the datum bytes.
     * 
     * @param bytes the datum bytes (hex) to set
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
        return "InlineDatum{" +
                "bytes='" + bytes + '\'' +
                ", value=" + value +
                '}';
    }
}
