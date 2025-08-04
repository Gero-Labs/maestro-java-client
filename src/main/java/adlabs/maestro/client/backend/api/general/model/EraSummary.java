package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a summary of an era.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EraSummary {

  /**
   * End boundary of the era.
   */
  @Valid
  private Bound end;

  /**
   * Parameters of the era.
   */
  @NotNull
  @Valid
  private EraParameters parameters;

  /**
   * Start boundary of the era.
   */
  @NotNull
  @Valid
  private Bound start;

  /**
   * Creates a new instance of EraSummary.
   */
  public EraSummary() {
  }

  /**
   * Creates a new instance of EraSummary with all fields.
   *
   * @param end the end boundary of the era
   * @param parameters the parameters of the era
   * @param start the start boundary of the era
   */
  public EraSummary(Bound end, EraParameters parameters, Bound start) {
    this.end = end;
    this.parameters = parameters;
    this.start = start;
  }

  /**
   * Gets the end boundary of the era.
   *
   * @return the end boundary of the era
   */
  public Bound getEnd() {
    return end;
  }

  /**
   * Sets the end boundary of the era.
   *
   * @param end the end boundary of the era
   */
  public void setEnd(Bound end) {
    this.end = end;
  }

  /**
   * Gets the parameters of the era.
   *
   * @return the parameters of the era
   */
  public EraParameters getParameters() {
    return parameters;
  }

  /**
   * Sets the parameters of the era.
   *
   * @param parameters the parameters of the era
   */
  public void setParameters(EraParameters parameters) {
    this.parameters = parameters;
  }

  /**
   * Gets the start boundary of the era.
   *
   * @return the start boundary of the era
   */
  public Bound getStart() {
    return start;
  }

  /**
   * Sets the start boundary of the era.
   *
   * @param start the start boundary of the era
   */
  public void setStart(Bound start) {
    this.start = start;
  }

  /**
   * Returns a string representation of this EraSummary object.
   *
   * @return a string representation of this EraSummary object
   */
  @Override
  public String toString() {
    return "EraSummary{" +
           "end=" + end +
           ", parameters=" + parameters +
           ", start=" + start +
           '}';
  }

  /**
   * Indicates whether some other object is "equal to" this one.
   *
   * @param o the reference object with which to compare
   * @return true if this object is the same as the o argument; false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EraSummary that = (EraSummary) o;
    return Objects.equals(end, that.end) &&
           Objects.equals(parameters, that.parameters) &&
           Objects.equals(start, that.start);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(end, parameters, start);
  }
}
