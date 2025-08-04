package adlabs.maestro.client.backend.factory.options;

/**
 * Count
 */
public class Count extends Option {

    private final Integer count;

    /**
     * Count Option Constructor
     *
     * @param count records number of items per page
     */
    public Count(Integer count) {
        super(OptionType.COUNT);
        this.count = count;
    }

    /**
     * Gets the count value.
     * 
     * @return the count value
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Count.of Static Constructor
     *
     * @param count records the max number of results per page
     * @return new Count Option Object
     */
    public static Count of(Integer count) {
        return new Count(count);
    }

    @Override
    public String getValue() {
        return String.valueOf(count);
    }
}
