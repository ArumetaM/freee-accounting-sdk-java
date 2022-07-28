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
import java.math.BigDecimal;

/**
 * TrialBsTwoYearsResponseTrialBsTwoYearsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialBsTwoYearsResponseTrialBsTwoYearsItems {
  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LAST_YEAR_CLOSING_BALANCE = "last_year_closing_balance";
  @SerializedName(SERIALIZED_NAME_LAST_YEAR_CLOSING_BALANCE)
  private Integer lastYearClosingBalance;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_YEAR_ON_YEAR = "year_on_year";
  @SerializedName(SERIALIZED_NAME_YEAR_ON_YEAR)
  private BigDecimal yearOnYear;

  public TrialBsTwoYearsResponseTrialBsTwoYearsItems() { 
  }

  public TrialBsTwoYearsResponseTrialBsTwoYearsItems closingBalance(Integer closingBalance) {
    
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


  public TrialBsTwoYearsResponseTrialBsTwoYearsItems id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 品目ID
   * minimum: 0
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "品目ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYearsItems lastYearClosingBalance(Integer lastYearClosingBalance) {
    
    this.lastYearClosingBalance = lastYearClosingBalance;
    return this;
  }

   /**
   * 前年度期末残高
   * @return lastYearClosingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "前年度期末残高")

  public Integer getLastYearClosingBalance() {
    return lastYearClosingBalance;
  }


  public void setLastYearClosingBalance(Integer lastYearClosingBalance) {
    this.lastYearClosingBalance = lastYearClosingBalance;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYearsItems name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 品目
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "源泉所得税", value = "品目")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TrialBsTwoYearsResponseTrialBsTwoYearsItems yearOnYear(BigDecimal yearOnYear) {
    
    this.yearOnYear = yearOnYear;
    return this;
  }

   /**
   * 前年比
   * @return yearOnYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.12", value = "前年比")

  public BigDecimal getYearOnYear() {
    return yearOnYear;
  }


  public void setYearOnYear(BigDecimal yearOnYear) {
    this.yearOnYear = yearOnYear;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBsTwoYearsResponseTrialBsTwoYearsItems trialBsTwoYearsResponseTrialBsTwoYearsItems = (TrialBsTwoYearsResponseTrialBsTwoYearsItems) o;
    return Objects.equals(this.closingBalance, trialBsTwoYearsResponseTrialBsTwoYearsItems.closingBalance) &&
        Objects.equals(this.id, trialBsTwoYearsResponseTrialBsTwoYearsItems.id) &&
        Objects.equals(this.lastYearClosingBalance, trialBsTwoYearsResponseTrialBsTwoYearsItems.lastYearClosingBalance) &&
        Objects.equals(this.name, trialBsTwoYearsResponseTrialBsTwoYearsItems.name) &&
        Objects.equals(this.yearOnYear, trialBsTwoYearsResponseTrialBsTwoYearsItems.yearOnYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingBalance, id, lastYearClosingBalance, name, yearOnYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialBsTwoYearsResponseTrialBsTwoYearsItems {\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastYearClosingBalance: ").append(toIndentedString(lastYearClosingBalance)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    yearOnYear: ").append(toIndentedString(yearOnYear)).append("\n");
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

