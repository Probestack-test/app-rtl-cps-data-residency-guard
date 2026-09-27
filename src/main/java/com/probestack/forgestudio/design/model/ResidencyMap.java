package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.ResidencyMapPoliciesSummaryInner;
import com.probestack.forgestudio.design.model.ResidencyMapRegionsInner;
import com.probestack.forgestudio.design.model.ResidencyMapViolationsInner;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResidencyMap
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyMap {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  private BigDecimal totalComplianceScore;

  @Valid
  private List<@Valid ResidencyMapRegionsInner> regions = new ArrayList<>();

  @Valid
  private List<@Valid ResidencyMapViolationsInner> violations;

  @Valid
  private List<@Valid ResidencyMapPoliciesSummaryInner> policiesSummary;

  public ResidencyMap() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResidencyMap(OffsetDateTime generatedAt, BigDecimal totalComplianceScore, List<@Valid ResidencyMapRegionsInner> regions) {
    this.generatedAt = generatedAt;
    this.totalComplianceScore = totalComplianceScore;
    this.regions = regions;
  }

  public ResidencyMap generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Get generatedAt
   * @return generatedAt
  */
  @NotNull @Valid   @Schema(name = "generatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generatedAt")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }

  public ResidencyMap totalComplianceScore(BigDecimal totalComplianceScore) {
    this.totalComplianceScore = totalComplianceScore;
    return this;
  }

  /**
   * Overall residency compliance health.
   * minimum: 0
   * maximum: 100
   * @return totalComplianceScore
  */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("100")   @Schema(name = "totalComplianceScore", example = "94.5", description = "Overall residency compliance health.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalComplianceScore")
  public BigDecimal getTotalComplianceScore() {
    return totalComplianceScore;
  }

  public void setTotalComplianceScore(BigDecimal totalComplianceScore) {
    this.totalComplianceScore = totalComplianceScore;
  }

  public ResidencyMap regions(List<@Valid ResidencyMapRegionsInner> regions) {
    this.regions = regions;
    return this;
  }

  public ResidencyMap addRegionsItem(ResidencyMapRegionsInner regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Get regions
   * @return regions
  */
  @NotNull @Valid   @Schema(name = "regions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regions")
  public List<@Valid ResidencyMapRegionsInner> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid ResidencyMapRegionsInner> regions) {
    this.regions = regions;
  }

  public ResidencyMap violations(List<@Valid ResidencyMapViolationsInner> violations) {
    this.violations = violations;
    return this;
  }

  public ResidencyMap addViolationsItem(ResidencyMapViolationsInner violationsItem) {
    if (this.violations == null) {
      this.violations = new ArrayList<>();
    }
    this.violations.add(violationsItem);
    return this;
  }

  /**
   * Currently active residency violations.
   * @return violations
  */
  @Valid   @Schema(name = "violations", description = "Currently active residency violations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("violations")
  public List<@Valid ResidencyMapViolationsInner> getViolations() {
    return violations;
  }

  public void setViolations(List<@Valid ResidencyMapViolationsInner> violations) {
    this.violations = violations;
  }

  public ResidencyMap policiesSummary(List<@Valid ResidencyMapPoliciesSummaryInner> policiesSummary) {
    this.policiesSummary = policiesSummary;
    return this;
  }

  public ResidencyMap addPoliciesSummaryItem(ResidencyMapPoliciesSummaryInner policiesSummaryItem) {
    if (this.policiesSummary == null) {
      this.policiesSummary = new ArrayList<>();
    }
    this.policiesSummary.add(policiesSummaryItem);
    return this;
  }

  /**
   * Get policiesSummary
   * @return policiesSummary
  */
  @Valid   @Schema(name = "policiesSummary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policiesSummary")
  public List<@Valid ResidencyMapPoliciesSummaryInner> getPoliciesSummary() {
    return policiesSummary;
  }

  public void setPoliciesSummary(List<@Valid ResidencyMapPoliciesSummaryInner> policiesSummary) {
    this.policiesSummary = policiesSummary;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyMap residencyMap = (ResidencyMap) o;
    return Objects.equals(this.generatedAt, residencyMap.generatedAt) &&
        Objects.equals(this.totalComplianceScore, residencyMap.totalComplianceScore) &&
        Objects.equals(this.regions, residencyMap.regions) &&
        Objects.equals(this.violations, residencyMap.violations) &&
        Objects.equals(this.policiesSummary, residencyMap.policiesSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generatedAt, totalComplianceScore, regions, violations, policiesSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyMap {\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    totalComplianceScore: ").append(toIndentedString(totalComplianceScore)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    violations: ").append(toIndentedString(violations)).append("\n");
    sb.append("    policiesSummary: ").append(toIndentedString(policiesSummary)).append("\n");
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

