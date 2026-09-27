package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResidencyMapPoliciesSummaryInner
 */
@JsonTypeName("ResidencyMap_policiesSummary_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyMapPoliciesSummaryInner {

  private String policyName;

  private String framework;

  private String enforcementMode;

  private Integer decisionsLast24h;

  private Integer blockedLast24h;

  public ResidencyMapPoliciesSummaryInner policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
    @Schema(name = "policyName", example = "eu-customer-data-gdpr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public ResidencyMapPoliciesSummaryInner framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Get framework
   * @return framework
  */
    @Schema(name = "framework", example = "GDPR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("framework")
  public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }

  public ResidencyMapPoliciesSummaryInner enforcementMode(String enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * Get enforcementMode
   * @return enforcementMode
  */
    @Schema(name = "enforcementMode", example = "BLOCK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enforcementMode")
  public String getEnforcementMode() {
    return enforcementMode;
  }

  public void setEnforcementMode(String enforcementMode) {
    this.enforcementMode = enforcementMode;
  }

  public ResidencyMapPoliciesSummaryInner decisionsLast24h(Integer decisionsLast24h) {
    this.decisionsLast24h = decisionsLast24h;
    return this;
  }

  /**
   * Get decisionsLast24h
   * @return decisionsLast24h
  */
    @Schema(name = "decisionsLast24h", example = "45200", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionsLast24h")
  public Integer getDecisionsLast24h() {
    return decisionsLast24h;
  }

  public void setDecisionsLast24h(Integer decisionsLast24h) {
    this.decisionsLast24h = decisionsLast24h;
  }

  public ResidencyMapPoliciesSummaryInner blockedLast24h(Integer blockedLast24h) {
    this.blockedLast24h = blockedLast24h;
    return this;
  }

  /**
   * Get blockedLast24h
   * @return blockedLast24h
  */
    @Schema(name = "blockedLast24h", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedLast24h")
  public Integer getBlockedLast24h() {
    return blockedLast24h;
  }

  public void setBlockedLast24h(Integer blockedLast24h) {
    this.blockedLast24h = blockedLast24h;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyMapPoliciesSummaryInner residencyMapPoliciesSummaryInner = (ResidencyMapPoliciesSummaryInner) o;
    return Objects.equals(this.policyName, residencyMapPoliciesSummaryInner.policyName) &&
        Objects.equals(this.framework, residencyMapPoliciesSummaryInner.framework) &&
        Objects.equals(this.enforcementMode, residencyMapPoliciesSummaryInner.enforcementMode) &&
        Objects.equals(this.decisionsLast24h, residencyMapPoliciesSummaryInner.decisionsLast24h) &&
        Objects.equals(this.blockedLast24h, residencyMapPoliciesSummaryInner.blockedLast24h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, framework, enforcementMode, decisionsLast24h, blockedLast24h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyMapPoliciesSummaryInner {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    enforcementMode: ").append(toIndentedString(enforcementMode)).append("\n");
    sb.append("    decisionsLast24h: ").append(toIndentedString(decisionsLast24h)).append("\n");
    sb.append("    blockedLast24h: ").append(toIndentedString(blockedLast24h)).append("\n");
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

