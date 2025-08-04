package adlabs.maestro.client.backend.factory.options;

/**
 * Cursor
 */
public class Cursor extends Option {

    private final String cursor;

    /**
     * Cursor Option Constructor
     *
     * @param cursor records cursor value
     */
    public Cursor(String cursor) {
        super(OptionType.CURSOR);
        this.cursor = cursor;
    }

    /**
     * Gets the cursor value.
     * 
     * @return the cursor value
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Cursor.of Static Constructor
     *
     * @param cursor records cursor pagination value
     * @return new Cursor Option Object
     */
    public static Cursor of(String cursor) {
        return new Cursor(cursor);
    }

    @Override
    public String getValue() {
        return String.valueOf(cursor);
    }
}
