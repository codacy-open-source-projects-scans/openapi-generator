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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonPropertyOrder({
  NullableClass.JSON_PROPERTY_INTEGER_PROP,
  NullableClass.JSON_PROPERTY_NUMBER_PROP,
  NullableClass.JSON_PROPERTY_BOOLEAN_PROP,
  NullableClass.JSON_PROPERTY_STRING_PROP,
  NullableClass.JSON_PROPERTY_DATE_PROP,
  NullableClass.JSON_PROPERTY_DATETIME_PROP,
  NullableClass.JSON_PROPERTY_ARRAY_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_ARRAY_ITEMS_NULLABLE,
  NullableClass.JSON_PROPERTY_OBJECT_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP,
  NullableClass.JSON_PROPERTY_OBJECT_ITEMS_NULLABLE
})

public class NullableClass extends HashMap<String, Object> {
  
  public static final String JSON_PROPERTY_INTEGER_PROP = "integer_prop";
  
  private Integer integerProp;

  public static final String JSON_PROPERTY_NUMBER_PROP = "number_prop";
  
  private BigDecimal numberProp;

  public static final String JSON_PROPERTY_BOOLEAN_PROP = "boolean_prop";
  
  private Boolean booleanProp;

  public static final String JSON_PROPERTY_STRING_PROP = "string_prop";
  
  private String stringProp;

  public static final String JSON_PROPERTY_DATE_PROP = "date_prop";
  
  private Date dateProp;

  public static final String JSON_PROPERTY_DATETIME_PROP = "datetime_prop";
  
  private Date datetimeProp;

  public static final String JSON_PROPERTY_ARRAY_NULLABLE_PROP = "array_nullable_prop";
  
  private List<Object> arrayNullableProp = null;

  public static final String JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP = "array_and_items_nullable_prop";
  
  private List<Object> arrayAndItemsNullableProp = null;

  public static final String JSON_PROPERTY_ARRAY_ITEMS_NULLABLE = "array_items_nullable";
  
  private List<Object> arrayItemsNullable = null;

  public static final String JSON_PROPERTY_OBJECT_NULLABLE_PROP = "object_nullable_prop";
  
  private Map<String, Object> objectNullableProp = null;

  public static final String JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP = "object_and_items_nullable_prop";
  
  private Map<String, Object> objectAndItemsNullableProp = null;

  public static final String JSON_PROPERTY_OBJECT_ITEMS_NULLABLE = "object_items_nullable";
  
  private Map<String, Object> objectItemsNullable = null;

