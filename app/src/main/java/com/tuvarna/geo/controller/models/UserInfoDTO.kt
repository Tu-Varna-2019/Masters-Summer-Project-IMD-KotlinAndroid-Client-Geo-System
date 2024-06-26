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
 * @param isblocked
 * @param userType
 */


data class UserInfoDTO (

    @Json(name = "username")
    val username: kotlin.String? = null,

    @Json(name = "email")
    val email: kotlin.String? = null,

    @Json(name = "isblocked")
    val isblocked: kotlin.Boolean? = null,

    @Json(name = "userType")
    val userType: kotlin.String? = null

)

