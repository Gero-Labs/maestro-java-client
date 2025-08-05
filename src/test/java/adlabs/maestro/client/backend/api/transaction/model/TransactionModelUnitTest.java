package adlabs.maestro.client.backend.api.transaction.model;

import adlabs.maestro.client.backend.models.NumOrString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for transaction.model package classes to improve code coverage
 */
class TransactionModelUnitTest {

    @Test
    void txStatus_Values() {
        TxStatus[] values = TxStatus.values();
        assertEquals(5, values.length);
        
        assertTrue(contains(values, TxStatus.FAILED));
        assertTrue(contains(values, TxStatus.ONCHAIN));
        assertTrue(contains(values, TxStatus.PENDING));
        assertTrue(contains(values, TxStatus.REJECTED));
        assertTrue(contains(values, TxStatus.ROLLEDBACK));
    }

    @Test
    void txStatus_GetValue() {
        assertEquals("Failed", TxStatus.FAILED.getValue());
        assertEquals("Onchain", TxStatus.ONCHAIN.getValue());
        assertEquals("Pending", TxStatus.PENDING.getValue());
        assertEquals("Rejected", TxStatus.REJECTED.getValue());
        assertEquals("Rolledback", TxStatus.ROLLEDBACK.getValue());
    }

    @Test
    void txStatus_ToString() {
        assertEquals("Failed", TxStatus.FAILED.toString());
        assertEquals("Onchain", TxStatus.ONCHAIN.toString());
        assertEquals("Pending", TxStatus.PENDING.toString());
        assertEquals("Rejected", TxStatus.REJECTED.toString());
        assertEquals("Rolledback", TxStatus.ROLLEDBACK.toString());
    }

    @Test
    void txStatus_FromValue() {
        assertEquals(TxStatus.FAILED, TxStatus.fromValue("Failed"));
        assertEquals(TxStatus.ONCHAIN, TxStatus.fromValue("Onchain"));
        assertEquals(TxStatus.PENDING, TxStatus.fromValue("Pending"));
        assertEquals(TxStatus.REJECTED, TxStatus.fromValue("Rejected"));
        assertEquals(TxStatus.ROLLEDBACK, TxStatus.fromValue("Rolledback"));
        
        // Test invalid value
        assertThrows(IllegalArgumentException.class, () -> {
            TxStatus.fromValue("Invalid");
        });
    }

    @Test
    void dRepKind_Values() {
        DRepKind[] values = DRepKind.values();
        assertEquals(3, values.length);
        
        assertTrue(contains(values, DRepKind.CREDENTIAL));
        assertTrue(contains(values, DRepKind.ABSTAIN));
        assertTrue(contains(values, DRepKind.NO_CONFIDENCE));
    }

    @Test
    void dRepKind_GetValue() {
        assertEquals("credential", DRepKind.CREDENTIAL.getValue());
        assertEquals("abstain", DRepKind.ABSTAIN.getValue());
        assertEquals("no_confidence", DRepKind.NO_CONFIDENCE.getValue());
    }

    @Test
    void dRepKind_ToString() {
        assertEquals("credential", DRepKind.CREDENTIAL.toString());
        assertEquals("abstain", DRepKind.ABSTAIN.toString());
        assertEquals("no_confidence", DRepKind.NO_CONFIDENCE.toString());
    }

    @Test
    void dRepKind_FromValue() {
        assertEquals(DRepKind.CREDENTIAL, DRepKind.fromValue("credential"));
        assertEquals(DRepKind.ABSTAIN, DRepKind.fromValue("abstain"));
        assertEquals(DRepKind.NO_CONFIDENCE, DRepKind.fromValue("no_confidence"));
        
        // Test invalid value
        assertThrows(IllegalArgumentException.class, () -> {
            DRepKind.fromValue("invalid");
        });
    }

