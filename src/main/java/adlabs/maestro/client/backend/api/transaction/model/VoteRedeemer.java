package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a vote redeemer.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class VoteRedeemer {

  /**
   * The datum associated with the vote redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * The execution unit budget (memory, steps).
   */
  @NotNull
  @Valid
  private List<@Min(0L) Long> exUnits;

  /**
   * The index of the relevant vote in sorted votes.
   */
  @NotNull
  @Min(0)
  private Integer voteIndex;

  /**
   * Creates a no-argument constructor.
   */
  public VoteRedeemer() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param data The datum associated with the vote redeemer
   * @param exUnits The execution unit budget (memory, steps)
   * @param voteIndex The index of the relevant vote in sorted votes
   */
  public VoteRedeemer(Datum data, List<Long> exUnits, Integer voteIndex) {
    this.data = data;
    this.exUnits = exUnits;
    this.voteIndex = voteIndex;
  }

  /**
   * Gets the datum associated with the vote redeemer.
   *
   * @return the datum
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the datum associated with the vote redeemer.
   *
   * @param data the datum to set
   */
  public void setData(Datum data) {
    this.data = data;
  }

  /**
   * Gets the execution unit budget (memory, steps).
   *
   * @return the execution units
   */
  public List<Long> getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution unit budget (memory, steps).
   *
   * @param exUnits the execution units to set
   */
  public void setExUnits(List<Long> exUnits) {
    this.exUnits = exUnits;
  }

  /**
   * Gets the index of the relevant vote in sorted votes.
   *
   * @return the vote index
   */
  public Integer getVoteIndex() {
    return voteIndex;
  }

  /**
   * Sets the index of the relevant vote in sorted votes.
   *
   * @param voteIndex the vote index to set
   */
  public void setVoteIndex(Integer voteIndex) {
    this.voteIndex = voteIndex;
  }

  @Override
  public String toString() {
    return "VoteRedeemer{" +
        "data=" + data +
        ", exUnits=" + exUnits +
        ", voteIndex=" + voteIndex +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    VoteRedeemer that = (VoteRedeemer) o;
    return java.util.Objects.equals(data, that.data) &&
        java.util.Objects.equals(exUnits, that.exUnits) &&
        java.util.Objects.equals(voteIndex, that.voteIndex);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, exUnits, voteIndex);
  }
}
