/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import com.google.gson.annotations.JsonAdapter
import java.io.IOException
import com.google.gson.annotations.SerializedName

/**
 * A User who is purchasing from the pet store
 *
 * @param username 
 * @param id 
 * @param firstName 
 * @param lastName 
 * @param email 
 * @param password 
 * @param phone 
 * @param userStatus User Status
 */


data class ApiUser (

    @SerializedName("username")
    val username: kotlin.String,

    @SerializedName("id")
    val id: kotlin.Long? = null,

    @SerializedName("firstName")
    val firstName: kotlin.String? = null,

    @SerializedName("lastName")
    val lastName: kotlin.String? = null,

    @SerializedName("email")
    val email: kotlin.String? = null,

    @SerializedName("password")
    val password: kotlin.String? = null,

    @SerializedName("phone")
    val phone: kotlin.String? = null,

    /* User Status */
    @SerializedName("userStatus")
    val userStatus: kotlin.Int? = null

) {


    class CustomTypeAdapterFactory : TypeAdapterFactory {
        override fun <T> create(gson: Gson, type: TypeToken<T>): TypeAdapter<T>? {
            if (!ApiUser::class.java.isAssignableFrom(type.rawType)) {
              return null // this class only serializes 'ApiUser' and its subtypes
            }
            val elementAdapter = gson.getAdapter(JsonElement::class.java)
            val thisAdapter = gson.getDelegateAdapter(this, TypeToken.get(ApiUser::class.java))

            @Suppress("UNCHECKED_CAST")
            return object : TypeAdapter<ApiUser>() {
                @Throws(IOException::class)
                override fun write(out: JsonWriter, value: ApiUser) {
                    val obj = thisAdapter.toJsonTree(value).getAsJsonObject()
                    elementAdapter.write(out, obj)
                }

                @Throws(IOException::class)
                override fun read(jsonReader: JsonReader): ApiUser  {
                    val jsonElement = elementAdapter.read(jsonReader)
                    validateJsonElement(jsonElement)
                    return thisAdapter.fromJsonTree(jsonElement)
                }
            }.nullSafe() as TypeAdapter<T>
        }
    }

    companion object {
        var openapiFields = HashSet<String>()
        var openapiRequiredFields = HashSet<String>()
      
        init {
            // a set of all properties/fields (JSON key names)
            openapiFields.add("username")
            openapiFields.add("id")
            openapiFields.add("firstName")
            openapiFields.add("lastName")
            openapiFields.add("email")
            openapiFields.add("password")
            openapiFields.add("phone")
            openapiFields.add("userStatus")

            // a set of required properties/fields (JSON key names)
            openapiRequiredFields.add("username")
        }
      
       /**
        * Validates the JSON Element and throws an exception if issues found
        *
        * @param jsonElement JSON Element
        * @throws IOException if the JSON Element is invalid with respect to ApiUser
        */
        @Throws(IOException::class)
        fun validateJsonElement(jsonElement: JsonElement?) {
            if (jsonElement == null) {
              require(openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                String.format("The required field(s) %s in ApiUser is not found in the empty JSON string", ApiUser.openapiRequiredFields.toString())
              }
            }
      
            // check to make sure all required properties/fields are present in the JSON string
            for (requiredField in openapiRequiredFields) {
              requireNotNull(jsonElement!!.getAsJsonObject()[requiredField]) {
                String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString())
              }
            }
            val jsonObj = jsonElement!!.getAsJsonObject()
            require(jsonObj["username"].isJsonPrimitive) {
              String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj["username"].toString())
            }
            if (jsonObj["firstName"] != null && !jsonObj["firstName"].isJsonNull) {
              require(jsonObj.get("firstName").isJsonPrimitive) {
                String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj["firstName"].toString())
              }
            }
            if (jsonObj["lastName"] != null && !jsonObj["lastName"].isJsonNull) {
              require(jsonObj.get("lastName").isJsonPrimitive) {
                String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj["lastName"].toString())
              }
            }
            if (jsonObj["email"] != null && !jsonObj["email"].isJsonNull) {
              require(jsonObj.get("email").isJsonPrimitive) {
                String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj["email"].toString())
              }
            }
            if (jsonObj["password"] != null && !jsonObj["password"].isJsonNull) {
              require(jsonObj.get("password").isJsonPrimitive) {
                String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj["password"].toString())
              }
            }
            if (jsonObj["phone"] != null && !jsonObj["phone"].isJsonNull) {
              require(jsonObj.get("phone").isJsonPrimitive) {
                String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj["phone"].toString())
              }
            }
        }
    }

}

