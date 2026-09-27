package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GenerateAuditEvidenceRequest
 */
@JsonTypeName("generateAuditEvidence_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class GenerateAuditEvidenceRequest {

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
  private OutputFormatEnum outputFormat = OutputFormatEnum.PDF;

  private Boolean includeRawDecisions = false;

  private Boolean includeTransferMechanisms = true;

  private Boolean signReport = true;

  public GenerateAuditEvidenceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateAuditEvidenceRequest(FrameworkEnum framework, LocalDate periodFrom, LocalDate periodTo, OutputFormatEnum outputFormat) {
    this.framework = framework;
    this.periodFrom = periodFrom;
    this.periodTo = periodTo;
    this.outputFormat = outputFormat;
  }

  public GenerateAuditEvidenceRequest framework(FrameworkEnum framework) {
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

  public GenerateAuditEvidenceRequest periodFrom(LocalDate periodFrom) {
    this.periodFrom = periodFrom;
    return this;
  }

  /**
   * Get periodFrom
   * @return periodFrom
  */
  @NotNull @Valid   @Schema(name = "periodFrom", example = "Thu Jan 01 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("periodFrom")
  public LocalDate getPeriodFrom() {
    return periodFrom;
  }

  public void setPeriodFrom(LocalDate periodFrom) {
    this.periodFrom = periodFrom;
  }

  public GenerateAuditEvidenceRequest periodTo(LocalDate periodTo) {
    this.periodTo = periodTo;
    return this;
  }

  /**
   * Get periodTo
   * @return periodTo
  */
  @NotNull @Valid   @Schema(name = "periodTo", example = "Wed Sep 30 00:00:00 GMT 2026", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("periodTo")
  public LocalDate getPeriodTo() {
    return periodTo;
  }

  public void setPeriodTo(LocalDate periodTo) {
    this.periodTo = periodTo;
  }

  public GenerateAuditEvidenceRequest outputFormat(OutputFormatEnum outputFormat) {
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

  public GenerateAuditEvidenceRequest includeRawDecisions(Boolean includeRawDecisions) {
    this.includeRawDecisions = includeRawDecisions;
    return this;
  }

  /**
   * Attach raw allow/block decisions as appendix.
   * @return includeRawDecisions
  */
    @Schema(name = "includeRawDecisions", example = "false", description = "Attach raw allow/block decisions as appendix.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeRawDecisions")
  public Boolean getIncludeRawDecisions() {
    return includeRawDecisions;
  }

  public void setIncludeRawDecisions(Boolean includeRawDecisions) {
    this.includeRawDecisions = includeRawDecisions;
  }

  public GenerateAuditEvidenceRequest includeTransferMechanisms(Boolean includeTransferMechanisms) {
    this.includeTransferMechanisms = includeTransferMechanisms;
    return this;
  }

  /**
   * Document SCC/BCC/adequacy mechanisms used.
   * @return includeTransferMechanisms
  */
    @Schema(name = "includeTransferMechanisms", example = "true", description = "Document SCC/BCC/adequacy mechanisms used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeTransferMechanisms")
  public Boolean getIncludeTransferMechanisms() {
    return includeTransferMechanisms;
  }

  public void setIncludeTransferMechanisms(Boolean includeTransferMechanisms) {
    this.includeTransferMechanisms = includeTransferMechanisms;
  }

  public GenerateAuditEvidenceRequest signReport(Boolean signReport) {
    this.signReport = signReport;
    return this;
  }

  /**
   * Get signReport
   * @return signReport
  */
    @Schema(name = "signReport", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signReport")
  public Boolean getSignReport() {
    return signReport;
  }

  public void setSignReport(Boolean signReport) {
    this.signReport = signReport;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateAuditEvidenceRequest generateAuditEvidenceRequest = (GenerateAuditEvidenceRequest) o;
    return Objects.equals(this.framework, generateAuditEvidenceRequest.framework) &&
        Objects.equals(this.periodFrom, generateAuditEvidenceRequest.periodFrom) &&
        Objects.equals(this.periodTo, generateAuditEvidenceRequest.periodTo) &&
        Objects.equals(this.outputFormat, generateAuditEvidenceRequest.outputFormat) &&
        Objects.equals(this.includeRawDecisions, generateAuditEvidenceRequest.includeRawDecisions) &&
        Objects.equals(this.includeTransferMechanisms, generateAuditEvidenceRequest.includeTransferMechanisms) &&
        Objects.equals(this.signReport, generateAuditEvidenceRequest.signReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(framework, periodFrom, periodTo, outputFormat, includeRawDecisions, includeTransferMechanisms, signReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateAuditEvidenceRequest {\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    periodFrom: ").append(toIndentedString(periodFrom)).append("\n");
    sb.append("    periodTo: ").append(toIndentedString(periodTo)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("    includeRawDecisions: ").append(toIndentedString(includeRawDecisions)).append("\n");
    sb.append("    includeTransferMechanisms: ").append(toIndentedString(includeTransferMechanisms)).append("\n");
    sb.append("    signReport: ").append(toIndentedString(signReport)).append("\n");
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

