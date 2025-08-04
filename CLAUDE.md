# Maestro Java Client - Development Guide

## Project Overview

The **Maestro Java Client** is a comprehensive Java REST client library that provides type-safe access to the Maestro blockchain indexer APIs for Cardano. This library allows developers to interact with Cardano blockchain data using well-structured Java objects and handles all the complexities of HTTP communication, serialization, and error handling.

### Purpose
- Provides Java developers with easy access to Cardano blockchain data
- Abstracts away HTTP communication details and JSON serialization/deserialization
- Offers a comprehensive set of APIs covering accounts, addresses, assets, blocks, transactions, pools, policies, scripts, and general blockchain information
- Supports multiple Cardano networks (Mainnet, Preprod, Preview)

### Key Features
- Type-safe API access with strongly-typed models
- Built-in pagination support with flexible query options
- Comprehensive error handling and retry mechanisms
- GZIP compression support
- Configurable timeouts and retry policies
- Environment-based configuration

## Architecture & Structure

### Package Organization
```
src/main/java/adlabs/maestro/client/
├── backend/
│   ├── api/                    # Service interfaces and implementations
│   │   ├── account/           # Account-related operations
│   │   ├── address/           # Address-related operations
│   │   ├── asset/             # Asset-related operations
│   │   ├── base/              # Base classes and utilities
│   │   ├── block/             # Block-related operations
│   │   ├── datum/             # Datum-related operations
│   │   ├── epoch/             # Epoch-related operations
│   │   ├── general/           # General blockchain information
│   │   ├── policy/            # Policy-related operations
│   │   ├── pool/              # Pool-related operations
│   │   ├── script/            # Script-related operations
│   │   └── transaction/       # Transaction-related operations
│   ├── factory/               # Factory classes and service creation
│   │   ├── impl/              # Factory implementations
│   │   └── options/           # Query options and filters
│   └── models/                # Shared model classes
└── utils/                     # Utility classes
```

### Design Patterns

#### 1. Factory Pattern
- **BackendFactory**: Provides static factory methods to create service instances for different networks
- **BackendService**: Central interface providing access to all service implementations
- Supports Mainnet, Preprod, and Preview networks

#### 2. Service Layer Pattern
- Each API domain has a service interface and implementation
- Services extend `BaseService` for common functionality
- Clean separation between API definitions and implementations

#### 3. Builder Pattern
- **Options.OptionsBuilder**: For constructing complex query parameters
- **Result**: Uses Lombok @Builder for creating API response wrappers

#### 4. Template Method Pattern
- **BaseService**: Provides common HTTP handling, retry logic, and validation
- Service implementations extend BaseService and implement domain-specific logic

## Key Components

### Core Classes

#### BackendFactory
Entry point for creating service instances:
```java
// Get Mainnet service
BackendService mainnetService = BackendFactory.getMaestroMainnetService(apiToken);

// Get Preprod service  
BackendService preprodService = BackendFactory.getMaestroPreprodService(apiToken);

// Get Preview service
BackendService previewService = BackendFactory.getMaestroPreviewService(apiToken);
```

#### BaseService
Base class providing:
- HTTP client configuration with Retrofit
- Retry logic with configurable count and timeouts
- GZIP compression support
- Environment-based configuration
- Input validation (Bech32, hex format, epoch validation)
- Response processing and error handling

#### Result<T>
Standard response wrapper containing:
- `successful`: Boolean indicating operation success
- `response`: Raw HTTP response text
- `code`: HTTP status code
- `value`: Typed response data

### Service Interfaces

Each service follows a consistent pattern:
- Interface defining operations (`AccountService`, `AssetService`, etc.)
- Implementation extending `BaseService` (`AccountServiceImpl`, `AssetServiceImpl`, etc.)
- Retrofit API interface for HTTP operations (`AccountApi`, `AssetApi`, etc.)

### Model Classes

#### Naming Conventions
- **Paginated\***: Models for paginated responses (e.g., `PaginatedAsset`)
- **Timestamped\***: Models with blockchain timestamp information
- Base models use descriptive names reflecting their blockchain purpose

