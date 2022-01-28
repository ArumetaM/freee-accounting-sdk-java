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
import jp.co.freee.accounting.models.CompanyIndexResponseCompanies;

/**
 * CompanyIndexResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyIndexResponse {
  public static final String SERIALIZED_NAME_COMPANIES = "companies";
  @SerializedName(SERIALIZED_NAME_COMPANIES)
  private List<CompanyIndexResponseCompanies> companies = new ArrayList<>();

  public CompanyIndexResponse() { 
  }

  public CompanyIndexResponse companies(List<CompanyIndexResponseCompanies> companies) {
    
    this.companies = companies;
    return this;
  }

  public CompanyIndexResponse addCompaniesItem(CompanyIndexResponseCompanies companiesItem) {
    this.companies.add(companiesItem);
    return this;
  }

   /**
   * Get companies
   * @return companies
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CompanyIndexResponseCompanies> getCompanies() {
    return companies;
  }


  public void setCompanies(List<CompanyIndexResponseCompanies> companies) {
    this.companies = companies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyIndexResponse companyIndexResponse = (CompanyIndexResponse) o;
    return Objects.equals(this.companies, companyIndexResponse.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyIndexResponse {\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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

