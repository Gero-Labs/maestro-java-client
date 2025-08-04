# Maestro Java Client

<p align="center">
  <img src="https://maestro.org/maestro-logo.png" width="200">
</p>

<p align="center">
  <a href="https://github.com/Gero-Labs/maestro-java-client/actions">
    <img src="https://github.com/Gero-Labs/maestro-java-client/workflows/Build/badge.svg" alt="Build Status">
  </a>
  <a href="https://central.sonatype.com/artifact/io.github.Gero-Labs/maestro-java-client">
    <img src="https://img.shields.io/maven-central/v/io.github.Gero-Labs/maestro-java-client" alt="Maven Central">
  </a>
  <a href="https://github.com/Gero-Labs/maestro-java-client/blob/main/LICENSE">
    <img src="https://img.shields.io/badge/license-MIT-blue.svg" alt="License">
  </a>
  <a href="https://codecov.io/gh/Gero-Labs/maestro-java-client">
    <img src="https://codecov.io/gh/Gero-Labs/maestro-java-client/branch/main/graph/badge.svg" alt="Code Coverage">
  </a>
  <a href="https://github.com/Gero-Labs/maestro-java-client/security/code-scanning">
    <img src="https://github.com/Gero-Labs/maestro-java-client/workflows/CodeQL/badge.svg" alt="CodeQL">
  </a>
</p>

## What is Maestro?

