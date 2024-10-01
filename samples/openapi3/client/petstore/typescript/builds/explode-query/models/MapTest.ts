/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class MapTest {
    'mapMapOfString'?: { [key: string]: { [key: string]: string; }; };
    'mapOfEnumString'?: { [key: string]: string; };
    'directMap'?: { [key: string]: boolean; };
    'indirectMap'?: { [key: string]: boolean; };

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "mapMapOfString",
            "baseName": "map_map_of_string",
            "type": "{ [key: string]: { [key: string]: string; }; }",
            "format": ""
        },
        {
            "name": "mapOfEnumString",
            "baseName": "map_of_enum_string",
            "type": "{ [key: string]: string; }",
            "format": ""
        },
        {
            "name": "directMap",
            "baseName": "direct_map",
            "type": "{ [key: string]: boolean; }",
            "format": ""
        },
        {
            "name": "indirectMap",
            "baseName": "indirect_map",
            "type": "{ [key: string]: boolean; }",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MapTest.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum MapTestMapOfEnumStringEnum {
    Upper = 'UPPER',
    Lower = 'lower'
}
