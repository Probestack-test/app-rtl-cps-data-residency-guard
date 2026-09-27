package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.ResidencyPolicyAllowedTransfersInner;
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
 * ResidencyPolicy
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class ResidencyPolicy {

  private UUID policyId;

  private String policyName;

  private String description;

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

  /**
   * Gets or Sets regulatoryFramework
   */
  public enum RegulatoryFrameworkEnum {
    GDPR("GDPR"),
    
    SCHREMS_II("SCHREMS_II"),
    
    DPDP_INDIA("DPDP_INDIA"),
    
    HIPAA("HIPAA"),
    
    PIPL_CHINA("PIPL_CHINA"),
    
    LGPD_BRAZIL("LGPD_BRAZIL"),
    
    PIPEDA_CANADA("PIPEDA_CANADA"),
    
    APPI_JAPAN("APPI_JAPAN"),
    
    POPIA_SOUTH_AFRICA("POPIA_SOUTH_AFRICA"),
    
    NONE("NONE");

    private String value;

    RegulatoryFrameworkEnum(String value) {
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
    public static RegulatoryFrameworkEnum fromValue(String value) {
      for (RegulatoryFrameworkEnum b : RegulatoryFrameworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RegulatoryFrameworkEnum regulatoryFramework;

  @Valid
  private List<String> allowedRegions = new ArrayList<>();

  @Valid
  private List<String> prohibitedRegions;

  @Valid
  private List<@Valid ResidencyPolicyAllowedTransfersInner> allowedTransfers;

  /**
   * Gets or Sets enforcementMode
   */
  public enum EnforcementModeEnum {
    BLOCK("BLOCK"),
    
    AUDIT_ONLY("AUDIT_ONLY"),
    
    WARN("WARN"),
    
    AUTO_ROUTE("AUTO_ROUTE");

    private String value;

    EnforcementModeEnum(String value) {
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
    public static EnforcementModeEnum fromValue(String value) {
      for (EnforcementModeEnum b : EnforcementModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnforcementModeEnum enforcementMode;

  @Valid
  private List<String> dataSubjectCountries;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    PENDING_APPROVAL("PENDING_APPROVAL"),
    
    ACTIVE("ACTIVE"),
    
    SUSPENDED("SUSPENDED"),
    
    RETIRED("RETIRED");

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

  private String owner;

  @Valid
  private List<String> approvers;

  @Valid
  private List<String> approvedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime approvedAt;

  private Integer retentionDays;

  @Valid
  private List<String> tags;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private Integer enforcementCount30d;

  private Integer blockedCount30d;

  public ResidencyPolicy() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResidencyPolicy(UUID policyId, String policyName, DataClassificationEnum dataClassification, RegulatoryFrameworkEnum regulatoryFramework, List<String> allowedRegions, EnforcementModeEnum enforcementMode, StatusEnum status, OffsetDateTime createdAt) {
    this.policyId = policyId;
    this.policyName = policyName;
    this.dataClassification = dataClassification;
    this.regulatoryFramework = regulatoryFramework;
    this.allowedRegions = allowedRegions;
    this.enforcementMode = enforcementMode;
    this.status = status;
    this.createdAt = createdAt;
  }

  public ResidencyPolicy policyId(UUID policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
  */
  @NotNull @Valid   @Schema(name = "policyId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("policyId")
  public UUID getPolicyId() {
    return policyId;
  }

  public void setPolicyId(UUID policyId) {
    this.policyId = policyId;
  }

  public ResidencyPolicy policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
  @NotNull   @Schema(name = "policyName", example = "eu-customer-data-gdpr", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public ResidencyPolicy description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
    @Schema(name = "description", example = "EU customer PII must remain in EU regions per GDPR Art. 44-50.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResidencyPolicy dataClassification(DataClassificationEnum dataClassification) {
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

  public ResidencyPolicy regulatoryFramework(RegulatoryFrameworkEnum regulatoryFramework) {
    this.regulatoryFramework = regulatoryFramework;
    return this;
  }

  /**
   * Get regulatoryFramework
   * @return regulatoryFramework
  */
  @NotNull   @Schema(name = "regulatoryFramework", example = "GDPR", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regulatoryFramework")
  public RegulatoryFrameworkEnum getRegulatoryFramework() {
    return regulatoryFramework;
  }

  public void setRegulatoryFramework(RegulatoryFrameworkEnum regulatoryFramework) {
    this.regulatoryFramework = regulatoryFramework;
  }

  public ResidencyPolicy allowedRegions(List<String> allowedRegions) {
    this.allowedRegions = allowedRegions;
    return this;
  }

  public ResidencyPolicy addAllowedRegionsItem(String allowedRegionsItem) {
    if (this.allowedRegions == null) {
      this.allowedRegions = new ArrayList<>();
    }
    this.allowedRegions.add(allowedRegionsItem);
    return this;
  }

  /**
   * Get allowedRegions
   * @return allowedRegions
  */
  @NotNull   @Schema(name = "allowedRegions", example = "[\"eu-west-1\",\"eu-central-1\",\"eu-north-1\"]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allowedRegions")
  public List<String> getAllowedRegions() {
    return allowedRegions;
  }

  public void setAllowedRegions(List<String> allowedRegions) {
    this.allowedRegions = allowedRegions;
  }

  public ResidencyPolicy prohibitedRegions(List<String> prohibitedRegions) {
    this.prohibitedRegions = prohibitedRegions;
    return this;
  }

  public ResidencyPolicy addProhibitedRegionsItem(String prohibitedRegionsItem) {
    if (this.prohibitedRegions == null) {
      this.prohibitedRegions = new ArrayList<>();
    }
    this.prohibitedRegions.add(prohibitedRegionsItem);
    return this;
  }

  /**
   * Get prohibitedRegions
   * @return prohibitedRegions
  */
    @Schema(name = "prohibitedRegions", example = "[\"us-east-1\",\"us-west-2\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prohibitedRegions")
  public List<String> getProhibitedRegions() {
    return prohibitedRegions;
  }

  public void setProhibitedRegions(List<String> prohibitedRegions) {
    this.prohibitedRegions = prohibitedRegions;
  }

  public ResidencyPolicy allowedTransfers(List<@Valid ResidencyPolicyAllowedTransfersInner> allowedTransfers) {
    this.allowedTransfers = allowedTransfers;
    return this;
  }

  public ResidencyPolicy addAllowedTransfersItem(ResidencyPolicyAllowedTransfersInner allowedTransfersItem) {
    if (this.allowedTransfers == null) {
      this.allowedTransfers = new ArrayList<>();
    }
    this.allowedTransfers.add(allowedTransfersItem);
    return this;
  }

  /**
   * Get allowedTransfers
   * @return allowedTransfers
  */
  @Valid   @Schema(name = "allowedTransfers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedTransfers")
  public List<@Valid ResidencyPolicyAllowedTransfersInner> getAllowedTransfers() {
    return allowedTransfers;
  }

  public void setAllowedTransfers(List<@Valid ResidencyPolicyAllowedTransfersInner> allowedTransfers) {
    this.allowedTransfers = allowedTransfers;
  }

  public ResidencyPolicy enforcementMode(EnforcementModeEnum enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * Get enforcementMode
   * @return enforcementMode
  */
  @NotNull   @Schema(name = "enforcementMode", example = "BLOCK", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enforcementMode")
  public EnforcementModeEnum getEnforcementMode() {
    return enforcementMode;
  }

  public void setEnforcementMode(EnforcementModeEnum enforcementMode) {
    this.enforcementMode = enforcementMode;
  }

  public ResidencyPolicy dataSubjectCountries(List<String> dataSubjectCountries) {
    this.dataSubjectCountries = dataSubjectCountries;
    return this;
  }

  public ResidencyPolicy addDataSubjectCountriesItem(String dataSubjectCountriesItem) {
    if (this.dataSubjectCountries == null) {
      this.dataSubjectCountries = new ArrayList<>();
    }
    this.dataSubjectCountries.add(dataSubjectCountriesItem);
    return this;
  }

  /**
   * Get dataSubjectCountries
   * @return dataSubjectCountries
  */
    @Schema(name = "dataSubjectCountries", example = "[\"DE\",\"FR\",\"IT\",\"ES\",\"NL\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSubjectCountries")
  public List<String> getDataSubjectCountries() {
    return dataSubjectCountries;
  }

  public void setDataSubjectCountries(List<String> dataSubjectCountries) {
    this.dataSubjectCountries = dataSubjectCountries;
  }

  public ResidencyPolicy status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "ACTIVE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ResidencyPolicy owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
    @Schema(name = "owner", example = "privacy-office@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ResidencyPolicy approvers(List<String> approvers) {
    this.approvers = approvers;
    return this;
  }

  public ResidencyPolicy addApproversItem(String approversItem) {
    if (this.approvers == null) {
      this.approvers = new ArrayList<>();
    }
    this.approvers.add(approversItem);
    return this;
  }

  /**
   * Get approvers
   * @return approvers
  */
    @Schema(name = "approvers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvers")
  public List<String> getApprovers() {
    return approvers;
  }

  public void setApprovers(List<String> approvers) {
    this.approvers = approvers;
  }

  public ResidencyPolicy approvedBy(List<String> approvedBy) {
    this.approvedBy = approvedBy;
    return this;
  }

  public ResidencyPolicy addApprovedByItem(String approvedByItem) {
    if (this.approvedBy == null) {
      this.approvedBy = new ArrayList<>();
    }
    this.approvedBy.add(approvedByItem);
    return this;
  }

  /**
   * Get approvedBy
   * @return approvedBy
  */
    @Schema(name = "approvedBy", example = "[\"dpo@forgesphere.example.com\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvedBy")
  public List<String> getApprovedBy() {
    return approvedBy;
  }

  public void setApprovedBy(List<String> approvedBy) {
    this.approvedBy = approvedBy;
  }

  public ResidencyPolicy approvedAt(OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
    return this;
  }

  /**
   * Get approvedAt
   * @return approvedAt
  */
  @Valid   @Schema(name = "approvedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvedAt")
  public OffsetDateTime getApprovedAt() {
    return approvedAt;
  }

  public void setApprovedAt(OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
  }

  public ResidencyPolicy retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Get retentionDays
   * @return retentionDays
  */
    @Schema(name = "retentionDays", example = "2555", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionDays")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public ResidencyPolicy tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ResidencyPolicy addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
    @Schema(name = "tags", example = "[\"gdpr\",\"pii\",\"eu\",\"schrems-ii\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ResidencyPolicy createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @NotNull @Valid   @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ResidencyPolicy updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid   @Schema(name = "updatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ResidencyPolicy enforcementCount30d(Integer enforcementCount30d) {
    this.enforcementCount30d = enforcementCount30d;
    return this;
  }

  /**
   * How many times this policy blocked/audited a movement.
   * @return enforcementCount30d
  */
    @Schema(name = "enforcementCount30d", example = "342", description = "How many times this policy blocked/audited a movement.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enforcementCount30d")
  public Integer getEnforcementCount30d() {
    return enforcementCount30d;
  }

  public void setEnforcementCount30d(Integer enforcementCount30d) {
    this.enforcementCount30d = enforcementCount30d;
  }

  public ResidencyPolicy blockedCount30d(Integer blockedCount30d) {
    this.blockedCount30d = blockedCount30d;
    return this;
  }

  /**
   * Get blockedCount30d
   * @return blockedCount30d
  */
    @Schema(name = "blockedCount30d", example = "47", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("blockedCount30d")
  public Integer getBlockedCount30d() {
    return blockedCount30d;
  }

  public void setBlockedCount30d(Integer blockedCount30d) {
    this.blockedCount30d = blockedCount30d;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResidencyPolicy residencyPolicy = (ResidencyPolicy) o;
    return Objects.equals(this.policyId, residencyPolicy.policyId) &&
        Objects.equals(this.policyName, residencyPolicy.policyName) &&
        Objects.equals(this.description, residencyPolicy.description) &&
        Objects.equals(this.dataClassification, residencyPolicy.dataClassification) &&
        Objects.equals(this.regulatoryFramework, residencyPolicy.regulatoryFramework) &&
        Objects.equals(this.allowedRegions, residencyPolicy.allowedRegions) &&
        Objects.equals(this.prohibitedRegions, residencyPolicy.prohibitedRegions) &&
        Objects.equals(this.allowedTransfers, residencyPolicy.allowedTransfers) &&
        Objects.equals(this.enforcementMode, residencyPolicy.enforcementMode) &&
        Objects.equals(this.dataSubjectCountries, residencyPolicy.dataSubjectCountries) &&
        Objects.equals(this.status, residencyPolicy.status) &&
        Objects.equals(this.owner, residencyPolicy.owner) &&
        Objects.equals(this.approvers, residencyPolicy.approvers) &&
        Objects.equals(this.approvedBy, residencyPolicy.approvedBy) &&
        Objects.equals(this.approvedAt, residencyPolicy.approvedAt) &&
        Objects.equals(this.retentionDays, residencyPolicy.retentionDays) &&
        Objects.equals(this.tags, residencyPolicy.tags) &&
        Objects.equals(this.createdAt, residencyPolicy.createdAt) &&
        Objects.equals(this.updatedAt, residencyPolicy.updatedAt) &&
        Objects.equals(this.enforcementCount30d, residencyPolicy.enforcementCount30d) &&
        Objects.equals(this.blockedCount30d, residencyPolicy.blockedCount30d);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyId, policyName, description, dataClassification, regulatoryFramework, allowedRegions, prohibitedRegions, allowedTransfers, enforcementMode, dataSubjectCountries, status, owner, approvers, approvedBy, approvedAt, retentionDays, tags, createdAt, updatedAt, enforcementCount30d, blockedCount30d);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResidencyPolicy {\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
    sb.append("    regulatoryFramework: ").append(toIndentedString(regulatoryFramework)).append("\n");
    sb.append("    allowedRegions: ").append(toIndentedString(allowedRegions)).append("\n");
    sb.append("    prohibitedRegions: ").append(toIndentedString(prohibitedRegions)).append("\n");
    sb.append("    allowedTransfers: ").append(toIndentedString(allowedTransfers)).append("\n");
    sb.append("    enforcementMode: ").append(toIndentedString(enforcementMode)).append("\n");
    sb.append("    dataSubjectCountries: ").append(toIndentedString(dataSubjectCountries)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    approvedBy: ").append(toIndentedString(approvedBy)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    enforcementCount30d: ").append(toIndentedString(enforcementCount30d)).append("\n");
    sb.append("    blockedCount30d: ").append(toIndentedString(blockedCount30d)).append("\n");
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

