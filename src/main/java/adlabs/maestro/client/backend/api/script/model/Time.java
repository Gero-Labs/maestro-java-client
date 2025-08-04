package adlabs.maestro.client.backend.api.script.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.*;
import java.util.Objects;

/**
 * Time
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Time {

  @NotNull
  private Long seconds;

  /**
   * Default constructor.
   */
  public Time() {
  }

  /**
   * Constructor with all fields.
   *
   * @param seconds the seconds value
   */
  public Time(Long seconds) {
    this.seconds = seconds;
  }

  /**
   * Gets the seconds value.
   *
   * @return the seconds value
   */
  public Long getSeconds() {
    return seconds;
  }

  /**
   * Sets the seconds value.
   *
   * @param seconds the seconds value to set
   */
  public void setSeconds(Long seconds) {
    this.seconds = seconds;
  }

  @Override
  public String toString() {
    return "Time{" +
        "seconds=" + seconds +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Time time = (Time) o;
    return Objects.equals(seconds, time.seconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seconds);
  }
}