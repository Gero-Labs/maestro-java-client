package adlabs.maestro.client.backend.factory.options.filters;

import adlabs.maestro.client.backend.factory.options.Option;
import adlabs.maestro.client.backend.factory.options.OptionType;

/**
 * Filter
 */
public class Filter extends Option {

    private final FilterType filterType;
    private final String field;
    private final String value;

    /**
     * Filter Constructor
     *
     * @param field      field
     * @param filterType filterType
     * @param value      value
     */
    public Filter(String field, FilterType filterType, String value) {
        super(OptionType.FILTER);
        this.filterType = filterType;
        this.field = field;
        this.value = value;
    }

    /**
     * Gets the filter type.
     * 
     * @return the filter type
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Gets the field.
     * 
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * Gets the raw value.
     * 
     * @return the raw value
     */
    public String getRawValue() {
        return value;
    }

    /**
     * Filter.of Static Constructor
     *
     * @param field      field
     * @param filterType filterType
     * @param value      value
     * @return new Filter Option Object
     */
    public static Filter of(String field, FilterType filterType, String value) {
        return new Filter(field, filterType, value);
    }

    @Override
    public String getOptionTypeValue() {
        return field;
    }

    @Override
    public String getValue() {
        return filterType.name().toLowerCase()+"."+value;
    }
}
