package adlabs.maestro.client.backend.factory.options;

/**
 * Option
 */
public abstract class  Option {

    private final OptionType optionType;

    /**
     * Option Constructor
     *
     * @param optionType optionType
     */
    public Option(OptionType optionType) {
        this.optionType = optionType;
    }

    /**
     * Gets the option type.
     * 
     * @return the option type
     */
    public OptionType getOptionType() {
        return optionType;
    }

    /**
     * getValue
     *
     * @return abstract value per child Objects
     */
    public abstract String getValue();

    /**
     * getOptionTypeValue
     *
     * @return OptionType Name in lower case
     */
    public String getOptionTypeValue() {
        return optionType.name().toLowerCase();
    }
}
