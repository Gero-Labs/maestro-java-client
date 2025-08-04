package adlabs.maestro.client.backend.factory.options;

import adlabs.maestro.client.backend.api.address.AddressesService;
import adlabs.maestro.client.backend.api.address.model.PaginatedAddressTransaction;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.BackendFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OptionsPreprodTest {

    private static final Logger log = LoggerFactory.getLogger(OptionsPreprodTest.class);


    private AddressesService addressService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        addressService = BackendFactory.getMaestroPreprodService(apiKey).getAddressService();
    }

    @Test
    void MixedOptionsTest() throws ApiException {
        String address = "addr_test1vpfwv0ezc5g8a4mkku8hhy3y3vp92t7s3ul8g778g5yegsgalc6gc";
        Integer count = 5;
        Options options = Options.builder()
                .option(Cursor.of("AAAAAACkBq4AAFcqJXyj3PK7H4u2_w6hbIaGRhys9vy1dAfpG-KB4U_K"))
                .option(Count.of(count))
                .build();

        Result<PaginatedAddressTransaction> transactionsResult = addressService.getAddressTransactions(address, options);

        assertTrue(transactionsResult.isSuccessful());
        assertNotNull(transactionsResult.getValue());
        log.info(transactionsResult.getValue().toString());
        assertEquals(count, transactionsResult.getValue().getData().size());
        assertEquals("545b33f5211126898e94d14196ba84d76bbfedad80594e6d29daed6f467058ca", transactionsResult.getValue().getData().get(0).getTxHash());
        assertNotEquals(0, transactionsResult.getValue().getData().get(0).getSlot());
        assertNotNull(transactionsResult.getValue().getData().get(0).getSlot());
    }
}
