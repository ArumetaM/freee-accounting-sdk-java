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
import jp.co.freee.accounting.models.ExpenseApplicationResponseExpenseApplication;

/**
 * ExpenseApplicationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExpenseApplicationResponse {
  public static final String SERIALIZED_NAME_EXPENSE_APPLICATION = "expense_application";
  @SerializedName(SERIALIZED_NAME_EXPENSE_APPLICATION)
  private ExpenseApplicationResponseExpenseApplication expenseApplication;

  public ExpenseApplicationResponse() { 
  }

  public ExpenseApplicationResponse expenseApplication(ExpenseApplicationResponseExpenseApplication expenseApplication) {
    
    this.expenseApplication = expenseApplication;
    return this;
  }

   /**
   * Get expenseApplication
   * @return expenseApplication
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ExpenseApplicationResponseExpenseApplication getExpenseApplication() {
    return expenseApplication;
  }


  public void setExpenseApplication(ExpenseApplicationResponseExpenseApplication expenseApplication) {
    this.expenseApplication = expenseApplication;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpenseApplicationResponse expenseApplicationResponse = (ExpenseApplicationResponse) o;
    return Objects.equals(this.expenseApplication, expenseApplicationResponse.expenseApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expenseApplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpenseApplicationResponse {\n");
    sb.append("    expenseApplication: ").append(toIndentedString(expenseApplication)).append("\n");
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

