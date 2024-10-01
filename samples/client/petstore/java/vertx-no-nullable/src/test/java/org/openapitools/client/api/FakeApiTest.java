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

package org.openapitools.client.api;

import io.vertx.core.file.AsyncFile;
import java.math.BigDecimal;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.User;
import org.openapitools.client.model.XmlItem;

import org.openapitools.client.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.Async;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
@Disabled
public class FakeApiTest {

    private FakeApi api;

    @BeforeAll
    public void setupApiClient() {
        api = new FakeApiImpl();
    }

    /**
     * creates an XmlItem
     * this route creates an XmlItem
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void createXmlItemTest(TestContext testContext) {
        Async async = testContext.async();
        XmlItem xmlItem = null;
        api.createXmlItem(xmlItem, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * Test serialization of outer boolean types
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterBooleanSerializeTest(TestContext testContext) {
        Async async = testContext.async();
        Boolean body = null;
        api.fakeOuterBooleanSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * Test serialization of object with outer number type
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterCompositeSerializeTest(TestContext testContext) {
        Async async = testContext.async();
        OuterComposite body = null;
        api.fakeOuterCompositeSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * Test serialization of outer number types
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterNumberSerializeTest(TestContext testContext) {
        Async async = testContext.async();
        BigDecimal body = null;
        api.fakeOuterNumberSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * Test serialization of outer string types
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void fakeOuterStringSerializeTest(TestContext testContext) {
        Async async = testContext.async();
        String body = null;
        api.fakeOuterStringSerialize(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testBodyWithFileSchemaTest(TestContext testContext) {
        Async async = testContext.async();
        FileSchemaTestClass body = null;
        api.testBodyWithFileSchema(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testBodyWithQueryParamsTest(TestContext testContext) {
        Async async = testContext.async();
        String query = null;
        User body = null;
        api.testBodyWithQueryParams(query, body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testClientModelTest(TestContext testContext) {
        Async async = testContext.async();
        Client body = null;
        api.testClientModel(body, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testEndpointParametersTest(TestContext testContext) {
        Async async = testContext.async();
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        AsyncFile binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * To test enum parameters
     * To test enum parameters
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testEnumParametersTest(TestContext testContext) {
        Async async = testContext.async();
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testGroupParametersTest(TestContext testContext) {
        Async async = testContext.async();
        Integer requiredStringGroup = null;
        Boolean requiredBooleanGroup = null;
        Long requiredInt64Group = null;
        Integer stringGroup = null;
        Boolean booleanGroup = null;
        Long int64Group = null;
        api.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * test inline additionalProperties
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testInlineAdditionalPropertiesTest(TestContext testContext) {
        Async async = testContext.async();
        Map<String, String> param = null;
        api.testInlineAdditionalProperties(param, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * test json serialization of form data
     * 
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testJsonFormDataTest(TestContext testContext) {
        Async async = testContext.async();
        String param = null;
        String param2 = null;
        api.testJsonFormData(param, param2, result -> {
            // TODO: test validations
            async.complete();
        });
    }
    /**
     * 
     * To test the collection format in query parameters
     *
     * @param context Vertx test context for doing assertions
     */
    @Test
    public void testQueryParameterCollectionFormatTest(TestContext testContext) {
        Async async = testContext.async();
        List<String> pipe = null;
        List<String> ioutil = null;
        List<String> http = null;
        List<String> url = null;
        List<String> context = null;
        api.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context, result -> {
            // TODO: test validations
            async.complete();
        });
    }
}