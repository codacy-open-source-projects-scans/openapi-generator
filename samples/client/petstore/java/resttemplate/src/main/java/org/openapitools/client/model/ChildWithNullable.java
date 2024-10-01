/*
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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.ParentWithNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChildWithNullable
 */
@JsonPropertyOrder({
  ChildWithNullable.JSON_PROPERTY_OTHER_PROPERTY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)

public class ChildWithNullable extends ParentWithNullable {
  public static final String JSON_PROPERTY_OTHER_PROPERTY = "otherProperty";
  private String otherProperty;

  public ChildWithNullable() {

  }

  /**
   * Constructor with all args parameters
   */
  public ChildWithNullable(@JsonProperty(JSON_PROPERTY_OTHER_PROPERTY) String otherProperty, @JsonProperty(JSON_PROPERTY_TYPE) TypeEnum type, @JsonProperty(JSON_PROPERTY_NULLABLE_PROPERTY) String nullableProperty) {
    super(type, nullableProperty);
    this.otherProperty = otherProperty;
  }

  public ChildWithNullable otherProperty(String otherProperty) {
    
    this.otherProperty = otherProperty;
    return this;
  }

  /**
   * Get otherProperty
   * @return otherProperty
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTHER_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOtherProperty() {
    return otherProperty;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherProperty(String otherProperty) {
    this.otherProperty = otherProperty;
  }

  @Override
  public ChildWithNullable type(TypeEnum type) {
    this.setType(type);
    return this;
  }

  @Override
  public ChildWithNullable nullableProperty(String nullableProperty) {
    this.setNullableProperty(nullableProperty);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildWithNullable childWithNullable = (ChildWithNullable) o;
    return Objects.equals(this.otherProperty, childWithNullable.otherProperty) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherProperty, super.hashCode());
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildWithNullable {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    otherProperty: ").append(toIndentedString(otherProperty)).append("\n");
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

  public static class Builder extends ParentWithNullable.Builder {

    private ChildWithNullable instance;

    public Builder() {
      this(new ChildWithNullable());
    }

    protected Builder(ChildWithNullable instance) {
      super(instance);
      this.instance = instance;
    }

    public ChildWithNullable.Builder otherProperty(String otherProperty) {
      this.instance.otherProperty = otherProperty;
      return this;
    }

    public ChildWithNullable.Builder type(TypeEnum type) { // inherited: true
      super.type(type);
      return this;
   }

    public ChildWithNullable.Builder nullableProperty(String nullableProperty) { // inherited: true
      super.nullableProperty(nullableProperty);
      return this;
   }
    public ChildWithNullable.Builder nullableProperty(JsonNullable<String> nullableProperty) {
      this.instance.nullableProperty = nullableProperty;
      return this;
    }


    /**
    * returns a built ChildWithNullable instance.
    *
    * The builder is not reusable.
    */
    public ChildWithNullable build() {
      try {
        return this.instance;
      } finally {
        // ensure that this.instance is not reused
        super.build();
        this.instance = null;
      }
    }

    @Override
    public String toString() {
      return getClass() + "=(" + instance + ")";
    }
  }

  /**
  * Create a builder with no initialized field.
  */
  public static ChildWithNullable.Builder builder() {
    return new ChildWithNullable.Builder();
  }

  /**
  * Create a builder with a shallow copy of this instance.
  */
  public ChildWithNullable.Builder toBuilder() {
    return new ChildWithNullable.Builder()
      .type(getType())
      .nullableProperty(getNullableProperty())
      .otherProperty(getOtherProperty());
  }


}
