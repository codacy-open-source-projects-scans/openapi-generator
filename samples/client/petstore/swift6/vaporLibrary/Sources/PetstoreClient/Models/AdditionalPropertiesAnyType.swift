//
// AdditionalPropertiesAnyType.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Vapor

public final class AdditionalPropertiesAnyType: Content, Hashable {

    public var name: String?

    public init(name: String? = nil) {
        self.name = name
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
    }

    public var additionalProperties: [String: JSONValue] = [:]

    public subscript(key: String) -> JSONValue? {
        get {
            if let value = additionalProperties[key] {
                return value
            }
            return nil
        }

        set {
            additionalProperties[key] = newValue
        }
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(name, forKey: .name)
        var additionalPropertiesContainer = encoder.container(keyedBy: String.self)
        try additionalPropertiesContainer.encodeMap(additionalProperties)
    }

    // Decodable protocol methods

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)

        name = try container.decodeIfPresent(String.self, forKey: .name)
        var nonAdditionalPropertyKeys = Set<String>()
        nonAdditionalPropertyKeys.insert("name")
        let additionalPropertiesContainer = try decoder.container(keyedBy: String.self)
        additionalProperties = try additionalPropertiesContainer.decodeMap(JSONValue.self, excludedKeys: nonAdditionalPropertyKeys)
    }

    public static func == (lhs: AdditionalPropertiesAnyType, rhs: AdditionalPropertiesAnyType) -> Bool {
        lhs.name == rhs.name
        && lhs.additionalProperties == rhs.additionalProperties
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(name?.hashValue)
        hasher.combine(additionalProperties.hashValue)
    }
}

