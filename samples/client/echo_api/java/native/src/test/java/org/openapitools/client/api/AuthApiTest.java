/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openapitools.client.ApiException;


/**
 * API tests for AuthApi
 */
@Disabled
public class AuthApiTest {

    private final AuthApi api = new AuthApi();

    
    /**
     * To test HTTP basic authentication
     *
     * To test HTTP basic authentication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testAuthHttpBasicTest() throws ApiException {
        String response = 
        api.testAuthHttpBasic();
        
        // TODO: test validations
    }
    
    /**
     * To test HTTP bearer authentication
     *
     * To test HTTP bearer authentication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testAuthHttpBearerTest() throws ApiException {
        String response = 
        api.testAuthHttpBearer();
        
        // TODO: test validations
    }
    
}