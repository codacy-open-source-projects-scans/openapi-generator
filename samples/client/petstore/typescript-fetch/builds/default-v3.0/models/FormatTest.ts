/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { Decimal } from './Decimal';
import {
    DecimalFromJSON,
    DecimalFromJSONTyped,
    DecimalToJSON,
    DecimalToJSONTyped,
} from './Decimal';

/**
 * 
 * @export
 * @interface FormatTest
 */
export interface FormatTest {
    /**
     * 
     * @type {number}
     * @memberof FormatTest
     */
    integer?: number;
    /**
     * 
     * @type {number}
     * @memberof FormatTest
     */
    int32?: number;
    /**
     * 
     * @type {number}
     * @memberof FormatTest
     */
    int64?: number;
    /**
     * 
     * @type {number}
     * @memberof FormatTest
     */
    number: number;
    /**
     * 
     * @type {number}
     * @memberof FormatTest
     */
    _float?: number;
    /**
     * 
     * @type {number}
     * @memberof FormatTest
     */
    _double?: number;
    /**
     * 
     * @type {Decimal}
     * @memberof FormatTest
     */
    decimal?: Decimal;
    /**
     * 
     * @type {string}
     * @memberof FormatTest
     */
    string?: string;
    /**
     * 
     * @type {string}
     * @memberof FormatTest
     */
    _byte: string;
    /**
     * 
     * @type {Blob}
     * @memberof FormatTest
     */
    binary?: Blob;
    /**
     * 
     * @type {Date}
     * @memberof FormatTest
     */
    date: Date;
    /**
     * 
     * @type {Date}
     * @memberof FormatTest
     */
    dateTime?: Date;
    /**
     * 
     * @type {string}
     * @memberof FormatTest
     */
    uuid?: string;
    /**
     * 
     * @type {string}
     * @memberof FormatTest
     */
    password: string;
    /**
     * A string that is a 10 digit number. Can have leading zeros.
     * @type {string}
     * @memberof FormatTest
     */
    patternWithDigits?: string;
    /**
     * A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01.
     * @type {string}
     * @memberof FormatTest
     */
    patternWithDigitsAndDelimiter?: string;
}

/**
 * Check if a given object implements the FormatTest interface.
 */
export function instanceOfFormatTest(value: object): value is FormatTest {
    if (!('number' in value) || value['number'] === undefined) return false;
    if (!('_byte' in value) || value['_byte'] === undefined) return false;
    if (!('date' in value) || value['date'] === undefined) return false;
    if (!('password' in value) || value['password'] === undefined) return false;
    return true;
}

export function FormatTestFromJSON(json: any): FormatTest {
    return FormatTestFromJSONTyped(json, false);
}

export function FormatTestFromJSONTyped(json: any, ignoreDiscriminator: boolean): FormatTest {
    if (json == null) {
        return json;
    }
    return {
        
        'integer': json['integer'] == null ? undefined : json['integer'],
        'int32': json['int32'] == null ? undefined : json['int32'],
        'int64': json['int64'] == null ? undefined : json['int64'],
        'number': json['number'],
        '_float': json['float'] == null ? undefined : json['float'],
        '_double': json['double'] == null ? undefined : json['double'],
        'decimal': json['decimal'] == null ? undefined : DecimalFromJSON(json['decimal']),
        'string': json['string'] == null ? undefined : json['string'],
        '_byte': json['byte'],
        'binary': json['binary'] == null ? undefined : json['binary'],
        'date': (new Date(json['date'])),
        'dateTime': json['dateTime'] == null ? undefined : (new Date(json['dateTime'])),
        'uuid': json['uuid'] == null ? undefined : json['uuid'],
        'password': json['password'],
        'patternWithDigits': json['pattern_with_digits'] == null ? undefined : json['pattern_with_digits'],
        'patternWithDigitsAndDelimiter': json['pattern_with_digits_and_delimiter'] == null ? undefined : json['pattern_with_digits_and_delimiter'],
    };
}

  export function FormatTestToJSON(json: any): FormatTest {
      return FormatTestToJSONTyped(json, false);
  }

  export function FormatTestToJSONTyped(value?: FormatTest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'integer': value['integer'],
        'int32': value['int32'],
        'int64': value['int64'],
        'number': value['number'],
        'float': value['_float'],
        'double': value['_double'],
        'decimal': DecimalToJSON(value['decimal']),
        'string': value['string'],
        'byte': value['_byte'],
        'binary': value['binary'],
        'date': ((value['date']).toISOString().substring(0,10)),
        'dateTime': value['dateTime'] == null ? undefined : ((value['dateTime']).toISOString()),
        'uuid': value['uuid'],
        'password': value['password'],
        'pattern_with_digits': value['patternWithDigits'],
        'pattern_with_digits_and_delimiter': value['patternWithDigitsAndDelimiter'],
    };
}
