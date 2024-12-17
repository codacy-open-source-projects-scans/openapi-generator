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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * Must be named &#x60;File&#x60; for test.
 */
@JsonPropertyOrder({
  ModelFile.JSON_PROPERTY_SOURCE_U_R_I
})
@JsonTypeName("File")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
@XmlRootElement(name = "ModelFile")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "ModelFile")
public class ModelFile {
  public static final String JSON_PROPERTY_SOURCE_U_R_I = "sourceURI";
  @XmlElement(name = "sourceURI")
  @javax.annotation.Nullable
  private String sourceURI;

  public ModelFile() {
  }

  public ModelFile sourceURI(@javax.annotation.Nullable String sourceURI) {
    
    this.sourceURI = sourceURI;
    return this;
  }

  /**
   * Test capitalization
   * @return sourceURI
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "sourceURI")

  public String getSourceURI() {
    return sourceURI;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_U_R_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "sourceURI")
  public void setSourceURI(@javax.annotation.Nullable String sourceURI) {
    this.sourceURI = sourceURI;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelFile _file = (ModelFile) o;
    return Objects.equals(this.sourceURI, _file.sourceURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceURI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelFile {\n");
    sb.append("    sourceURI: ").append(toIndentedString(sourceURI)).append("\n");
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

