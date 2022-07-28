/*
 * freee API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jp.co.freee.accounting.models.TrialBsTwoYearsResponseTrialBsTwoYearsBalances;

/**
 * TrialBsTwoYearsResponseTrialBsTwoYears
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialBsTwoYearsResponseTrialBsTwoYears {
  /**
   * 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(AccountItemDisplayTypeEnum.Adapter.class)
  public enum AccountItemDisplayTypeEnum {
    ACCOUNT_ITEM("account_item"),
    
    GROUP("group");

    private String value;

    AccountItemDisplayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountItemDisplayTypeEnum fromValue(String value) {
      for (AccountItemDisplayTypeEnum b : AccountItemDisplayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountItemDisplayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountItemDisplayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountItemDisplayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountItemDisplayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_DISPLAY_TYPE = "account_item_display_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_DISPLAY_TYPE)
  private AccountItemDisplayTypeEnum accountItemDisplayType;

  /**
   * 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(AdjustmentEnum.Adapter.class)
  public enum AdjustmentEnum {
    ONLY("only"),
    
    WITHOUT("without");

    private String value;

    AdjustmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AdjustmentEnum fromValue(String value) {
      for (AdjustmentEnum b : AdjustmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AdjustmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdjustmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdjustmentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AdjustmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADJUSTMENT = "adjustment";
  @SerializedName(SERIALIZED_NAME_ADJUSTMENT)
  private AdjustmentEnum adjustment;

  /**
   * 未承認を除く: without_in_progress (デフォルト), 全てのステータス: all(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(ApprovalFlowStatusEnum.Adapter.class)
  public enum ApprovalFlowStatusEnum {
    WITHOUT_IN_PROGRESS("without_in_progress"),
    
    ALL("all");

    private String value;

    ApprovalFlowStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApprovalFlowStatusEnum fromValue(String value) {
      for (ApprovalFlowStatusEnum b : ApprovalFlowStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApprovalFlowStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApprovalFlowStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApprovalFlowStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApprovalFlowStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPROVAL_FLOW_STATUS = "approval_flow_status";
  @SerializedName(SERIALIZED_NAME_APPROVAL_FLOW_STATUS)
  private ApprovalFlowStatusEnum approvalFlowStatus;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private List<TrialBsTwoYearsResponseTrialBsTwoYearsBalances> balances = new ArrayList<>();

  /**
   * 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag）(条件に指定した時のみ含まれる）
   */
  @JsonAdapter(BreakdownDisplayTypeEnum.Adapter.class)
  public enum BreakdownDisplayTypeEnum {
    PARTNER("partner"),
    
    ITEM("item"),
    
    SECTION("section"),
    
    ACCOUNT_ITEM("account_item"),
    
    SEGMENT_1_TAG("segment_1_tag"),
    
    SEGMENT_2_TAG("segment_2_tag"),
    
    SEGMENT_3_TAG("segment_3_tag");

    private String value;

    BreakdownDisplayTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BreakdownDisplayTypeEnum fromValue(String value) {
      for (BreakdownDisplayTypeEnum b : BreakdownDisplayTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BreakdownDisplayTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BreakdownDisplayTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BreakdownDisplayTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BreakdownDisplayTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BREAKDOWN_DISPLAY_TYPE = "breakdown_display_type";
  @SerializedName(SERIALIZED_NAME_BREAKDOWN_DISPLAY_TYPE)
  private BreakdownDisplayTypeEnum breakdownDisplayType;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_END_MONTH = "end_month";
  @SerializedName(SERIALIZED_NAME_END_MONTH)
  private Integer endMonth;

  public static final String SERIALIZED_NAME_FISCAL_YEAR = "fiscal_year";
  @SerializedName(SERIALIZED_NAME_FISCAL_YEAR)
  private Integer fiscalYear;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Integer itemId;

  public static final String SERIALIZED_NAME_PARTNER_CODE = "partner_code";
  @SerializedName(SERIALIZED_NAME_PARTNER_CODE)
  private String partnerCode;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partner_id";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private Integer partnerId;

  public static final String SERIALIZED_NAME_SECTION_ID = "section_id";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_START_MONTH = "start_month";
  @SerializedName(SERIALIZED_NAME_START_MONTH)
  private Integer startMonth;

  public TrialBsTwoYearsResponseTrialBsTwoYears() { 
  }

  public TrialBsTwoYearsResponseTrialBsTwoYears accountItemDisplayType(AccountItemDisplayTypeEnum accountItemDisplayType) {
    
    this.accountItemDisplayType = accountItemDisplayType;
    return this;
  }

   /**
   * 勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）
   * @return accountItemDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "勘定科目の表示（勘定科目: account_item, 決算書表示:group）(条件に指定した時のみ含まれる）")

  public AccountItemDisplayTypeEnum getAccountItemDisplayType() {
    return accountItemDisplayType;
  }


  public void setAccountItemDisplayType(AccountItemDisplayTypeEnum accountItemDisplayType) {
    this.accountItemDisplayType = accountItemDisplayType;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears adjustment(AdjustmentEnum adjustment) {
    
    this.adjustment = adjustment;
    return this;
  }

   /**
   * 決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）
   * @return adjustment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "only", value = "決算整理仕訳のみ: only, 決算整理仕訳以外: without(条件に指定した時のみ含まれる）")

  public AdjustmentEnum getAdjustment() {
    return adjustment;
  }


  public void setAdjustment(AdjustmentEnum adjustment) {
    this.adjustment = adjustment;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears approvalFlowStatus(ApprovalFlowStatusEnum approvalFlowStatus) {
    
    this.approvalFlowStatus = approvalFlowStatus;
    return this;
  }

   /**
   * 未承認を除く: without_in_progress (デフォルト), 全てのステータス: all(条件に指定した時のみ含まれる）
   * @return approvalFlowStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "without_in_progress", value = "未承認を除く: without_in_progress (デフォルト), 全てのステータス: all(条件に指定した時のみ含まれる）")

  public ApprovalFlowStatusEnum getApprovalFlowStatus() {
    return approvalFlowStatus;
  }


  public void setApprovalFlowStatus(ApprovalFlowStatusEnum approvalFlowStatus) {
    this.approvalFlowStatus = approvalFlowStatus;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears balances(List<TrialBsTwoYearsResponseTrialBsTwoYearsBalances> balances) {
    
    this.balances = balances;
    return this;
  }

  public TrialBsTwoYearsResponseTrialBsTwoYears addBalancesItem(TrialBsTwoYearsResponseTrialBsTwoYearsBalances balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TrialBsTwoYearsResponseTrialBsTwoYearsBalances> getBalances() {
    return balances;
  }


  public void setBalances(List<TrialBsTwoYearsResponseTrialBsTwoYearsBalances> balances) {
    this.balances = balances;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears breakdownDisplayType(BreakdownDisplayTypeEnum breakdownDisplayType) {
    
    this.breakdownDisplayType = breakdownDisplayType;
    return this;
  }

   /**
   * 内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag）(条件に指定した時のみ含まれる）
   * @return breakdownDisplayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "内訳の表示（取引先: partner, 品目: item, 部門: section, 勘定科目: account_item, セグメント1(法人向けプロフェッショナル, 法人向けエンタープライズプラン): segment_1_tag, セグメント2(法人向け エンタープライズプラン):segment_2_tag, セグメント3(法人向け エンタープライズプラン): segment_3_tag）(条件に指定した時のみ含まれる）")

  public BreakdownDisplayTypeEnum getBreakdownDisplayType() {
    return breakdownDisplayType;
  }


  public void setBreakdownDisplayType(BreakdownDisplayTypeEnum breakdownDisplayType) {
    this.breakdownDisplayType = breakdownDisplayType;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 2147483647
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 作成日時
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17T13:47:24+09:00", value = "作成日時")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "発生日で絞込：終了日(yyyy-mm-dd)(条件に指定した時のみ含まれる）")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears endMonth(Integer endMonth) {
    
    this.endMonth = endMonth;
    return this;
  }

   /**
   * 発生月で絞込：終了会計月(1-12)(条件に指定した時のみ含まれる）
   * minimum: 1
   * maximum: 12
   * @return endMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "発生月で絞込：終了会計月(1-12)(条件に指定した時のみ含まれる）")

  public Integer getEndMonth() {
    return endMonth;
  }


  public void setEndMonth(Integer endMonth) {
    this.endMonth = endMonth;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears fiscalYear(Integer fiscalYear) {
    
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * 会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）
   * @return fiscalYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019", value = "会計年度(条件に指定した時、または条件に月、日条件がない時のみ含まれる）")

  public Integer getFiscalYear() {
    return fiscalYear;
  }


  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears itemId(Integer itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 品目ID(条件に指定した時のみ含まれる）
   * minimum: 0
   * maximum: 2147483647
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "品目ID(条件に指定した時のみ含まれる）")

  public Integer getItemId() {
    return itemId;
  }


  public void setItemId(Integer itemId) {
    this.itemId = itemId;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears partnerCode(String partnerCode) {
    
    this.partnerCode = partnerCode;
    return this;
  }

   /**
   * 取引先コード(条件に指定した時のみ含まれる）
   * @return partnerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", value = "取引先コード(条件に指定した時のみ含まれる）")

  public String getPartnerCode() {
    return partnerCode;
  }


  public void setPartnerCode(String partnerCode) {
    this.partnerCode = partnerCode;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears partnerId(Integer partnerId) {
    
    this.partnerId = partnerId;
    return this;
  }

   /**
   * 取引先ID(条件に指定した時のみ含まれる）
   * minimum: 0
   * maximum: 2147483647
   * @return partnerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "取引先ID(条件に指定した時のみ含まれる）")

  public Integer getPartnerId() {
    return partnerId;
  }


  public void setPartnerId(Integer partnerId) {
    this.partnerId = partnerId;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears sectionId(Integer sectionId) {
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * 部門ID(条件に指定した時のみ含まれる）
   * minimum: 0
   * maximum: 2147483647
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "部門ID(条件に指定した時のみ含まれる）")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    this.sectionId = sectionId;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "発生日で絞込：開始日(yyyy-mm-dd)(条件に指定した時のみ含まれる）")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYears startMonth(Integer startMonth) {
    
    this.startMonth = startMonth;
    return this;
  }

   /**
   * 発生月で絞込：開始会計月(1-12)(条件に指定した時のみ含まれる）
   * minimum: 1
   * maximum: 12
   * @return startMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "発生月で絞込：開始会計月(1-12)(条件に指定した時のみ含まれる）")

  public Integer getStartMonth() {
    return startMonth;
  }


  public void setStartMonth(Integer startMonth) {
    this.startMonth = startMonth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBsTwoYearsResponseTrialBsTwoYears trialBsTwoYearsResponseTrialBsTwoYears = (TrialBsTwoYearsResponseTrialBsTwoYears) o;
    return Objects.equals(this.accountItemDisplayType, trialBsTwoYearsResponseTrialBsTwoYears.accountItemDisplayType) &&
        Objects.equals(this.adjustment, trialBsTwoYearsResponseTrialBsTwoYears.adjustment) &&
        Objects.equals(this.approvalFlowStatus, trialBsTwoYearsResponseTrialBsTwoYears.approvalFlowStatus) &&
        Objects.equals(this.balances, trialBsTwoYearsResponseTrialBsTwoYears.balances) &&
        Objects.equals(this.breakdownDisplayType, trialBsTwoYearsResponseTrialBsTwoYears.breakdownDisplayType) &&
        Objects.equals(this.companyId, trialBsTwoYearsResponseTrialBsTwoYears.companyId) &&
        Objects.equals(this.createdAt, trialBsTwoYearsResponseTrialBsTwoYears.createdAt) &&
        Objects.equals(this.endDate, trialBsTwoYearsResponseTrialBsTwoYears.endDate) &&
        Objects.equals(this.endMonth, trialBsTwoYearsResponseTrialBsTwoYears.endMonth) &&
        Objects.equals(this.fiscalYear, trialBsTwoYearsResponseTrialBsTwoYears.fiscalYear) &&
        Objects.equals(this.itemId, trialBsTwoYearsResponseTrialBsTwoYears.itemId) &&
        Objects.equals(this.partnerCode, trialBsTwoYearsResponseTrialBsTwoYears.partnerCode) &&
        Objects.equals(this.partnerId, trialBsTwoYearsResponseTrialBsTwoYears.partnerId) &&
        Objects.equals(this.sectionId, trialBsTwoYearsResponseTrialBsTwoYears.sectionId) &&
        Objects.equals(this.startDate, trialBsTwoYearsResponseTrialBsTwoYears.startDate) &&
        Objects.equals(this.startMonth, trialBsTwoYearsResponseTrialBsTwoYears.startMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountItemDisplayType, adjustment, approvalFlowStatus, balances, breakdownDisplayType, companyId, createdAt, endDate, endMonth, fiscalYear, itemId, partnerCode, partnerId, sectionId, startDate, startMonth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialBsTwoYearsResponseTrialBsTwoYears {\n");
    sb.append("    accountItemDisplayType: ").append(toIndentedString(accountItemDisplayType)).append("\n");
    sb.append("    adjustment: ").append(toIndentedString(adjustment)).append("\n");
    sb.append("    approvalFlowStatus: ").append(toIndentedString(approvalFlowStatus)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    breakdownDisplayType: ").append(toIndentedString(breakdownDisplayType)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endMonth: ").append(toIndentedString(endMonth)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    partnerCode: ").append(toIndentedString(partnerCode)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startMonth: ").append(toIndentedString(startMonth)).append("\n");
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

