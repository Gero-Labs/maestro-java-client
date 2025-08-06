package adlabs.maestro.client.backend.api.address;

import adlabs.maestro.client.backend.api.address.model.*;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddressServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(AddressServiceMainnetIntegrationTest.class);

    private AddressesService addressService;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set. Please set it before running tests.");
        }
        addressService = BackendFactory.getMaestroMainnetService(apiKey).getAddressService();
    }

    @Test
    void getTransactionsByPaymentCredentialsTest() throws ApiException {
        var paymentCredentials = List.of("addr_shared_vkh1ewj7sycvy5y234m3uhudn5dggqk3djr0jheacr3utna5gcnmwp2");

        Result<PaginatedPaymentCredentialsTransaction> txHashesResult = addressService.getTransactionsByPaymentCredentials(paymentCredentials, Options.EMPTY);
        Assertions.assertTrue(txHashesResult.isSuccessful());
        Assertions.assertNotNull(txHashesResult.getValue());
        log.info("getTransactionsByPaymentCredentialsTest: " + txHashesResult.getValue().toString());
    }

    @Test
    void getTransactionsByPaymentCredentialsBadRequestTest() {
        var badPaymentCredentials = List.of("a123sd");
        ApiException exception = assertThrows(ApiException.class, () -> addressService.getTransactionsByPaymentCredentials(badPaymentCredentials, Options.EMPTY));
        assertInstanceOf(ApiException.class, exception);
    }

    @Test
    void getUTxOsFromPaymentCredentialsTest() throws ApiException {
        List<String> paymentCredentials = List.of("addr_shared_vkh1ewj7sycvy5y234m3uhudn5dggqk3djr0jheacr3utna5gcnmwp2");
        Result<PaginatedUtxoWithSlot> addressUTxOsResult = addressService.getUTxOsByPaymentCredentials(paymentCredentials, false, false, Options.EMPTY);
        Assertions.assertTrue(addressUTxOsResult.isSuccessful());
        Assertions.assertNotNull(addressUTxOsResult.getValue());
        log.info("getUTxOsFromPaymentCredentialsTest: " + addressUTxOsResult.getValue().toString());
    }

    @Test
    void getBalancesByPaymentCredentialTest() throws ApiException {
        String paymentCredential = "addr_shared_vkh1ewj7sycvy5y234m3uhudn5dggqk3djr0jheacr3utna5gcnmwp2";
        Result<TimestampedBalance> addressBalanceResult = addressService.getBalanceByPaymentCredential(paymentCredential);
        Assertions.assertTrue(addressBalanceResult.isSuccessful());
        Assertions.assertNotNull(addressBalanceResult.getValue());
        log.info("getBalancesByPaymentCredentialTest: " + addressBalanceResult.getValue().toString());
    }

    @Test
    void getTransactionsByPaymentCredentialTest() throws ApiException {
        String paymentCredential = "addr_shared_vkh1ewj7sycvy5y234m3uhudn5dggqk3djr0jheacr3utna5gcnmwp2";
        Result<PaginatedPaymentCredentialTransaction> transactionsResult = addressService.getTransactionsByPaymentCredential(paymentCredential, Options.EMPTY);
        Assertions.assertTrue(transactionsResult.isSuccessful());
        Assertions.assertNotNull(transactionsResult.getValue());
        log.info("getTransactionsByPaymentCredentialTest: " + transactionsResult.getValue().toString());
    }

    @Test
    void getUTxOsByPaymentCredentialTest() throws ApiException {
        //
        String paymentCredential = "addr_shared_vkh1ewj7sycvy5y234m3uhudn5dggqk3djr0jheacr3utna5gcnmwp2";
        Result<PaginatedUtxoWithSlot> transactionsResult = addressService
                .getUTxOsByPaymentCredential(paymentCredential,null,false,true, Options.EMPTY);
        Assertions.assertTrue(transactionsResult.isSuccessful());
        Assertions.assertNotNull(transactionsResult.getValue());
        log.info("getUTxOsByPaymentCredentialTest: " + transactionsResult.getValue().toString());
    }

    @Test
    void getUTxOsByPaymentCredentialsTest() throws ApiException {
        List<String> paymentCredentials = List.of("addr_shared_vkh1ewj7sycvy5y234m3uhudn5dggqk3djr0jheacr3utna5gcnmwp2");
        Result<PaginatedUtxoWithSlot> transactionsResult = addressService
                .getUTxOsByPaymentCredentials(paymentCredentials,false,false, Options.EMPTY);
        Assertions.assertTrue(transactionsResult.isSuccessful());
        Assertions.assertNotNull(transactionsResult.getValue());
        log.info("getUTxOsByPaymentCredentialsTest: " + transactionsResult.getValue().toString());
    }

    @Test
    void decodeAddressTest() throws ApiException { //Decode Address
        String stakeAddress = "addr1qy2jt0qpqz2z2z9zx5w4xemekkce7yderz53kjue53lpqv90lkfa9sgrfjuz6uvt4uqtrqhl2kj0a9lnr9ndzutx32gqleeckv";
        Result<AddressInfo> addressInfoResult = addressService
                .decodeAddress(stakeAddress);
        Assertions.assertTrue(addressInfoResult.isSuccessful());
        Assertions.assertNotNull(addressInfoResult.getValue());
        log.info("decodeAddressTest: " + addressInfoResult.getValue().toString());
    }

    @Test
    void getAddressTransactionsTest() throws ApiException { //Decode Address
        String stakeAddress = "addr1q9xvgr4ehvu5k5tmaly7ugpnvekpqvnxj8xy50pa7kyetlnhel389pa4rnq6fmkzwsaynmw0mnldhlmchn2sfd589fgsz9dd0y";
        Result<PaginatedAddressTransaction> addressInfoResult = addressService
                .getAddressTransactions(stakeAddress, Options.EMPTY);
        Assertions.assertTrue(addressInfoResult.isSuccessful());
        Assertions.assertNotNull(addressInfoResult.getValue());
        log.info("getAddressTransactionsTest: " + addressInfoResult.getValue().toString());
    }

    @Test
    void getUTxOsRefBysAddressTest() throws ApiException { //Decode Address
        String addressBech32 = "addr1q9xvgr4ehvu5k5tmaly7ugpnvekpqvnxj8xy50pa7kyetlnhel389pa4rnq6fmkzwsaynmw0mnldhlmchn2sfd589fgsz9dd0y";
        Result<PaginatedUtxoRef> addressUTxORefs = addressService
                .getUTxORefsByAddress(addressBech32, Options.EMPTY);
        Assertions.assertTrue(addressUTxORefs.isSuccessful());
        Assertions.assertNotNull(addressUTxORefs.getValue());
        log.info("getUTxOsRefBysAddressTest: " + addressUTxORefs.getValue().toString());
    }

    @Test
    void getUTxOsBysAddressTest() throws ApiException { //Decode Address
        //addr1q9xvgr4ehvu5k5tmaly7ugpnvekpqvnxj8xy50pa7kyetlnhel389pa4rnq6fmkzwsaynmw0mnldhlmchn2sfd589fgsz9dd0y
        List<String> addresses = List.of("addr1q9xvgr4ehvu5k5tmaly7ugpnvekpqvnxj8xy50pa7kyetlnhel389pa4rnq6fmkzwsaynmw0mnldhlmchn2sfd589fgsz9dd0y");
        Result<PaginatedUtxoWithSlot> addressUTxORefs = addressService
                .getUTxOsByAddresses(addresses, false, false,Options.EMPTY);
        Assertions.assertTrue(addressUTxORefs.isSuccessful());
        Assertions.assertNotNull(addressUTxORefs.getValue());
        log.info("getUTxOsBysAddressTest: " + addressUTxORefs.getValue().toString());
    }

}