#### Lombok Usage
Models extensively use Lombok annotations:
- `@Getter/@Setter`: Generate accessor methods
- `@ToString`: Generate toString() methods
- `@NoArgsConstructor`: Generate default constructor
- `@Builder`: Generate builder pattern (for complex objects)
- `@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)`: Handle API snake_case conversion

#### Common Model Patterns
- **BaseModel**: Common blockchain fields (blockHash, blockSlot, timestamp)
- Enum classes for type safety (e.g., `AccountAction`, `LedgerEra`, `ScriptType`)
- Rich model hierarchies reflecting Cardano's complex data structures

### Query Options System

#### Options Class
Flexible parameter system for API queries:
```java
Options options = Options.builder()
    .option(Count.of(50))
    .option(Order.asc())
    .option(Cursor.of("cursor_value"))
    .build();
```

#### Available Options
- **Count**: Limit number of results
- **Cursor**: Pagination cursor
- **Limit/Offset**: Traditional pagination
- **Order**: Sort order (asc/desc)
- **Filters**: Complex filtering with logical operators

## Build & Dependencies

### Maven Configuration
- **Java Version**: 11
- **Build Tool**: Maven 3.x
- **Main Dependencies**:
  - Retrofit 2.11.0 (HTTP client)
  - Jackson 2.18.2 (JSON processing)
  - OkHttp 4.12.0 (HTTP logging)
  - Lombok 1.18.36 (code generation)
  - BouncyCastle 1.80 (cryptographic operations)
  - SLF4J 2.0.16 (logging)
  - JUnit 5.11.3 (testing)

### Key Plugins
- **maven-compiler-plugin**: Java 11 compilation
- **maven-surefire-plugin**: Unit test execution
- **maven-failsafe-plugin**: Integration test execution
- **jacoco-maven-plugin**: Code coverage reporting
- **maven-javadoc-plugin**: API documentation generation
- **nexus-staging-maven-plugin**: Maven Central deployment

### Build Commands
```bash
# Compile project
mvn compile

# Run tests
mvn test

# Run integration tests  
mvn failsafe:integration-test

# Generate Javadoc
mvn javadoc:javadoc

# Package for distribution
mvn package

# Generate code coverage report
mvn jacoco:report
```

## Code Conventions

### Coding Standards
1. **Package Naming**: Follows reverse domain convention (`adlabs.maestro.client.*`)
2. **Class Naming**: 
   - Services: `*Service` interface, `*ServiceImpl` implementation
   - APIs: `*Api` for Retrofit interfaces
   - Models: Descriptive domain names
3. **Method Naming**: camelCase, descriptive verb-noun patterns
4. **Constants**: UPPER_SNAKE_CASE
5. **Field Naming**: camelCase for Java, snake_case for JSON mapping

### Lombok Usage Patterns
```java
// Standard model class
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AccountInfo {
    private String stakeAddress;
    private Boolean registered;
    // ... other fields
}

// Builder pattern for complex objects
@Getter
@Builder
@ToString
public class Result<T> {
    boolean successful;
    String response;
    int code;
    T value;
}
```

### JSON Mapping
- All model classes use `@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)`
- This automatically converts between Java camelCase and API snake_case
- Jackson handles all serialization/deserialization

## API Documentation

### Javadoc Standards
- All public classes and methods must have Javadoc comments
- Include `@param` tags for all parameters
- Include `@return` tags for return values
- Include `@throws` tags for checked exceptions
- Use `{@link}` tags to reference related classes/methods

### Javadoc Examples
```java
import adlabs.maestro.client.backend.api.base.exception.ApiException;

/**
 * Get Stake Account Information
 * Returns various information regarding a stake account
 *
 * @param stakeAddr Bech32 encoded reward/stake address ('stake1...')
 * @param options   Query Options
 * @return Information about the account
 * @throws ApiException if an error occurs while attempting to invoke the API
 */
Result<TimestampedAccountInfo> getAccountInfo(String stakeAddr, Options options) throws ApiException;
```

