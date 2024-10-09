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
package org.openapitools.client.models

import io.circe.*
import io.circe.syntax.*
import io.circe.{Decoder, Encoder}


/** A User who is purchasing from the pet store
  * @param id 
  * @param username 
  * @param firstName 
  * @param lastName 
  * @param email 
  * @param password 
  * @param phone 
  * @param userStatus User Status
  */
case class User(
    id: Option[Long] = None,
    username: Option[String] = None,
    firstName: Option[String] = None,
    lastName: Option[String] = None,
    email: Option[String] = None,
    password: Option[String] = None,
    phone: Option[String] = None,
    userStatus: Option[Int] = None
)
  
object User {
  given encoderUser: Encoder[User] = Encoder.instance { t =>
    Json.fromFields{
      Seq(
        t.id.map(v => "id" -> v.asJson),
        t.username.map(v => "username" -> v.asJson),
        t.firstName.map(v => "firstName" -> v.asJson),
        t.lastName.map(v => "lastName" -> v.asJson),
        t.email.map(v => "email" -> v.asJson),
        t.password.map(v => "password" -> v.asJson),
        t.phone.map(v => "phone" -> v.asJson),
        t.userStatus.map(v => "userStatus" -> v.asJson)
      ).flatten
    }
  }
  given decoderUser: Decoder[User] = Decoder.instance { c =>
    for {
      id <- c.downField("id").as[Option[Long]]
      username <- c.downField("username").as[Option[String]]
      firstName <- c.downField("firstName").as[Option[String]]
      lastName <- c.downField("lastName").as[Option[String]]
      email <- c.downField("email").as[Option[String]]
      password <- c.downField("password").as[Option[String]]
      phone <- c.downField("phone").as[Option[String]]
      userStatus <- c.downField("userStatus").as[Option[Int]]
    } yield User(
      id = id,
      username = username,
      firstName = firstName,
      lastName = lastName,
      email = email,
      password = password,
      phone = phone,
      userStatus = userStatus
    )
  }
}
