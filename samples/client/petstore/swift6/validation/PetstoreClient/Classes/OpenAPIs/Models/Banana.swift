//
// Banana.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Banana: Sendable, Codable, JSONEncodable, Hashable {

    static let countRule = NumericRule<Int>(minimum: 10, exclusiveMinimum: true, maximum: 100, exclusiveMaximum: true, multipleOf: 5)
    static let idsRule = ArrayRule(minItems: 1, maxItems: 10, uniqueItems: false)
    public var count: Int?
    public var ids: [Int]?

    public init(count: Int? = nil, ids: [Int]? = nil) {
        self.count = count
        self.ids = ids
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case count
        case ids
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(count, forKey: .count)
        try container.encodeIfPresent(ids, forKey: .ids)
    }
}

