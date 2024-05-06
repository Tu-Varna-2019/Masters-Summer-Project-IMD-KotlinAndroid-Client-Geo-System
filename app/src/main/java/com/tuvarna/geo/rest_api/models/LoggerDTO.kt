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

package com.tuvarna.geo.rest_api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param username 
 * @param event 
 * @param ip 
 * @param timestamp 
 */


data class LoggerDTO (

    @Json(name = "username")
    val username: kotlin.String? = null,

    @Json(name = "event")
    val event: kotlin.String? = null,

    @Json(name = "ip")
    val ip: kotlin.String? = null,

    @Json(name = "timestamp")
    val timestamp: kotlin.String? = null

)
