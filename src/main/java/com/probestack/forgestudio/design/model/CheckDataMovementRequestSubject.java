package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Which data subject/tenant/record this concerns.
 */
@Schema(name = "checkDataMovement_request_subject", description = "Which data subject/tenant/record this concerns.")
@JsonTypeName("checkDataMovement_request_subject")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class CheckDataMovementRequestSubject {

  private String tenantId;

  private String dataSubjectCountry;

  private Integer recordCount;

  public CheckDataMovementRequestSubject tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
    @Schema(name = "tenantId", example = "tenant-acme-eu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CheckDataMovementRequestSubject dataSubjectCountry(String dataSubjectCountry) {
    this.dataSubjectCountry = dataSubjectCountry;
    return this;
  }

  /**
   * ISO country code of data subject.
   * @return dataSubjectCountry
  */
    @Schema(name = "dataSubjectCountry", example = "DE", description = "ISO country code of data subject.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSubjectCountry")
  public String getDataSubjectCountry() {
    return dataSubjectCountry;
  }

  public void setDataSubjectCountry(String dataSubjectCountry) {
    this.dataSubjectCountry = dataSubjectCountry;
  }

  public CheckDataMovementRequestSubject recordCount(Integer recordCount) {
    this.recordCount = recordCount;
    return this;
  }

  /**
   * Get recordCount
   * @return recordCount
  */
    @Schema(name = "recordCount", example = "45000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordCount")
  public Integer getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Integer recordCount) {
    this.recordCount = recordCount;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDataMovementRequestSubject checkDataMovementRequestSubject = (CheckDataMovementRequestSubject) o;
    return Objects.equals(this.tenantId, checkDataMovementRequestSubject.tenantId) &&
        Objects.equals(this.dataSubjectCountry, checkDataMovementRequestSubject.dataSubjectCountry) &&
        Objects.equals(this.recordCount, checkDataMovementRequestSubject.recordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, dataSubjectCountry, recordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDataMovementRequestSubject {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    dataSubjectCountry: ").append(toIndentedString(dataSubjectCountry)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
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

