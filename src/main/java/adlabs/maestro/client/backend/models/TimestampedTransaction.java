package adlabs.maestro.client.backend.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * Transaction hash with details of when that transaction appeared on-chain
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)public class TimestampedTransaction {

  private Long slot;

  private String timestamp;

  private String txHash;

}