    @Test
    void anchor_DefaultConstructor() {
        Anchor anchor = new Anchor();
        assertNull(anchor.getContentHash());
        assertNull(anchor.getUrl());
    }

    @Test
    void anchor_ParameterizedConstructor() {
        String contentHash = "abc123";
        String url = "https://example.com/data";
        
        Anchor anchor = new Anchor(contentHash, url);
        assertEquals(contentHash, anchor.getContentHash());
        assertEquals(url, anchor.getUrl());
    }

    @Test
    void anchor_GettersSetters() {
        Anchor anchor = new Anchor();
        
        String contentHash = "def456";
        String url = "https://test.com/anchor";
        
        anchor.setContentHash(contentHash);
        anchor.setUrl(url);
        
        assertEquals(contentHash, anchor.getContentHash());
        assertEquals(url, anchor.getUrl());
    }

    @Test
    void anchor_ToString() {
        Anchor anchor = new Anchor("hash123", "https://example.com");
        String toString = anchor.toString();
        
        assertTrue(toString.contains("Anchor{"));
        assertTrue(toString.contains("contentHash='hash123'"));
        assertTrue(toString.contains("url='https://example.com'"));
    }

    @Test
    void anchor_EqualsAndHashCode() {
        Anchor anchor1 = new Anchor("hash123", "https://example.com");
        Anchor anchor2 = new Anchor("hash123", "https://example.com");
        Anchor anchor3 = new Anchor("hash456", "https://example.com");
        
        assertEquals(anchor1, anchor2);
        assertEquals(anchor1.hashCode(), anchor2.hashCode());
        assertNotEquals(anchor1, anchor3);
        assertNotEquals(anchor1.hashCode(), anchor3.hashCode());
        
        // Test reflexivity
        assertEquals(anchor1, anchor1);
        
        // Test null handling
        assertNotEquals(anchor1, null);
        
        // Test different class
        assertNotEquals(anchor1, "not an Anchor object");
    }

    @Test
    void txStatusInfo_DefaultConstructor() {
        TxStatusInfo txStatusInfo = new TxStatusInfo();
        assertNull(txStatusInfo.getTxHash());
        assertNull(txStatusInfo.getTxStatus());
    }

    @Test
    void txStatusInfo_ParameterizedConstructor() {
        String txHash = "abc123def456";
        TxStatus status = TxStatus.ONCHAIN;
        
        TxStatusInfo txStatusInfo = new TxStatusInfo(txHash, status);
        assertEquals(txHash, txStatusInfo.getTxHash());
        assertEquals(status, txStatusInfo.getTxStatus());
    }

    @Test
    void txStatusInfo_GettersSetters() {
        TxStatusInfo txStatusInfo = new TxStatusInfo();
        
        String txHash = "xyz789";
        TxStatus status = TxStatus.PENDING;
        
        txStatusInfo.setTxHash(txHash);
        txStatusInfo.setTxStatus(status);
        
        assertEquals(txHash, txStatusInfo.getTxHash());
        assertEquals(status, txStatusInfo.getTxStatus());
    }

    @Test
    void txStatusInfo_ToString() {
        TxStatusInfo txStatusInfo = new TxStatusInfo("hash123", TxStatus.ONCHAIN);
        String toString = txStatusInfo.toString();
        
        assertTrue(toString.contains("TxStatusInfo{"));
        assertTrue(toString.contains("txHash='hash123'"));
        assertTrue(toString.contains("txStatus=Onchain"));
    }

    @Test
    void txStatusInfo_EqualsAndHashCode() {
        TxStatusInfo info1 = new TxStatusInfo("hash123", TxStatus.ONCHAIN);
        TxStatusInfo info2 = new TxStatusInfo("hash123", TxStatus.ONCHAIN);
        TxStatusInfo info3 = new TxStatusInfo("hash456", TxStatus.PENDING);
        
        assertEquals(info1, info2);
        assertEquals(info1.hashCode(), info2.hashCode());
        assertNotEquals(info1, info3);
        assertNotEquals(info1.hashCode(), info3.hashCode());
        
        // Test reflexivity
        assertEquals(info1, info1);
        
        // Test null handling
        assertNotEquals(info1, null);
        
        // Test different class
        assertNotEquals(info1, "not a TxStatusInfo object");
    }

