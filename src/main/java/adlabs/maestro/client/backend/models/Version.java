package adlabs.maestro.client.backend.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotNull;

/**
 * Represents a version with major and minor components.
 * 
 * <p>This class provides the following constructors:
 * <ul>
 *   <li>No-argument constructor - Creates an instance with default values</li>
 *   <li>All-arguments constructor - Creates an instance with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Version {

  /**
   * The major version number.
   */
  @NotNull
  private Integer major;

  /**
   * The minor version number.
   */
  @NotNull
  private Integer minor;

  /**
   * Default no-argument constructor.
   */
  public Version() {
  }

  /**
   * Constructor with all fields.
   * 
   * @param major the major version number
   * @param minor the minor version number
   */
  public Version(Integer major, Integer minor) {
    this.major = major;
    this.minor = minor;
  }

  /**
   * Gets the major version number.
   * 
   * @return the major version number
   */
  public Integer getMajor() {
    return major;
  }

  /**
   * Sets the major version number.
   * 
   * @param major the major version number to set
   */
  public void setMajor(Integer major) {
    this.major = major;
  }

  /**
   * Gets the minor version number.
   * 
   * @return the minor version number
   */
  public Integer getMinor() {
    return minor;
  }

  /**
   * Sets the minor version number.
   * 
   * @param minor the minor version number to set
   */
  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  @Override
  public String toString() {
    return "Version{" +
            "major=" + major +
            ", minor=" + minor +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Version version = (Version) o;

    if (major != null ? !major.equals(version.major) : version.major != null) return false;
    return minor != null ? minor.equals(version.minor) : version.minor == null;
  }

  @Override
  public int hashCode() {
    int result = major != null ? major.hashCode() : 0;
    result = 31 * result + (minor != null ? minor.hashCode() : 0);
    return result;
  }
}
