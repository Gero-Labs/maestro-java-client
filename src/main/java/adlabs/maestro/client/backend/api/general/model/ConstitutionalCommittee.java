package adlabs.maestro.client.backend.api.general.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Represents a Constitutional Committee with a default value and a state of no confidence.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ConstitutionalCommittee {

  /**
   * Default value.
   */
  @NotNull
  private String _default;

  /**
   * State of no confidence.
   */
  @NotNull
  private String stateOfNoConfidence;

  /**
   * Creates a new instance of ConstitutionalCommittee.
   */
  public ConstitutionalCommittee() {
  }

  /**
   * Creates a new instance of ConstitutionalCommittee with all fields.
   *
   * @param _default the default value
   * @param stateOfNoConfidence the state of no confidence
   */
  public ConstitutionalCommittee(String _default, String stateOfNoConfidence) {
    this._default = _default;
    this.stateOfNoConfidence = stateOfNoConfidence;
  }

  /**
   * Gets the default value.
   *
   * @return the default value
   */
  public String get_default() {
    return _default;
  }

  /**
   * Sets the default value.
   *
   * @param _default the default value
   */
  public void set_default(String _default) {
    this._default = _default;
  }

  /**
   * Gets the state of no confidence.
   *
   * @return the state of no confidence
   */
  public String getStateOfNoConfidence() {
    return stateOfNoConfidence;
  }

  /**
   * Sets the state of no confidence.
   *
   * @param stateOfNoConfidence the state of no confidence
   */
  public void setStateOfNoConfidence(String stateOfNoConfidence) {
    this.stateOfNoConfidence = stateOfNoConfidence;
  }

  /**
   * Returns a string representation of this ConstitutionalCommittee object.
   *
   * @return a string representation of this ConstitutionalCommittee object
   */
  @Override
  public String toString() {
    return "ConstitutionalCommittee{" +
           "_default='" + _default + '\'' +
           ", stateOfNoConfidence='" + stateOfNoConfidence + '\'' +
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
    ConstitutionalCommittee that = (ConstitutionalCommittee) o;
    return Objects.equals(_default, that._default) &&
           Objects.equals(stateOfNoConfidence, that.stateOfNoConfidence);
  }

  /**
   * Returns a hash code value for the object.
   *
   * @return a hash code value for this object
   */
  @Override
  public int hashCode() {
    return Objects.hash(_default, stateOfNoConfidence);
  }
}
