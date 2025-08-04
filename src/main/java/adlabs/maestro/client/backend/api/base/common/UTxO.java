package adlabs.maestro.client.backend.api.base.common;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

/**
 * UTxO
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UTxO {

    /**
     * Hash identifier of the transaction
     */
    private String txHash;

    /**
     * Index of UTxO in the transaction
     */
    private Integer txIndex;

    /**
     * A Cardano payment/base address (bech32 encoded)
     */
    private String address;

    /**
     * Total sum of ADA on the UTxO
     */
    private String value;

    /**
     * Cardano staking address (reward account) in bech32 format
     */
    private String stakeAddress;

    /**
     * Payment credential
     */
    private String paymentCred;

    /**
     * Epoch number of the block
     */
    private Integer epochNo;

    /**
     * Block height
     */
    private Integer blockHeight;

    /**
     * UNIX timestamp of the block
     */
    private Integer blockTime;

    /**
     * The Hash of the Plutus Data
     */
    private String datumHash;

    /**
     * Allows datums to be attached to UTxO (CIP-32)
     */
    private InlineDatum inlineDatum;

    /**
     * Allow reference scripts to be used to satisfy script requirements during validation, rather than requiring the spending transaction to do so. (CIP-33)
     */
    private ReferenceScript referenceScript;

    /**
     * List of assets on the UTxO
     */
    private List<Asset> assetList;

    /**
     * True if the UTXO has been spent
     */
    private Boolean isSpent;

    /**
     * Default no-argument constructor.
     */
    public UTxO() {
    }

    /**
     * Constructor with all fields.
     * 
     * @param txHash the hash identifier of the transaction
     * @param txIndex the index of UTxO in the transaction
     * @param address the Cardano payment/base address (bech32 encoded)
     * @param value the total sum of ADA on the UTxO
     * @param stakeAddress the Cardano staking address (reward account) in bech32 format
     * @param paymentCred the payment credential
     * @param epochNo the epoch number of the block
     * @param blockHeight the block height
     * @param blockTime the UNIX timestamp of the block
     * @param datumHash the hash of the Plutus Data
     * @param inlineDatum allows datums to be attached to UTxO (CIP-32)
     * @param referenceScript allow reference scripts to be used to satisfy script requirements during validation (CIP-33)
     * @param assetList the list of assets on the UTxO
     * @param isSpent true if the UTXO has been spent
     */
    public UTxO(String txHash, Integer txIndex, String address, String value, String stakeAddress, 
                String paymentCred, Integer epochNo, Integer blockHeight, Integer blockTime, 
                String datumHash, InlineDatum inlineDatum, ReferenceScript referenceScript, 
                List<Asset> assetList, Boolean isSpent) {
        this.txHash = txHash;
        this.txIndex = txIndex;
        this.address = address;
        this.value = value;
        this.stakeAddress = stakeAddress;
        this.paymentCred = paymentCred;
        this.epochNo = epochNo;
        this.blockHeight = blockHeight;
        this.blockTime = blockTime;
        this.datumHash = datumHash;
        this.inlineDatum = inlineDatum;
        this.referenceScript = referenceScript;
        this.assetList = assetList;
        this.isSpent = isSpent;
    }

    /**
     * Gets the hash identifier of the transaction.
     * 
     * @return the hash identifier of the transaction
     */
    public String getTxHash() {
        return txHash;
    }

    /**
     * Sets the hash identifier of the transaction.
     * 
     * @param txHash the hash identifier of the transaction to set
     */
    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    /**
     * Gets the index of UTxO in the transaction.
     * 
     * @return the index of UTxO in the transaction
     */
    public Integer getTxIndex() {
        return txIndex;
    }

    /**
     * Sets the index of UTxO in the transaction.
     * 
     * @param txIndex the index of UTxO in the transaction to set
     */
    public void setTxIndex(Integer txIndex) {
        this.txIndex = txIndex;
    }

    /**
     * Gets the Cardano payment/base address (bech32 encoded).
     * 
     * @return the Cardano payment/base address (bech32 encoded)
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the Cardano payment/base address (bech32 encoded).
     * 
     * @param address the Cardano payment/base address (bech32 encoded) to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the total sum of ADA on the UTxO.
     * 
     * @return the total sum of ADA on the UTxO
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the total sum of ADA on the UTxO.
     * 
     * @param value the total sum of ADA on the UTxO to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the Cardano staking address (reward account) in bech32 format.
     * 
     * @return the Cardano staking address (reward account) in bech32 format
     */
    public String getStakeAddress() {
        return stakeAddress;
    }

    /**
     * Sets the Cardano staking address (reward account) in bech32 format.
     * 
     * @param stakeAddress the Cardano staking address (reward account) in bech32 format to set
     */
    public void setStakeAddress(String stakeAddress) {
        this.stakeAddress = stakeAddress;
    }

    /**
     * Gets the payment credential.
     * 
     * @return the payment credential
     */
    public String getPaymentCred() {
        return paymentCred;
    }

    /**
     * Sets the payment credential.
     * 
     * @param paymentCred the payment credential to set
     */
    public void setPaymentCred(String paymentCred) {
        this.paymentCred = paymentCred;
    }

    /**
     * Gets the epoch number of the block.
     * 
     * @return the epoch number of the block
     */
    public Integer getEpochNo() {
        return epochNo;
    }

    /**
     * Sets the epoch number of the block.
     * 
     * @param epochNo the epoch number of the block to set
     */
    public void setEpochNo(Integer epochNo) {
        this.epochNo = epochNo;
    }

    /**
     * Gets the block height.
     * 
     * @return the block height
     */
    public Integer getBlockHeight() {
        return blockHeight;
    }

    /**
     * Sets the block height.
     * 
     * @param blockHeight the block height to set
     */
    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    /**
     * Gets the UNIX timestamp of the block.
     * 
     * @return the UNIX timestamp of the block
     */
    public Integer getBlockTime() {
        return blockTime;
    }

    /**
     * Sets the UNIX timestamp of the block.
     * 
     * @param blockTime the UNIX timestamp of the block to set
     */
    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    /**
     * Gets the hash of the Plutus Data.
     * 
     * @return the hash of the Plutus Data
     */
    public String getDatumHash() {
        return datumHash;
    }

    /**
     * Sets the hash of the Plutus Data.
     * 
     * @param datumHash the hash of the Plutus Data to set
     */
    public void setDatumHash(String datumHash) {
        this.datumHash = datumHash;
    }

    /**
     * Gets the inline datum that allows datums to be attached to UTxO (CIP-32).
     * 
     * @return the inline datum
     */
    public InlineDatum getInlineDatum() {
        return inlineDatum;
    }

    /**
     * Sets the inline datum that allows datums to be attached to UTxO (CIP-32).
     * 
     * @param inlineDatum the inline datum to set
     */
    public void setInlineDatum(InlineDatum inlineDatum) {
        this.inlineDatum = inlineDatum;
    }

    /**
     * Gets the reference script that allows reference scripts to be used to satisfy script requirements during validation (CIP-33).
     * 
     * @return the reference script
     */
    public ReferenceScript getReferenceScript() {
        return referenceScript;
    }

    /**
     * Sets the reference script that allows reference scripts to be used to satisfy script requirements during validation (CIP-33).
     * 
     * @param referenceScript the reference script to set
     */
    public void setReferenceScript(ReferenceScript referenceScript) {
        this.referenceScript = referenceScript;
    }

    /**
     * Gets the list of assets on the UTxO.
     * 
     * @return the list of assets on the UTxO
     */
    public List<Asset> getAssetList() {
        return assetList;
    }

    /**
     * Sets the list of assets on the UTxO.
     * 
     * @param assetList the list of assets on the UTxO to set
     */
    public void setAssetList(List<Asset> assetList) {
        this.assetList = assetList;
    }

    /**
     * Gets whether the UTXO has been spent.
     * 
     * @return true if the UTXO has been spent, false otherwise
     */
    public Boolean getIsSpent() {
        return isSpent;
    }

    /**
     * Sets whether the UTXO has been spent.
     * 
     * @param isSpent true if the UTXO has been spent, false otherwise
     */
    public void setIsSpent(Boolean isSpent) {
        this.isSpent = isSpent;
    }

    @Override
    public String toString() {
        return "UTxO{" +
                "txHash='" + txHash + '\'' +
                ", txIndex=" + txIndex +
                ", address='" + address + '\'' +
                ", value='" + value + '\'' +
                ", stakeAddress='" + stakeAddress + '\'' +
                ", paymentCred='" + paymentCred + '\'' +
                ", epochNo=" + epochNo +
                ", blockHeight=" + blockHeight +
                ", blockTime=" + blockTime +
                ", datumHash='" + datumHash + '\'' +
                ", inlineDatum=" + inlineDatum +
                ", referenceScript=" + referenceScript +
                ", assetList=" + assetList +
                ", isSpent=" + isSpent +
                '}';
    }
}
