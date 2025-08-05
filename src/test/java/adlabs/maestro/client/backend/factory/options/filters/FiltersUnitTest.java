package adlabs.maestro.client.backend.factory.options.filters;

import adlabs.maestro.client.backend.factory.options.OptionType;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for factory.options.filters package classes to improve code coverage
 */
class FiltersUnitTest {

    @Test
    void filterType_Values() {
        FilterType[] values = FilterType.values();
        assertEquals(11, values.length);
        
        assertTrue(contains(values, FilterType.EQ));
        assertTrue(contains(values, FilterType.GT));
        assertTrue(contains(values, FilterType.GTE));
        assertTrue(contains(values, FilterType.LT));
        assertTrue(contains(values, FilterType.LTE));
        assertTrue(contains(values, FilterType.NEQ));
        assertTrue(contains(values, FilterType.LIKE));
        assertTrue(contains(values, FilterType.IN));
        assertTrue(contains(values, FilterType.IS));
        assertTrue(contains(values, FilterType.CS));
        assertTrue(contains(values, FilterType.CD));
    }

    @Test
    void filterType_Name() {
        assertEquals("EQ", FilterType.EQ.name());
        assertEquals("GT", FilterType.GT.name());
        assertEquals("GTE", FilterType.GTE.name());
        assertEquals("LT", FilterType.LT.name());
        assertEquals("LTE", FilterType.LTE.name());
        assertEquals("NEQ", FilterType.NEQ.name());
        assertEquals("LIKE", FilterType.LIKE.name());
        assertEquals("IN", FilterType.IN.name());
        assertEquals("IS", FilterType.IS.name());
        assertEquals("CS", FilterType.CS.name());
        assertEquals("CD", FilterType.CD.name());
    }

    @Test
    void filterType_Ordinal() {
        assertEquals(0, FilterType.EQ.ordinal());
        assertEquals(1, FilterType.GT.ordinal());
        assertEquals(2, FilterType.GTE.ordinal());
        assertEquals(3, FilterType.LT.ordinal());
        assertEquals(4, FilterType.LTE.ordinal());
        assertEquals(5, FilterType.NEQ.ordinal());
        assertEquals(6, FilterType.LIKE.ordinal());
        assertEquals(7, FilterType.IN.ordinal());
        assertEquals(8, FilterType.IS.ordinal());
        assertEquals(9, FilterType.CS.ordinal());
        assertEquals(10, FilterType.CD.ordinal());
    }

    @Test
    void filterType_ToString() {
        assertEquals("EQ", FilterType.EQ.toString());
        assertEquals("GT", FilterType.GT.toString());
        assertEquals("GTE", FilterType.GTE.toString());
        assertEquals("LT", FilterType.LT.toString());
        assertEquals("LTE", FilterType.LTE.toString());
        assertEquals("NEQ", FilterType.NEQ.toString());
    }

    @Test
    void filterType_ValueOf() {
        assertEquals(FilterType.EQ, FilterType.valueOf("EQ"));
        assertEquals(FilterType.GT, FilterType.valueOf("GT"));
        assertEquals(FilterType.GTE, FilterType.valueOf("GTE"));
        assertEquals(FilterType.LT, FilterType.valueOf("LT"));
        assertEquals(FilterType.LTE, FilterType.valueOf("LTE"));
        assertEquals(FilterType.NEQ, FilterType.valueOf("NEQ"));
        assertEquals(FilterType.LIKE, FilterType.valueOf("LIKE"));
        assertEquals(FilterType.IN, FilterType.valueOf("IN"));
        assertEquals(FilterType.IS, FilterType.valueOf("IS"));
        assertEquals(FilterType.CS, FilterType.valueOf("CS"));
        assertEquals(FilterType.CD, FilterType.valueOf("CD"));
        
        assertThrows(IllegalArgumentException.class, () -> FilterType.valueOf("INVALID"));
    }

    @Test
    void filter_Constructor() {
        String field = "epoch_no";
        FilterType filterType = FilterType.EQ;
        String value = "456";
        
        Filter filter = new Filter(field, filterType, value);
        
        assertEquals(field, filter.getField());
        assertEquals(filterType, filter.getFilterType());
        assertEquals(value, filter.getRawValue());
        assertEquals(OptionType.FILTER, filter.getOptionType());
    }

