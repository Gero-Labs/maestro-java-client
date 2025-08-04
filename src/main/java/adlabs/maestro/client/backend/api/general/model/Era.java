package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents an era with start, end, and parameters.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Era {

  /**
   * End details of the era.
   */
  @NotNull
  @Valid
  private End end;

  /**
   * Parameters of the era.
   */
  @NotNull
  @Valid
  private Parameters parameters;

  /**
   * Start details of the era.
   */
  @NotNull
  @Valid
  private Start start;

  /**
   * Creates a new instance of Era.
   */
  public Era() {
  }

  /**
   * Creates a new instance of Era with all fields.
   *
   * @param end the end details of the era
   * @param parameters the parameters of the era
   * @param start the start details of the era
   */
  public Era(End end, Parameters parameters, Start start) {
    this.end = end;
    this.parameters = parameters;
    this.start = start;
  }

  /**
   * Gets the end details of the era.
   *
   * @return the end details of the era
   */
  public End getEnd() {
    return end;
  }

  /**
   * Sets the end details of the era.
   *
   * @param end the end details of the era
   */
  public void setEnd(End end) {
    this.end = end;
  }

  /**
   * Gets the parameters of the era.
   *
   * @return the parameters of the era
   */
  public Parameters getParameters() {
    return parameters;
  }

  /**
   * Sets the parameters of the era.
   *
   * @param parameters the parameters of the era
   */
  public void setParameters(Parameters parameters) {
    this.parameters = parameters;
  }

  /**
   * Gets the start details of the era.
   *
   * @return the start details of the era
   */
  public Start getStart() {
    return start;
  }

  /**
   * Sets the start details of the era.
   *
   * @param start the start details of the era
   */
  public void setStart(Start start) {
    this.start = start;
  }

  /**
   * Returns a string representation of this Era object.
   *
   * @return a string representation of this Era object
   */
  @Override
  public String toString() {
    return "Era{" +
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
    Era era = (Era) o;
    return Objects.equals(end, era.end) &&
           Objects.equals(parameters, era.parameters) &&
           Objects.equals(start, era.start);
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