    @Test
    void mintAsset_DefaultConstructor() {
        MintAsset mintAsset = new MintAsset();
        assertNull(mintAsset.getAmount());
        assertNull(mintAsset.getUnit());
    }

    @Test
    void mintAsset_ParameterizedConstructor() {
        String amount = "1000000";
        String unit = "lovelace";
        
        MintAsset mintAsset = new MintAsset(amount, unit);
        assertEquals(amount, mintAsset.getAmount());
        assertEquals(unit, mintAsset.getUnit());
    }

    @Test
    void mintAsset_GettersSetters() {
        MintAsset mintAsset = new MintAsset();
        
        String amount = "500000";
        String unit = "ada";
        
        mintAsset.setAmount(amount);
        mintAsset.setUnit(unit);
        
        assertEquals(amount, mintAsset.getAmount());
        assertEquals(unit, mintAsset.getUnit());
    }

    @Test
    void mintAsset_ToString() {
        MintAsset mintAsset = new MintAsset("1000000", "lovelace");
        String toString = mintAsset.toString();
        
        assertTrue(toString.contains("MintAsset{"));
        assertTrue(toString.contains("amount='1000000'"));
        assertTrue(toString.contains("unit='lovelace'"));
    }

    // Test basic constructor functionality for other simple classes
    @Test
    void additionalUtxo_DefaultConstructor() {
        AdditionalUtxo additionalUtxo = new AdditionalUtxo();
        assertNotNull(additionalUtxo);
    }

    @Test
    void certRedeemer_DefaultConstructor() {
        CertRedeemer certRedeemer = new CertRedeemer();
        assertNotNull(certRedeemer);
    }

    @Test
    void certificates_DefaultConstructor() {
        Certificates certificates = new Certificates();
        assertNotNull(certificates);
    }

    @Test
    void dRep_DefaultConstructor() {
        DRep dRep = new DRep();
        assertNotNull(dRep);
    }

    @Test
    void evaluateRequest_DefaultConstructor() {
        EvaluateRequest evaluateRequest = new EvaluateRequest();
        assertNotNull(evaluateRequest);
    }

    @Test
    void evaluatedRedeemer_DefaultConstructor() {
        EvaluatedRedeemer evaluatedRedeemer = new EvaluatedRedeemer();
        assertNotNull(evaluatedRedeemer);
    }

    @Test
    void mintRedeemer_DefaultConstructor() {
        MintRedeemer mintRedeemer = new MintRedeemer();
        assertNotNull(mintRedeemer);
    }

    @Test
    void paginatedUtxoWithBytes_DefaultConstructor() {
        PaginatedUtxoWithBytes paginated = new PaginatedUtxoWithBytes();
        assertNotNull(paginated);
    }

    @Test
    void redeemers_DefaultConstructor() {
        Redeemers redeemers = new Redeemers();
        assertNotNull(redeemers);
    }

    @Test
    void timestampedTransaction_DefaultConstructor() {
        TimestampedTransaction timestamped = new TimestampedTransaction();
        assertNotNull(timestamped);
    }

    @Test
    void timestampedTransactionInfo_DefaultConstructor() {
        TimestampedTransactionInfo timestamped = new TimestampedTransactionInfo();
        assertNotNull(timestamped);
    }

    @Test
    void timestampedTxCbor_DefaultConstructor() {
        TimestampedTxCbor timestamped = new TimestampedTxCbor();
        assertNotNull(timestamped);
    }

    @Test
    void timestampedUtxo_DefaultConstructor() {
        TimestampedUtxo timestamped = new TimestampedUtxo();
        assertNotNull(timestamped);
    }