    @Test
    void filter_StaticOfMethod() {
        String field = "block_height";
        FilterType filterType = FilterType.GT;
        String value = "1000";
        
        Filter filter = Filter.of(field, filterType, value);
        
        assertEquals(field, filter.getField());
        assertEquals(filterType, filter.getFilterType());
        assertEquals(value, filter.getRawValue());
        assertEquals(OptionType.FILTER, filter.getOptionType());
    }

    @Test
    void filter_GetOptionTypeValue() {
        Filter filter = new Filter("test_field", FilterType.EQ, "test_value");
        assertEquals("test_field", filter.getOptionTypeValue());
    }

    @Test
    void filter_GetValue() {
        Filter eqFilter = new Filter("field1", FilterType.EQ, "value1");
        assertEquals("eq.value1", eqFilter.getValue());
        
        Filter gtFilter = new Filter("field2", FilterType.GT, "100");
        assertEquals("gt.100", gtFilter.getValue());
        
        Filter gteFilter = new Filter("field3", FilterType.GTE, "50");
        assertEquals("gte.50", gteFilter.getValue());
        
        Filter ltFilter = new Filter("field4", FilterType.LT, "200");
        assertEquals("lt.200", ltFilter.getValue());
        
        Filter lteFilter = new Filter("field5", FilterType.LTE, "150");
        assertEquals("lte.150", lteFilter.getValue());
        
        Filter neqFilter = new Filter("field6", FilterType.NEQ, "invalid");
        assertEquals("neq.invalid", neqFilter.getValue());
    }

    @Test
    void filter_AllFilterTypes() {
        for (FilterType filterType : FilterType.values()) {
            Filter filter = new Filter("test_field", filterType, "test_value");
            String expectedValue = filterType.name().toLowerCase() + ".test_value";
            assertEquals(expectedValue, filter.getValue());
        }
    }

    @Test
    void filter_WithNullValues() {
        Filter filter = new Filter(null, FilterType.EQ, null);
        
        assertNull(filter.getField());
        assertEquals(FilterType.EQ, filter.getFilterType());
        assertNull(filter.getRawValue());
        assertNull(filter.getOptionTypeValue());
        assertEquals("eq.null", filter.getValue());
    }

    @Test
    void filter_WithEmptyValues() {
        Filter filter = new Filter("", FilterType.NEQ, "");
        
        assertEquals("", filter.getField());
        assertEquals(FilterType.NEQ, filter.getFilterType());
        assertEquals("", filter.getRawValue());
        assertEquals("", filter.getOptionTypeValue());
        assertEquals("neq.", filter.getValue());
    }

    @Test
    void logicalOperatorFilterType_Values() {
        LogicalOperatorFilterType[] values = LogicalOperatorFilterType.values();
        assertEquals(2, values.length);
        
        assertTrue(contains(values, LogicalOperatorFilterType.AND));
        assertTrue(contains(values, LogicalOperatorFilterType.OR));
    }

    @Test
    void logicalOperatorFilterType_Name() {
        assertEquals("AND", LogicalOperatorFilterType.AND.name());
        assertEquals("OR", LogicalOperatorFilterType.OR.name());
    }

    @Test
    void logicalOperatorFilterType_ToString() {
        assertEquals("AND", LogicalOperatorFilterType.AND.toString());
        assertEquals("OR", LogicalOperatorFilterType.OR.toString());
    }

    @Test
    void logicalOperatorFilterType_ValueOf() {
        assertEquals(LogicalOperatorFilterType.AND, LogicalOperatorFilterType.valueOf("AND"));
        assertEquals(LogicalOperatorFilterType.OR, LogicalOperatorFilterType.valueOf("OR"));
        
        assertThrows(IllegalArgumentException.class, () -> LogicalOperatorFilterType.valueOf("INVALID"));
    }

