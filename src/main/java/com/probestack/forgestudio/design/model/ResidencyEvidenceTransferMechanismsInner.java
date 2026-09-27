package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResidencyEvidenceTransferMechanismsInner
 */
@JsonTypeName("ResidencyEvidence_transferMechanisms_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyEvidenceTransferMechanismsInner {

  private String mechanism;

  @Valid
  private List<String> destinationCountries;

  private String approvalReference;

  private Integer usageCount;

  public ResidencyEvidenceTransferMechanismsInner mechanism(String mechanism) {
    this.mechanism = mechanism;
    return this;
  }

  /**
   * Get mechanism
   * @return mechanism
  */
    @Schema(name = "mechanism", example = "STANDARD_CONTRACTUAL_CLAUSES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mechanism")
  public String getMechanism() {
    return mechanism;
  }

  public void setMechanism(String mechanism) {
    this.mechanism = mechanism;
  }

  public ResidencyEvidenceTransferMechanismsInner destinationCountries(List<String> destinationCountries) {
    this.destinationCountries = destinationCountries;
    return this;
  }

  public ResidencyEvidenceTransferMechanismsInner addDestinationCountriesItem(String destinationCountriesItem) {
    if (this.destinationCountries == null) {
      this.destinationCountries = new ArrayList<>();
    }
    this.destinationCountries.add(destinationCountriesItem);
    return this;
  }

  /**
   * Get destinationCountries
   * @return destinationCountries
  */
    @Schema(name = "destinationCountries", example = "[\"US\",\"GB\",\"CH\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationCountries")
  public List<String> getDestinationCountries() {
    return destinationCountries;
  }

  public void setDestinationCountries(List<String> destinationCountries) {
    this.destinationCountries = destinationCountries;
  }

  public ResidencyEvidenceTransferMechanismsInner approvalReference(String approvalReference) {
    this.approvalReference = approvalReference;
    return this;
  }

  /**
   * Get approvalReference
   * @return approvalReference
  */
    @Schema(name = "approvalReference", example = "DPA-2026-001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalReference")
  public String getApprovalReference() {
    return approvalReference;
  }

  public void setApprovalReference(String approvalReference) {
    this.approvalReference = approvalReference;
  }

  public ResidencyEvidenceTransferMechanismsInner usageCount(Integer usageCount) {
    this.usageCount = usageCount;
    return this;
  }

  /**
   * Get usageCount
   * @return usageCount
  */
    @Schema(name = "usageCount", example = "12840", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usageCount")
  public Integer getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(Integer usageCount) {
    this.usageCount = usageCount;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyEvidenceTransferMechanismsInner residencyEvidenceTransferMechanismsInner = (ResidencyEvidenceTransferMechanismsInner) o;
    return Objects.equals(this.mechanism, residencyEvidenceTransferMechanismsInner.mechanism) &&
        Objects.equals(this.destinationCountries, residencyEvidenceTransferMechanismsInner.destinationCountries) &&
        Objects.equals(this.approvalReference, residencyEvidenceTransferMechanismsInner.approvalReference) &&
        Objects.equals(this.usageCount, residencyEvidenceTransferMechanismsInner.usageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mechanism, destinationCountries, approvalReference, usageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyEvidenceTransferMechanismsInner {\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    destinationCountries: ").append(toIndentedString(destinationCountries)).append("\n");
    sb.append("    approvalReference: ").append(toIndentedString(approvalReference)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

