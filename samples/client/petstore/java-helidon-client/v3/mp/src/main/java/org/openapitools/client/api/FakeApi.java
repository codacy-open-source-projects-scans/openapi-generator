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

package org.openapitools.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.math.BigDecimal;
import org.openapitools.client.model.ChildWithNullable;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;

/**
 * OpenAPI Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/fake")
public interface FakeApi  {

    @GET
    @Path("/BigDecimalMap")
    @Produces({ "*/*" })
    FakeBigDecimalMap200Response fakeBigDecimalMap() throws ApiException, ProcessingException;

    /**
     * Health check endpoint
     */
    @GET
    @Path("/health")
    @Produces({ "application/json" })
    HealthCheckResult fakeHealthGet() throws ApiException, ProcessingException;

    /**
     * test http signature authentication
     */
    @GET
    @Path("/http-signature-test")
    @Consumes({ "application/json", "application/xml" })
    void fakeHttpSignatureTest(Pet pet, @QueryParam("query_1") String query1, @HeaderParam("header_1") String header1) throws ApiException, ProcessingException;

    @POST
    @Path("/outer/boolean")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    Boolean fakeOuterBooleanSerialize(Boolean body) throws ApiException, ProcessingException;

    @POST
    @Path("/outer/composite")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    OuterComposite fakeOuterCompositeSerialize(OuterComposite outerComposite) throws ApiException, ProcessingException;

    @POST
    @Path("/outer/number")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    BigDecimal fakeOuterNumberSerialize(BigDecimal body) throws ApiException, ProcessingException;

    @POST
    @Path("/outer/string")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    String fakeOuterStringSerialize(String body) throws ApiException, ProcessingException;

    @POST
    @Path("/property/enum-int")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    OuterObjectWithEnumProperty fakePropertyEnumIntegerSerialize(OuterObjectWithEnumProperty outerObjectWithEnumProperty) throws ApiException, ProcessingException;

    /**
     * test referenced additionalProperties
     * 
     */
    @POST
    @Path("/additionalProperties-reference")
    @Consumes({ "application/json" })
    void testAdditionalPropertiesReference(Map<String, Object> requestBody) throws ApiException, ProcessingException;

    @PUT
    @Path("/body-with-binary")
    @Consumes({ "image/png" })
    void testBodyWithBinary(File body) throws ApiException, ProcessingException;

    @PUT
    @Path("/body-with-file-schema")
    @Consumes({ "application/json" })
    void testBodyWithFileSchema(FileSchemaTestClass fileSchemaTestClass) throws ApiException, ProcessingException;

    @PUT
    @Path("/body-with-query-params")
    @Consumes({ "application/json" })
    void testBodyWithQueryParams(@QueryParam("query") String query, User user) throws ApiException, ProcessingException;

    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     */
    @PATCH
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Client testClientModel(Client client) throws ApiException, ProcessingException;

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     */
    @POST
    
    @Consumes({ "application/x-www-form-urlencoded" })
    void testEndpointParameters(@FormParam("number") BigDecimal number, @FormParam("double") Double _double, @FormParam("pattern_without_delimiter") String patternWithoutDelimiter, @FormParam("byte") byte[] _byte, @FormParam("integer") Integer integer, @FormParam("int32") Integer int32, @FormParam("int64") Long int64, @FormParam("float") Float _float, @FormParam("string") String string, @FormParam("binary") File binary, @FormParam("date") LocalDate date, @FormParam("dateTime") OffsetDateTime dateTime, @FormParam("password") String password, @FormParam("callback") String paramCallback) throws ApiException, ProcessingException;

    /**
     * To test enum parameters
     * To test enum parameters
     */
    @GET
    
    @Consumes({ "application/x-www-form-urlencoded" })
    void testEnumParameters(@HeaderParam("enum_header_string_array") List<String> enumHeaderStringArray, @HeaderParam("enum_header_string") String enumHeaderString, @QueryParam("enum_query_string_array") List<String> enumQueryStringArray, @QueryParam("enum_query_string") @DefaultValue("-efg") String enumQueryString, @QueryParam("enum_query_integer") Integer enumQueryInteger, @QueryParam("enum_query_double") Double enumQueryDouble, @QueryParam("enum_query_model_array") List<EnumClass> enumQueryModelArray, @FormParam("enum_form_string_array") List<String> enumFormStringArray, @FormParam("enum_form_string") String enumFormString) throws ApiException, ProcessingException;

    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     */
    @DELETE
    
    void testGroupParameters(@QueryParam("required_string_group") Integer requiredStringGroup, @HeaderParam("required_boolean_group") Boolean requiredBooleanGroup, @QueryParam("required_int64_group") Long requiredInt64Group, @QueryParam("string_group") Integer stringGroup, @HeaderParam("boolean_group") Boolean booleanGroup, @QueryParam("int64_group") Long int64Group) throws ApiException, ProcessingException;

    /**
     * test inline additionalProperties
     * 
     */
    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    void testInlineAdditionalProperties(Map<String, String> requestBody) throws ApiException, ProcessingException;

    /**
     * test inline free-form additionalProperties
     * 
     */
    @POST
    @Path("/inline-freeform-additionalProperties")
    @Consumes({ "application/json" })
    void testInlineFreeformAdditionalProperties(TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws ApiException, ProcessingException;

    /**
     * test json serialization of form data
     * 
     */
    @GET
    @Path("/jsonFormData")
    @Consumes({ "application/x-www-form-urlencoded" })
    void testJsonFormData(@FormParam("param") String param, @FormParam("param2") String param2) throws ApiException, ProcessingException;

    /**
     * test nullable parent property
     * 
     */
    @POST
    @Path("/nullable")
    @Consumes({ "application/json" })
    void testNullable(ChildWithNullable childWithNullable) throws ApiException, ProcessingException;

    @PUT
    @Path("/test-query-parameters")
    void testQueryParameterCollectionFormat(@QueryParam("pipe") List<String> pipe, @QueryParam("ioutil") List<String> ioutil, @QueryParam("http") List<String> http, @QueryParam("url") List<String> url, @QueryParam("context") List<String> context, @QueryParam("allowEmpty") String allowEmpty, @QueryParam("language") Map<String, String> language) throws ApiException, ProcessingException;

    /**
     * test referenced string map
     * 
     */
    @POST
    @Path("/stringMap-reference")
    @Consumes({ "application/json" })
    void testStringMapReference(Map<String, String> requestBody) throws ApiException, ProcessingException;
}