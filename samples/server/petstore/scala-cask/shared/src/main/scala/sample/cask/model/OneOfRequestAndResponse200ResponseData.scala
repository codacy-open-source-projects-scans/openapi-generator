/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

// this model was generated using modelData.mustache
package sample.cask.model
import java.time.OffsetDateTime
import scala.util.control.NonFatal
import scala.util.*

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*


type OneOfRequestAndResponse200ResponseData = SomeResponse1Data | SomeResponse2Data

object OneOfRequestAndResponse200ResponseData {

  def validated(d8a : OneOfRequestAndResponse200ResponseData, failFast: Boolean) : Try[OneOfRequestAndResponse200Response] = {
    d8a match {
      case value : SomeResponse1Data => value.validated(failFast)
      case value : SomeResponse2Data => value.validated(failFast)
    }
  }

  def fromJsonString(jason : String) = fromJson {
    try {
      read[ujson.Value](jason)
    } catch {
      case NonFatal(e) => sys.error(s"Error parsing json '$jason': $e")
    }
  }

  def fromJson(jason : ujson.Value) : OneOfRequestAndResponse200ResponseData = {
      val attempt =  Try(SomeResponse1Data.fromJson(jason))  .orElse( Try(SomeResponse2Data.fromJson(jason)) ) /* not first */ 
      attempt.get
  }
}