    @Test
    void transactionInfo_DefaultConstructor() {
        TransactionInfo transactionInfo = new TransactionInfo();
        assertNotNull(transactionInfo);
    }

    @Test
    void utxo_DefaultConstructor() {
        Utxo utxo = new Utxo();
        assertNotNull(utxo);
    }

    @Test
    void utxoWithBytes_DefaultConstructor() {
        UtxoWithBytes utxoWithBytes = new UtxoWithBytes();
        assertNotNull(utxoWithBytes);
    }

    @Test
    void withdrawal_DefaultConstructor() {
        Withdrawal withdrawal = new Withdrawal();
        assertNotNull(withdrawal);
    }

    // Additional comprehensive tests for more transaction model classes

    @Test
    void dRepCredKind_Values() {
        DRepCredKind[] values = DRepCredKind.values();
        assertEquals(2, values.length);
        
        assertTrue(contains(values, DRepCredKind.KEY));
        assertTrue(contains(values, DRepCredKind.SCRIPT));
    }

    @Test
    void dRepCredKind_GetValue() {
        assertEquals("key", DRepCredKind.KEY.getValue());
        assertEquals("script", DRepCredKind.SCRIPT.getValue());
    }

    @Test
    void dRepCredKind_ToString() {
        assertEquals("key", DRepCredKind.KEY.toString());
        assertEquals("script", DRepCredKind.SCRIPT.toString());
    }

    @Test
    void dRepCredKind_FromValue() {
        assertEquals(DRepCredKind.KEY, DRepCredKind.fromValue("key"));
        assertEquals(DRepCredKind.SCRIPT, DRepCredKind.fromValue("script"));
        
        // Test invalid value
        assertThrows(IllegalArgumentException.class, () -> {
            DRepCredKind.fromValue("invalid");
        });
    }

    @Test
    void dRepCredential_DefaultConstructor() {
        DRepCredential credential = new DRepCredential();
        assertNull(credential.getBech32());
        assertNull(credential.getHex());
        assertNull(credential.getKind());
    }

    @Test
    void dRepCredential_ParameterizedConstructor() {
        String bech32 = "drep1abc123";
        String hex = "abcd1234";
        DRepCredKind kind = DRepCredKind.KEY;
        
        DRepCredential credential = new DRepCredential(bech32, hex, kind);
        assertEquals(bech32, credential.getBech32());
        assertEquals(hex, credential.getHex());
        assertEquals(kind, credential.getKind());
    }

    @Test
    void dRepCredential_GettersSetters() {
        DRepCredential credential = new DRepCredential();
        
        String bech32 = "drep1xyz789";
        String hex = "xyz789";
        DRepCredKind kind = DRepCredKind.SCRIPT;
        
        credential.setBech32(bech32);
        credential.setHex(hex);
        credential.setKind(kind);
        
        assertEquals(bech32, credential.getBech32());
        assertEquals(hex, credential.getHex());
        assertEquals(kind, credential.getKind());
    }

    @Test
    void dRepCredential_ToString() {
        DRepCredential credential = new DRepCredential("drep1abc", "abc123", DRepCredKind.KEY);
        String toString = credential.toString();
        
        assertTrue(toString.contains("DRepCredential{"));
        assertTrue(toString.contains("bech32='drep1abc'"));
        assertTrue(toString.contains("hex='abc123'"));
        assertTrue(toString.contains("kind=key"));
    }

    @Test
    void dRepCredential_EqualsAndHashCode() {
        DRepCredential cred1 = new DRepCredential("drep1abc", "abc123", DRepCredKind.KEY);
        DRepCredential cred2 = new DRepCredential("drep1abc", "abc123", DRepCredKind.KEY);
        DRepCredential cred3 = new DRepCredential("drep1xyz", "xyz789", DRepCredKind.SCRIPT);
        
        assertEquals(cred1, cred2);
        assertEquals(cred1.hashCode(), cred2.hashCode());
        assertNotEquals(cred1, cred3);
        assertNotEquals(cred1.hashCode(), cred3.hashCode());
        
        // Test reflexivity
        assertEquals(cred1, cred1);
        
        // Test null handling
        assertNotEquals(cred1, null);
        
        // Test different class
        assertNotEquals(cred1, "not a DRepCredential object");
    }

