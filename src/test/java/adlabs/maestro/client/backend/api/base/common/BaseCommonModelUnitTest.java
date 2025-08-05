package adlabs.maestro.client.backend.api.base.common;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for base.common package classes to improve code coverage
 */
class BaseCommonModelUnitTest {

    @Test
    void asset_DefaultConstructor() {
        Asset asset = new Asset();
        
        assertNull(asset.getPolicyId());
        assertNull(asset.getAssetName());
        assertNull(asset.getFingerprint());
        assertNull(asset.getDecimals());
        assertNull(asset.getQuantity());
    }

    @Test
    void asset_ParameterizedConstructor() {
        String policyId = "abc123def456";
        String assetName = "MyToken";
        String fingerprint = "asset1abc123";
        Integer decimals = 6;
        String quantity = "1000000";
        
        Asset asset = new Asset(policyId, assetName, fingerprint, decimals, quantity);
        
        assertEquals(policyId, asset.getPolicyId());
        assertEquals(assetName, asset.getAssetName());
        assertEquals(fingerprint, asset.getFingerprint());
        assertEquals(decimals, asset.getDecimals());
        assertEquals(quantity, asset.getQuantity());
    }

    @Test
    void asset_GettersSetters() {
        Asset asset = new Asset();
        
        String policyId = "xyz789ghi012";
        String assetName = "TestAsset";
        String fingerprint = "asset1xyz789";
        Integer decimals = 8;
        String quantity = "500000";
        
        asset.setPolicyId(policyId);
        asset.setAssetName(assetName);
        asset.setFingerprint(fingerprint);
        asset.setDecimals(decimals);
        asset.setQuantity(quantity);
        
        assertEquals(policyId, asset.getPolicyId());
        assertEquals(assetName, asset.getAssetName());
        assertEquals(fingerprint, asset.getFingerprint());
        assertEquals(decimals, asset.getDecimals());
        assertEquals(quantity, asset.getQuantity());
    }

    @Test
    void asset_ToString() {
        Asset asset = new Asset("policy123", "token456", "asset1finger", 6, "1000000");
        String toString = asset.toString();
        
        assertTrue(toString.contains("Asset{"));
        assertTrue(toString.contains("policyId='policy123'"));
        assertTrue(toString.contains("assetName='token456'"));
        assertTrue(toString.contains("fingerprint='asset1finger'"));
        assertTrue(toString.contains("decimals=6"));
        assertTrue(toString.contains("quantity='1000000'"));
    }

    @Test
    void asset_NullValues() {
        Asset asset = new Asset();
        
        asset.setPolicyId(null);
        asset.setAssetName(null);
        asset.setFingerprint(null);
        asset.setDecimals(null);
        asset.setQuantity(null);
        
        assertNull(asset.getPolicyId());
        assertNull(asset.getAssetName());
        assertNull(asset.getFingerprint());
        assertNull(asset.getDecimals());
        assertNull(asset.getQuantity());
        
        // Test toString with null values
        String toString = asset.toString();
        assertTrue(toString.contains("Asset{"));
    }

    @Test
    void utxo_DefaultConstructor() {
        UTxO utxo = new UTxO();
        
        assertNull(utxo.getTxHash());
        assertNull(utxo.getTxIndex());
        assertNull(utxo.getAddress());
        assertNull(utxo.getValue());
        assertNull(utxo.getStakeAddress());
        assertNull(utxo.getPaymentCred());
        assertNull(utxo.getEpochNo());
        assertNull(utxo.getBlockHeight());
        assertNull(utxo.getBlockTime());
        assertNull(utxo.getDatumHash());
        assertNull(utxo.getInlineDatum());
        assertNull(utxo.getReferenceScript());
        assertNull(utxo.getAssetList());
        assertNull(utxo.getIsSpent());
    }