[Maestro](https://maestro.org) is a powerful blockchain indexer for the Cardano blockchain that provides a comprehensive REST API for accessing blockchain data. Maestro offers high-performance, reliable access to on-chain data with minimal latency.

## Overview

**Maestro Java Client** is a Java REST Client library that provides type-safe access to the Maestro blockchain indexer APIs for Cardano. This library allows developers to interact with Cardano blockchain data using well-structured Java objects and handles all the complexities of HTTP communication, serialization, and error handling.

## Features

- 🚀 **Type-safe API access** with strongly-typed models
- 📄 **Built-in pagination support** with flexible query options
- 🔧 **Comprehensive error handling** and retry mechanisms
- 🗜️ **GZIP compression support** for improved performance
- ⚙️ **Configurable timeouts** and retry policies
- 🌐 **Multi-network support** (Mainnet, Preprod, Preview)
- 📊 **Complete API coverage** for all Maestro endpoints
- 🛡️ **Bean validation** support
- 📝 **Extensive documentation** and examples

## Supported Services

<details>
<summary>Comprehensive list of supported Maestro APIs</summary>

| Service Category | Endpoints | Description |
|-----------------|-----------|-------------|
| **Accounts** | `/accounts/*` | Stake account information, rewards, history, delegations |
| **Addresses** | `/addresses/*` | Address details, UTXOs, transactions |
| **Assets** | `/assets/*` | Native assets, tokens, NFTs metadata |
| **Blocks** | `/blocks/*` | Block information, transactions |
| **Datum** | `/datum/*` | Script datum values |
| **DEX** | `/dex/*` | Decentralized exchange data |
| **Epochs** | `/epochs/*` | Epoch information, parameters |
| **General** | `/general/*` | Chain info, protocol parameters |
| **Pools** | `/pools/*` | Stake pool information, delegators |
| **Policies** | `/policies/*` | Minting policies, assets |
| **Scripts** | `/scripts/*` | Smart contract scripts |
| **Transactions** | `/transactions/*` | Transaction details, submission |

</details>

## Version Compatibility

| Library Version | Maestro API | Java Version | Status |
|----------------|-------------|--------------|---------|
| 1.0.0+ | v1 | 11+ | ✅ Active |

## Library Usage

### Add Dependency

<details>
<summary>Maven</summary>

```xml
<dependency>
    <groupId>io.github.Gero-Labs</groupId>
    <artifactId>maestro-java-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

</details>

<details>
<summary>Gradle</summary>

```gradle
implementation 'io.github.Gero-Labs:maestro-java-client:1.0.0'
```

</details>

### Initialize Maestro Service

<details>
<summary>Simple Initialization</summary>

```java
import adlabs.maestro.client.backend.factory.BackendFactory;
import adlabs.maestro.client.backend.factory.BackendService;

// Initialize for Mainnet
String apiKey = "your-maestro-api-key";
BackendService maestroService = BackendFactory.getMaestroMainnetService(apiKey);

// Initialize for Preprod
BackendService maestroPreprodService = BackendFactory.getMaestroPreprodService(apiKey);

// Initialize for Preview
BackendService maestroPreviewService = BackendFactory.getMaestroPreviewService(apiKey);
```

</details>

### Example Usage

<details>
<summary>Get Account Information</summary>

```java
import adlabs.maestro.client.backend.api.account.model.TimestampedAccountInfo;
import adlabs.maestro.client.backend.api.base.Result;
import adlabs.maestro.client.backend.factory.options.Options;

// Get account information
String stakeAddress = "stake1u9ylzsgxaa6xctf4juup682ar3juj85n8tx3hthnljg47zctvm3rc";
Result<TimestampedAccountInfo> result = maestroService.getAccountService()
    .getAccountInfo(stakeAddress, Options.EMPTY);

if (result.isSuccessful()) {
    TimestampedAccountInfo accountInfo = result.getValue();
    System.out.println("Total Balance: " + accountInfo.getData().getTotalBalance());
    System.out.println("Rewards: " + accountInfo.getData().getRewardsAvailable());
} else {
    System.err.println("Error: " + result.getResponse());
}
```

</details>

<details>
<summary>Query Assets with Pagination</summary>

```java
import adlabs.maestro.client.backend.api.asset.model.PaginatedAsset;
import adlabs.maestro.client.backend.factory.options.*;

// Query assets with pagination
Options options = Options.builder()
    .option(Count.of(100))
    .option(Order.desc())
    .build();

Result<PaginatedAsset> assets = maestroService.getAssetService()
    .getAssets(options);

if (assets.isSuccessful()) {
    PaginatedAsset paginatedAssets = assets.getValue();
    paginatedAssets.getData().forEach(asset -> {
        System.out.println("Asset: " + asset.getAssetName());
        System.out.println("Policy: " + asset.getPolicyId());
    });
    
    // Handle pagination
    String nextCursor = paginatedAssets.getNextCursor();
    if (nextCursor != null) {
        // Fetch next page
        Options nextPageOptions = Options.builder()
            .option(Count.of(100))
            .option(Cursor.of(nextCursor))
            .build();
    }
}
```

</details>

<details>
<summary>Submit Transaction</summary>

```java
import adlabs.maestro.client.backend.api.transaction.model.SubmitRequest;
import adlabs.maestro.client.backend.api.transaction.model.SubmitResponse;

// Submit a transaction
String txCbor = "84a40081..."; // Your transaction CBOR
SubmitRequest submitRequest = new SubmitRequest();
submitRequest.setCbor(txCbor);

Result<SubmitResponse> submitResult = maestroService.getTransactionService()
    .submitTransaction(submitRequest);

if (submitResult.isSuccessful()) {
    String txHash = submitResult.getValue().getTxHash();
    System.out.println("Transaction submitted: " + txHash);
}
```

</details>

### Advanced Query Example

<details>
<summary>Complex Filtering with Options</summary>

```java
import adlabs.maestro.client.backend.factory.options.filters.*;

// Build complex query with filters
Options complexOptions = Options.builder()
    .option(Count.of(50))
    .option(Order.asc())
    .option(new AssetNameFilter("MyNFT"))
    .option(new PolicyIdFilter("f0ff48bbb7bbe9d59a40f1ce90e9e9d0ff5002ec48f232b49ca0fb9a"))
    .build();

// Execute filtered query
Result<PaginatedAsset> filteredAssets = maestroService.getAssetService()
    .getAssets(complexOptions);
```

</details>

## Environment Variables

The library supports several environment variables for configuration:

| Variable | Description | Default |
|----------|-------------|---------|
| `MAESTRO_API_KEY` | Your Maestro API key | Required |
| `MAESTRO_READ_TIMEOUT_SEC` | Read timeout in seconds | 300 |
| `MAESTRO_CONNECT_TIMEOUT_SEC` | Connection timeout in seconds | 300 |
| `MAESTRO_RETRIES_COUNT` | Number of retries for failed requests | 5 |
| `MAESTRO_RETRY_SLEEP_TIME_SEC` | Sleep time between retries | 60 |
| `MAESTRO_GZIP_COMPRESSION` | Enable GZIP compression | true |
| `MAESTRO_JAVA_LIB_LOGGING` | Enable HTTP logging | false |

## Build Instructions

### Prerequisites
- Java 11 or higher
- Maven 3.6 or higher

### Building from Source

```bash
# Clone the repository
git clone https://github.com/Gero-Labs/maestro-java-client.git
cd maestro-java-client

# Build the project
mvn clean install

# Run tests
mvn test

# Generate Javadoc
mvn javadoc:javadoc
```

## Used By

The following projects use Maestro Java Client:

- Your project here! [Submit a PR](https://github.com/Gero-Labs/maestro-java-client/pulls) to add your project.

## Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

- 📚 [Documentation](https://docs.maestro.org)
- 💬 [Discord Community](https://discord.gg/maestro)
- 🐛 [Issue Tracker](https://github.com/Gero-Labs/maestro-java-client/issues)
- 📧 [Contact Support](mailto:support@maestro.org)

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/Gero-Labs">A.D. Labs</a>
</p>