    @Test
    void withdrawal_DefaultConstructorNew() {
        Withdrawal withdrawal = new Withdrawal();
        assertNull(withdrawal.getAmount());
        assertNull(withdrawal.getStakeAddress());
    }

    @Test
    void withdrawal_ParameterizedConstructor() {
        // Create a mock implementation of NumOrString interface for testing
        NumOrString amount = new NumOrString() {};
        String stakeAddress = "stake1abc123";
        
        Withdrawal withdrawal = new Withdrawal(amount, stakeAddress);
        assertEquals(amount, withdrawal.getAmount());
        assertEquals(stakeAddress, withdrawal.getStakeAddress());
    }

    @Test
    void withdrawal_GettersSetters() {
        Withdrawal withdrawal = new Withdrawal();
        
        // Create a mock implementation of NumOrString interface for testing
        NumOrString amount = new NumOrString() {};
        String stakeAddress = "stake1xyz789";
        
        withdrawal.setAmount(amount);
        withdrawal.setStakeAddress(stakeAddress);
        
        assertEquals(amount, withdrawal.getAmount());
        assertEquals(stakeAddress, withdrawal.getStakeAddress());
    }

    @Test
    void withdrawal_ToString() {
        NumOrString amount = new NumOrString() {};
        Withdrawal withdrawal = new Withdrawal(amount, "stake1abc");
        String toString = withdrawal.toString();
        
        assertTrue(toString.contains("Withdrawal{"));
        assertTrue(toString.contains("amount="));
        assertTrue(toString.contains("stakeAddress='stake1abc'"));
    }

    @Test
    void withdrawal_EqualsAndHashCode() {
        NumOrString amount1 = new NumOrString() {};
        // Use the same instance for proper equals comparison
        NumOrString amount2 = amount1;
        
        Withdrawal withdrawal1 = new Withdrawal(amount1, "stake1abc");
        Withdrawal withdrawal2 = new Withdrawal(amount2, "stake1abc");
        Withdrawal withdrawal3 = new Withdrawal(amount1, "stake1xyz");
        
        assertEquals(withdrawal1, withdrawal2);
        assertEquals(withdrawal1.hashCode(), withdrawal2.hashCode());
        assertNotEquals(withdrawal1, withdrawal3);
        
        // Test reflexivity
        assertEquals(withdrawal1, withdrawal1);
        
        // Test null handling
        assertNotEquals(withdrawal1, null);
        
        // Test different class
        assertNotEquals(withdrawal1, "not a Withdrawal object");
    }

    // Test more complex classes for basic instantiation to improve coverage
    @Test
    void spendRedeemer_DefaultConstructor() {
        SpendRedeemer spendRedeemer = new SpendRedeemer();
        assertNotNull(spendRedeemer);
    }

    @Test
    void spendRedeemerInput_DefaultConstructor() {
        SpendRedeemerInput spendRedeemerInput = new SpendRedeemerInput();
        assertNotNull(spendRedeemerInput);
    }

    @Test
    void voteRedeemer_DefaultConstructor() {
        VoteRedeemer voteRedeemer = new VoteRedeemer();
        assertNotNull(voteRedeemer);
    }

    @Test
    void wdrlRedeemer_DefaultConstructor() {
        WdrlRedeemer wdrlRedeemer = new WdrlRedeemer();
        assertNotNull(wdrlRedeemer);
    }

