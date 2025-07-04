package adlabs.maestro.client.backend.api.epoch.model;

import adlabs.maestro.client.backend.models.LastUpdated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TimestampedCurrentEpochInfo {

  private CurrentEpochInfo data;

  private LastUpdated lastUpdated;

}