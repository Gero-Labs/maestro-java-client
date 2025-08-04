package adlabs.maestro.client.backend.factory.options;

import adlabs.maestro.client.backend.factory.options.filters.LogicalOperatorFilter;
import adlabs.maestro.client.backend.factory.options.filters.LogicalOperatorFilterType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Options
 */
public class Options {

    private final List<Option> optionList;
    
    /** 
     * Constant representing empty options (no query parameters).
     */
    public static final Options EMPTY = null;

    /**
     * Options Default Constructor
     */
    public Options() {
        optionList = new ArrayList<>();
    }

    /**
     * Options Constructor
     *
     * @param optionList list of options
     */
    public Options(List<Option> optionList) {
        this.optionList = optionList;
    }

    /**
     * Gets the list of options.
     * 
     * @return the list of options
     */
    public List<Option> getOptionList() {
        return optionList;
    }

    /**
     * Options List to Map
     *
     * @return Map of Options
     */
    public Map<String, String> toMap() {
        List<Option> optionArrayList = new ArrayList<>();
        List<Option> filters = new ArrayList<>();
        for (Option option : this.optionList) {
            if (option.getOptionType() == OptionType.FILTER) {
                filters.add(option);
            } else {
                optionArrayList.add(option);
            }
        }
        if (filters.size() >= 2) {
            optionArrayList.add(LogicalOperatorFilter.of(LogicalOperatorFilterType.AND,filters.toArray(new Option[0])));
        } else if (filters.size() == 1) {
            optionArrayList.add(filters.get(0));
        }
        return optionArrayList.stream().collect(Collectors.toMap(Option::getOptionTypeValue, Option::getValue));
    }

    /**
     * OptionsBuilder.builder
     *
     * @return new OptionsBuilder
     */
    public static OptionsBuilder builder() {
        return new OptionsBuilder();
    }

    /**
     * Options Builder
     * 
     * <p>This class uses Lombok annotations to generate constructors:
     * <ul>
     *   <li>Default constructor - Creates a new OptionsBuilder instance</li>
     * </ul>
     */
    public static class OptionsBuilder {

        private List<Option> options;
        
        /**
         * Default constructor.
         */
        public OptionsBuilder() {
        }

        /**
         * option
         * Add new Option to OptionBuilder
         *
         * @param option option to add
         * @return OptionsBuilder
         */
        public OptionsBuilder option(Option option) {
            if (this.options == null) {
                this.options = new ArrayList<>();
            }
            this.options.add(option);
            return this;
        }

        /**
         * options
         * Add new Options to OptionBuilder
         *
         * @param options options to add
         * @return OptionsBuilder
         */
        public OptionsBuilder options(Collection<? extends Option> options) {
            if (this.options == null) {
                this.options = new ArrayList<>();
            }
            this.options.addAll(options);
            return this;
        }

        /**
         * Build OptionsBuilder Object
         *
         * @return Options
         */
        public Options build() {
            return new Options(options);
        }
    }
}
