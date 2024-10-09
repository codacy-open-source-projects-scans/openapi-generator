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

sealed trait _Authorization

object _Authorization {
  final case class Basic(username: String, password: Option[String] = None) extends _Authorization
  final case class ApiKey(name: String, value: String)                      extends _Authorization
  final case class Bearer(token: String)                                    extends _Authorization
}