// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

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
    /// GrandparentAnimal
    /// </summary>
    public partial class GrandparentAnimal : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GrandparentAnimal" /> class.
        /// </summary>
        [JsonConstructor]
        public GrandparentAnimal()
        {
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// The discriminator
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public string PetType { get; } = "GrandparentAnimal";

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GrandparentAnimal {\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            return this.BaseValidate(validationContext);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        protected IEnumerable<ValidationResult> BaseValidate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="GrandparentAnimal" />
    /// </summary>
    public class GrandparentAnimalJsonConverter : JsonConverter<GrandparentAnimal>
    {
        /// <summary>
        /// Deserializes json to <see cref="GrandparentAnimal" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override GrandparentAnimal Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<string?> petType = default;

            string? discriminator = ClientUtils.GetDiscriminator(utf8JsonReader, "pet_type");

            if (discriminator != null && discriminator.Equals("ChildCat"))
                return JsonSerializer.Deserialize<ChildCat>(ref utf8JsonReader, jsonSerializerOptions) ?? throw new JsonException("The result was an unexpected value.");

            if (discriminator != null && discriminator.Equals("ParentPet"))
                return JsonSerializer.Deserialize<ParentPet>(ref utf8JsonReader, jsonSerializerOptions) ?? throw new JsonException("The result was an unexpected value.");

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "pet_type":
                            petType = new Option<string?>(utf8JsonReader.GetString()!);
                            break;
                        default:
                            break;
                    }
                }
            }

            if (!petType.IsSet)
                throw new ArgumentException("Property is required for class GrandparentAnimal.", nameof(petType));

            if (petType.IsSet && petType.Value == null)
                throw new ArgumentNullException(nameof(petType), "Property is not nullable for class GrandparentAnimal.");

            return new GrandparentAnimal();
        }

        /// <summary>
        /// Serializes a <see cref="GrandparentAnimal" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="grandparentAnimal"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, GrandparentAnimal grandparentAnimal, JsonSerializerOptions jsonSerializerOptions)
        {
            if (grandparentAnimal is ChildCat childCat){
                JsonSerializer.Serialize<ChildCat>(writer, childCat, jsonSerializerOptions);
                return;
            }

            if (grandparentAnimal is ParentPet parentPet){
                JsonSerializer.Serialize<ParentPet>(writer, parentPet, jsonSerializerOptions);
                return;
            }

            writer.WriteStartObject();

            WriteProperties(writer, grandparentAnimal, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="GrandparentAnimal" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="grandparentAnimal"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, GrandparentAnimal grandparentAnimal, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteString("pet_type", grandparentAnimal.PetType);
        }
    }
}