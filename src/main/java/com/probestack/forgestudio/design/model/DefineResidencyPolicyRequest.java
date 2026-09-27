package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.DefineResidencyPolicyRequestAllowedTransfersInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DefineResidencyPolicyRequest
 */
@JsonTypeName("defineResidencyPolicy_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-09-27T07:05:50.076061285Z[GMT]")public class DefineResidencyPolicyRequest {

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
  private List<@Valid DefineResidencyPolicyRequestAllowedTransfersInner> allowedTransfers;

  /**
   * BLOCK = reject; WARN = allow + alert; AUDIT_ONLY = log only; AUTO_ROUTE = redirect to allowed region.
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

  private String owner;

  @Valid
  private List<String> approvers;

  private Integer retentionDays;

  @Valid
  private List<String> tags;

  public DefineResidencyPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DefineResidencyPolicyRequest(String policyName, DataClassificationEnum dataClassification, RegulatoryFrameworkEnum regulatoryFramework, List<String> allowedRegions, EnforcementModeEnum enforcementMode) {
    this.policyName = policyName;
    this.dataClassification = dataClassification;
    this.regulatoryFramework = regulatoryFramework;
    this.allowedRegions = allowedRegions;
    this.enforcementMode = enforcementMode;
  }

  public DefineResidencyPolicyRequest policyName(String policyName) {
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

  public DefineResidencyPolicyRequest description(String description) {
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

  public DefineResidencyPolicyRequest dataClassification(DataClassificationEnum dataClassification) {
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

  public DefineResidencyPolicyRequest regulatoryFramework(RegulatoryFrameworkEnum regulatoryFramework) {
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

  public DefineResidencyPolicyRequest allowedRegions(List<String> allowedRegions) {
    this.allowedRegions = allowedRegions;
    return this;
  }

  public DefineResidencyPolicyRequest addAllowedRegionsItem(String allowedRegionsItem) {
    if (this.allowedRegions == null) {
      this.allowedRegions = new ArrayList<>();
    }
    this.allowedRegions.add(allowedRegionsItem);
    return this;
  }

  /**
   * Cloud regions where this data may reside or be processed.
   * @return allowedRegions
  */
  @NotNull   @Schema(name = "allowedRegions", example = "[\"eu-west-1\",\"eu-central-1\",\"eu-north-1\"]", description = "Cloud regions where this data may reside or be processed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("allowedRegions")
  public List<String> getAllowedRegions() {
    return allowedRegions;
  }

  public void setAllowedRegions(List<String> allowedRegions) {
    this.allowedRegions = allowedRegions;
  }

  public DefineResidencyPolicyRequest prohibitedRegions(List<String> prohibitedRegions) {
    this.prohibitedRegions = prohibitedRegions;
    return this;
  }

  public DefineResidencyPolicyRequest addProhibitedRegionsItem(String prohibitedRegionsItem) {
    if (this.prohibitedRegions == null) {
      this.prohibitedRegions = new ArrayList<>();
    }
    this.prohibitedRegions.add(prohibitedRegionsItem);
    return this;
  }

  /**
   * Explicitly blocked regions (overrides allowlist).
   * @return prohibitedRegions
  */
    @Schema(name = "prohibitedRegions", example = "[\"us-east-1\",\"us-west-2\",\"ap-south-1\"]", description = "Explicitly blocked regions (overrides allowlist).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prohibitedRegions")
  public List<String> getProhibitedRegions() {
    return prohibitedRegions;
  }

  public void setProhibitedRegions(List<String> prohibitedRegions) {
    this.prohibitedRegions = prohibitedRegions;
  }

  public DefineResidencyPolicyRequest allowedTransfers(List<@Valid DefineResidencyPolicyRequestAllowedTransfersInner> allowedTransfers) {
    this.allowedTransfers = allowedTransfers;
    return this;
  }

  public DefineResidencyPolicyRequest addAllowedTransfersItem(DefineResidencyPolicyRequestAllowedTransfersInner allowedTransfersItem) {
    if (this.allowedTransfers == null) {
      this.allowedTransfers = new ArrayList<>();
    }
    this.allowedTransfers.add(allowedTransfersItem);
    return this;
  }

  /**
   * Cross-border transfer mechanisms permitted under this policy.
   * @return allowedTransfers
  */
  @Valid   @Schema(name = "allowedTransfers", description = "Cross-border transfer mechanisms permitted under this policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedTransfers")
  public List<@Valid DefineResidencyPolicyRequestAllowedTransfersInner> getAllowedTransfers() {
    return allowedTransfers;
  }

  public void setAllowedTransfers(List<@Valid DefineResidencyPolicyRequestAllowedTransfersInner> allowedTransfers) {
    this.allowedTransfers = allowedTransfers;
  }

  public DefineResidencyPolicyRequest enforcementMode(EnforcementModeEnum enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * BLOCK = reject; WARN = allow + alert; AUDIT_ONLY = log only; AUTO_ROUTE = redirect to allowed region.
   * @return enforcementMode
  */
  @NotNull   @Schema(name = "enforcementMode", example = "BLOCK", description = "BLOCK = reject; WARN = allow + alert; AUDIT_ONLY = log only; AUTO_ROUTE = redirect to allowed region.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enforcementMode")
  public EnforcementModeEnum getEnforcementMode() {
    return enforcementMode;
  }

  public void setEnforcementMode(EnforcementModeEnum enforcementMode) {
    this.enforcementMode = enforcementMode;
  }

  public DefineResidencyPolicyRequest dataSubjectCountries(List<String> dataSubjectCountries) {
    this.dataSubjectCountries = dataSubjectCountries;
    return this;
  }

  public DefineResidencyPolicyRequest addDataSubjectCountriesItem(String dataSubjectCountriesItem) {
    if (this.dataSubjectCountries == null) {
      this.dataSubjectCountries = new ArrayList<>();
    }
    this.dataSubjectCountries.add(dataSubjectCountriesItem);
    return this;
  }

  /**
   * Which countries' citizens this policy covers.
   * @return dataSubjectCountries
  */
    @Schema(name = "dataSubjectCountries", example = "[\"DE\",\"FR\",\"IT\",\"ES\",\"NL\"]", description = "Which countries' citizens this policy covers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataSubjectCountries")
  public List<String> getDataSubjectCountries() {
    return dataSubjectCountries;
  }

  public void setDataSubjectCountries(List<String> dataSubjectCountries) {
    this.dataSubjectCountries = dataSubjectCountries;
  }

  public DefineResidencyPolicyRequest owner(String owner) {
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

  public DefineResidencyPolicyRequest approvers(List<String> approvers) {
    this.approvers = approvers;
    return this;
  }

  public DefineResidencyPolicyRequest addApproversItem(String approversItem) {
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
    @Schema(name = "approvers", example = "[\"dpo@forgesphere.example.com\",\"legal@forgesphere.example.com\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvers")
  public List<String> getApprovers() {
    return approvers;
  }

  public void setApprovers(List<String> approvers) {
    this.approvers = approvers;
  }

  public DefineResidencyPolicyRequest retentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
    return this;
  }

  /**
   * Optional. Days to retain residency evidence.
   * @return retentionDays
  */
    @Schema(name = "retentionDays", example = "2555", description = "Optional. Days to retain residency evidence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retentionDays")
  public Integer getRetentionDays() {
    return retentionDays;
  }

  public void setRetentionDays(Integer retentionDays) {
    this.retentionDays = retentionDays;
  }

  public DefineResidencyPolicyRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DefineResidencyPolicyRequest addTagsItem(String tagsItem) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefineResidencyPolicyRequest defineResidencyPolicyRequest = (DefineResidencyPolicyRequest) o;
    return Objects.equals(this.policyName, defineResidencyPolicyRequest.policyName) &&
        Objects.equals(this.description, defineResidencyPolicyRequest.description) &&
        Objects.equals(this.dataClassification, defineResidencyPolicyRequest.dataClassification) &&
        Objects.equals(this.regulatoryFramework, defineResidencyPolicyRequest.regulatoryFramework) &&
        Objects.equals(this.allowedRegions, defineResidencyPolicyRequest.allowedRegions) &&
        Objects.equals(this.prohibitedRegions, defineResidencyPolicyRequest.prohibitedRegions) &&
        Objects.equals(this.allowedTransfers, defineResidencyPolicyRequest.allowedTransfers) &&
        Objects.equals(this.enforcementMode, defineResidencyPolicyRequest.enforcementMode) &&
        Objects.equals(this.dataSubjectCountries, defineResidencyPolicyRequest.dataSubjectCountries) &&
        Objects.equals(this.owner, defineResidencyPolicyRequest.owner) &&
        Objects.equals(this.approvers, defineResidencyPolicyRequest.approvers) &&
        Objects.equals(this.retentionDays, defineResidencyPolicyRequest.retentionDays) &&
        Objects.equals(this.tags, defineResidencyPolicyRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, description, dataClassification, regulatoryFramework, allowedRegions, prohibitedRegions, allowedTransfers, enforcementMode, dataSubjectCountries, owner, approvers, retentionDays, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefineResidencyPolicyRequest {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataClassification: ").append(toIndentedString(dataClassification)).append("\n");
    sb.append("    regulatoryFramework: ").append(toIndentedString(regulatoryFramework)).append("\n");
    sb.append("    allowedRegions: ").append(toIndentedString(allowedRegions)).append("\n");
    sb.append("    prohibitedRegions: ").append(toIndentedString(prohibitedRegions)).append("\n");
    sb.append("    allowedTransfers: ").append(toIndentedString(allowedTransfers)).append("\n");
    sb.append("    enforcementMode: ").append(toIndentedString(enforcementMode)).append("\n");
    sb.append("    dataSubjectCountries: ").append(toIndentedString(dataSubjectCountries)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    approvers: ").append(toIndentedString(approvers)).append("\n");
    sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

