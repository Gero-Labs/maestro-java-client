package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Represents a DRep.
 * 
 * <p>This class uses Lombok annotations to generate constructors:
 * <ul>
 *   <li>{@code @NoArgsConstructor} - Creates a no-argument constructor</li>
 *   <li>{@code @AllArgsConstructor} - Creates a constructor with all fields as parameters</li>
 * </ul>
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DRep {

  /**
   * No-argument constructor.
   */
  public DRep() {
  }

  /**
   * All-argument constructor.
   *
   * @param credential the DRep credential
   * @param kind the kind of DRep
   */
  public DRep(DRepCredential credential, DRepKind kind) {
    this.credential = credential;
    this.kind = kind;
  }

  /**
   * DRep credential.
   */
  @Valid
  private DRepCredential credential;

  /**
   * Kind of DRep.
   */
  @NotNull
  @Valid
  private DRepKind kind;

  /**
   * Gets the DRep credential.
   *
   * @return the DRep credential
   */
  public DRepCredential getCredential() {
    return credential;
  }

  /**
   * Sets the DRep credential.
   *
   * @param credential the DRep credential to set
   */
  public void setCredential(DRepCredential credential) {
    this.credential = credential;
  }

  /**
   * Gets the kind of DRep.
   *
   * @return the kind of DRep
   */
  public DRepKind getKind() {
    return kind;
  }

  /**
   * Sets the kind of DRep.
   *
   * @param kind the kind of DRep to set
   */
  public void setKind(DRepKind kind) {
    this.kind = kind;
  }

  @Override
  public String toString() {
    return "DRep{" +
        "credential=" + credential +
        ", kind=" + kind +
        '}';
  }
}
