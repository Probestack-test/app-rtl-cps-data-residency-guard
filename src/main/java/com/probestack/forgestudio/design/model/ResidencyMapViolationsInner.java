package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResidencyMapViolationsInner
 */
@JsonTypeName("ResidencyMap_violations_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyMapViolationsInner {

  private UUID violationId;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SeverityEnum severity;

  private String policyName;

  private String detail;

  private Integer affectedRecords;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime detectedAt;

  /**
   * Gets or Sets remediationStatus
   */
  public enum RemediationStatusEnum {
    OPEN("OPEN"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    RESOLVED("RESOLVED");

    private String value;

    RemediationStatusEnum(String value) {
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
    public static RemediationStatusEnum fromValue(String value) {
      for (RemediationStatusEnum b : RemediationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RemediationStatusEnum remediationStatus;

  public ResidencyMapViolationsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResidencyMapViolationsInner(UUID violationId, SeverityEnum severity, String detail) {
    this.violationId = violationId;
    this.severity = severity;
    this.detail = detail;
  }

  public ResidencyMapViolationsInner violationId(UUID violationId) {
    this.violationId = violationId;
    return this;
  }

  /**
   * Get violationId
   * @return violationId
  */
  @NotNull @Valid   @Schema(name = "violationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("violationId")
  public UUID getViolationId() {
    return violationId;
  }

  public void setViolationId(UUID violationId) {
    this.violationId = violationId;
  }

  public ResidencyMapViolationsInner severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  @NotNull   @Schema(name = "severity", example = "CRITICAL", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public ResidencyMapViolationsInner policyName(String policyName) {
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

  public ResidencyMapViolationsInner detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @NotNull   @Schema(name = "detail", example = "1.2M EU PII records found in us-east-1 replica set.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ResidencyMapViolationsInner affectedRecords(Integer affectedRecords) {
    this.affectedRecords = affectedRecords;
    return this;
  }

  /**
   * Get affectedRecords
   * @return affectedRecords
  */
    @Schema(name = "affectedRecords", example = "1200000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affectedRecords")
  public Integer getAffectedRecords() {
    return affectedRecords;
  }

  public void setAffectedRecords(Integer affectedRecords) {
    this.affectedRecords = affectedRecords;
  }

  public ResidencyMapViolationsInner detectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
    return this;
  }

  /**
   * Get detectedAt
   * @return detectedAt
  */
  @Valid   @Schema(name = "detectedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("detectedAt")
  public OffsetDateTime getDetectedAt() {
    return detectedAt;
  }

  public void setDetectedAt(OffsetDateTime detectedAt) {
    this.detectedAt = detectedAt;
  }

  public ResidencyMapViolationsInner remediationStatus(RemediationStatusEnum remediationStatus) {
    this.remediationStatus = remediationStatus;
    return this;
  }

  /**
   * Get remediationStatus
   * @return remediationStatus
  */
    @Schema(name = "remediationStatus", example = "IN_PROGRESS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remediationStatus")
  public RemediationStatusEnum getRemediationStatus() {
    return remediationStatus;
  }

  public void setRemediationStatus(RemediationStatusEnum remediationStatus) {
    this.remediationStatus = remediationStatus;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyMapViolationsInner residencyMapViolationsInner = (ResidencyMapViolationsInner) o;
    return Objects.equals(this.violationId, residencyMapViolationsInner.violationId) &&
        Objects.equals(this.severity, residencyMapViolationsInner.severity) &&
        Objects.equals(this.policyName, residencyMapViolationsInner.policyName) &&
        Objects.equals(this.detail, residencyMapViolationsInner.detail) &&
        Objects.equals(this.affectedRecords, residencyMapViolationsInner.affectedRecords) &&
        Objects.equals(this.detectedAt, residencyMapViolationsInner.detectedAt) &&
        Objects.equals(this.remediationStatus, residencyMapViolationsInner.remediationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(violationId, severity, policyName, detail, affectedRecords, detectedAt, remediationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyMapViolationsInner {\n");
    sb.append("    violationId: ").append(toIndentedString(violationId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    affectedRecords: ").append(toIndentedString(affectedRecords)).append("\n");
    sb.append("    detectedAt: ").append(toIndentedString(detectedAt)).append("\n");
    sb.append("    remediationStatus: ").append(toIndentedString(remediationStatus)).append("\n");
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

