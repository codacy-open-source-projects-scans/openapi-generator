/** OpenAPI Petstore
  * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
  *
  * The version of the OpenAPI document: 1.0.0
  * Contact: team@openapitools.org
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech
  * Do not edit the class manually.
  */
package org.openapitools.client.apis

import cats.effect.*
import cats.implicits.*
import io.circe.{Decoder, Encoder}
import org.http4s.{EntityDecoder, EntityEncoder, Response}
import org.http4s.circe as http4sCirce
import org.openapitools.client.models.*

object JsonSupports {

  implicit def circeJsonEncoder[F[*]: Concurrent, A](implicit encoder: Encoder[A]): EntityEncoder[F, A] =
    http4sCirce.jsonEncoderOf[F, A]
  implicit def circeJsonDecoder[F[*]: Concurrent, A](implicit decoder: Decoder[A]): EntityDecoder[F, A] =
    http4sCirce.jsonOf[F, A]

  def parseJson[F[*]: Concurrent, T](
      className: String,
      r: Response[F]
  )(implicit decoder: Decoder[T]): F[T] = r.attemptAs[T].value.flatMap {
    case Right(value) => Concurrent[F].pure(value)
    case Left(error)  => Concurrent[F].raiseError(
      _FailedRequest(r.status.code, s"Invalid json for class[$className]: error $error")
    )
  }

}
