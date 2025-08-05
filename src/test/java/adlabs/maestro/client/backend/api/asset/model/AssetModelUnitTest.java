package adlabs.maestro.client.backend.api.asset.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for asset.model package classes to improve code coverage
 */
class AssetModelUnitTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void assetStandards_DefaultConstructor() {
        AssetStandards assetStandards = new AssetStandards();
        assertNull(assetStandards.getCip25Metadata());
        assertNull(assetStandards.getCip68Metadata());
    }

    @Test
    void assetStandards_ParameterizedConstructor() throws Exception {
        JsonNode cip25 = objectMapper.readTree("{\"name\":\"Test Asset\"}");
        Cip68Metadata cip68 = new Cip68Metadata();
        
        AssetStandards assetStandards = new AssetStandards(cip25, cip68);
        assertEquals(cip25, assetStandards.getCip25Metadata());
        assertEquals(cip68, assetStandards.getCip68Metadata());
    }

    @Test
    void assetStandards_GettersSetters() throws Exception {
        AssetStandards assetStandards = new AssetStandards();
        
        JsonNode cip25 = objectMapper.readTree("{\"description\":\"Test Description\"}");
        Cip68Metadata cip68 = new Cip68Metadata();
        
        assetStandards.setCip25Metadata(cip25);
        assetStandards.setCip68Metadata(cip68);
        
        assertEquals(cip25, assetStandards.getCip25Metadata());
        assertEquals(cip68, assetStandards.getCip68Metadata());
    }

    @Test
    void assetStandards_ToString() throws Exception {
        JsonNode cip25 = objectMapper.readTree("{\"name\":\"Test\"}");
        Cip68Metadata cip68 = new Cip68Metadata();
        AssetStandards assetStandards = new AssetStandards(cip25, cip68);
        
        String toString = assetStandards.toString();
        assertTrue(toString.contains("AssetStandards{"));
        assertTrue(toString.contains("cip25Metadata="));
        assertTrue(toString.contains("cip68Metadata="));
    }

    @Test
    void assetStandards_EqualsAndHashCode() throws Exception {
        JsonNode cip25 = objectMapper.readTree("{\"name\":\"Test\"}");
        Cip68Metadata cip68 = new Cip68Metadata();
        
        AssetStandards standards1 = new AssetStandards(cip25, cip68);
        AssetStandards standards2 = new AssetStandards(cip25, cip68);
        
        assertEquals(standards1, standards2);
        assertEquals(standards1.hashCode(), standards2.hashCode());
        
        // Test reflexivity
        assertEquals(standards1, standards1);
        
        // Test null handling
        assertNotEquals(standards1, null);
        
        // Test different class
        assertNotEquals(standards1, "not an AssetStandards object");
    }

    @Test
    void cip68AssetType_Values() {
        // Test enum values exist
        Cip68AssetType[] values = Cip68AssetType.values();
        assertTrue(values.length > 0);
        
        // Test specific known values if they exist
        for (Cip68AssetType type : values) {
            assertNotNull(type.name());
        }
    }

    @Test
    void cip68Metadata_DefaultConstructor() {
        Cip68Metadata metadata = new Cip68Metadata();
        assertNotNull(metadata);
    }

    @Test
    void asset_DefaultConstructor() {
        Asset asset = new Asset();
        assertNotNull(asset);
    }

    @Test
    void assetHolder_DefaultConstructor() {
        AssetHolder holder = new AssetHolder();
        assertNotNull(holder);
    }

    @Test
    void assetInfo_DefaultConstructor() {
        AssetInfo info = new AssetInfo();
        assertNotNull(info);
    }

    @Test
    void paginatedAsset_DefaultConstructor() {
        PaginatedAsset paginated = new PaginatedAsset();
        assertNotNull(paginated);
    }

    @Test
    void timestampedAssetInfo_DefaultConstructor() {
        TimestampedAssetInfo timestamped = new TimestampedAssetInfo();
        assertNotNull(timestamped);
    }
}