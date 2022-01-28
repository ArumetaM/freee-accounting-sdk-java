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
import jp.co.freee.accounting.models.PaymentRequestsIndexResponsePaymentRequests;

/**
 * PaymentRequestsIndexResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaymentRequestsIndexResponse {
  public static final String SERIALIZED_NAME_PAYMENT_REQUESTS = "payment_requests";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REQUESTS)
  private List<PaymentRequestsIndexResponsePaymentRequests> paymentRequests = new ArrayList<>();

  public PaymentRequestsIndexResponse() { 
  }

  public PaymentRequestsIndexResponse paymentRequests(List<PaymentRequestsIndexResponsePaymentRequests> paymentRequests) {
    
    this.paymentRequests = paymentRequests;
    return this;
  }

  public PaymentRequestsIndexResponse addPaymentRequestsItem(PaymentRequestsIndexResponsePaymentRequests paymentRequestsItem) {
    this.paymentRequests.add(paymentRequestsItem);
    return this;
  }

   /**
   * Get paymentRequests
   * @return paymentRequests
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PaymentRequestsIndexResponsePaymentRequests> getPaymentRequests() {
    return paymentRequests;
  }


  public void setPaymentRequests(List<PaymentRequestsIndexResponsePaymentRequests> paymentRequests) {
    this.paymentRequests = paymentRequests;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequestsIndexResponse paymentRequestsIndexResponse = (PaymentRequestsIndexResponse) o;
    return Objects.equals(this.paymentRequests, paymentRequestsIndexResponse.paymentRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequestsIndexResponse {\n");
    sb.append("    paymentRequests: ").append(toIndentedString(paymentRequests)).append("\n");
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

