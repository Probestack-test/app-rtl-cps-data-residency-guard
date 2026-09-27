package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.ResidencyEvidenceReportSignature;
import com.probestack.forgestudio.design.model.ResidencyEvidenceSummary;
import com.probestack.forgestudio.design.model.ResidencyEvidenceTransferMechanismsInner;
import java.time.LocalDate;
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
 * ResidencyEvidence
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyEvidence {

  private UUID evidenceId;

  /**
   * Gets or Sets framework
   */
  public enum FrameworkEnum {
    GDPR("GDPR"),
    
    SCHREMS_II("SCHREMS_II"),
    
    DPDP_INDIA("DPDP_INDIA"),
    
    HIPAA("HIPAA"),
    
    PIPL_CHINA("PIPL_CHINA"),
    
    LGPD_BRAZIL("LGPD_BRAZIL"),
    
    PIPEDA_CANADA("PIPEDA_CANADA"),
    
    APPI_JAPAN("APPI_JAPAN"),
    
    POPIA_SOUTH_AFRICA("POPIA_SOUTH_AFRICA");

    private String value;

    FrameworkEnum(String value) {
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
    public static FrameworkEnum fromValue(String value) {
      for (FrameworkEnum b : FrameworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private FrameworkEnum framework;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate periodFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate periodTo;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    COLLECTING("COLLECTING"),
    
    VERIFYING("VERIFYING"),
    
    SIGNING("SIGNING"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private Integer progressPercent;

  /**
   * Gets or Sets outputFormat
   */
  public enum OutputFormatEnum {
    PDF("PDF"),
    
    CSV("CSV"),
    
    JSON("JSON"),
    
    XLSX("XLSX");

    private String value;

    OutputFormatEnum(String value) {
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
    public static OutputFormatEnum fromValue(String value) {
      for (OutputFormatEnum b : OutputFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private OutputFormatEnum outputFormat;

  private ResidencyEvidenceSummary summary;

  @Valid
  private List<@Valid ResidencyEvidenceTransferMechanismsInner> transferMechanisms;

  private String reportDownloadUrl;

  private ResidencyEvidenceReportSignature reportSignature;

  private String evidenceVaultReference;

  private String errorMessage;

  public ResidencyEvidence() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResidencyEvidence(UUID evidenceId, FrameworkEnum framework, LocalDate periodFrom, LocalDate periodTo, StatusEnum status, OffsetDateTime requestedAt, OutputFormatEnum outputFormat) {
    this.evidenceId = evidenceId;
    this.framework = framework;
    this.periodFrom = periodFrom;
    this.periodTo = periodTo;
    this.status = status;
    this.requestedAt = requestedAt;
    this.outputFormat = outputFormat;
  }

  public ResidencyEvidence evidenceId(UUID evidenceId) {
    this.evidenceId = evidenceId;
    return this;
  }

  /**
   * Get evidenceId
   * @return evidenceId
  */
  @NotNull @Valid   @Schema(name = "evidenceId", example = "d1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("evidenceId")
  public UUID getEvidenceId() {
    return evidenceId;
  }

  public void setEvidenceId(UUID evidenceId) {
    this.evidenceId = evidenceId;
  }

  public ResidencyEvidence framework(FrameworkEnum framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Get framework
   * @return framework
  */
  @NotNull   @Schema(name = "framework", example = "GDPR", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("framework")
  public FrameworkEnum getFramework() {
    return framework;
  }

  public void setFramework(FrameworkEnum framework) {
    this.framework = framework;
  }

  public ResidencyEvidence periodFrom(LocalDate periodFrom) {
    this.periodFrom = periodFrom;
    return this;
  }

  /**
   * Get periodFrom
   * @return periodFrom
  */
  @NotNull @Valid   @Schema(name = "periodFrom", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("periodFrom")
  public LocalDate getPeriodFrom() {
    return periodFrom;
  }

  public void setPeriodFrom(LocalDate periodFrom) {
    this.periodFrom = periodFrom;
  }

  public ResidencyEvidence periodTo(LocalDate periodTo) {
    this.periodTo = periodTo;
    return this;
  }

  /**
   * Get periodTo
   * @return periodTo
  */
  @NotNull @Valid   @Schema(name = "periodTo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("periodTo")
  public LocalDate getPeriodTo() {
    return periodTo;
  }

  public void setPeriodTo(LocalDate periodTo) {
    this.periodTo = periodTo;
  }

  public ResidencyEvidence status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "COLLECTING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ResidencyEvidence requestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
    return this;
  }

  /**
   * Get requestedAt
   * @return requestedAt
  */
  @NotNull @Valid   @Schema(name = "requestedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedAt")
  public OffsetDateTime getRequestedAt() {
    return requestedAt;
  }

  public void setRequestedAt(OffsetDateTime requestedAt) {
    this.requestedAt = requestedAt;
  }

  public ResidencyEvidence completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public ResidencyEvidence progressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
    return this;
  }

  /**
   * Get progressPercent
   * minimum: 0
   * maximum: 100
   * @return progressPercent
  */
  @Min(0) @Max(100)   @Schema(name = "progressPercent", example = "45", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progressPercent")
  public Integer getProgressPercent() {
    return progressPercent;
  }

  public void setProgressPercent(Integer progressPercent) {
    this.progressPercent = progressPercent;
  }

  public ResidencyEvidence outputFormat(OutputFormatEnum outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Get outputFormat
   * @return outputFormat
  */
  @NotNull   @Schema(name = "outputFormat", example = "PDF", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("outputFormat")
  public OutputFormatEnum getOutputFormat() {
    return outputFormat;
  }

  public void setOutputFormat(OutputFormatEnum outputFormat) {
    this.outputFormat = outputFormat;
  }

  public ResidencyEvidence summary(ResidencyEvidenceSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public ResidencyEvidenceSummary getSummary() {
    return summary;
  }

  public void setSummary(ResidencyEvidenceSummary summary) {
    this.summary = summary;
  }

  public ResidencyEvidence transferMechanisms(List<@Valid ResidencyEvidenceTransferMechanismsInner> transferMechanisms) {
    this.transferMechanisms = transferMechanisms;
    return this;
  }

  public ResidencyEvidence addTransferMechanismsItem(ResidencyEvidenceTransferMechanismsInner transferMechanismsItem) {
    if (this.transferMechanisms == null) {
      this.transferMechanisms = new ArrayList<>();
    }
    this.transferMechanisms.add(transferMechanismsItem);
    return this;
  }

  /**
   * Get transferMechanisms
   * @return transferMechanisms
  */
  @Valid   @Schema(name = "transferMechanisms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transferMechanisms")
  public List<@Valid ResidencyEvidenceTransferMechanismsInner> getTransferMechanisms() {
    return transferMechanisms;
  }

  public void setTransferMechanisms(List<@Valid ResidencyEvidenceTransferMechanismsInner> transferMechanisms) {
    this.transferMechanisms = transferMechanisms;
  }

  public ResidencyEvidence reportDownloadUrl(String reportDownloadUrl) {
    this.reportDownloadUrl = reportDownloadUrl;
    return this;
  }

  /**
   * Get reportDownloadUrl
   * @return reportDownloadUrl
  */
    @Schema(name = "reportDownloadUrl", example = "https://storage.googleapis.com/residency-evidence/gdpr-2026-q3.pdf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportDownloadUrl")
  public String getReportDownloadUrl() {
    return reportDownloadUrl;
  }

  public void setReportDownloadUrl(String reportDownloadUrl) {
    this.reportDownloadUrl = reportDownloadUrl;
  }

  public ResidencyEvidence reportSignature(ResidencyEvidenceReportSignature reportSignature) {
    this.reportSignature = reportSignature;
    return this;
  }

  /**
   * Get reportSignature
   * @return reportSignature
  */
  @Valid   @Schema(name = "reportSignature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reportSignature")
  public ResidencyEvidenceReportSignature getReportSignature() {
    return reportSignature;
  }

  public void setReportSignature(ResidencyEvidenceReportSignature reportSignature) {
    this.reportSignature = reportSignature;
  }

  public ResidencyEvidence evidenceVaultReference(String evidenceVaultReference) {
    this.evidenceVaultReference = evidenceVaultReference;
    return this;
  }

  /**
   * Get evidenceVaultReference
   * @return evidenceVaultReference
  */
    @Schema(name = "evidenceVaultReference", example = "compliance-evidence://gdpr/Art44/residency-q3-2026", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evidenceVaultReference")
  public String getEvidenceVaultReference() {
    return evidenceVaultReference;
  }

  public void setEvidenceVaultReference(String evidenceVaultReference) {
    this.evidenceVaultReference = evidenceVaultReference;
  }

  public ResidencyEvidence errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
    @Schema(name = "errorMessage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyEvidence residencyEvidence = (ResidencyEvidence) o;
    return Objects.equals(this.evidenceId, residencyEvidence.evidenceId) &&
        Objects.equals(this.framework, residencyEvidence.framework) &&
        Objects.equals(this.periodFrom, residencyEvidence.periodFrom) &&
        Objects.equals(this.periodTo, residencyEvidence.periodTo) &&
        Objects.equals(this.status, residencyEvidence.status) &&
        Objects.equals(this.requestedAt, residencyEvidence.requestedAt) &&
        Objects.equals(this.completedAt, residencyEvidence.completedAt) &&
        Objects.equals(this.progressPercent, residencyEvidence.progressPercent) &&
        Objects.equals(this.outputFormat, residencyEvidence.outputFormat) &&
        Objects.equals(this.summary, residencyEvidence.summary) &&
        Objects.equals(this.transferMechanisms, residencyEvidence.transferMechanisms) &&
        Objects.equals(this.reportDownloadUrl, residencyEvidence.reportDownloadUrl) &&
        Objects.equals(this.reportSignature, residencyEvidence.reportSignature) &&
        Objects.equals(this.evidenceVaultReference, residencyEvidence.evidenceVaultReference) &&
        Objects.equals(this.errorMessage, residencyEvidence.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidenceId, framework, periodFrom, periodTo, status, requestedAt, completedAt, progressPercent, outputFormat, summary, transferMechanisms, reportDownloadUrl, reportSignature, evidenceVaultReference, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyEvidence {\n");
    sb.append("    evidenceId: ").append(toIndentedString(evidenceId)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    periodFrom: ").append(toIndentedString(periodFrom)).append("\n");
    sb.append("    periodTo: ").append(toIndentedString(periodTo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    progressPercent: ").append(toIndentedString(progressPercent)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    transferMechanisms: ").append(toIndentedString(transferMechanisms)).append("\n");
    sb.append("    reportDownloadUrl: ").append(toIndentedString(reportDownloadUrl)).append("\n");
    sb.append("    reportSignature: ").append(toIndentedString(reportSignature)).append("\n");
    sb.append("    evidenceVaultReference: ").append(toIndentedString(evidenceVaultReference)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

