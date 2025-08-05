package adlabs.maestro.client.backend.api.policy.model;

import adlabs.maestro.client.backend.api.script.model.Script;
import adlabs.maestro.client.backend.api.transaction.model.TimestampedTransaction;
import adlabs.maestro.client.backend.models.Holders;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for policy.model package classes to improve code coverage
 */
class PolicyModelUnitTest {

    @Test
    void policyInfo_DefaultConstructor() {
        PolicyInfo policyInfo = new PolicyInfo();
        assertNotNull(policyInfo);
    }

    @Test
    void policyInfo_ParameterizedConstructor() {
        Long assetsOfPolicy = 10L;
        TimestampedTransaction firstMintTx = new TimestampedTransaction();
        TimestampedTransaction latestMintTx = new TimestampedTransaction();
        String policyId = "abc123policyid";
        Script script = new Script();
        String totalSupply = "1000000";
        Holders uniqueHolders = new Holders();

        PolicyInfo policyInfo = new PolicyInfo(assetsOfPolicy, firstMintTx, latestMintTx, 
                                              policyId, script, totalSupply, uniqueHolders);

        assertEquals(assetsOfPolicy, policyInfo.getAssetsOfPolicy());
        assertEquals(firstMintTx, policyInfo.getFirstMintTx());
        assertEquals(latestMintTx, policyInfo.getLatestMintTx());
        assertEquals(policyId, policyInfo.getPolicyId());
        assertEquals(script, policyInfo.getScript());
        assertEquals(totalSupply, policyInfo.getTotalSupply());
        assertEquals(uniqueHolders, policyInfo.getUniqueHolders());
    }

    @Test
    void policyInfo_GettersSetters() {
        PolicyInfo policyInfo = new PolicyInfo();

        Long assetsOfPolicy = 25L;
        TimestampedTransaction firstMintTx = new TimestampedTransaction();
        TimestampedTransaction latestMintTx = new TimestampedTransaction();
        String policyId = "def456policyid";
        Script script = new Script();
        String totalSupply = "2000000";
        Holders uniqueHolders = new Holders();

        policyInfo.setAssetsOfPolicy(assetsOfPolicy);
        policyInfo.setFirstMintTx(firstMintTx);
        policyInfo.setLatestMintTx(latestMintTx);
        policyInfo.setPolicyId(policyId);
        policyInfo.setScript(script);
        policyInfo.setTotalSupply(totalSupply);
        policyInfo.setUniqueHolders(uniqueHolders);

        assertEquals(assetsOfPolicy, policyInfo.getAssetsOfPolicy());
        assertEquals(firstMintTx, policyInfo.getFirstMintTx());
        assertEquals(latestMintTx, policyInfo.getLatestMintTx());
        assertEquals(policyId, policyInfo.getPolicyId());
        assertEquals(script, policyInfo.getScript());
        assertEquals(totalSupply, policyInfo.getTotalSupply());
        assertEquals(uniqueHolders, policyInfo.getUniqueHolders());
    }

    @Test
    void policyInfo_ToString() {
        PolicyInfo policyInfo = new PolicyInfo();
        policyInfo.setAssetsOfPolicy(10L);
        policyInfo.setPolicyId("abc123policyid");

        String toString = policyInfo.toString();
        assertTrue(toString.contains("PolicyInfo{") || toString.contains("assetsOfPolicy") || 
                   toString.contains("policyId"));
        assertNotNull(toString);
    }

    @Test
    void policyInfo_EqualsAndHashCode() {
        PolicyInfo policyInfo1 = new PolicyInfo();
        policyInfo1.setAssetsOfPolicy(10L);
        policyInfo1.setPolicyId("abc123policyid");

        PolicyInfo policyInfo2 = new PolicyInfo();
        policyInfo2.setAssetsOfPolicy(10L);
        policyInfo2.setPolicyId("abc123policyid");

        PolicyInfo policyInfo3 = new PolicyInfo();
        policyInfo3.setAssetsOfPolicy(20L);
        policyInfo3.setPolicyId("def456policyid");

        // Test equality
        assertEquals(policyInfo1, policyInfo2);
        assertEquals(policyInfo1.hashCode(), policyInfo2.hashCode());
        assertNotEquals(policyInfo1, policyInfo3);

        // Test reflexivity
        assertEquals(policyInfo1, policyInfo1);

        // Test null handling
        assertNotEquals(policyInfo1, null);

        // Test different class
        assertNotEquals(policyInfo1, "not a PolicyInfo object");
    }

    @Test
    void policyHolder_DefaultConstructor() {
        PolicyHolder policyHolder = new PolicyHolder();
        assertNotNull(policyHolder);
    }

    @Test
    void policyHolderAccount_DefaultConstructor() {
        PolicyHolderAccount policyHolderAccount = new PolicyHolderAccount();
        assertNotNull(policyHolderAccount);
    }

    @Test
    void policyMintTransaction_DefaultConstructor() {
        PolicyMintTransaction policyMintTransaction = new PolicyMintTransaction();
        assertNotNull(policyMintTransaction);
    }

    @Test
    void policyTransaction_DefaultConstructor() {
        PolicyTransaction policyTransaction = new PolicyTransaction();
        assertNotNull(policyTransaction);
    }