    @Test
    void proposalRedeemer_DefaultConstructor() {
        ProposalRedeemer proposalRedeemer = new ProposalRedeemer();
        assertNotNull(proposalRedeemer);
    }

    @Test
    void dRepNew_DefaultConstructor() {
        DRep dRep = new DRep();
        assertNotNull(dRep);
    }

    @Test
    void regCert_DefaultConstructor() {
        RegCert regCert = new RegCert();
        assertNotNull(regCert);
    }

    @Test
    void unRegCert_DefaultConstructor() {
        UnRegCert unRegCert = new UnRegCert();
        assertNotNull(unRegCert);
    }

    @Test
    void stakeDelegCert_DefaultConstructor() {
        StakeDelegCert stakeDelegCert = new StakeDelegCert();
        assertNotNull(stakeDelegCert);
    }

    @Test
    void stakeRegCert_DefaultConstructor() {
        StakeRegCert stakeRegCert = new StakeRegCert();
        assertNotNull(stakeRegCert);
    }

    @Test
    void stakeRegDelegCert_DefaultConstructor() {
        StakeRegDelegCert stakeRegDelegCert = new StakeRegDelegCert();
        assertNotNull(stakeRegDelegCert);
    }

    @Test
    void stakeVoteDelegCert_DefaultConstructor() {
        StakeVoteDelegCert stakeVoteDelegCert = new StakeVoteDelegCert();
        assertNotNull(stakeVoteDelegCert);
    }

    @Test
    void stakeVoteRegDelegCert_DefaultConstructor() {
        StakeVoteRegDelegCert stakeVoteRegDelegCert = new StakeVoteRegDelegCert();
        assertNotNull(stakeVoteRegDelegCert);
    }

    @Test
    void voteDelegCert_DefaultConstructor() {
        VoteDelegCert voteDelegCert = new VoteDelegCert();
        assertNotNull(voteDelegCert);
    }

    @Test
    void voteRegDelegCert_DefaultConstructor() {
        VoteRegDelegCert voteRegDelegCert = new VoteRegDelegCert();
        assertNotNull(voteRegDelegCert);
    }

    @Test
    void regDRepCert_DefaultConstructor() {
        RegDRepCert regDRepCert = new RegDRepCert();
        assertNotNull(regDRepCert);
    }

    @Test
    void unRegDRepCert_DefaultConstructor() {
        UnRegDRepCert unRegDRepCert = new UnRegDRepCert();
        assertNotNull(unRegDRepCert);
    }

    @Test
    void updateDRepCert_DefaultConstructor() {
        UpdateDRepCert updateDRepCert = new UpdateDRepCert();
        assertNotNull(updateDRepCert);
    }

    @Test
    void authCommitteeHotCert_DefaultConstructor() {
        AuthCommitteeHotCert authCommitteeHotCert = new AuthCommitteeHotCert();
        assertNotNull(authCommitteeHotCert);
    }

    @Test
    void resignCommitteeColdCert_DefaultConstructor() {
        ResignCommitteeColdCert resignCommitteeColdCert = new ResignCommitteeColdCert();
        assertNotNull(resignCommitteeColdCert);
    }

    @Test
    void poolRegCert_DefaultConstructor() {
        PoolRegCert poolRegCert = new PoolRegCert();
        assertNotNull(poolRegCert);
    }

    @Test
    void poolRetireCert_DefaultConstructor() {
        PoolRetireCert poolRetireCert = new PoolRetireCert();
        assertNotNull(poolRetireCert);
    }

    @Test
    void mirCert_DefaultConstructor() {
        MirCert mirCert = new MirCert();
        assertNotNull(mirCert);
    }

    // Helper methods for enum testing
    private boolean contains(TxStatus[] array, TxStatus value) {
        for (TxStatus item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    private boolean contains(DRepKind[] array, DRepKind value) {
        for (DRepKind item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    private boolean contains(DRepCredKind[] array, DRepCredKind value) {
        for (DRepCredKind item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }
}