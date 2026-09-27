package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResidencyEvidenceReportSignature
 */
@JsonTypeName("ResidencyEvidence_reportSignature")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyEvidenceReportSignature {

  private String algorithm;

  private String sha256Hash;

  private String signedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime signedAt;

  public ResidencyEvidenceReportSignature algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Get algorithm
   * @return algorithm
  */
    @Schema(name = "algorithm", example = "SHA256_RSA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("algorithm")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public ResidencyEvidenceReportSignature sha256Hash(String sha256Hash) {
    this.sha256Hash = sha256Hash;
    return this;
  }

  /**
   * Get sha256Hash
   * @return sha256Hash
  */
    @Schema(name = "sha256Hash", example = "3a7bd3e2360a3d29eea436fcfb7e44c735d117c42d1c1835420b6b9942dd4f1b", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sha256Hash")
  public String getSha256Hash() {
    return sha256Hash;
  }

  public void setSha256Hash(String sha256Hash) {
    this.sha256Hash = sha256Hash;
  }

  public ResidencyEvidenceReportSignature signedBy(String signedBy) {
    this.signedBy = signedBy;
    return this;
  }

  /**
   * Get signedBy
   * @return signedBy
  */
    @Schema(name = "signedBy", example = "dpo@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signedBy")
  public String getSignedBy() {
    return signedBy;
  }

  public void setSignedBy(String signedBy) {
    this.signedBy = signedBy;
  }

  public ResidencyEvidenceReportSignature signedAt(OffsetDateTime signedAt) {
    this.signedAt = signedAt;
    return this;
  }

  /**
   * Get signedAt
   * @return signedAt
  */
  @Valid   @Schema(name = "signedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signedAt")
  public OffsetDateTime getSignedAt() {
    return signedAt;
  }

  public void setSignedAt(OffsetDateTime signedAt) {
    this.signedAt = signedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyEvidenceReportSignature residencyEvidenceReportSignature = (ResidencyEvidenceReportSignature) o;
    return Objects.equals(this.algorithm, residencyEvidenceReportSignature.algorithm) &&
        Objects.equals(this.sha256Hash, residencyEvidenceReportSignature.sha256Hash) &&
        Objects.equals(this.signedBy, residencyEvidenceReportSignature.signedBy) &&
        Objects.equals(this.signedAt, residencyEvidenceReportSignature.signedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, sha256Hash, signedBy, signedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyEvidenceReportSignature {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    sha256Hash: ").append(toIndentedString(sha256Hash)).append("\n");
    sb.append("    signedBy: ").append(toIndentedString(signedBy)).append("\n");
    sb.append("    signedAt: ").append(toIndentedString(signedAt)).append("\n");
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

