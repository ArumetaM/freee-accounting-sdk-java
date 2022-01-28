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

/**
 * SegmentTagParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SegmentTagParams {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORTCUT1 = "shortcut1";
  @SerializedName(SERIALIZED_NAME_SHORTCUT1)
  private String shortcut1;

  public static final String SERIALIZED_NAME_SHORTCUT2 = "shortcut2";
  @SerializedName(SERIALIZED_NAME_SHORTCUT2)
  private String shortcut2;

  public SegmentTagParams() { 
  }

  public SegmentTagParams companyId(Integer companyId) {
    
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


  public SegmentTagParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 備考 (30文字以内)
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "備考", value = "備考 (30文字以内)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SegmentTagParams name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * セグメントタグ名 (30文字以内)
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "プロジェクトA", required = true, value = "セグメントタグ名 (30文字以内)")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SegmentTagParams shortcut1(String shortcut1) {
    
    this.shortcut1 = shortcut1;
    return this;
  }

   /**
   * ショートカット１ (20文字以内)
   * @return shortcut1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A", value = "ショートカット１ (20文字以内)")

  public String getShortcut1() {
    return shortcut1;
  }


  public void setShortcut1(String shortcut1) {
    this.shortcut1 = shortcut1;
  }


  public SegmentTagParams shortcut2(String shortcut2) {
    
    this.shortcut2 = shortcut2;
    return this;
  }

   /**
   * ショートカット２ (20文字以内)
   * @return shortcut2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "ショートカット２ (20文字以内)")

  public String getShortcut2() {
    return shortcut2;
  }


  public void setShortcut2(String shortcut2) {
    this.shortcut2 = shortcut2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentTagParams segmentTagParams = (SegmentTagParams) o;
    return Objects.equals(this.companyId, segmentTagParams.companyId) &&
        Objects.equals(this.description, segmentTagParams.description) &&
        Objects.equals(this.name, segmentTagParams.name) &&
        Objects.equals(this.shortcut1, segmentTagParams.shortcut1) &&
        Objects.equals(this.shortcut2, segmentTagParams.shortcut2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, description, name, shortcut1, shortcut2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentTagParams {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortcut1: ").append(toIndentedString(shortcut1)).append("\n");
    sb.append("    shortcut2: ").append(toIndentedString(shortcut2)).append("\n");
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

