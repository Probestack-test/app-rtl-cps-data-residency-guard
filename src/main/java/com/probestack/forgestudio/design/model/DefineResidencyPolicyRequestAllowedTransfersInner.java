package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DefineResidencyPolicyRequestAllowedTransfersInner
 */
@JsonTypeName("defineResidencyPolicy_request_allowedTransfers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class DefineResidencyPolicyRequestAllowedTransfersInner {

  private String destinationRegion;

  /**
   * Gets or Sets mechanism
   */
  public enum MechanismEnum {
    STANDARD_CONTRACTUAL_CLAUSES("STANDARD_CONTRACTUAL_CLAUSES"),
    
    BINDING_CORPORATE_RULES("BINDING_CORPORATE_RULES"),
    
    ADEQUACY_DECISION("ADEQUACY_DECISION"),
    
    EXPLICIT_CONSENT("EXPLICIT_CONSENT"),
    
    CONTRACT_NECESSITY("CONTRACT_NECESSITY");

    private String value;

    MechanismEnum(String value) {
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
    public static MechanismEnum fromValue(String value) {
      for (MechanismEnum b : MechanismEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private MechanismEnum mechanism;

  private String approvalReference;

  public DefineResidencyPolicyRequestAllowedTransfersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DefineResidencyPolicyRequestAllowedTransfersInner(String destinationRegion, MechanismEnum mechanism) {
    this.destinationRegion = destinationRegion;
    this.mechanism = mechanism;
  }

  public DefineResidencyPolicyRequestAllowedTransfersInner destinationRegion(String destinationRegion) {
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

  public DefineResidencyPolicyRequestAllowedTransfersInner mechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
    return this;
  }

  /**
   * Get mechanism
   * @return mechanism
  */
  @NotNull   @Schema(name = "mechanism", example = "STANDARD_CONTRACTUAL_CLAUSES", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mechanism")
  public MechanismEnum getMechanism() {
    return mechanism;
  }

  public void setMechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
  }

  public DefineResidencyPolicyRequestAllowedTransfersInner approvalReference(String approvalReference) {
    this.approvalReference = approvalReference;
    return this;
  }

  /**
   * Get approvalReference
   * @return approvalReference
  */
    @Schema(name = "approvalReference", example = "DPA-2026-001", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalReference")
  public String getApprovalReference() {
    return approvalReference;
  }

  public void setApprovalReference(String approvalReference) {
    this.approvalReference = approvalReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefineResidencyPolicyRequestAllowedTransfersInner defineResidencyPolicyRequestAllowedTransfersInner = (DefineResidencyPolicyRequestAllowedTransfersInner) o;
    return Objects.equals(this.destinationRegion, defineResidencyPolicyRequestAllowedTransfersInner.destinationRegion) &&
        Objects.equals(this.mechanism, defineResidencyPolicyRequestAllowedTransfersInner.mechanism) &&
        Objects.equals(this.approvalReference, defineResidencyPolicyRequestAllowedTransfersInner.approvalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationRegion, mechanism, approvalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefineResidencyPolicyRequestAllowedTransfersInner {\n");
    sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
    sb.append("    approvalReference: ").append(toIndentedString(approvalReference)).append("\n");
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