  /**
   * Get integerProp
   * @return integerProp
   **/
  @JsonProperty(JSON_PROPERTY_INTEGER_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getIntegerProp() {
    return integerProp;
  }

  /**
   * Set integerProp
   */
  @JsonProperty(JSON_PROPERTY_INTEGER_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegerProp(Integer integerProp) {
    this.integerProp = integerProp;
  }

  public NullableClass integerProp(Integer integerProp) {
    this.integerProp = integerProp;
    return this;
  }

  /**
   * Get numberProp
   * @return numberProp
   **/
  @JsonProperty(JSON_PROPERTY_NUMBER_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BigDecimal getNumberProp() {
    return numberProp;
  }

  /**
   * Set numberProp
   */
  @JsonProperty(JSON_PROPERTY_NUMBER_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
  }

  public NullableClass numberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
    return this;
  }

  /**
   * Get booleanProp
   * @return booleanProp
   **/
  @JsonProperty(JSON_PROPERTY_BOOLEAN_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getBooleanProp() {
    return booleanProp;
  }

  /**
   * Set booleanProp
   */
  @JsonProperty(JSON_PROPERTY_BOOLEAN_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBooleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
  }

  public NullableClass booleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
    return this;
  }

  /**
   * Get stringProp
   * @return stringProp
   **/
  @JsonProperty(JSON_PROPERTY_STRING_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStringProp() {
    return stringProp;
  }

  /**
   * Set stringProp
   */
  @JsonProperty(JSON_PROPERTY_STRING_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringProp(String stringProp) {
    this.stringProp = stringProp;
  }

  public NullableClass stringProp(String stringProp) {
    this.stringProp = stringProp;
    return this;
  }

  /**
   * Get dateProp
   * @return dateProp
   **/
  @JsonProperty(JSON_PROPERTY_DATE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Date getDateProp() {
    return dateProp;
  }

  /**
   * Set dateProp
   */
  @JsonProperty(JSON_PROPERTY_DATE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateProp(Date dateProp) {
    this.dateProp = dateProp;
  }

  public NullableClass dateProp(Date dateProp) {
    this.dateProp = dateProp;
    return this;
  }

  /**
   * Get datetimeProp
   * @return datetimeProp
   **/
  @JsonProperty(JSON_PROPERTY_DATETIME_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Date getDatetimeProp() {
    return datetimeProp;
  }

  /**
   * Set datetimeProp
   */
  @JsonProperty(JSON_PROPERTY_DATETIME_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatetimeProp(Date datetimeProp) {
    this.datetimeProp = datetimeProp;
  }

  public NullableClass datetimeProp(Date datetimeProp) {
    this.datetimeProp = datetimeProp;
    return this;
  }

  /**
   * Get arrayNullableProp
   * @return arrayNullableProp
   **/
  @JsonProperty(JSON_PROPERTY_ARRAY_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getArrayNullableProp() {
    return arrayNullableProp;
  }

  /**
   * Set arrayNullableProp
   */
  @JsonProperty(JSON_PROPERTY_ARRAY_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
  }

  public NullableClass arrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
    return this;
  }

  public NullableClass addArrayNullablePropItem(Object arrayNullablePropItem) {
    if (this.arrayNullableProp == null) {
      this.arrayNullableProp = new ArrayList<>();
    }
    this.arrayNullableProp.add(arrayNullablePropItem);
    return this;
  }

  /**
   * Get arrayAndItemsNullableProp
   * @return arrayAndItemsNullableProp
   **/
  @JsonProperty(JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getArrayAndItemsNullableProp() {
    return arrayAndItemsNullableProp;
  }

  /**
   * Set arrayAndItemsNullableProp
   */
  @JsonProperty(JSON_PROPERTY_ARRAY_AND_ITEMS_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
  }

  public NullableClass arrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
    return this;
  }

  public NullableClass addArrayAndItemsNullablePropItem(Object arrayAndItemsNullablePropItem) {
    if (this.arrayAndItemsNullableProp == null) {
      this.arrayAndItemsNullableProp = new ArrayList<>();
    }
    this.arrayAndItemsNullableProp.add(arrayAndItemsNullablePropItem);
    return this;
  }

  /**
   * Get arrayItemsNullable
   * @return arrayItemsNullable
   **/
  @JsonProperty(JSON_PROPERTY_ARRAY_ITEMS_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Object> getArrayItemsNullable() {
    return arrayItemsNullable;
  }

  /**
   * Set arrayItemsNullable
   */
  @JsonProperty(JSON_PROPERTY_ARRAY_ITEMS_NULLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
  }

  public NullableClass arrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
    return this;
  }

  public NullableClass addArrayItemsNullableItem(Object arrayItemsNullableItem) {
    if (this.arrayItemsNullable == null) {
      this.arrayItemsNullable = new ArrayList<>();
    }
    this.arrayItemsNullable.add(arrayItemsNullableItem);
    return this;
  }

  /**
   * Get objectNullableProp
   * @return objectNullableProp
   **/
  @JsonProperty(JSON_PROPERTY_OBJECT_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getObjectNullableProp() {
    return objectNullableProp;
  }

  /**
   * Set objectNullableProp
   */
  @JsonProperty(JSON_PROPERTY_OBJECT_NULLABLE_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
  }

  public NullableClass objectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
    return this;
  }

  public NullableClass putObjectNullablePropItem(String key, Object objectNullablePropItem) {
    if (this.objectNullableProp == null) {
      this.objectNullableProp = new HashMap<>();
    }
    this.objectNullableProp.put(key, objectNullablePropItem);
    return this;
  }

  /**
   * Get objectAndItemsNullableProp
   * @return objectAndItemsNullableProp
   **/
  @JsonProperty(JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getObjectAndItemsNullableProp() {
    return objectAndItemsNullableProp;
  }

  /**
   * Set objectAndItemsNullableProp
   */
  @JsonProperty(JSON_PROPERTY_OBJECT_AND_ITEMS_NULLABLE_PROP)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
  }

  public NullableClass objectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
    return this;
  }

  public NullableClass putObjectAndItemsNullablePropItem(String key, Object objectAndItemsNullablePropItem) {
    if (this.objectAndItemsNullableProp == null) {
      this.objectAndItemsNullableProp = new HashMap<>();
    }
    this.objectAndItemsNullableProp.put(key, objectAndItemsNullablePropItem);
    return this;
  }

  /**
   * Get objectItemsNullable
   * @return objectItemsNullable
   **/
  @JsonProperty(JSON_PROPERTY_OBJECT_ITEMS_NULLABLE)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getObjectItemsNullable() {
    return objectItemsNullable;
  }

  /**
   * Set objectItemsNullable
   */
  @JsonProperty(JSON_PROPERTY_OBJECT_ITEMS_NULLABLE)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
  }

  public NullableClass objectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
    return this;
  }

  public NullableClass putObjectItemsNullableItem(String key, Object objectItemsNullableItem) {
    if (this.objectItemsNullable == null) {
      this.objectItemsNullable = new HashMap<>();
    }
    this.objectItemsNullable.put(key, objectItemsNullableItem);
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
    sb.append("class NullableClass {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    integerProp: ").append(toIndentedString(integerProp)).append("\n");
    sb.append("    numberProp: ").append(toIndentedString(numberProp)).append("\n");
    sb.append("    booleanProp: ").append(toIndentedString(booleanProp)).append("\n");
    sb.append("    stringProp: ").append(toIndentedString(stringProp)).append("\n");
    sb.append("    dateProp: ").append(toIndentedString(dateProp)).append("\n");
    sb.append("    datetimeProp: ").append(toIndentedString(datetimeProp)).append("\n");
    sb.append("    arrayNullableProp: ").append(toIndentedString(arrayNullableProp)).append("\n");
    sb.append("    arrayAndItemsNullableProp: ").append(toIndentedString(arrayAndItemsNullableProp)).append("\n");
    sb.append("    arrayItemsNullable: ").append(toIndentedString(arrayItemsNullable)).append("\n");
    sb.append("    objectNullableProp: ").append(toIndentedString(objectNullableProp)).append("\n");
    sb.append("    objectAndItemsNullableProp: ").append(toIndentedString(objectAndItemsNullableProp)).append("\n");
    sb.append("    objectItemsNullable: ").append(toIndentedString(objectItemsNullable)).append("\n");
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
