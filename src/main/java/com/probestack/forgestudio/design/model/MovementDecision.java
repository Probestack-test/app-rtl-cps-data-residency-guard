package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.MovementDecisionLegalBasis;
import com.probestack.forgestudio.design.model.MovementDecisionMetadata;
import com.probestack.forgestudio.design.model.MovementDecisionSuggestedAlternativesInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MovementDecision
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class MovementDecision {

  private UUID decisionId;

  /**
   * Gets or Sets decision
   */
  public enum DecisionEnum {
    ALLOW("ALLOW"),
    
    BLOCK("BLOCK"),
    
    WARN("WARN"),
    
    AUTO_ROUTE("AUTO_ROUTE");

    private String value;

    DecisionEnum(String value) {
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
    public static DecisionEnum fromValue(String value) {
      for (DecisionEnum b : DecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DecisionEnum decision;

  private MovementDecisionLegalBasis legalBasis;

  @Valid
  private List<@Valid MovementDecisionSuggestedAlternativesInner> suggestedAlternatives;

  private String autoRoutedTo;

  private MovementDecisionMetadata metadata;

  private String auditReference;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime evaluatedAt;

  private Integer latencyMs;

  public MovementDecision() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MovementDecision(UUID decisionId, DecisionEnum decision, MovementDecisionLegalBasis legalBasis, OffsetDateTime evaluatedAt, Integer latencyMs) {
    this.decisionId = decisionId;
    this.decision = decision;
    this.legalBasis = legalBasis;
    this.evaluatedAt = evaluatedAt;
    this.latencyMs = latencyMs;
  }

  public MovementDecision decisionId(UUID decisionId) {
    this.decisionId = decisionId;
    return this;
  }

  /**
   * Get decisionId
   * @return decisionId
  */
  @NotNull @Valid   @Schema(name = "decisionId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decisionId")
  public UUID getDecisionId() {
    return decisionId;
  }

  public void setDecisionId(UUID decisionId) {
    this.decisionId = decisionId;
  }

  public MovementDecision decision(DecisionEnum decision) {
    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   * @return decision
  */
  @NotNull   @Schema(name = "decision", example = "BLOCK", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("decision")
  public DecisionEnum getDecision() {
    return decision;
  }

  public void setDecision(DecisionEnum decision) {
    this.decision = decision;
  }

  public MovementDecision legalBasis(MovementDecisionLegalBasis legalBasis) {
    this.legalBasis = legalBasis;
    return this;
  }

  /**
   * Get legalBasis
   * @return legalBasis
  */
  @NotNull @Valid   @Schema(name = "legalBasis", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("legalBasis")
  public MovementDecisionLegalBasis getLegalBasis() {
    return legalBasis;
  }

  public void setLegalBasis(MovementDecisionLegalBasis legalBasis) {
    this.legalBasis = legalBasis;
  }

  public MovementDecision suggestedAlternatives(List<@Valid MovementDecisionSuggestedAlternativesInner> suggestedAlternatives) {
    this.suggestedAlternatives = suggestedAlternatives;
    return this;
  }

  public MovementDecision addSuggestedAlternativesItem(MovementDecisionSuggestedAlternativesInner suggestedAlternativesItem) {
    if (this.suggestedAlternatives == null) {
      this.suggestedAlternatives = new ArrayList<>();
    }
    this.suggestedAlternatives.add(suggestedAlternativesItem);
    return this;
  }

  /**
   * If blocked, what CAN be done.
   * @return suggestedAlternatives
  */
  @Valid   @Schema(name = "suggestedAlternatives", description = "If blocked, what CAN be done.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestedAlternatives")
  public List<@Valid MovementDecisionSuggestedAlternativesInner> getSuggestedAlternatives() {
    return suggestedAlternatives;
  }

  public void setSuggestedAlternatives(List<@Valid MovementDecisionSuggestedAlternativesInner> suggestedAlternatives) {
    this.suggestedAlternatives = suggestedAlternatives;
  }

  public MovementDecision autoRoutedTo(String autoRoutedTo) {
    this.autoRoutedTo = autoRoutedTo;
    return this;
  }

  /**
   * If decision = AUTO_ROUTE, the region used.
   * @return autoRoutedTo
  */
    @Schema(name = "autoRoutedTo", example = "eu-central-1", description = "If decision = AUTO_ROUTE, the region used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRoutedTo")
  public String getAutoRoutedTo() {
    return autoRoutedTo;
  }

  public void setAutoRoutedTo(String autoRoutedTo) {
    this.autoRoutedTo = autoRoutedTo;
  }

  public MovementDecision metadata(MovementDecisionMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid   @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public MovementDecisionMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(MovementDecisionMetadata metadata) {
    this.metadata = metadata;
  }

  public MovementDecision auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://residency/a1b2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }

  public MovementDecision evaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
    return this;
  }

  /**
   * Get evaluatedAt
   * @return evaluatedAt
  */
  @NotNull @Valid   @Schema(name = "evaluatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evaluatedAt")
  public OffsetDateTime getEvaluatedAt() {
    return evaluatedAt;
  }

  public void setEvaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
  }

  public MovementDecision latencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
    return this;
  }

  /**
   * Get latencyMs
   * @return latencyMs
  */
  @NotNull   @Schema(name = "latencyMs", example = "14", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("latencyMs")
  public Integer getLatencyMs() {
    return latencyMs;
  }

  public void setLatencyMs(Integer latencyMs) {
    this.latencyMs = latencyMs;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovementDecision movementDecision = (MovementDecision) o;
    return Objects.equals(this.decisionId, movementDecision.decisionId) &&
        Objects.equals(this.decision, movementDecision.decision) &&
        Objects.equals(this.legalBasis, movementDecision.legalBasis) &&
        Objects.equals(this.suggestedAlternatives, movementDecision.suggestedAlternatives) &&
        Objects.equals(this.autoRoutedTo, movementDecision.autoRoutedTo) &&
        Objects.equals(this.metadata, movementDecision.metadata) &&
        Objects.equals(this.auditReference, movementDecision.auditReference) &&
        Objects.equals(this.evaluatedAt, movementDecision.evaluatedAt) &&
        Objects.equals(this.latencyMs, movementDecision.latencyMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionId, decision, legalBasis, suggestedAlternatives, autoRoutedTo, metadata, auditReference, evaluatedAt, latencyMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovementDecision {\n");
    sb.append("    decisionId: ").append(toIndentedString(decisionId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    legalBasis: ").append(toIndentedString(legalBasis)).append("\n");
    sb.append("    suggestedAlternatives: ").append(toIndentedString(suggestedAlternatives)).append("\n");
    sb.append("    autoRoutedTo: ").append(toIndentedString(autoRoutedTo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
    sb.append("    evaluatedAt: ").append(toIndentedString(evaluatedAt)).append("\n");
    sb.append("    latencyMs: ").append(toIndentedString(latencyMs)).append("\n");
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

