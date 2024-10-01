/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
@Controller
@Tag(name = "Pet", description = "The Pet API")
public class PetController {
    /**
     * Add a new pet to the store
     * 
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return Pet
     */
    @Operation(
        operationId = "addPet",
        summary = "Add a new pet to the store",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        parameters = {
            @Parameter(name = "pet", description = "Pet object that needs to be added to the store", required = true)
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" })
        }
    )
    @Post(uri="/pet")
    @Produces(value = {"application/xml", "application/json"})
    @Consumes(value = {"application/json", "application/xml"})
    public Mono<Pet> addPet(
        @Body @NotNull @Valid Pet pet
    ) {
        // TODO implement addPet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Deletes a pet
     * 
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     */
    @Operation(
        operationId = "deletePet",
        summary = "Deletes a pet",
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid pet value")
        },
        parameters = {
            @Parameter(name = "petId", description = "Pet id to delete", required = true),
            @Parameter(name = "apiKey")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" })
        }
    )
    @Delete(uri="/pet/{petId}")
    @Produces(value = {})
    public Mono<Void> deletePet(
        @PathVariable(value="petId") @NotNull Long petId, 
        @Header(value="api_key") @Nullable String apiKey
    ) {
        // TODO implement deletePet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (required)
     * @return List&lt;Pet&gt;
     */
    @Operation(
        operationId = "findPetsByStatus",
        summary = "Finds Pets by status",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid status value")
        },
        parameters = {
            @Parameter(name = "status", description = "Status values that need to be considered for filter", required = true)
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "read:pets" })
        }
    )
    @Get(uri="/pet/findByStatus")
    @Produces(value = {"application/xml", "application/json"})
    public Mono<List<Pet>> findPetsByStatus(
        @QueryValue(value="status") @NotNull List<String> status
    ) {
        // TODO implement findPetsByStatus();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (required)
     * @return List&lt;Pet&gt;
     */
    @Operation(
        operationId = "findPetsByTags",
        summary = "Finds Pets by tags",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid tag value")
        },
        parameters = {
            @Parameter(name = "tags", description = "Tags to filter by", required = true)
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "read:pets" })
        }
    )
    @Get(uri="/pet/findByTags")
    @Produces(value = {"application/xml", "application/json"})
    public Mono<List<Pet>> findPetsByTags(
        @QueryValue(value="tags") @NotNull List<String> tags
    ) {
        // TODO implement findPetsByTags();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return Pet
     */
    @Operation(
        operationId = "getPetById",
        summary = "Find pet by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found")
        },
        parameters = {
            @Parameter(name = "petId", description = "ID of pet to return", required = true)
        },
        security = {
            @SecurityRequirement(name = "api_key")
        }
    )
    @Get(uri="/pet/{petId}")
    @Produces(value = {"application/xml", "application/json"})
    public Mono<Pet> getPetById(
        @PathVariable(value="petId") @NotNull Long petId
    ) {
        // TODO implement getPetById();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Update an existing pet
     * 
     *
     * @param pet Pet object that needs to be added to the store (required)
     * @return Pet
     * API documentation for the updatePet operation
     * @see <a href="http://petstore.swagger.io/v2/doc/updatePet">Update an existing pet Documentation</a>
     */
    @Operation(
        operationId = "updatePet",
        summary = "Update an existing pet",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Pet.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Pet not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        },
        parameters = {
            @Parameter(name = "pet", description = "Pet object that needs to be added to the store", required = true)
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" })
        }
    )
    @Put(uri="/pet")
    @Produces(value = {"application/xml", "application/json"})
    @Consumes(value = {"application/json", "application/xml"})
    public Mono<Pet> updatePet(
        @Body @NotNull @Valid Pet pet
    ) {
        // TODO implement updatePet();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * Updates a pet in the store with form data
     * 
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     */
    @Operation(
        operationId = "updatePetWithForm",
        summary = "Updates a pet in the store with form data",
        responses = {
            @ApiResponse(responseCode = "405", description = "Invalid input")
        },
        parameters = {
            @Parameter(name = "petId", description = "ID of pet that needs to be updated", required = true),
            @Parameter(name = "name", description = "Updated name of the pet"),
            @Parameter(name = "status", description = "Updated status of the pet")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" })
        }
    )
    @Post(uri="/pet/{petId}")
    @Produces(value = {})
    @Consumes(value = {"application/x-www-form-urlencoded"})
    public Mono<Void> updatePetWithForm(
        @PathVariable(value="petId") @NotNull Long petId, 
        @Nullable String name, 
        @Nullable String status
    ) {
        // TODO implement updatePetWithForm();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }


    /**
     * uploads an image
     * 
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param _file file to upload (optional)
     * @return ModelApiResponse
     */
    @Operation(
        operationId = "uploadFile",
        summary = "uploads an image",
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))
            })
        },
        parameters = {
            @Parameter(name = "petId", description = "ID of pet to update", required = true),
            @Parameter(name = "additionalMetadata", description = "Additional data to pass to server"),
            @Parameter(name = "_file", description = "file to upload")
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes = { "write:pets", "read:pets" })
        }
    )
    @Post(uri="/pet/{petId}/uploadImage")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    public Mono<ModelApiResponse> uploadFile(
        @PathVariable(value="petId") @NotNull Long petId, 
        @Nullable String additionalMetadata, 
        @Nullable CompletedFileUpload _file
    ) {
        // TODO implement uploadFile();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}