//
// Animal.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

internal struct Animal: Codable, JSONEncodable {

    internal private(set) var className: String
    internal private(set) var color: String? = "red"

    internal init(className: String, color: String? = "red") {
        self.className = className
        self.color = color
    }

    internal enum CodingKeys: String, CodingKey, CaseIterable {
        case className
        case color
    }

    // Encodable protocol methods

    internal func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(className, forKey: .className)
        try container.encodeIfPresent(color, forKey: .color)
    }
}
