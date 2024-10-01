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

export class ArrayOfArrayOfNumberOnly {
    'arrayArrayNumber'?: Array<Array<number>>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "arrayArrayNumber",
            "baseName": "ArrayArrayNumber",
            "type": "Array<Array<number>>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ArrayOfArrayOfNumberOnly.attributeTypeMap;
    }

    public constructor() {
    }
}