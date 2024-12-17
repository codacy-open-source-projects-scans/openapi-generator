/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonPropertyOrder({
  FakeBigDecimalMap200Response.JSON_PROPERTY_SOME_ID,
  FakeBigDecimalMap200Response.JSON_PROPERTY_SOME_MAP
})
@JsonTypeName("fakeBigDecimalMap_200_response")

public class FakeBigDecimalMap200Response  {
  
  public static final String JSON_PROPERTY_SOME_ID = "someId";
  
  private BigDecimal someId;

  public static final String JSON_PROPERTY_SOME_MAP = "someMap";
  
  private Map<String, BigDecimal> someMap = null;

  /**
   * Get someId
   * @return someId
   **/
  @JsonProperty(JSON_PROPERTY_SOME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getSomeId() {
    return someId;
  }

  /**
   * Set someId
   */
  @JsonProperty(JSON_PROPERTY_SOME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSomeId(BigDecimal someId) {
    this.someId = someId;
  }

  public FakeBigDecimalMap200Response someId(BigDecimal someId) {
    this.someId = someId;
    return this;
  }

  /**
   * Get someMap
   * @return someMap
   **/
  @JsonProperty(JSON_PROPERTY_SOME_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, BigDecimal> getSomeMap() {
    return someMap;
  }

  /**
   * Set someMap
   */
  @JsonProperty(JSON_PROPERTY_SOME_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSomeMap(Map<String, BigDecimal> someMap) {
    this.someMap = someMap;
  }

  public FakeBigDecimalMap200Response someMap(Map<String, BigDecimal> someMap) {
    this.someMap = someMap;
    return this;
  }

  public FakeBigDecimalMap200Response putSomeMapItem(String key, BigDecimal someMapItem) {
    if (this.someMap == null) {
      this.someMap = new HashMap<>();
    }
    this.someMap.put(key, someMapItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FakeBigDecimalMap200Response {\n");
    
    sb.append("    someId: ").append(toIndentedString(someId)).append("\n");
    sb.append("    someMap: ").append(toIndentedString(someMap)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
