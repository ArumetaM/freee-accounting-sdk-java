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
import jp.co.freee.accounting.models.TrialPlSectionsResponseTrialPlSectionsSections;

/**
 * TrialPlSectionsResponseTrialPlSectionsBalances
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialPlSectionsResponseTrialPlSectionsBalances {
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

  public static final String SERIALIZED_NAME_SECTIONS = "sections";
  @SerializedName(SERIALIZED_NAME_SECTIONS)
  private List<TrialPlSectionsResponseTrialPlSectionsSections> sections = null;

  public static final String SERIALIZED_NAME_TOTAL_LINE = "total_line";
  @SerializedName(SERIALIZED_NAME_TOTAL_LINE)
  private Boolean totalLine;

  public TrialPlSectionsResponseTrialPlSectionsBalances() { 
  }

  public TrialPlSectionsResponseTrialPlSectionsBalances accountCategoryName(String accountCategoryName) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances accountGroupName(String accountGroupName) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances accountItemId(Integer accountItemId) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances accountItemName(String accountItemName) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances closingBalance(Integer closingBalance) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances hierarchyLevel(Integer hierarchyLevel) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances parentAccountCategoryName(String parentAccountCategoryName) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsBalances sections(List<TrialPlSectionsResponseTrialPlSectionsSections> sections) {
    
    this.sections = sections;
    return this;
  }

  public TrialPlSectionsResponseTrialPlSectionsBalances addSectionsItem(TrialPlSectionsResponseTrialPlSectionsSections sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * 部門
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "部門")

  public List<TrialPlSectionsResponseTrialPlSectionsSections> getSections() {
    return sections;
  }


  public void setSections(List<TrialPlSectionsResponseTrialPlSectionsSections> sections) {
    this.sections = sections;
  }


  public TrialPlSectionsResponseTrialPlSectionsBalances totalLine(Boolean totalLine) {
    
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
    TrialPlSectionsResponseTrialPlSectionsBalances trialPlSectionsResponseTrialPlSectionsBalances = (TrialPlSectionsResponseTrialPlSectionsBalances) o;
    return Objects.equals(this.accountCategoryName, trialPlSectionsResponseTrialPlSectionsBalances.accountCategoryName) &&
        Objects.equals(this.accountGroupName, trialPlSectionsResponseTrialPlSectionsBalances.accountGroupName) &&
        Objects.equals(this.accountItemId, trialPlSectionsResponseTrialPlSectionsBalances.accountItemId) &&
        Objects.equals(this.accountItemName, trialPlSectionsResponseTrialPlSectionsBalances.accountItemName) &&
        Objects.equals(this.closingBalance, trialPlSectionsResponseTrialPlSectionsBalances.closingBalance) &&
        Objects.equals(this.hierarchyLevel, trialPlSectionsResponseTrialPlSectionsBalances.hierarchyLevel) &&
        Objects.equals(this.parentAccountCategoryName, trialPlSectionsResponseTrialPlSectionsBalances.parentAccountCategoryName) &&
        Objects.equals(this.sections, trialPlSectionsResponseTrialPlSectionsBalances.sections) &&
        Objects.equals(this.totalLine, trialPlSectionsResponseTrialPlSectionsBalances.totalLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCategoryName, accountGroupName, accountItemId, accountItemName, closingBalance, hierarchyLevel, parentAccountCategoryName, sections, totalLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlSectionsResponseTrialPlSectionsBalances {\n");
    sb.append("    accountCategoryName: ").append(toIndentedString(accountCategoryName)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    accountItemId: ").append(toIndentedString(accountItemId)).append("\n");
    sb.append("    accountItemName: ").append(toIndentedString(accountItemName)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    parentAccountCategoryName: ").append(toIndentedString(parentAccountCategoryName)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

