package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MovementDecisionSuggestedAlternativesInner
 */
@JsonTypeName("MovementDecision_suggestedAlternatives_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class MovementDecisionSuggestedAlternativesInner {

  private String alternative;

  private String detail;

  private Integer latencyImpactMs;

  private Double costImpactUSDPerMonth;

  public MovementDecisionSuggestedAlternativesInner alternative(String alternative) {
    this.alternative = alternative;
    return this;
  }

  /**
   * Get alternative
   * @return alternative
  */
    @Schema(name = "alternative", example = "USE_ALLOWED_REGION", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternative")
  public String getAlternative() {
    return alternative;
  }

  public void setAlternative(String alternative) {
    this.alternative = alternative;
  }

  public MovementDecisionSuggestedAlternativesInner detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
    @Schema(name = "detail", example = "Route ML training to eu-central-1 (already allowed).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public MovementDecisionSuggestedAlternativesInner latencyImpactMs(Integer latencyImpactMs) {
    this.latencyImpactMs = latencyImpactMs;
    return this;
  }

  /**
   * Get latencyImpactMs
   * @return latencyImpactMs
  */
    @Schema(name = "latencyImpactMs", example = "15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latencyImpactMs")
  public Integer getLatencyImpactMs() {
    return latencyImpactMs;
  }

  public void setLatencyImpactMs(Integer latencyImpactMs) {
    this.latencyImpactMs = latencyImpactMs;
  }

  public MovementDecisionSuggestedAlternativesInner costImpactUSDPerMonth(Double costImpactUSDPerMonth) {
    this.costImpactUSDPerMonth = costImpactUSDPerMonth;
    return this;
  }

  /**
   * Get costImpactUSDPerMonth
   * @return costImpactUSDPerMonth
  */
    @Schema(name = "costImpactUSDPerMonth", example = "120.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("costImpactUSDPerMonth")
  public Double getCostImpactUSDPerMonth() {
    return costImpactUSDPerMonth;
  }

  public void setCostImpactUSDPerMonth(Double costImpactUSDPerMonth) {
    this.costImpactUSDPerMonth = costImpactUSDPerMonth;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovementDecisionSuggestedAlternativesInner movementDecisionSuggestedAlternativesInner = (MovementDecisionSuggestedAlternativesInner) o;
    return Objects.equals(this.alternative, movementDecisionSuggestedAlternativesInner.alternative) &&
        Objects.equals(this.detail, movementDecisionSuggestedAlternativesInner.detail) &&
        Objects.equals(this.latencyImpactMs, movementDecisionSuggestedAlternativesInner.latencyImpactMs) &&
        Objects.equals(this.costImpactUSDPerMonth, movementDecisionSuggestedAlternativesInner.costImpactUSDPerMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternative, detail, latencyImpactMs, costImpactUSDPerMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovementDecisionSuggestedAlternativesInner {\n");
    sb.append("    alternative: ").append(toIndentedString(alternative)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    latencyImpactMs: ").append(toIndentedString(latencyImpactMs)).append("\n");
    sb.append("    costImpactUSDPerMonth: ").append(toIndentedString(costImpactUSDPerMonth)).append("\n");
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

