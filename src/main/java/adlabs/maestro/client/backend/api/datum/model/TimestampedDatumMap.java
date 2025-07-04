package adlabs.maestro.client.backend.api.datum.model;

import java.util.HashMap;
import java.util.Map;

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
public class TimestampedDatumMap {

  private Map<String, Datum> data = new HashMap<>();

  private LastUpdated lastUpdated;

}