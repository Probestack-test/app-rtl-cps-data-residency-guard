package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResidencyMapRegionsInner
 */
@JsonTypeName("ResidencyMap_regions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyMapRegionsInner {

  private String region;

  /**
   * Gets or Sets provider
   */
  public enum ProviderEnum {
    AWS("AWS"),
    
    GCP("GCP"),
    
    AZURE("AZURE"),
    
    ON_PREM("ON_PREM"),
    
    OTHER("OTHER");

    private String value;

    ProviderEnum(String value) {
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
    public static ProviderEnum fromValue(String value) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ProviderEnum provider;

  private String jurisdiction;

  /**
   * Gets or Sets adequacyStatus
   */
  public enum AdequacyStatusEnum {
    ADEQUATE("ADEQUATE"),
    
    PARTIAL("PARTIAL"),
    
    NOT_ADEQUATE("NOT_ADEQUATE"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    AdequacyStatusEnum(String value) {
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
    public static AdequacyStatusEnum fromValue(String value) {
      for (AdequacyStatusEnum b : AdequacyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private AdequacyStatusEnum adequacyStatus;

  private Integer storageUsedBytes;

  @Valid
  private Map<String, Integer> dataClassificationCounts = new HashMap<>();

  @Valid
  private List<String> activePolicies;

  /**
   * Gets or Sets complianceStatus
   */
  public enum ComplianceStatusEnum {
    COMPLIANT("COMPLIANT"),
    
    NON_COMPLIANT("NON_COMPLIANT"),
    
    UNDER_REVIEW("UNDER_REVIEW"),
    
    EXEMPT("EXEMPT");

    private String value;

    ComplianceStatusEnum(String value) {
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
    public static ComplianceStatusEnum fromValue(String value) {
      for (ComplianceStatusEnum b : ComplianceStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ComplianceStatusEnum complianceStatus;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastVerifiedAt;

  public ResidencyMapRegionsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResidencyMapRegionsInner(String region, Integer storageUsedBytes, Map<String, Integer> dataClassificationCounts) {
    this.region = region;
    this.storageUsedBytes = storageUsedBytes;
    this.dataClassificationCounts = dataClassificationCounts;
  }

  public ResidencyMapRegionsInner region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
  @NotNull   @Schema(name = "region", example = "eu-west-1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ResidencyMapRegionsInner provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
    @Schema(name = "provider", example = "AWS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public ResidencyMapRegionsInner jurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
    return this;
  }

  /**
   * Legal jurisdiction.
   * @return jurisdiction
  */
    @Schema(name = "jurisdiction", example = "European Union", description = "Legal jurisdiction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jurisdiction")
  public String getJurisdiction() {
    return jurisdiction;
  }

  public void setJurisdiction(String jurisdiction) {
    this.jurisdiction = jurisdiction;
  }

  public ResidencyMapRegionsInner adequacyStatus(AdequacyStatusEnum adequacyStatus) {
    this.adequacyStatus = adequacyStatus;
    return this;
  }

  /**
   * Get adequacyStatus
   * @return adequacyStatus
  */
    @Schema(name = "adequacyStatus", example = "ADEQUATE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adequacyStatus")
  public AdequacyStatusEnum getAdequacyStatus() {
    return adequacyStatus;
  }

  public void setAdequacyStatus(AdequacyStatusEnum adequacyStatus) {
    this.adequacyStatus = adequacyStatus;
  }

  public ResidencyMapRegionsInner storageUsedBytes(Integer storageUsedBytes) {
    this.storageUsedBytes = storageUsedBytes;
    return this;
  }

  /**
   * Get storageUsedBytes
   * @return storageUsedBytes
  */
  @NotNull   @Schema(name = "storageUsedBytes", example = "1284500000000", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("storageUsedBytes")
  public Integer getStorageUsedBytes() {
    return storageUsedBytes;
  }

  public void setStorageUsedBytes(Integer storageUsedBytes) {
    this.storageUsedBytes = storageUsedBytes;
  }

  public ResidencyMapRegionsInner dataClassificationCounts(Map<String, Integer> dataClassificationCounts) {
    this.dataClassificationCounts = dataClassificationCounts;
    return this;
  }

  public ResidencyMapRegionsInner putDataClassificationCountsItem(String key, Integer dataClassificationCountsItem) {
    if (this.dataClassificationCounts == null) {
      this.dataClassificationCounts = new HashMap<>();
    }
    this.dataClassificationCounts.put(key, dataClassificationCountsItem);
    return this;
  }

  /**
   * Get dataClassificationCounts
   * @return dataClassificationCounts
  */
  @NotNull   @Schema(name = "dataClassificationCounts", example = "{\"PII\":45000000,\"PCI\":12000000,\"FINANCIAL\":8500000}", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dataClassificationCounts")
  public Map<String, Integer> getDataClassificationCounts() {
    return dataClassificationCounts;
  }

  public void setDataClassificationCounts(Map<String, Integer> dataClassificationCounts) {
    this.dataClassificationCounts = dataClassificationCounts;
  }

  public ResidencyMapRegionsInner activePolicies(List<String> activePolicies) {
    this.activePolicies = activePolicies;
    return this;
  }

  public ResidencyMapRegionsInner addActivePoliciesItem(String activePoliciesItem) {
    if (this.activePolicies == null) {
      this.activePolicies = new ArrayList<>();
    }
    this.activePolicies.add(activePoliciesItem);
    return this;
  }

  /**
   * Get activePolicies
   * @return activePolicies
  */
    @Schema(name = "activePolicies", example = "[\"eu-customer-data-gdpr\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activePolicies")
  public List<String> getActivePolicies() {
    return activePolicies;
  }

  public void setActivePolicies(List<String> activePolicies) {
    this.activePolicies = activePolicies;
  }

  public ResidencyMapRegionsInner complianceStatus(ComplianceStatusEnum complianceStatus) {
    this.complianceStatus = complianceStatus;
    return this;
  }

  /**
   * Get complianceStatus
   * @return complianceStatus
  */
    @Schema(name = "complianceStatus", example = "COMPLIANT", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complianceStatus")
  public ComplianceStatusEnum getComplianceStatus() {
    return complianceStatus;
  }

  public void setComplianceStatus(ComplianceStatusEnum complianceStatus) {
    this.complianceStatus = complianceStatus;
  }

  public ResidencyMapRegionsInner lastVerifiedAt(OffsetDateTime lastVerifiedAt) {
    this.lastVerifiedAt = lastVerifiedAt;
    return this;
  }

  /**
   * Get lastVerifiedAt
   * @return lastVerifiedAt
  */
  @Valid   @Schema(name = "lastVerifiedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastVerifiedAt")
  public OffsetDateTime getLastVerifiedAt() {
    return lastVerifiedAt;
  }

  public void setLastVerifiedAt(OffsetDateTime lastVerifiedAt) {
    this.lastVerifiedAt = lastVerifiedAt;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyMapRegionsInner residencyMapRegionsInner = (ResidencyMapRegionsInner) o;
    return Objects.equals(this.region, residencyMapRegionsInner.region) &&
        Objects.equals(this.provider, residencyMapRegionsInner.provider) &&
        Objects.equals(this.jurisdiction, residencyMapRegionsInner.jurisdiction) &&
        Objects.equals(this.adequacyStatus, residencyMapRegionsInner.adequacyStatus) &&
        Objects.equals(this.storageUsedBytes, residencyMapRegionsInner.storageUsedBytes) &&
        Objects.equals(this.dataClassificationCounts, residencyMapRegionsInner.dataClassificationCounts) &&
        Objects.equals(this.activePolicies, residencyMapRegionsInner.activePolicies) &&
        Objects.equals(this.complianceStatus, residencyMapRegionsInner.complianceStatus) &&
        Objects.equals(this.lastVerifiedAt, residencyMapRegionsInner.lastVerifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, provider, jurisdiction, adequacyStatus, storageUsedBytes, dataClassificationCounts, activePolicies, complianceStatus, lastVerifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyMapRegionsInner {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    adequacyStatus: ").append(toIndentedString(adequacyStatus)).append("\n");
    sb.append("    storageUsedBytes: ").append(toIndentedString(storageUsedBytes)).append("\n");
    sb.append("    dataClassificationCounts: ").append(toIndentedString(dataClassificationCounts)).append("\n");
    sb.append("    activePolicies: ").append(toIndentedString(activePolicies)).append("\n");
    sb.append("    complianceStatus: ").append(toIndentedString(complianceStatus)).append("\n");
    sb.append("    lastVerifiedAt: ").append(toIndentedString(lastVerifiedAt)).append("\n");
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