    @Test
    void logicalOperatorFilter_Constructor() {
        Filter filter1 = new Filter("field1", FilterType.EQ, "value1");
        Filter filter2 = new Filter("field2", FilterType.GT, "100");
        List<adlabs.maestro.client.backend.factory.options.Option> filters = Arrays.asList(filter1, filter2);
        
        LogicalOperatorFilter logicalFilter = new LogicalOperatorFilter(LogicalOperatorFilterType.AND, filters);
        
        assertEquals(LogicalOperatorFilterType.AND, logicalFilter.getLogicalOperatorFilterType());
        assertEquals(filters, logicalFilter.getOptions());
        assertEquals(OptionType.LOGICAL_FILTER, logicalFilter.getOptionType());
    }

    @Test
    void logicalOperatorFilter_StaticOfMethod() {
        Filter filter1 = new Filter("field1", FilterType.LTE, "50");
        Filter filter2 = new Filter("field2", FilterType.NEQ, "invalid");
        
        LogicalOperatorFilter logicalFilter = LogicalOperatorFilter.of(LogicalOperatorFilterType.OR, filter1, filter2);
        
        assertEquals(LogicalOperatorFilterType.OR, logicalFilter.getLogicalOperatorFilterType());
        assertEquals(2, logicalFilter.getOptions().size());
    }

    @Test
    void logicalOperatorFilter_GetOptionTypeValue() {
        Filter filter = new Filter("test_field", FilterType.EQ, "test_value");
        LogicalOperatorFilter logicalFilter = LogicalOperatorFilter.of(LogicalOperatorFilterType.AND, filter);
        
        assertEquals("and", logicalFilter.getOptionTypeValue());
        assertTrue(logicalFilter.getValue().contains("test_field.eq.test_value"));
    }

    @Test
    void logicalOperatorFilter_GetValueWithOR() {
        Filter filter = new Filter("test_field", FilterType.GT, "100");
        LogicalOperatorFilter logicalFilter = LogicalOperatorFilter.of(LogicalOperatorFilterType.OR, filter);
        
        assertEquals("or", logicalFilter.getOptionTypeValue());
        assertTrue(logicalFilter.getValue().contains("test_field.gt.100"));
    }

    @Test
    void notOperatorFilter_Constructor() {
        Filter innerFilter = new Filter("field1", FilterType.EQ, "value1");
        
        NotOperatorFilter notFilter = new NotOperatorFilter(innerFilter);
        
        assertEquals(innerFilter, notFilter.getOption());
        assertEquals(OptionType.NOT_OPERATOR, notFilter.getOptionType());
    }

    @Test
    void notOperatorFilter_StaticOfMethod() {
        Filter innerFilter = new Filter("field2", FilterType.LT, "200");
        
        NotOperatorFilter notFilter = NotOperatorFilter.of(innerFilter);
        
        assertEquals(innerFilter, notFilter.getOption());
    }

    @Test
    void notOperatorFilter_GetOptionTypeValue() {
        Filter innerFilter = new Filter("test_field", FilterType.GTE, "75");
        NotOperatorFilter notFilter = new NotOperatorFilter(innerFilter);
        
        assertEquals("test_field", notFilter.getOptionTypeValue());
        assertEquals("not.gte.75", notFilter.getValue());
    }

    @Test
    void filters_ComplexScenario() {
        // Create a complex filter scenario
        Filter filter1 = Filter.of("epoch_no", FilterType.EQ, "456");
        Filter filter2 = Filter.of("block_height", FilterType.GT, "1000");
        Filter filter3 = Filter.of("tx_count", FilterType.LTE, "500");
        
        LogicalOperatorFilter andFilter = LogicalOperatorFilter.of(LogicalOperatorFilterType.AND, filter1, filter2);
        NotOperatorFilter notFilter = NotOperatorFilter.of(filter3);
        
        assertEquals("eq.456", filter1.getValue());
        assertEquals("gt.1000", filter2.getValue());
        assertEquals("lte.500", filter3.getValue());
        assertTrue(andFilter.getValue().contains("epoch_no.eq.456"));
        assertTrue(andFilter.getValue().contains("block_height.gt.1000"));
        assertEquals("not.lte.500", notFilter.getValue());
    }

    // Helper methods for enum testing
    private boolean contains(FilterType[] array, FilterType value) {
        for (FilterType item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    private boolean contains(LogicalOperatorFilterType[] array, LogicalOperatorFilterType value) {
        for (LogicalOperatorFilterType item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}