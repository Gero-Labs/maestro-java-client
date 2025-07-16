package adlabs.maestro.client.backend.factory.options;

/**
 * Option Type
 */
public enum  OptionType {

    /**
     * FILTERING OPTION TYPE
     */
    FILTER,

    /**
     * LOGICAL FILTERING OPTION TYPE
     */
    LOGICAL_FILTER,

    /**
     * NOT OPERATOR FILTERING OPTION TYPE
     */
    NOT_OPERATOR,

    /**
     * OFFSET OPTION TYPE
     */
    OFFSET,

    /**
     * LIMIT OPTION TYPE
     */
    LIMIT,

    /**
     * ORDER OPTION TYPE
     */
    ORDER,

    /**
     * CURSOR OPTION TYPE
     * Pagination cursor (next page) string
     */
    CURSOR,

    /**
     * The max number of results per page
     */
    COUNT,

    /**
     * Objects created on or after a specific slot
     */
    FROM,

    /**
     * Objects created on or before a specific slot
     */
    TO,

}