    @Test
    void utxo_ParameterizedConstructor() {
        String txHash = "abc123def456";
        Integer txIndex = 0;
        String address = "addr1abc123";
        String value = "1000000";
        String stakeAddress = "stake1xyz789";
        String paymentCred = "cred123";
        Integer epochNo = 456;
        Integer blockHeight = 123456;
        Integer blockTime = 1672531200;
        String datumHash = "datum123";
        InlineDatum inlineDatum = new InlineDatum();
        ReferenceScript referenceScript = new ReferenceScript();
        List<Asset> assetList = Arrays.asList(new Asset());
        Boolean isSpent = false;
        
        UTxO utxo = new UTxO(txHash, txIndex, address, value, stakeAddress, paymentCred, 
                            epochNo, blockHeight, blockTime, datumHash, inlineDatum, 
                            referenceScript, assetList, isSpent);
        
        assertEquals(txHash, utxo.getTxHash());
        assertEquals(txIndex, utxo.getTxIndex());
        assertEquals(address, utxo.getAddress());
        assertEquals(value, utxo.getValue());
        assertEquals(stakeAddress, utxo.getStakeAddress());
        assertEquals(paymentCred, utxo.getPaymentCred());
        assertEquals(epochNo, utxo.getEpochNo());
        assertEquals(blockHeight, utxo.getBlockHeight());
        assertEquals(blockTime, utxo.getBlockTime());
        assertEquals(datumHash, utxo.getDatumHash());
        assertEquals(inlineDatum, utxo.getInlineDatum());
        assertEquals(referenceScript, utxo.getReferenceScript());
        assertEquals(assetList, utxo.getAssetList());
        assertEquals(isSpent, utxo.getIsSpent());
    }

    @Test
    void utxo_GettersSetters() {
        UTxO utxo = new UTxO();
        
        String txHash = "xyz789ghi012";
        Integer txIndex = 1;
        String address = "addr1xyz789";
        String value = "2000000";
        String stakeAddress = "stake1abc123";
        String paymentCred = "cred456";
        Integer epochNo = 789;
        Integer blockHeight = 654321;
        Integer blockTime = 1672617600;
        String datumHash = "datum456";
        InlineDatum inlineDatum = new InlineDatum();
        ReferenceScript referenceScript = new ReferenceScript();
        List<Asset> assetList = Arrays.asList(new Asset(), new Asset());
        Boolean isSpent = true;
        
        utxo.setTxHash(txHash);
        utxo.setTxIndex(txIndex);
        utxo.setAddress(address);
        utxo.setValue(value);
        utxo.setStakeAddress(stakeAddress);
        utxo.setPaymentCred(paymentCred);
        utxo.setEpochNo(epochNo);
        utxo.setBlockHeight(blockHeight);
        utxo.setBlockTime(blockTime);
        utxo.setDatumHash(datumHash);
        utxo.setInlineDatum(inlineDatum);
        utxo.setReferenceScript(referenceScript);
        utxo.setAssetList(assetList);
        utxo.setIsSpent(isSpent);
        
        assertEquals(txHash, utxo.getTxHash());
        assertEquals(txIndex, utxo.getTxIndex());
        assertEquals(address, utxo.getAddress());
        assertEquals(value, utxo.getValue());
        assertEquals(stakeAddress, utxo.getStakeAddress());
        assertEquals(paymentCred, utxo.getPaymentCred());
        assertEquals(epochNo, utxo.getEpochNo());
        assertEquals(blockHeight, utxo.getBlockHeight());
        assertEquals(blockTime, utxo.getBlockTime());
        assertEquals(datumHash, utxo.getDatumHash());
        assertEquals(inlineDatum, utxo.getInlineDatum());
        assertEquals(referenceScript, utxo.getReferenceScript());
        assertEquals(assetList, utxo.getAssetList());
        assertEquals(isSpent, utxo.getIsSpent());
    }

    @Test
    void utxo_ToString() {
        UTxO utxo = new UTxO("hash123", 0, "addr1test", "1000000", "stake1test", 
                            "cred123", 456, 123456, 1672531200, "datum123", 
                            null, null, null, false);
        String toString = utxo.toString();
        
        assertTrue(toString.contains("UTxO{"));
        assertTrue(toString.contains("txHash='hash123'"));
        assertTrue(toString.contains("txIndex=0"));
        assertTrue(toString.contains("address='addr1test'"));
        assertTrue(toString.contains("value='1000000'"));
        assertTrue(toString.contains("stakeAddress='stake1test'"));
        assertTrue(toString.contains("paymentCred='cred123'"));
        assertTrue(toString.contains("epochNo=456"));
        assertTrue(toString.contains("blockHeight=123456"));
        assertTrue(toString.contains("blockTime=1672531200"));
        assertTrue(toString.contains("datumHash='datum123'"));
        assertTrue(toString.contains("isSpent=false"));
    }

