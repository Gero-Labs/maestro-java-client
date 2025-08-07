package adlabs.maestro.client.backend.api.transaction;

import adlabs.maestro.client.backend.api.address.model.TimestampedAddress;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.api.base.exception.ApiException;
import adlabs.maestro.client.backend.api.transaction.model.PaginatedUtxoWithBytes;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransactionInfo;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedTxCbor;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedUtxo;
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.options.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TransactionServiceMainnetIntegrationTest {

    private static final Logger log = LoggerFactory.getLogger(TransactionServiceMainnetIntegrationTest.class);

    private TransactionService transactionService;
    private String txHash;
    private Integer txHashIndex;

    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY Environment Variable is not set. Please set it before running tests.");
        }
        transactionService = BackendFactory.getMaestroMainnetService(apiKey).getTransactionService();
        txHash = "f144a8264acf4bdfe2e1241170969c930d64ab6b0996a4a45237b623f1dd670e";
        txHashIndex = 0;
    }

    @Test
    void getTxOsByTxORefsTest() throws ApiException {
        // txHash of the format List.of("TxHash#Index")
        var tx1 = txHash+"#"+txHashIndex.toString();
        List<String> txHashes = List.of(tx1,
                "0b8ba3bed976fa4913f19adc9f6dd9063138db5b4dd29cecde369456b5155e94#0");
        Result<PaginatedUtxoWithBytes> paginatedUtxoWithBytesResult = transactionService.getTxOsByTxORefs(txHashes, Options.EMPTY);
        assertTrue(paginatedUtxoWithBytesResult.isSuccessful());
        assertNotNull(paginatedUtxoWithBytesResult.getValue());
        log.info("getTxOsByTxORefsTest: " + paginatedUtxoWithBytesResult.getValue().toString());
    }

    @Test
    void getTxInfoTest() throws ApiException {
        Result<TimestampedTransactionInfo> timestampedTransactionInfoResult = transactionService.getTxInfo(txHash);
        assertTrue(timestampedTransactionInfoResult.isSuccessful());
        assertNotNull(timestampedTransactionInfoResult.getValue());
        log.info("getTxInfoTest: " + timestampedTransactionInfoResult.getValue().toString());
    }

    @Test
    void getTxCborByTxHashTest() throws ApiException {
        Result<TimestampedTxCbor> timestampedTxCborResult = transactionService.getTxCborByTxHash(txHash);
        assertTrue(timestampedTxCborResult.isSuccessful());
        assertNotNull(timestampedTxCborResult.getValue());
        log.info("getTxCborByTxHashTest: " + timestampedTxCborResult.getValue().toString());
    }

    @Test
    void getAddressByTxoTest() throws ApiException {
        Result<TimestampedAddress> timestampedAddressResult = transactionService.getAddressByTxO(txHash, txHashIndex);
        assertTrue(timestampedAddressResult.isSuccessful());
        assertNotNull(timestampedAddressResult.getValue());
        log.info("getAddressByTxoTest: " + timestampedAddressResult.getValue().toString());
    }

    @Test
    void getTxOByTxORefTest() throws ApiException {
        Result<TimestampedUtxo> timestampedUtxoResult = transactionService.getTxOByTxORef(txHash, txHashIndex, Options.EMPTY);
        assertTrue(timestampedUtxoResult.isSuccessful());
        assertNotNull(timestampedUtxoResult.getValue());
        log.info("getTxOByTxORefTest: " + timestampedUtxoResult.getValue().toString());
    }

    /*
    @Test
    void evaluateRedeemersTest() throws ApiException {
        String txCbor = "84a3008182582079aa03c713b868a29a0f9c2d1587d583081e7d82585971431952e896b0101b00018182583900e2551052b618f4a34b2a8d119e1c1815121b67f1de639d67a99188e3a246949354228b7e250b73c9c05769e5593c6b2257d090a2a1008182582038596f2e22c140c83a9e710f63c8a4a6d2f348d2ad75704a259c07170c9769990158405597799d55b0c44f479a40a5a3501a4e140d348a27891278e32faddd61994e6361a99859f1f0a5aa878b27ad519800a43922f46e100f2e0f21469e38f170f1a00286a40a1015820cbb75a09c5e533c39a311899a8e2343a41703e72f10b38a05f159a68a15998188282583900e2551052b618f4a34b2a8d119e1c1815121b67f1de639d67a99188e3a246949354228b7e250b73c9c05769e5593c6b2257d090a2a1008182582038596f2e22c140c83a9e710f63c8a4a6d2f348d2ad75704a259c07170c97699900584039c36868878b8772a096c4b22c3666f8510a26e84d313175c02484433c2a9a7a08b1a0e446d6e19198650a36e522f7c0a7ac66a56e29a997d81a9657b01d18201a0016335a8282582079aa03c713b868a29a0f9c2d1587d583081e7d82585971431952e896b0101b00021a003184a5a2f5f4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4.5820459f2497672a9e223838528656114a5a54b6c337b51e6005086d7951336142714f5820d8f5c6e88fed549339e8029013e8431c2c310c8c0f5451a44a6f264d96c9c647a4f5f6";
        EvaluateRequest evaluateRequest = new EvaluateRequest(txCbor);
        Result<List<EvaluatedRedeemer>> evaluatedRedeemerResult = transactionService.evaluateRedeemers(evaluateRequest);
        assertTrue(evaluatedRedeemerResult.isSuccessful());
        assertNotNull(evaluatedRedeemerResult.getValue());
        log.info("evaluateRedeemersTest: " + evaluatedRedeemerResult.getValue().toString());
    }*/

}