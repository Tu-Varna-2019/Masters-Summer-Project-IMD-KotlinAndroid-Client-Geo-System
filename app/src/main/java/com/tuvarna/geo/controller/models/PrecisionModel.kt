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
 * @param scale
 * @param type
 * @param floating
 * @param maximumSignificantDigits
 * @param offsetX
 * @param offsetY
 */


data class PrecisionModel (

    @Json(name = "scale")
    val scale: kotlin.Double? = null,

    @Json(name = "type")
    val type: kotlin.Any? = null,

    @Json(name = "floating")
    val floating: kotlin.Boolean? = null,

    @Json(name = "maximumSignificantDigits")
    val maximumSignificantDigits: kotlin.Int? = null,

    @Json(name = "offsetX")
    val offsetX: kotlin.Double? = null,

    @Json(name = "offsetY")
    val offsetY: kotlin.Double? = null

)

