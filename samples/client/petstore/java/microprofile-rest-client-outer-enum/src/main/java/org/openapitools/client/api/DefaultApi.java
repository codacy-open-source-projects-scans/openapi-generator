/**
 * Petstore API
 * API for managing pets in a pet store
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.model.Cat;
import org.openapitools.client.model.Dog;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;


import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * Petstore API
 *
 * <p>API for managing pets in a pet store
 *
 */

@RegisterRestClient(configKey="default-api")
@RegisterProvider(ApiExceptionMapper.class)
@Path("")
public interface DefaultApi  {

    /**
     * List all cats
     *
     */
    @GET
    @Path("/cats")
    @Produces({ "application/json" })
    List<Cat> listCats() throws ApiException, ProcessingException;

    /**
     * List all dogs
     *
     */
    @GET
    @Path("/dogs")
    @Produces({ "application/json" })
    List<Dog> listDogs() throws ApiException, ProcessingException;
}