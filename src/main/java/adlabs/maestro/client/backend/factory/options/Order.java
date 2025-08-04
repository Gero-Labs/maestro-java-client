package adlabs.maestro.client.backend.factory.options;

/**
 * Order
 */
public class Order extends Option {

    private final String param;
    private final SortType sortType;

    /**
     * Order Option Constructor
     *
     * @param param Param to Order By
     * @param sortType SortType ASC or DESC
     */
    public Order(String param, SortType sortType) {
        super(OptionType.ORDER);
        this.param = param;
        this.sortType = sortType;
    }

    /**
     * Gets the parameter to order by.
     * 
     * @return the parameter to order by
     */
    public String getParam() {
        return param;
    }

    /**
     * Gets the sort type.
     * 
     * @return the sort type
     */
    public SortType getSortType() {
        return sortType;
    }

    /**
     * Order.by Static Constructor
     *
     * @param param    Parameter to Order By
     * @param sortType SortType - ASC or DESC
     * @return new Order Option Object
     */
    public static Order by(String param, SortType sortType) {
        return new Order(param, sortType);
    }

    @Override
    public String getValue() {
        return param+"."+sortType.name().toLowerCase();
    }
}
