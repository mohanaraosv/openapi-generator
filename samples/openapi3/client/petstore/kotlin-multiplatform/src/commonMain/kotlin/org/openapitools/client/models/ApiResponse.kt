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
package org.openapitools.client.models


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer
/**
 * 
 * @param code 
 * @param type 
 * @param message 
 */
@Serializable
data class ApiResponse (
    @SerialName(value = "code") val code: kotlin.Int? = null,
    @SerialName(value = "type") val type: kotlin.String? = null,
    @SerialName(value = "message") val message: kotlin.String? = null
) 



