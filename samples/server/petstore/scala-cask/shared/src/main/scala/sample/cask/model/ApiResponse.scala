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

// this model was generated using model.mustache
package sample.cask.model
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class ApiResponse(
  code: Option[Int] = None ,

    `type`: Option[String] = None ,

    message: Option[String] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : ApiResponseData = {
    ApiResponseData(
            code = code.getOrElse(0),
            `type` = `type`.getOrElse(""),
            message = message.getOrElse("")
    )
  }

}

object ApiResponse{

    given RW[ApiResponse] = ApiResponseData.readWriter.bimap[ApiResponse](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case code extends Fields("code")
            case `type` extends Fields("`type`")
            case message extends Fields("message")
    }


}
