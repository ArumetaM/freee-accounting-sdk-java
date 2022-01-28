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
import jp.co.freee.accounting.models.TrialPlSegment1TagsResponseTrialPlSegment1TagsSegment1Tags;

/**
 * TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances {
  public static final String SERIALIZED_NAME_ACCOUNT_CATEGORY_NAME = "account_category_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CATEGORY_NAME)
  private String accountCategoryName;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "account_group_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private String accountGroupName;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_ID = "account_item_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_ID)
  private Integer accountItemId;

  public static final String SERIALIZED_NAME_ACCOUNT_ITEM_NAME = "account_item_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ITEM_NAME)
  private String accountItemName;

  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_HIERARCHY_LEVEL = "hierarchy_level";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_LEVEL)
  private Integer hierarchyLevel;

  public static final String SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME = "parent_account_category_name";
  @SerializedName(SERIALIZED_NAME_PARENT_ACCOUNT_CATEGORY_NAME)
  private String parentAccountCategoryName;

  public static final String SERIALIZED_NAME_SEGMENT1_TAGS = "segment_1_tags";
  @SerializedName(SERIALIZED_NAME_SEGMENT1_TAGS)
  private List<TrialPlSegment1TagsResponseTrialPlSegment1TagsSegment1Tags> segment1Tags = null;

  public static final String SERIALIZED_NAME_TOTAL_LINE = "total_line";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINE)
  private Boolean totalLine;

  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances() { 
  }

  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances accountCategoryName(String accountCategoryName) {
    
    this.accountCategoryName = accountCategoryName;
    return this;
  }

   /**
   * 勘定科目カテゴリー名
   * @return accountCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "販売管理費", value = "勘定科目カテゴリー名")

  public String getAccountCategoryName() {
    return accountCategoryName;
  }


  public void setAccountCategoryName(String accountCategoryName) {
    this.accountCategoryName = accountCategoryName;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances accountGroupName(String accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * 決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる)
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "現金及び預金", value = "決算書表示名(account_item_display_type:group指定時に決算書表示名の時のみ含まれる)")

  public String getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(String accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances accountItemId(Integer accountItemId) {
    
    this.accountItemId = accountItemId;
    return this;
  }

   /**
   * 勘定科目ID(勘定科目の時のみ含まれる)
   * minimum: 1
   * maximum: 2147483647
   * @return accountItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "192", value = "勘定科目ID(勘定科目の時のみ含まれる)")

  public Integer getAccountItemId() {
    return accountItemId;
  }


  public void setAccountItemId(Integer accountItemId) {
    this.accountItemId = accountItemId;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances accountItemName(String accountItemName) {
    
    this.accountItemName = accountItemName;
    return this;
  }

   /**
   * 勘定科目名(勘定科目の時のみ含まれる)
   * @return accountItemName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "現金", value = "勘定科目名(勘定科目の時のみ含まれる)")

  public String getAccountItemName() {
    return accountItemName;
  }


  public void setAccountItemName(String accountItemName) {
    this.accountItemName = accountItemName;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances closingBalance(Integer closingBalance) {
    
    this.closingBalance = closingBalance;
    return this;
  }

   /**
   * 期末残高
   * @return closingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-25920", value = "期末残高")

  public Integer getClosingBalance() {
    return closingBalance;
  }


  public void setClosingBalance(Integer closingBalance) {
    this.closingBalance = closingBalance;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances hierarchyLevel(Integer hierarchyLevel) {
    
    this.hierarchyLevel = hierarchyLevel;
    return this;
  }

   /**
   * 階層レベル
   * @return hierarchyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "階層レベル")

  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }


  public void setHierarchyLevel(Integer hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances parentAccountCategoryName(String parentAccountCategoryName) {
    
    this.parentAccountCategoryName = parentAccountCategoryName;
    return this;
  }

   /**
   * 上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる)
   * @return parentAccountCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "他流動資産", value = "上位勘定科目カテゴリー名(勘定科目カテゴリーの時のみ、上層が存在する場合含まれる)")

  public String getParentAccountCategoryName() {
    return parentAccountCategoryName;
  }


  public void setParentAccountCategoryName(String parentAccountCategoryName) {
    this.parentAccountCategoryName = parentAccountCategoryName;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances segment1Tags(List<TrialPlSegment1TagsResponseTrialPlSegment1TagsSegment1Tags> segment1Tags) {
    
    this.segment1Tags = segment1Tags;
    return this;
  }

  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances addSegment1TagsItem(TrialPlSegment1TagsResponseTrialPlSegment1TagsSegment1Tags segment1TagsItem) {
    if (this.segment1Tags == null) {
      this.segment1Tags = new ArrayList<>();
    }
    this.segment1Tags.add(segment1TagsItem);
    return this;
  }

   /**
   * セグメント1タグ
   * @return segment1Tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "セグメント1タグ")

  public List<TrialPlSegment1TagsResponseTrialPlSegment1TagsSegment1Tags> getSegment1Tags() {
    return segment1Tags;
  }


  public void setSegment1Tags(List<TrialPlSegment1TagsResponseTrialPlSegment1TagsSegment1Tags> segment1Tags) {
    this.segment1Tags = segment1Tags;
  }


  public TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances totalLine(Boolean totalLine) {
    
    this.totalLine = totalLine;
    return this;
  }

   /**
   * 合計行(勘定科目カテゴリーの時のみ含まれる)
   * @return totalLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "合計行(勘定科目カテゴリーの時のみ含まれる)")

  public Boolean getTotalLine() {
    return totalLine;
  }


  public void setTotalLine(Boolean totalLine) {
    this.totalLine = totalLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances trialPlSegment1TagsResponseTrialPlSegment1TagsBalances = (TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances) o;
    return Objects.equals(this.accountCategoryName, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.accountCategoryName) &&
        Objects.equals(this.accountGroupName, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.accountGroupName) &&
        Objects.equals(this.accountItemId, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.accountItemId) &&
        Objects.equals(this.accountItemName, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.accountItemName) &&
        Objects.equals(this.closingBalance, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.closingBalance) &&
        Objects.equals(this.hierarchyLevel, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.hierarchyLevel) &&
        Objects.equals(this.parentAccountCategoryName, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.parentAccountCategoryName) &&
        Objects.equals(this.segment1Tags, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.segment1Tags) &&
        Objects.equals(this.totalLine, trialPlSegment1TagsResponseTrialPlSegment1TagsBalances.totalLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategoryName, accountGroupName, accountItemId, accountItemName, closingBalance, hierarchyLevel, parentAccountCategoryName, segment1Tags, totalLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlSegment1TagsResponseTrialPlSegment1TagsBalances {\n");
    sb.append("    accountCategoryName: ").append(toIndentedString(accountCategoryName)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    accountItemName: ").append(toIndentedString(accountItemName)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    parentAccountCategoryName: ").append(toIndentedString(parentAccountCategoryName)).append("\n");
    sb.append("    segment1Tags: ").append(toIndentedString(segment1Tags)).append("\n");
    sb.append("    totalLine: ").append(toIndentedString(totalLine)).append("\n");
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

