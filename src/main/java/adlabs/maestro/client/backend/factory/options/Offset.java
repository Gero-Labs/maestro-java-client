package adlabs.maestro.client.backend.factory.options;

/**
 * Offset
 */
public class Offset extends Option {

    private final long offset;

    /**
     * Offset Option Constructor
     *
     * @param offset records offset value
     */
    public Offset(long offset) {
        super(OptionType.OFFSET);
        this.offset = offset;
    }

    /**
     * Gets the offset value.
     * 
     * @return the offset value
     */
    public long getOffset() {
        return offset;
    }

    /**
     * Offset.of Static Constructor
     *
     * @param offset records offset value
     * @return new Offset Option Object
     */
    public static Offset of(long offset) {
        return new Offset(offset);
    }

    @Override
    public String getValue() {
        return String.valueOf(offset);
    }
}
