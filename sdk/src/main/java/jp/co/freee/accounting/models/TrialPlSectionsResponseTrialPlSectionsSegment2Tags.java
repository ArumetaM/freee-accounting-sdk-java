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
 * TrialPlSectionsResponseTrialPlSectionsSegment2Tags
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TrialPlSectionsResponseTrialPlSectionsSegment2Tags {
  public static final String SERIALIZED_NAME_CLOSING_BALANCE = "closing_balance";
  @SerializedName(SERIALIZED_NAME_CLOSING_BALANCE)
  private Integer closingBalance;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TrialPlSectionsResponseTrialPlSectionsSegment2Tags() { 
  }

  public TrialPlSectionsResponseTrialPlSectionsSegment2Tags closingBalance(Integer closingBalance) {
    
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


  public TrialPlSectionsResponseTrialPlSectionsSegment2Tags id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * セグメント2タグID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "セグメント2タグID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TrialPlSectionsResponseTrialPlSectionsSegment2Tags name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * セグメント2タグ名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "プロジェクトA", value = "セグメント2タグ名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialPlSectionsResponseTrialPlSectionsSegment2Tags trialPlSectionsResponseTrialPlSectionsSegment2Tags = (TrialPlSectionsResponseTrialPlSectionsSegment2Tags) o;
    return Objects.equals(this.closingBalance, trialPlSectionsResponseTrialPlSectionsSegment2Tags.closingBalance) &&
        Objects.equals(this.id, trialPlSectionsResponseTrialPlSectionsSegment2Tags.id) &&
        Objects.equals(this.name, trialPlSectionsResponseTrialPlSectionsSegment2Tags.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingBalance, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialPlSectionsResponseTrialPlSectionsSegment2Tags {\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