### Lombok Documentation
Model classes include Lombok constructor documentation:
```java
/**
 * Summary of information regarding a stake account
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 * </ul>
 */
```

## Testing

### Test Structure
```
src/test/java/adlabs/maestro/client/
├── backend/
│   ├── api/
│   │   ├── account/AccountServicePreprodIntegrationTest.java
│   │   ├── address/AddressServicePreprodIntegrationTest.java
│   │   └── ... (other service integration tests)
│   └── factory/
│       └── options/OptionsPreviewTest.java
└── utils/
    └── Bech32PreviewUtilTest.java
```

### Test Categories
1. **Integration Tests**: End-to-end tests against Preprod network
2. **Unit Tests**: Isolated component testing
3. **Utility Tests**: Testing utility classes like Bech32Util

### Integration Test Pattern
```java
@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountServicePreprodIntegrationTest {
    
    private AccountService accountService;
    
    @BeforeAll
    public void setup() {
        String apiKey = System.getenv("MAESTRO_API_KEY");
        if (apiKey == null || apiKey.trim().isEmpty()) {
            throw new IllegalStateException("MAESTRO_API_KEY environment variable is not set");
        }
        accountService = BackendFactory.getMaestroPreprodService(apiKey).getAccountService();
    }
    
    @Test
    void getAccountInformationTest() throws ApiException {
        String address = "stake_test1uzcmuv8c6pj3ld9mrvml3jhxl7j4hvh4xskr6ce37dvpfdqjmdvh8";
        Result<TimestampedAccountInfo> result = accountService.getAccountInfo(address, Options.EMPTY);
        
        Assertions.assertTrue(result.isSuccessful());
        Assertions.assertNotNull(result.getValue());
        log.info(result.getValue().toString());
    }
}
```

### Test Environment Setup
- Requires `MAESTRO_API_KEY` environment variable
- Uses Preprod network for integration tests
- Tests both successful and error scenarios

## Development Guidelines

### Adding New Services

1. **Create Service Interface**:
```java
public interface NewService {
    Result<ResponseType> newOperation(String param, Options options) throws ApiException;
}
```

2. **Create Retrofit API Interface**:
```java
public interface NewApi {
    @GET("new-endpoint/{param}")
    Call<ResponseType> newOperation(@Path("param") String param, @QueryMap Map<String, String> paramsMap);
}
```

3. **Create Service Implementation**:
```java
public class NewServiceImpl extends BaseService implements NewService {
    private final NewApi newApi;
    
    public NewServiceImpl(String baseUrl, String apiToken) {
        super(baseUrl, apiToken);
        newApi = getRetrofit().create(NewApi.class);
    }
    
    @Override
    public Result<ResponseType> newOperation(String param, Options options) throws ApiException {
        // Add validation if needed
        validateBech32(param);
        
        Call<ResponseType> call = newApi.newOperation(param, optionsToParamMap(options));
        return processResponse(call);
    }
}
```

4. **Update BackendService Interface**:
```java
public interface BackendService {
    // ... existing methods
    NewService getNewService();
}
```

5. **Update BackendServiceImpl**:
```java
@Override
public NewService getNewService() {
    return new NewServiceImpl(getBaseUrl(), getApiToken());
}
```

### Adding New Models

1. **Follow Lombok Patterns**:
```java
@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class NewModel {
    private String field1;
    private Integer field2;
    private Boolean field3;
}
```

2. **For Complex Objects, Use Builder**:
```java
@Getter
@Builder
@ToString
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ComplexModel {
    private String field1;
    private List<String> field2;
    private NestedModel field3;
}
```

3. **Add Proper Documentation**:
```java
/**
 * Description of the model and its purpose
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @Builder} - Creates a builder pattern (if applicable)</li>
 * </ul>
 */
```

### Environment Configuration

The library supports several environment variables for configuration:

