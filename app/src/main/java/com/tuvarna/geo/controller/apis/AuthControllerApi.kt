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

package com.tuvarna.geo.controller.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import com.tuvarna.geo.controller.models.LoginUserDTO
import com.tuvarna.geo.controller.models.RegisterUserDTO
import com.tuvarna.geo.controller.models.RestApiResponseLoggedInUserDTO
import com.tuvarna.geo.controller.models.RestApiResponseVoid

import com.squareup.moshi.Json

import com.tuvarna.geo.controller.infrastructure.ApiClient
import com.tuvarna.geo.controller.infrastructure.ApiResponse
import com.tuvarna.geo.controller.infrastructure.ClientException
import com.tuvarna.geo.controller.infrastructure.ClientError
import com.tuvarna.geo.controller.infrastructure.ServerException
import com.tuvarna.geo.controller.infrastructure.ServerError
import com.tuvarna.geo.controller.infrastructure.MultiValueMap
import com.tuvarna.geo.controller.infrastructure.PartConfig
import com.tuvarna.geo.controller.infrastructure.RequestConfig
import com.tuvarna.geo.controller.infrastructure.RequestMethod
import com.tuvarna.geo.controller.infrastructure.ResponseType
import com.tuvarna.geo.controller.infrastructure.Success
import com.tuvarna.geo.controller.infrastructure.toMultiValue

class AuthControllerApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:8080/api.tuvarna.geo.com/v1")
        }
    }

    /**
     * Register a new user
     *
     * @param registerUserDTO
     * @return RestApiResponseVoid
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun create(registerUserDTO: RegisterUserDTO) : RestApiResponseVoid {
        val localVarResponse = createWithHttpInfo(registerUserDTO = registerUserDTO)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RestApiResponseVoid
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Register a new user
     *
     * @param registerUserDTO
     * @return ApiResponse<RestApiResponseVoid?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createWithHttpInfo(registerUserDTO: RegisterUserDTO) : ApiResponse<RestApiResponseVoid?> {
        val localVariableConfig = createRequestConfig(registerUserDTO = registerUserDTO)

        return request<RegisterUserDTO, RestApiResponseVoid>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation create
     *
     * @param registerUserDTO
     * @return RequestConfig
     */
    fun createRequestConfig(registerUserDTO: RegisterUserDTO) : RequestConfig<RegisterUserDTO> {
        val localVariableBody = registerUserDTO
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/auth/register",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Logging on a new user
     *
     * @param loginUserDTO
     * @return RestApiResponseLoggedInUserDTO
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun login(loginUserDTO: LoginUserDTO) : RestApiResponseLoggedInUserDTO {
        val localVarResponse = loginWithHttpInfo(loginUserDTO = loginUserDTO)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RestApiResponseLoggedInUserDTO
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Logging on a new user
     *
     * @param loginUserDTO
     * @return ApiResponse<RestApiResponseLoggedInUserDTO?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun loginWithHttpInfo(loginUserDTO: LoginUserDTO) : ApiResponse<RestApiResponseLoggedInUserDTO?> {
        val localVariableConfig = loginRequestConfig(loginUserDTO = loginUserDTO)

        return request<LoginUserDTO, RestApiResponseLoggedInUserDTO>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation login
     *
     * @param loginUserDTO
     * @return RequestConfig
     */
    fun loginRequestConfig(loginUserDTO: LoginUserDTO) : RequestConfig<LoginUserDTO> {
        val localVariableBody = loginUserDTO
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/auth/login",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
