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
import sample.cask.model.Category
import sample.cask.model.Tag
import scala.util.control.NonFatal

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class Pet(
  id: Option[Long] = None ,

    category: Option[Category] = None ,

    name: String,

    photoUrls: Seq[String],

    tags: Seq[Tag] = Nil ,

  /* pet status in the store */
  status: Option[Pet.StatusEnum] = None 

  ) {

  def asJson: String = asData.asJson

  def asData : PetData = {
    PetData(
            id = id.getOrElse(0),
            category = category.map(_.asData).getOrElse(null),
            name = name,
            photoUrls = photoUrls,
            tags = tags.map(_.asData),
            status = status.getOrElse(null)
    )
  }

}

object Pet{

    given RW[Pet] = PetData.readWriter.bimap[Pet](_.asData, _.asModel)

    enum Fields(fieldName : String) extends Field(fieldName) {
            case id extends Fields("id")
            case category extends Fields("category")
            case name extends Fields("name")
            case photoUrls extends Fields("photoUrls")
            case tags extends Fields("tags")
            case status extends Fields("status")
    }

        // baseName=status
        // nameInCamelCase = status
        enum StatusEnum derives ReadWriter {
            case available
            case pending
            case sold
        }

}