```bash
# API Configuration
MAESTRO_API_KEY=your_api_key_here

# Timeout Configuration
MAESTRO_READ_TIMEOUT_SEC=300
MAESTRO_CONNECT_TIMEOUT_SEC=300

# Retry Configuration  
MAESTRO_RETRIES_COUNT=5
MAESTRO_RETRY_ON_TIMEOUT=true
MAESTRO_RETRY_SLEEP_TIME_SEC=60

# Compression and Logging
MAESTRO_GZIP_COMPRESSION=true
MAESTRO_JAVA_LIB_LOGGING=false
```

## Common Tasks

### 1. Creating a Client Instance
```java
// For production (Mainnet)
String apiKey = "your_maestro_api_key";
BackendService service = BackendFactory.getMaestroMainnetService(apiKey);

// For testing (Preprod)
BackendService service = BackendFactory.getMaestroPreprodService(apiKey);
```

### 2. Making API Calls
```java
// Simple call without options
Result<TimestampedAccountInfo> result = service.getAccountService()
    .getAccountInfo("stake1...", Options.EMPTY);

// Call with pagination options
Options options = Options.builder()
    .option(Count.of(100))
    .option(Order.desc())
    .build();
    
Result<PaginatedAsset> assets = service.getAssetService()
    .getAssets(options);
```

### 3. Handling Results
```java
Result<TimestampedAccountInfo> result = service.getAccountService()
    .getAccountInfo("stake1...", Options.EMPTY);

if (result.isSuccessful()) {
    TimestampedAccountInfo accountInfo = result.getValue();
    // Process successful response
    System.out.println("Account balance: " + accountInfo.getData().getTotalBalance());
} else {
    // Handle error
    System.err.println("Error: " + result.getResponse());
    System.err.println("Status code: " + result.getCode());
}
```

### 4. Working with Pagination
```java
// Using cursor-based pagination
String cursor = null;
List<Asset> allAssets = new ArrayList<>();

do {
    Options.OptionsBuilder builder = Options.builder()
        .option(Count.of(100));
    
    if (cursor != null) {
        builder.option(Cursor.of(cursor));
    }
    
    Result<PaginatedAsset> result = service.getAssetService().getAssets(builder.build());
    
    if (result.isSuccessful()) {
        PaginatedAsset page = result.getValue();
        allAssets.addAll(page.getData());
        cursor = page.getNextCursor();
    } else {
        break;
    }
} while (cursor != null);
```

### 5. Error Handling Best Practices
```java
try {
    Result<TimestampedAccountInfo> result = service.getAccountService()
        .getAccountInfo("stake1...", Options.EMPTY);
        
    if (result.isSuccessful()) {
        // Process successful response
    } else {
        // Handle API error responses
        switch (result.getCode()) {
            case 400:
                // Bad request - check input parameters
                break;
            case 404:
                // Not found - resource doesn't exist
                break;
            case 429:
                // Rate limited - automatically retried by BaseService
                break;
            default:
                // Other HTTP errors
                break;
        }
    }
} catch (ApiException e) {
    // Handle network errors, timeouts, etc.
    log.error("API call failed", e);
}
```

## Project Context

### Maestro API Integration
This client library is designed to work with the Maestro blockchain indexer API, which provides comprehensive access to Cardano blockchain data. The Maestro API offers:

- Real-time and historical blockchain data
- High-performance indexing with sub-second latency
- Comprehensive coverage of all Cardano features
- RESTful API design with consistent patterns

### Cardano Blockchain Support
The library provides full support for Cardano-specific concepts:

- **Stake Pools**: Pool information, delegation, rewards
- **Native Assets**: Multi-asset support, minting policies
- **Smart Contracts**: Plutus scripts, datums, redeemers
- **Governance**: Voting, proposals, DRep functionality
- **Staking**: Delegation, rewards, stake distribution

### Network Support
- **Mainnet**: Production Cardano network
- **Preprod**: Pre-production testing network
- **Preview**: Development and testing network

This comprehensive Java client makes it easy for developers to build Cardano applications with reliable, type-safe access to blockchain data through the Maestro indexer platform.
