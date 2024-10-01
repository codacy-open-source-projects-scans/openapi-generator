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

import org.openapitools.client.models.ApiStringEnumRef

import com.google.gson.annotations.SerializedName

/**
 * to test the default value of properties
 *
 * @param arrayStringEnumRefDefault 
 * @param arrayStringEnumDefault 
 * @param arrayStringDefault 
 * @param arrayIntegerDefault 
 * @param arrayString 
 * @param arrayStringNullable 
 * @param arrayStringExtensionNullable 
 * @param stringNullable 
 */


data class ApiDefaultValue (

    @SerializedName("array_string_enum_ref_default")
    val arrayStringEnumRefDefault: kotlin.collections.List<ApiStringEnumRef>? = null,

    @SerializedName("array_string_enum_default")
    val arrayStringEnumDefault: kotlin.collections.List<ApiDefaultValue.ArrayStringEnumDefault>? = null,

    @SerializedName("array_string_default")
    val arrayStringDefault: kotlin.collections.List<kotlin.String>? = arrayListOf("failure","skipped"),

    @SerializedName("array_integer_default")
    val arrayIntegerDefault: kotlin.collections.List<kotlin.Int>? = arrayListOf(1,3),

    @SerializedName("array_string")
    val arrayString: kotlin.collections.List<kotlin.String>? = null,

    @SerializedName("array_string_nullable")
    val arrayStringNullable: kotlin.collections.List<kotlin.String>? = null,

    @SerializedName("array_string_extension_nullable")
    val arrayStringExtensionNullable: kotlin.collections.List<kotlin.String>? = null,

    @SerializedName("string_nullable")
    val stringNullable: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: SUCCESS,FAILURE,UNCLASSIFIED
     */
    enum class ArrayStringEnumDefault(val value: kotlin.String) {
        @SerializedName(value = "success") SUCCESS("success"),
        @SerializedName(value = "failure") FAILURE("failure"),
        @SerializedName(value = "unclassified") UNCLASSIFIED("unclassified");
    }

}
