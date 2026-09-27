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
 * ResidencyEvidenceSummary
 */
@JsonTypeName("ResidencyEvidence_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyEvidenceSummary {

  private Integer totalDecisions;

  private Integer allowedDecisions;

  private Integer blockedDecisions;

  private Integer warnedDecisions;

  private Integer totalDataSubjectsCovered;

  @Valid
  private List<String> countriesCovered;

  public ResidencyEvidenceSummary totalDecisions(Integer totalDecisions) {
    this.totalDecisions = totalDecisions;
    return this;
  }

  /**
   * Get totalDecisions
   * @return totalDecisions
  */
    @Schema(name = "totalDecisions", example = "1820000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalDecisions")
  public Integer getTotalDecisions() {
    return totalDecisions;
  }

  public void setTotalDecisions(Integer totalDecisions) {
    this.totalDecisions = totalDecisions;
  }

  public ResidencyEvidenceSummary allowedDecisions(Integer allowedDecisions) {
    this.allowedDecisions = allowedDecisions;
    return this;
  }

  /**
   * Get allowedDecisions
   * @return allowedDecisions
  */
    @Schema(name = "allowedDecisions", example = "1819600", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedDecisions")
  public Integer getAllowedDecisions() {
    return allowedDecisions;
  }

  public void setAllowedDecisions(Integer allowedDecisions) {
    this.allowedDecisions = allowedDecisions;
  }

  public ResidencyEvidenceSummary blockedDecisions(Integer blockedDecisions) {
    this.blockedDecisions = blockedDecisions;
    return this;
  }

  /**
   * Get blockedDecisions
   * @return blockedDecisions
  */
    @Schema(name = "blockedDecisions", example = "400", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedDecisions")
  public Integer getBlockedDecisions() {
    return blockedDecisions;
  }

  public void setBlockedDecisions(Integer blockedDecisions) {
    this.blockedDecisions = blockedDecisions;
  }

  public ResidencyEvidenceSummary warnedDecisions(Integer warnedDecisions) {
    this.warnedDecisions = warnedDecisions;
    return this;
  }

  /**
   * Get warnedDecisions
   * @return warnedDecisions
  */
    @Schema(name = "warnedDecisions", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnedDecisions")
  public Integer getWarnedDecisions() {
    return warnedDecisions;
  }

  public void setWarnedDecisions(Integer warnedDecisions) {
    this.warnedDecisions = warnedDecisions;
  }

  public ResidencyEvidenceSummary totalDataSubjectsCovered(Integer totalDataSubjectsCovered) {
    this.totalDataSubjectsCovered = totalDataSubjectsCovered;
    return this;
  }

  /**
   * Get totalDataSubjectsCovered
   * @return totalDataSubjectsCovered
  */
    @Schema(name = "totalDataSubjectsCovered", example = "450000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalDataSubjectsCovered")
  public Integer getTotalDataSubjectsCovered() {
    return totalDataSubjectsCovered;
  }

  public void setTotalDataSubjectsCovered(Integer totalDataSubjectsCovered) {
    this.totalDataSubjectsCovered = totalDataSubjectsCovered;
  }

  public ResidencyEvidenceSummary countriesCovered(List<String> countriesCovered) {
    this.countriesCovered = countriesCovered;
    return this;
  }

  public ResidencyEvidenceSummary addCountriesCoveredItem(String countriesCoveredItem) {
    if (this.countriesCovered == null) {
      this.countriesCovered = new ArrayList<>();
    }
    this.countriesCovered.add(countriesCoveredItem);
    return this;
  }

  /**
   * Get countriesCovered
   * @return countriesCovered
  */
    @Schema(name = "countriesCovered", example = "[\"DE\",\"FR\",\"IT\",\"ES\",\"NL\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countriesCovered")
  public List<String> getCountriesCovered() {
    return countriesCovered;
  }

  public void setCountriesCovered(List<String> countriesCovered) {
    this.countriesCovered = countriesCovered;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyEvidenceSummary residencyEvidenceSummary = (ResidencyEvidenceSummary) o;
    return Objects.equals(this.totalDecisions, residencyEvidenceSummary.totalDecisions) &&
        Objects.equals(this.allowedDecisions, residencyEvidenceSummary.allowedDecisions) &&
        Objects.equals(this.blockedDecisions, residencyEvidenceSummary.blockedDecisions) &&
        Objects.equals(this.warnedDecisions, residencyEvidenceSummary.warnedDecisions) &&
        Objects.equals(this.totalDataSubjectsCovered, residencyEvidenceSummary.totalDataSubjectsCovered) &&
        Objects.equals(this.countriesCovered, residencyEvidenceSummary.countriesCovered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalDecisions, allowedDecisions, blockedDecisions, warnedDecisions, totalDataSubjectsCovered, countriesCovered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyEvidenceSummary {\n");
    sb.append("    totalDecisions: ").append(toIndentedString(totalDecisions)).append("\n");
    sb.append("    allowedDecisions: ").append(toIndentedString(allowedDecisions)).append("\n");
    sb.append("    blockedDecisions: ").append(toIndentedString(blockedDecisions)).append("\n");
    sb.append("    warnedDecisions: ").append(toIndentedString(warnedDecisions)).append("\n");
    sb.append("    totalDataSubjectsCovered: ").append(toIndentedString(totalDataSubjectsCovered)).append("\n");
    sb.append("    countriesCovered: ").append(toIndentedString(countriesCovered)).append("\n");
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

