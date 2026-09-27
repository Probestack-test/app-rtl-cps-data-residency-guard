package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MovementDecisionLegalBasis
 */
@JsonTypeName("MovementDecision_legalBasis")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class MovementDecisionLegalBasis {

  private UUID policyId;

  private String policyName;

  /**
   * Gets or Sets regulatoryFramework
   */
  public enum RegulatoryFrameworkEnum {
    GDPR("GDPR"),
    
    SCHREMS_II("SCHREMS_II"),
    
    DPDP_INDIA("DPDP_INDIA"),
    
    HIPAA("HIPAA"),
    
    PIPL_CHINA("PIPL_CHINA"),
    
    LGPD_BRAZIL("LGPD_BRAZIL"),
    
    PIPEDA_CANADA("PIPEDA_CANADA"),
    
    APPI_JAPAN("APPI_JAPAN"),
    
    POPIA_SOUTH_AFRICA("POPIA_SOUTH_AFRICA"),
    
    NONE("NONE");

    private String value;

    RegulatoryFrameworkEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RegulatoryFrameworkEnum fromValue(String value) {
      for (RegulatoryFrameworkEnum b : RegulatoryFrameworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RegulatoryFrameworkEnum regulatoryFramework;

  private String regulationArticle;

  private String reasoning;

  public MovementDecisionLegalBasis policyId(UUID policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
  */
  @Valid   @Schema(name = "policyId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyId")
  public UUID getPolicyId() {
    return policyId;
  }

  public void setPolicyId(UUID policyId) {
    this.policyId = policyId;
  }

  public MovementDecisionLegalBasis policyName(String policyName) {
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

  public MovementDecisionLegalBasis regulatoryFramework(RegulatoryFrameworkEnum regulatoryFramework) {
    this.regulatoryFramework = regulatoryFramework;
    return this;
  }

  /**
   * Get regulatoryFramework
   * @return regulatoryFramework
  */
    @Schema(name = "regulatoryFramework", example = "GDPR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regulatoryFramework")
  public RegulatoryFrameworkEnum getRegulatoryFramework() {
    return regulatoryFramework;
  }

  public void setRegulatoryFramework(RegulatoryFrameworkEnum regulatoryFramework) {
    this.regulatoryFramework = regulatoryFramework;
  }

  public MovementDecisionLegalBasis regulationArticle(String regulationArticle) {
    this.regulationArticle = regulationArticle;
    return this;
  }

  /**
   * Get regulationArticle
   * @return regulationArticle
  */
    @Schema(name = "regulationArticle", example = "GDPR Art. 44 — General principle for transfers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regulationArticle")
  public String getRegulationArticle() {
    return regulationArticle;
  }

  public void setRegulationArticle(String regulationArticle) {
    this.regulationArticle = regulationArticle;
  }

  public MovementDecisionLegalBasis reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Get reasoning
   * @return reasoning
  */
    @Schema(name = "reasoning", example = "EU PII cannot be transferred to us-east-1 without Standard Contractual Clauses. No valid SCC found in policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reasoning")
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovementDecisionLegalBasis movementDecisionLegalBasis = (MovementDecisionLegalBasis) o;
    return Objects.equals(this.policyId, movementDecisionLegalBasis.policyId) &&
        Objects.equals(this.policyName, movementDecisionLegalBasis.policyName) &&
        Objects.equals(this.regulatoryFramework, movementDecisionLegalBasis.regulatoryFramework) &&
        Objects.equals(this.regulationArticle, movementDecisionLegalBasis.regulationArticle) &&
        Objects.equals(this.reasoning, movementDecisionLegalBasis.reasoning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName, regulatoryFramework, regulationArticle, reasoning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovementDecisionLegalBasis {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    regulatoryFramework: ").append(toIndentedString(regulatoryFramework)).append("\n");
    sb.append("    regulationArticle: ").append(toIndentedString(regulationArticle)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
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

