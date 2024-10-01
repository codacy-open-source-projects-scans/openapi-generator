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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.Apple;
import org.openapitools.client.model.Banana;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
public class Fruit extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Fruit.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Fruit.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Fruit' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Apple> adapterApple = gson.getDelegateAdapter(this, TypeToken.get(Apple.class));
            final TypeAdapter<Banana> adapterBanana = gson.getDelegateAdapter(this, TypeToken.get(Banana.class));

            return (TypeAdapter<T>) new TypeAdapter<Fruit>() {
                @Override
                public void write(JsonWriter out, Fruit value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Apple`
                    if (value.getActualInstance() instanceof Apple) {
                        JsonElement element = adapterApple.toJsonTree((Apple)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Banana`
                    if (value.getActualInstance() instanceof Banana) {
                        JsonElement element = adapterBanana.toJsonTree((Banana)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Apple, Banana");
                }

                @Override
                public Fruit read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Apple
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Apple.validateJsonElement(jsonElement);
                        actualAdapter = adapterApple;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Apple'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Apple failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Apple'", e);
                    }
                    // deserialize Banana
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Banana.validateJsonElement(jsonElement);
                        actualAdapter = adapterBanana;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Banana'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Banana failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Banana'", e);
                    }

                    if (match == 1) {
                        Fruit ret = new Fruit();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Fruit: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Fruit() {
        super("oneOf", Boolean.FALSE);
    }

    public Fruit(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Apple", Apple.class);
        schemas.put("Banana", Banana.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Fruit.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Apple, Banana
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Apple) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Banana) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Apple, Banana");
    }

    /**
     * Get the actual instance, which can be the following:
     * Apple, Banana
     *
     * @return The actual instance (Apple, Banana)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Apple`. If the actual instance is not `Apple`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Apple`
     * @throws ClassCastException if the instance is not `Apple`
     */
    public Apple getApple() throws ClassCastException {
        return (Apple)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Banana`. If the actual instance is not `Banana`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Banana`
     * @throws ClassCastException if the instance is not `Banana`
     */
    public Banana getBanana() throws ClassCastException {
        return (Banana)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Fruit
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Apple
        try {
            Apple.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Apple failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Banana
        try {
            Banana.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Banana failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Fruit with oneOf schemas: Apple, Banana. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Fruit given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Fruit
     * @throws IOException if the JSON string is invalid with respect to Fruit
     */
    public static Fruit fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Fruit.class);
    }

    /**
     * Convert an instance of Fruit to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