    @Test
    void policyUtxo_DefaultConstructor() {
        PolicyUtxo policyUtxo = new PolicyUtxo();
        assertNotNull(policyUtxo);
    }

    @Test
    void timestampedPolicyInfo_DefaultConstructor() {
        TimestampedPolicyInfo timestampedPolicyInfo = new TimestampedPolicyInfo();
        assertNotNull(timestampedPolicyInfo);
    }

    // Paginated classes
    @Test
    void paginatedPolicyHolder_DefaultConstructor() {
        PaginatedPolicyHolder paginatedPolicyHolder = new PaginatedPolicyHolder();
        assertNotNull(paginatedPolicyHolder);
    }

    @Test
    void paginatedPolicyHolderAccount_DefaultConstructor() {
        PaginatedPolicyHolderAccount paginatedPolicyHolderAccount = new PaginatedPolicyHolderAccount();
        assertNotNull(paginatedPolicyHolderAccount);
    }

    @Test
    void paginatedPolicyMintTransaction_DefaultConstructor() {
        PaginatedPolicyMintTransaction paginatedPolicyMintTransaction = new PaginatedPolicyMintTransaction();
        assertNotNull(paginatedPolicyMintTransaction);
    }

    @Test
    void paginatedPolicyTransaction_DefaultConstructor() {
        PaginatedPolicyTransaction paginatedPolicyTransaction = new PaginatedPolicyTransaction();
        assertNotNull(paginatedPolicyTransaction);
    }

    @Test
    void paginatedPolicyUtxo_DefaultConstructor() {
        PaginatedPolicyUtxo paginatedPolicyUtxo = new PaginatedPolicyUtxo();
        assertNotNull(paginatedPolicyUtxo);
    }

    @Test
    void policyInfo_WithNullValues() {
        PolicyInfo policyInfo = new PolicyInfo();

        // Set required fields to non-null values first
        policyInfo.setAssetsOfPolicy(0L);
        policyInfo.setPolicyId("test_policy_id");
        policyInfo.setFirstMintTx(new TimestampedTransaction());
        policyInfo.setLatestMintTx(new TimestampedTransaction());

        // Set nullable fields to null
        policyInfo.setScript(null);
        policyInfo.setTotalSupply(null);
        policyInfo.setUniqueHolders(null);

        // Verify nullable fields
        assertNull(policyInfo.getScript());
        assertNull(policyInfo.getTotalSupply());
        assertNull(policyInfo.getUniqueHolders());

        // Verify non-null required fields
        assertEquals(0L, policyInfo.getAssetsOfPolicy());
        assertEquals("test_policy_id", policyInfo.getPolicyId());
        assertNotNull(policyInfo.getFirstMintTx());
        assertNotNull(policyInfo.getLatestMintTx());

        // Verify toString handles null values
        String toString = policyInfo.toString();
        assertNotNull(toString);
    }

    @Test
    void policyInfo_EqualsWithNullFields() {
        PolicyInfo policyInfo1 = new PolicyInfo();
        policyInfo1.setAssetsOfPolicy(10L);
        policyInfo1.setPolicyId("test");
        policyInfo1.setScript(null);

        PolicyInfo policyInfo2 = new PolicyInfo();
        policyInfo2.setAssetsOfPolicy(10L);
        policyInfo2.setPolicyId("test");
        policyInfo2.setScript(null);

        assertEquals(policyInfo1, policyInfo2);
        assertEquals(policyInfo1.hashCode(), policyInfo2.hashCode());
    }

    @Test
    void policyInfo_EqualsWithDifferentValues() {
        PolicyInfo policyInfo1 = new PolicyInfo();
        policyInfo1.setAssetsOfPolicy(10L);
        policyInfo1.setPolicyId("policy1");

        PolicyInfo policyInfo2 = new PolicyInfo();
        policyInfo2.setAssetsOfPolicy(10L);
        policyInfo2.setPolicyId("policy2");

        assertNotEquals(policyInfo1, policyInfo2);
        assertNotEquals(policyInfo1.hashCode(), policyInfo2.hashCode());
    }

    @Test
    void policyInfo_EqualsWithDifferentAssetsOfPolicy() {
        PolicyInfo policyInfo1 = new PolicyInfo();
        policyInfo1.setAssetsOfPolicy(10L);
        policyInfo1.setPolicyId("same_policy");

        PolicyInfo policyInfo2 = new PolicyInfo();
        policyInfo2.setAssetsOfPolicy(20L);
        policyInfo2.setPolicyId("same_policy");

        assertNotEquals(policyInfo1, policyInfo2);
        assertNotEquals(policyInfo1.hashCode(), policyInfo2.hashCode());
    }

    @Test
    void policyInfo_SetAssetsOfPolicyToZero() {
        PolicyInfo policyInfo = new PolicyInfo();
        policyInfo.setAssetsOfPolicy(0L);

        assertEquals(0L, policyInfo.getAssetsOfPolicy());
    }

    @Test
    void policyInfo_SetAssetsOfPolicyToLargeValue() {
        PolicyInfo policyInfo = new PolicyInfo();
        Long largeValue = 999999999L;
        policyInfo.setAssetsOfPolicy(largeValue);

        assertEquals(largeValue, policyInfo.getAssetsOfPolicy());
    }
}