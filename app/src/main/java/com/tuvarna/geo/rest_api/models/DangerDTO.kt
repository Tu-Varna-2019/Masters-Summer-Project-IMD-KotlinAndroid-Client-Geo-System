/**
 * Please note: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
@file:Suppress("ArrayInDataClass", "EnumEntryName", "RemoveRedundantQualifierName", "UnusedImport")

package com.tuvarna.geo.rest_api.models

import com.squareup.moshi.Json

/**
 * @param latitude
 * @param longitude
 */
data class DangerDTO(
  @Json(name = "latitude") val latitude: kotlin.Double? = null,
  @Json(name = "longitude") val longitude: kotlin.Double? = null,
)