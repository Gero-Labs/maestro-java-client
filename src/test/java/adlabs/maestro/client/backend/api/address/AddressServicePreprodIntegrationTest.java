package adlabs.maestro.client.backend.api.address;

import adlabs.maestro.client.backend.api.address.model.*;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddressServicePreprodIntegrationTest {

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
    void getTransactionsByPaymentCredentialsTest() throws ApiException {
        var paymentCredentials = List.of("addr_vkh1sm6z4np95c4exg5002eyns0t4q4y74xrjfk9xz7qqz3726yse3n");

        Result<PaginatedPaymentCredentialsTransaction> txHashesResult = addressService.getTransactionsByPaymentCredentials(paymentCredentials, Options.EMPTY);
        Assertions.assertTrue(txHashesResult.isSuccessful());
        Assertions.assertNotNull(txHashesResult.getValue());
        log.info(txHashesResult.getValue().toString());
    }

    @Test
    void getTransactionsByPaymentCredentialsBadRequestTest() {
        var badPaymentCredentials = List.of("a123sd");
        ApiException exception = assertThrows(ApiException.class, () -> addressService.getTransactionsByPaymentCredentials(badPaymentCredentials, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getUTxOsFromPaymentCredentialsTest() throws ApiException {
        List<String> paymentCredentials = List.of("addr_vkh1sm6z4np95c4exg5002eyns0t4q4y74xrjfk9xz7qqz3726yse3n");
        Result<PaginatedUtxoWithSlot> addressUTxOsResult = addressService.getUTxOsByPaymentCredentials(paymentCredentials, false, false, Options.EMPTY);
        Assertions.assertTrue(addressUTxOsResult.isSuccessful());
        Assertions.assertNotNull(addressUTxOsResult.getValue());
        log.info(addressUTxOsResult.getValue().toString());
    }

    @Test
    void getBalancesByPaymentCredentialTest() throws ApiException {
        String paymentCredential = "addr_vkh1sm6z4np95c4exg5002eyns0t4q4y74xrjfk9xz7qqz3726yse3n";
        Result<TimestampedBalance> addressBalanceResult = addressService.getBalanceByPaymentCredential(paymentCredential);
        Assertions.assertTrue(addressBalanceResult.isSuccessful());
        Assertions.assertNotNull(addressBalanceResult.getValue());
        log.info(addressBalanceResult.getValue().toString());
    }

    @Test
    void getTransactionsByPaymentCredentialTest() throws ApiException {
        String paymentCredential = "addr_vkh1sm6z4np95c4exg5002eyns0t4q4y74xrjfk9xz7qqz3726yse3n";
        Result<PaginatedPaymentCredentialTransaction> transactionsResult = addressService.getTransactionsByPaymentCredential(paymentCredential, Options.EMPTY);
        Assertions.assertTrue(transactionsResult.isSuccessful());
        Assertions.assertNotNull(transactionsResult.getValue());
        log.info(transactionsResult.getValue().toString());
    }

    @Test
    void getUTxOsByPaymentCredentialTest() throws ApiException {
        String paymentCredential = "addr_vkh1sm6z4np95c4exg5002eyns0t4q4y74xrjfk9xz7qqz3726yse3n";
        Result<PaginatedUtxoWithSlot> transactionsResult = addressService
                .getUTxOsByPaymentCredential(paymentCredential,null,false,true, Options.EMPTY);
        Assertions.assertTrue(transactionsResult.isSuccessful());
        Assertions.assertNotNull(transactionsResult.getValue());
        log.info(transactionsResult.getValue().toString());
    }

    @Test
    void getUTxOsByPaymentCredentialsTest() throws ApiException {
        List<String> paymentCredentials = List.of("addr_vkh1sm6z4np95c4exg5002eyns0t4q4y74xrjfk9xz7qqz3726yse3n");
        Result<PaginatedUtxoWithSlot> transactionsResult = addressService
                .getUTxOsByPaymentCredentials(paymentCredentials,false,false, Options.EMPTY);
        Assertions.assertTrue(transactionsResult.isSuccessful());
        Assertions.assertNotNull(transactionsResult.getValue());
        log.info(transactionsResult.getValue().toString());
    }

    @Test
    void decodeAddressTest() throws ApiException { //Decode Address
        String stakeAddress = "addr_test1qzr0g2kvyknzhyez3aatyjwpaw5z5n65cwfxc5ctcqq28ed3hcc035r9r76tkxehlr9wdla9twe02dpv843nru6czj6qycpamy";
        Result<AddressInfo> addressInfoResult = addressService
                .decodeAddress(stakeAddress);
        Assertions.assertTrue(addressInfoResult.isSuccessful());
        Assertions.assertNotNull(addressInfoResult.getValue());
        log.info(addressInfoResult.getValue().toString());
    }

    @Test
    void getAddressTransactionsTest() throws ApiException { //Decode Address
        String stakeAddress = "addr_test1qzr0g2kvyknzhyez3aatyjwpaw5z5n65cwfxc5ctcqq28ed3hcc035r9r76tkxehlr9wdla9twe02dpv843nru6czj6qycpamy";
        Result<PaginatedAddressTransaction> addressInfoResult = addressService
                .getAddressTransactions(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(addressInfoResult.isSuccessful());
        Assertions.assertNotNull(addressInfoResult.getValue());
        log.info(addressInfoResult.getValue().toString());
    }

    @Test
    void getUTxOsRefBysAddressTest() throws ApiException { //Decode Address
        String addressBech32 = "addr_test1qzr0g2kvyknzhyez3aatyjwpaw5z5n65cwfxc5ctcqq28ed3hcc035r9r76tkxehlr9wdla9twe02dpv843nru6czj6qycpamy";
        Result<PaginatedUtxoRef> addressUTxORefs = addressService
                .getUTxORefsByAddress(addressBech32, Options.EMPTY);
        Assertions.assertTrue(addressUTxORefs.isSuccessful());
        Assertions.assertNotNull(addressUTxORefs.getValue());
        log.info(addressUTxORefs.getValue().toString());
    }

    @Test
    void getUTxOsBysAddressTest() throws ApiException { //Decode Address
        List<String> addresses = List.of("addr_test1qzr0g2kvyknzhyez3aatyjwpaw5z5n65cwfxc5ctcqq28ed3hcc035r9r76tkxehlr9wdla9twe02dpv843nru6czj6qycpamy");
        Result<PaginatedUtxoWithSlot> addressUTxORefs = addressService
                .getUTxOsByAddresses(addresses, false, false,Options.EMPTY);
        Assertions.assertTrue(addressUTxORefs.isSuccessful());
        Assertions.assertNotNull(addressUTxORefs.getValue());
        log.info(addressUTxORefs.getValue().toString());
    }

}
