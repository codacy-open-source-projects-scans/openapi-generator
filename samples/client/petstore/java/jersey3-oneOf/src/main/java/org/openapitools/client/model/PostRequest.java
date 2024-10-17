/*
 * dummy
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.Map;
import org.openapitools.client.model.SchemaA;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
@JsonDeserialize(using = PostRequest.PostRequestDeserializer.class)
@JsonSerialize(using = PostRequest.PostRequestSerializer.class)
public class PostRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PostRequest.class.getName());

    public static class PostRequestSerializer extends StdSerializer<PostRequest> {
        public PostRequestSerializer(Class<PostRequest> t) {
            super(t);
        }

        public PostRequestSerializer() {
            this(null);
        }

        @Override
        public void serialize(PostRequest value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PostRequestDeserializer extends StdDeserializer<PostRequest> {
        public PostRequestDeserializer() {
            this(PostRequest.class);
        }

        public PostRequestDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PostRequest deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize SchemaA
            try {
                boolean attemptParsing = true;
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SchemaA.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SchemaA'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SchemaA'", e);
            }

            // deserialize Map<String, Object>
            try {
                boolean attemptParsing = true;
                attemptParsing = typeCoercion; //respect type coercion setting
                if (!attemptParsing) {
                }
                if (attemptParsing) {
                    final TypeReference<Map<String, Object>> ref = new TypeReference<Map<String, Object>>(){};
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ref);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Map<String, Object>'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Map<String, Object>'", e);
            }

            if (match == 1) {
                PostRequest ret = new PostRequest();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for PostRequest: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PostRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PostRequest cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType<?>> schemas = new HashMap<>();

    public PostRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public PostRequest(SchemaA o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PostRequest(Map o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Map<String, Object>", new GenericType<Map<String, Object>>() {
        });
        schemas.put("SchemaA", new GenericType<SchemaA>() {
        });
        JSON.registerDescendants(PostRequest.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType<?>> getSchemas() {
        return PostRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Map<String, Object>, SchemaA
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(SchemaA.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Map.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Map<String, Object>, SchemaA");
    }

    /**
     * Get the actual instance, which can be the following:
     * Map<String, Object>, SchemaA
     *
     * @return The actual instance (Map<String, Object>, SchemaA)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SchemaA`. If the actual instance is not `SchemaA`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SchemaA`
     * @throws ClassCastException if the instance is not `SchemaA`
     */
    public SchemaA getSchemaA() throws ClassCastException {
        return (SchemaA)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Map<String, Object>`. If the actual instance is not `Map<String, Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Map<String, Object>`
     * @throws ClassCastException if the instance is not `Map<String, Object>`
     */
    public Map<String, Object> getMapStringObject() throws ClassCastException {
        return (Map<String, Object>)super.getActualInstance();
    }

}
