/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.tuvarna.geo.controller.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 *
 *
 * @param username
 * @param email
 * @param password
 * @param isblocked
 * @param usertype
 */


data class RegisterUserDTO (

    @Json(name = "username")
    val username: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "password")
    val password: kotlin.String? = null,

    @Json(name = "isblocked")
    val isblocked: kotlin.Boolean? = null,

    @Json(name = "usertype")
    val usertype: kotlin.String? = null

)

