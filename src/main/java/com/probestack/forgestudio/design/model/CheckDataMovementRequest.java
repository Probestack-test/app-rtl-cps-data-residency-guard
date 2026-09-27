package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.CheckDataMovementRequestSubject;
import java.util.UUID;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CheckDataMovementRequest
 */
@JsonTypeName("checkDataMovement_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class CheckDataMovementRequest {

  /**
   * Gets or Sets dataClassification
   */
  public enum DataClassificationEnum {
    PII("PII"),
    
    PHI("PHI"),
    
    PCI("PCI"),
    
    FINANCIAL("FINANCIAL"),
    
    CUSTOMER_CONTENT("CUSTOMER_CONTENT"),
    
    AUTHENTICATION("AUTHENTICATION"),
    
    TELEMETRY("TELEMETRY"),
    
    PUBLIC("PUBLIC"),
    
    INTERNAL("INTERNAL");

    private String value;

    DataClassificationEnum(String value) {
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
    public static DataClassificationEnum fromValue(String value) {
      for (DataClassificationEnum b : DataClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DataClassificationEnum dataClassification;

  private String sourceRegion;

  private String destinationRegion;

  /**
   * Gets or Sets operation
   */
  public enum OperationEnum {
    REPLICATION("REPLICATION"),
    
    BACKUP("BACKUP"),
    
    CACHE_POPULATE("CACHE_POPULATE"),
    
    ANALYTICS_EXPORT("ANALYTICS_EXPORT"),
    
    ML_TRAINING("ML_TRAINING"),
    
    CDN_PUSH("CDN_PUSH"),
    
    LOG_SHIPPING("LOG_SHIPPING"),
    
    DATA_WAREHOUSE_LOAD("DATA_WAREHOUSE_LOAD"),
    
    THIRD_PARTY_TRANSFER("THIRD_PARTY_TRANSFER"),
    
    API_READ("API_READ"),
    
    API_WRITE("API_WRITE");

    private String value;

    OperationEnum(String value) {
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
    public static OperationEnum fromValue(String value) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private OperationEnum operation;

  private CheckDataMovementRequestSubject subject;

  private String purpose;

  private String requestingService;

  private UUID correlationId;

  public CheckDataMovementRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CheckDataMovementRequest(DataClassificationEnum dataClassification, String sourceRegion, String destinationRegion, OperationEnum operation, CheckDataMovementRequestSubject subject) {
    this.dataClassification = dataClassification;
    this.sourceRegion = sourceRegion;
    this.destinationRegion = destinationRegion;
    this.operation = operation;
    this.subject = subject;
  }

  public CheckDataMovementRequest dataClassification(DataClassificationEnum dataClassification) {
    this.dataClassification = dataClassification;
    return this;
  }

  /**
   * Get dataClassification
   * @return dataClassification
  */
  @NotNull   @Schema(name = "dataClassification", example = "PII", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataClassification")
  public DataClassificationEnum getDataClassification() {
    return dataClassification;
  }

  public void setDataClassification(DataClassificationEnum dataClassification) {
    this.dataClassification = dataClassification;
  }

  public CheckDataMovementRequest sourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
    return this;
  }

  /**
   * Get sourceRegion
   * @return sourceRegion
  */
  @NotNull   @Schema(name = "sourceRegion", example = "eu-west-1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sourceRegion")
  public String getSourceRegion() {
    return sourceRegion;
  }

  public void setSourceRegion(String sourceRegion) {
    this.sourceRegion = sourceRegion;
  }

  public CheckDataMovementRequest destinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
    return this;
  }

  /**
   * Get destinationRegion
   * @return destinationRegion
  */
  @NotNull   @Schema(name = "destinationRegion", example = "us-east-1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("destinationRegion")
  public String getDestinationRegion() {
    return destinationRegion;
  }

  public void setDestinationRegion(String destinationRegion) {
    this.destinationRegion = destinationRegion;
  }

  public CheckDataMovementRequest operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
  @NotNull   @Schema(name = "operation", example = "ML_TRAINING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }

  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  public CheckDataMovementRequest subject(CheckDataMovementRequestSubject subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  @NotNull @Valid   @Schema(name = "subject", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subject")
  public CheckDataMovementRequestSubject getSubject() {
    return subject;
  }

  public void setSubject(CheckDataMovementRequestSubject subject) {
    this.subject = subject;
  }

  public CheckDataMovementRequest purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * Get purpose
   * @return purpose
  */
    @Schema(name = "purpose", example = "Fraud detection model training", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public CheckDataMovementRequest requestingService(String requestingService) {
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

  public CheckDataMovementRequest correlationId(UUID correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * Get correlationId
   * @return correlationId
  */
  @Valid   @Schema(name = "correlationId", example = "a1b2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlationId")
  public UUID getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(UUID correlationId) {
    this.correlationId = correlationId;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckDataMovementRequest checkDataMovementRequest = (CheckDataMovementRequest) o;
    return Objects.equals(this.dataClassification, checkDataMovementRequest.dataClassification) &&
        Objects.equals(this.sourceRegion, checkDataMovementRequest.sourceRegion) &&
        Objects.equals(this.destinationRegion, checkDataMovementRequest.destinationRegion) &&
        Objects.equals(this.operation, checkDataMovementRequest.operation) &&
        Objects.equals(this.subject, checkDataMovementRequest.subject) &&
        Objects.equals(this.purpose, checkDataMovementRequest.purpose) &&
        Objects.equals(this.requestingService, checkDataMovementRequest.requestingService) &&
        Objects.equals(this.correlationId, checkDataMovementRequest.correlationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataClassification, sourceRegion, destinationRegion, operation, subject, purpose, requestingService, correlationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckDataMovementRequest {\n");
    sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
    sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
    sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    requestingService: ").append(toIndentedString(requestingService)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
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

