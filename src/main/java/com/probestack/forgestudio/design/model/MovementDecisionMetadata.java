package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MovementDecisionMetadata
 */
@JsonTypeName("MovementDecision_metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class MovementDecisionMetadata {

  private String dataClassification;

  private String sourceRegion;

  private String destinationRegion;

  private String operation;

  private String requestingService;

  private Integer recordCount;

  public MovementDecisionMetadata dataClassification(String dataClassification) {
    this.dataClassification = dataClassification;
    return this;
  }

  /**
   * Get dataClassification
   * @return dataClassification
  */
    @Schema(name = "dataClassification", example = "PII", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataClassification")
  public String getDataClassification() {
    return dataClassification;
  }

  public void setDataClassification(String dataClassification) {
    this.dataClassification = dataClassification;
  }

  public MovementDecisionMetadata sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

  /**
   * Get sourceRegion
   * @return sourceRegion
  */
    @Schema(name = "sourceRegion", example = "eu-west-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceRegion")
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }

  public MovementDecisionMetadata destinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
    return this;
  }

  /**
   * Get destinationRegion
   * @return destinationRegion
  */
    @Schema(name = "destinationRegion", example = "us-east-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destinationRegion")
  public String getDestinationRegion() {
    return destinationRegion;
  }

  public void setDestinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
  }

  public MovementDecisionMetadata operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
    @Schema(name = "operation", example = "ML_TRAINING", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operation")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public MovementDecisionMetadata requestingService(String requestingService) {
    this.requestingService = requestingService;
    return this;
  }

  /**
   * Get requestingService
   * @return requestingService
  */
    @Schema(name = "requestingService", example = "ml-platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestingService")
  public String getRequestingService() {
    return requestingService;
  }

  public void setRequestingService(String requestingService) {
    this.requestingService = requestingService;
  }

  public MovementDecisionMetadata recordCount(Integer recordCount) {
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
    MovementDecisionMetadata movementDecisionMetadata = (MovementDecisionMetadata) o;
    return Objects.equals(this.dataClassification, movementDecisionMetadata.dataClassification) &&
        Objects.equals(this.sourceRegion, movementDecisionMetadata.sourceRegion) &&
        Objects.equals(this.destinationRegion, movementDecisionMetadata.destinationRegion) &&
        Objects.equals(this.operation, movementDecisionMetadata.operation) &&
        Objects.equals(this.requestingService, movementDecisionMetadata.requestingService) &&
        Objects.equals(this.recordCount, movementDecisionMetadata.recordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataClassification, sourceRegion, destinationRegion, operation, requestingService, recordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovementDecisionMetadata {\n");
    sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    requestingService: ").append(toIndentedString(requestingService)).append("\n");
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

