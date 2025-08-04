package adlabs.maestro.client.backend.factory.options.filters;

import adlabs.maestro.client.backend.factory.options.Option;
import adlabs.maestro.client.backend.factory.options.OptionType;

/**
 * Not Operator Logical Operator Filter
 */
public class NotOperatorFilter extends Option {

    private final Option option;

    /**
     * NotOperatorFilter Constructor
     *
     * @param option Option to negate
     */
    public NotOperatorFilter(Option option) {
        super(OptionType.NOT_OPERATOR);
        this.option = option;
    }

    /**
     * Gets the option to negate.
     * 
     * @return the option to negate
     */
    public Option getOption() {
        return option;
    }

    /**
     * NotOperatorFilter.of Static Constructor
     *
     * @param option Option to negate
     * @return new NotOperatorFilter Option Object
     */
    public static NotOperatorFilter of(Option option) {
        if (option == null) {
            throw new IllegalStateException("Cannot Negate null Option");
        }
        return new NotOperatorFilter(option);
    }

    @Override
    public String getOptionTypeValue() {
        if (option.getOptionType() == OptionType.LOGICAL_FILTER) {
            return "not." + getOption().getOptionTypeValue();
        } else {
            return getOption().getOptionTypeValue();
        }
    }

    @Override
    public String getValue() {
        if (option.getOptionType() == OptionType.LOGICAL_FILTER) {
            return getOption().getValue();
        } else {
            return "not." + getOption().getValue();
        }
    }
}