    @Test
    void utxo_NullValues() {
        UTxO utxo = new UTxO();
        
        // All fields should be null by default
        assertNull(utxo.getTxHash());
        assertNull(utxo.getTxIndex());
        assertNull(utxo.getAddress());
        assertNull(utxo.getValue());
        assertNull(utxo.getStakeAddress());
        assertNull(utxo.getPaymentCred());
        assertNull(utxo.getEpochNo());
        assertNull(utxo.getBlockHeight());
        assertNull(utxo.getBlockTime());
        assertNull(utxo.getDatumHash());
        assertNull(utxo.getInlineDatum());
        assertNull(utxo.getReferenceScript());
        assertNull(utxo.getAssetList());
        assertNull(utxo.getIsSpent());
        
        // Test toString with null values
        String toString = utxo.toString();
        assertTrue(toString.contains("UTxO{"));
    }

    @Test
    void utxo_ZeroValues() {
        UTxO utxo = new UTxO();
        
        utxo.setTxIndex(0);
        utxo.setEpochNo(0);
        utxo.setBlockHeight(0);
        utxo.setBlockTime(0);
        utxo.setIsSpent(false);
        
        assertEquals(Integer.valueOf(0), utxo.getTxIndex());
        assertEquals(Integer.valueOf(0), utxo.getEpochNo());
        assertEquals(Integer.valueOf(0), utxo.getBlockHeight());
        assertEquals(Integer.valueOf(0), utxo.getBlockTime());
        assertEquals(Boolean.FALSE, utxo.getIsSpent());
    }

    @Test
    void inlineDatum_DefaultConstructor() {
        InlineDatum inlineDatum = new InlineDatum();
        assertNotNull(inlineDatum);
    }

    @Test
    void referenceScript_DefaultConstructor() {
        ReferenceScript referenceScript = new ReferenceScript();
        assertNotNull(referenceScript);
    }

    @Test
    void txHash_DefaultConstructor() {
        TxHash txHash = new TxHash();
        assertNotNull(txHash);
    }

    @Test
    void asset_ZeroDecimals() {
        Asset asset = new Asset();
        asset.setDecimals(0);
        assertEquals(Integer.valueOf(0), asset.getDecimals());
    }

    @Test
    void asset_EmptyStrings() {
        Asset asset = new Asset();
        
        asset.setPolicyId("");
        asset.setAssetName("");
        asset.setFingerprint("");
        asset.setQuantity("");
        
        assertEquals("", asset.getPolicyId());
        assertEquals("", asset.getAssetName());
        assertEquals("", asset.getFingerprint());
        assertEquals("", asset.getQuantity());
    }

    @Test
    void utxo_EmptyStrings() {
        UTxO utxo = new UTxO();
        
        utxo.setTxHash("");
        utxo.setAddress("");
        utxo.setValue("");
        utxo.setStakeAddress("");
        utxo.setPaymentCred("");
        utxo.setDatumHash("");
        
        assertEquals("", utxo.getTxHash());
        assertEquals("", utxo.getAddress());
        assertEquals("", utxo.getValue());
        assertEquals("", utxo.getStakeAddress());
        assertEquals("", utxo.getPaymentCred());
        assertEquals("", utxo.getDatumHash());
    }

    @Test
    void utxo_WithAssetList() {
        UTxO utxo = new UTxO();
        Asset asset1 = new Asset("policy1", "name1", "finger1", 6, "1000");
        Asset asset2 = new Asset("policy2", "name2", "finger2", 8, "2000");
        List<Asset> assets = Arrays.asList(asset1, asset2);
        
        utxo.setAssetList(assets);
        
        assertEquals(assets, utxo.getAssetList());
        assertEquals(2, utxo.getAssetList().size());
        assertEquals(asset1, utxo.getAssetList().get(0));
        assertEquals(asset2, utxo.getAssetList().get(1));
    }

    @Test
    void utxo_WithInlineDatumAndReferenceScript() {
        UTxO utxo = new UTxO();
        InlineDatum inlineDatum = new InlineDatum();
        ReferenceScript referenceScript = new ReferenceScript();
        
        utxo.setInlineDatum(inlineDatum);
        utxo.setReferenceScript(referenceScript);
        
        assertEquals(inlineDatum, utxo.getInlineDatum());
        assertEquals(referenceScript, utxo.getReferenceScript());
    }
}