// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Defines findPetsByStatus_status_parameter_inner
    /// </summary>
    public enum FindPetsByStatusStatusParameterInner
    {
        /// <summary>
        /// Enum Available for value: available
        /// </summary>
        Available = 1,

        /// <summary>
        /// Enum Pending for value: pending
        /// </summary>
        Pending = 2,

        /// <summary>
        /// Enum Sold for value: sold
        /// </summary>
        Sold = 3
    }

    /// <summary>
    /// Converts <see cref="FindPetsByStatusStatusParameterInner"/> to and from the JSON value
    /// </summary>
    public static class FindPetsByStatusStatusParameterInnerValueConverter
    {
        /// <summary>
        /// Parses a given value to <see cref="FindPetsByStatusStatusParameterInner"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static FindPetsByStatusStatusParameterInner FromString(string value)
        {
            if (value.Equals("available"))
                return FindPetsByStatusStatusParameterInner.Available;

            if (value.Equals("pending"))
                return FindPetsByStatusStatusParameterInner.Pending;

            if (value.Equals("sold"))
                return FindPetsByStatusStatusParameterInner.Sold;

            throw new NotImplementedException($"Could not convert value to type FindPetsByStatusStatusParameterInner: '{value}'");
        }

        /// <summary>
        /// Parses a given value to <see cref="FindPetsByStatusStatusParameterInner"/>
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static FindPetsByStatusStatusParameterInner? FromStringOrDefault(string value)
        {
            if (value.Equals("available"))
                return FindPetsByStatusStatusParameterInner.Available;

            if (value.Equals("pending"))
                return FindPetsByStatusStatusParameterInner.Pending;

            if (value.Equals("sold"))
                return FindPetsByStatusStatusParameterInner.Sold;

            return null;
        }

        /// <summary>
        /// Converts the <see cref="FindPetsByStatusStatusParameterInner"/> to the json value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        /// <exception cref="NotImplementedException"></exception>
        public static string ToJsonValue(FindPetsByStatusStatusParameterInner value)
        {
            if (value == FindPetsByStatusStatusParameterInner.Available)
                return "available";

            if (value == FindPetsByStatusStatusParameterInner.Pending)
                return "pending";

            if (value == FindPetsByStatusStatusParameterInner.Sold)
                return "sold";

            throw new NotImplementedException($"Value could not be handled: '{value}'");
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="FindPetsByStatusStatusParameterInner"/>
    /// </summary>
    /// <exception cref="NotImplementedException"></exception>
    public class FindPetsByStatusStatusParameterInnerJsonConverter : JsonConverter<FindPetsByStatusStatusParameterInner>
    {
        /// <summary>
        /// Returns a  from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override FindPetsByStatusStatusParameterInner Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            FindPetsByStatusStatusParameterInner? result = rawValue == null
                ? null
                : FindPetsByStatusStatusParameterInnerValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the FindPetsByStatusStatusParameterInner to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="findPetsByStatusStatusParameterInner"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, FindPetsByStatusStatusParameterInner findPetsByStatusStatusParameterInner, JsonSerializerOptions options)
        {
            writer.WriteStringValue(findPetsByStatusStatusParameterInner.ToString());
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="FindPetsByStatusStatusParameterInner"/>
    /// </summary>
    public class FindPetsByStatusStatusParameterInnerNullableJsonConverter : JsonConverter<FindPetsByStatusStatusParameterInner?>
    {
        /// <summary>
        /// Returns a FindPetsByStatusStatusParameterInner from the Json object
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        public override FindPetsByStatusStatusParameterInner? Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            string rawValue = reader.GetString();

            FindPetsByStatusStatusParameterInner? result = rawValue == null
                ? null
                : FindPetsByStatusStatusParameterInnerValueConverter.FromStringOrDefault(rawValue);

            if (result != null)
                return result.Value;

            throw new JsonException();
        }

        /// <summary>
        /// Writes the DateTime to the json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="findPetsByStatusStatusParameterInner"></param>
        /// <param name="options"></param>
        public override void Write(Utf8JsonWriter writer, FindPetsByStatusStatusParameterInner? findPetsByStatusStatusParameterInner, JsonSerializerOptions options)
        {
            writer.WriteStringValue(findPetsByStatusStatusParameterInner?.ToString() ?? "null");
        }
    }
}