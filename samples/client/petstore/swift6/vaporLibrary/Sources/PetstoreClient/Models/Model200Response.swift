//
// Model200Response.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Vapor

/** Model for testing model name starting with number */
public final class Model200Response: Content, Hashable {

    public var name: Int?
    public var `class`: String?

    public init(name: Int? = nil, `class`: String? = nil) {
        self.name = name
        self.`class` = `class`
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case name
        case `class` = "class"
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(name, forKey: .name)
        try container.encodeIfPresent(`class`, forKey: .`class`)
    }

    public static func == (lhs: Model200Response, rhs: Model200Response) -> Bool {
        lhs.name == rhs.name &&
        lhs.`class` == rhs.`class`
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(name?.hashValue)
        hasher.combine(`class`?.hashValue)
        
    }
}

