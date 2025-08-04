package adlabs.maestro.client.backend.api.transaction.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import adlabs.maestro.client.backend.api.datum.model.Datum;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Represents a redeemer for a proposal.
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProposalRedeemer {

  /**
   * Datum for the redeemer.
   */
  @NotNull
  @Valid
  private Datum data;

  /**
   * Execution units for the redeemer.
   */
  @NotNull
  private List<@Min(0L)Long> exUnits;

  /**
   * Index of the relevant proposal.
   */
  @NotNull
  @Min(0)
  private Integer proposalIndex;

  /**
   * Creates a no-argument constructor.
   */
  public ProposalRedeemer() {
  }

  /**
   * Creates a constructor with all fields as parameters.
   *
   * @param data Datum for the redeemer
   * @param exUnits Execution units for the redeemer
   * @param proposalIndex Index of the relevant proposal
   */
  public ProposalRedeemer(Datum data, List<Long> exUnits, Integer proposalIndex) {
    this.data = data;
    this.exUnits = exUnits;
    this.proposalIndex = proposalIndex;
  }

  /**
   * Gets the datum for the redeemer.
   *
   * @return the datum
   */
  public Datum getData() {
    return data;
  }

  /**
   * Sets the datum for the redeemer.
   *
   * @param data the datum to set
   */
  public void setData(Datum data) {
    this.data = data;
  }

  /**
   * Gets the execution units for the redeemer.
   *
   * @return the execution units
   */
  public List<Long> getExUnits() {
    return exUnits;
  }

  /**
   * Sets the execution units for the redeemer.
   *
   * @param exUnits the execution units to set
   */
  public void setExUnits(List<Long> exUnits) {
    this.exUnits = exUnits;
  }

  /**
   * Gets the index of the relevant proposal.
   *
   * @return the proposal index
   */
  public Integer getProposalIndex() {
    return proposalIndex;
  }

  /**
   * Sets the index of the relevant proposal.
   *
   * @param proposalIndex the proposal index to set
   */
  public void setProposalIndex(Integer proposalIndex) {
    this.proposalIndex = proposalIndex;
  }

  @Override
  public String toString() {
    return "ProposalRedeemer{" +
        "data=" + data +
        ", exUnits=" + exUnits +
        ", proposalIndex=" + proposalIndex +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProposalRedeemer that = (ProposalRedeemer) o;
    return java.util.Objects.equals(data, that.data) &&
        java.util.Objects.equals(exUnits, that.exUnits) &&
        java.util.Objects.equals(proposalIndex, that.proposalIndex);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, exUnits, proposalIndex);
  }
}
