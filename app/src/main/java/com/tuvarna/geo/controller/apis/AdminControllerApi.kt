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

import com.tuvarna.geo.controller.models.LoggerDTO
import com.tuvarna.geo.controller.models.RestApiResponseListLoggerDTO
import com.tuvarna.geo.controller.models.RestApiResponseListUserInfoDTO
import com.tuvarna.geo.controller.models.RestApiResponseVoid

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

class AdminControllerApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost:8080/api.tuvarna.geo.com/v1")
        }
    }

    /**
     * Block user
     *
     * @param email
     * @param blocked
     * @return RestApiResponseVoid
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun blockUser(email: kotlin.String, blocked: kotlin.Boolean) : RestApiResponseVoid {
        val localVarResponse = blockUserWithHttpInfo(email = email, blocked = blocked)

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
     * Block user
     *
     * @param email
     * @param blocked
     * @return ApiResponse<RestApiResponseVoid?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun blockUserWithHttpInfo(email: kotlin.String, blocked: kotlin.Boolean) : ApiResponse<RestApiResponseVoid?> {
        val localVariableConfig = blockUserRequestConfig(email = email, blocked = blocked)

        return request<Unit, RestApiResponseVoid>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation blockUser
     *
     * @param email
     * @param blocked
     * @return RequestConfig
     */
    fun blockUserRequestConfig(email: kotlin.String, blocked: kotlin.Boolean) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/admin/users/{email}/block/{blocked}".replace("{"+"email"+"}", encodeURIComponent(email.toString())).replace("{"+"blocked"+"}", encodeURIComponent(blocked.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Retrieve user logs
     *
     * @param userType
     * @return RestApiResponseListLoggerDTO
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getLogs(userType: kotlin.String) : RestApiResponseListLoggerDTO {
        val localVarResponse = getLogsWithHttpInfo(userType = userType)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RestApiResponseListLoggerDTO
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
     * Retrieve user logs
     *
     * @param userType
     * @return ApiResponse<RestApiResponseListLoggerDTO?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getLogsWithHttpInfo(userType: kotlin.String) : ApiResponse<RestApiResponseListLoggerDTO?> {
        val localVariableConfig = getLogsRequestConfig(userType = userType)

        return request<Unit, RestApiResponseListLoggerDTO>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getLogs
     *
     * @param userType
     * @return RequestConfig
     */
    fun getLogsRequestConfig(userType: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/fetch/logs/{userType}".replace("{"+"userType"+"}", encodeURIComponent(userType.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Get all users
     *
     * @param userType
     * @return RestApiResponseListUserInfoDTO
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getUsers(userType: kotlin.String) : RestApiResponseListUserInfoDTO {
        val localVarResponse = getUsersWithHttpInfo(userType = userType)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RestApiResponseListUserInfoDTO
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
     * Get all users
     *
     * @param userType
     * @return ApiResponse<RestApiResponseListUserInfoDTO?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getUsersWithHttpInfo(userType: kotlin.String) : ApiResponse<RestApiResponseListUserInfoDTO?> {
        val localVariableConfig = getUsersRequestConfig(userType = userType)

        return request<Unit, RestApiResponseListUserInfoDTO>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getUsers
     *
     * @param userType
     * @return RequestConfig
     */
    fun getUsersRequestConfig(userType: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/admin/fetch/users/{userType}".replace("{"+"userType"+"}", encodeURIComponent(userType.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Promote or denote user to admin
     *
     * @param email
     * @param userType
     * @return RestApiResponseVoid
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun promoteUser(email: kotlin.String, userType: kotlin.String) : RestApiResponseVoid {
        val localVarResponse = promoteUserWithHttpInfo(email = email, userType = userType)

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
     * Promote or denote user to admin
     *
     * @param email
     * @param userType
     * @return ApiResponse<RestApiResponseVoid?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun promoteUserWithHttpInfo(email: kotlin.String, userType: kotlin.String) : ApiResponse<RestApiResponseVoid?> {
        val localVariableConfig = promoteUserRequestConfig(email = email, userType = userType)

        return request<Unit, RestApiResponseVoid>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation promoteUser
     *
     * @param email
     * @param userType
     * @return RequestConfig
     */
    fun promoteUserRequestConfig(email: kotlin.String, userType: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/admin/users/{email}/promote/{userType}".replace("{"+"email"+"}", encodeURIComponent(email.toString())).replace("{"+"userType"+"}", encodeURIComponent(userType.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * Save log
     *
     * @param userType
     * @param loggerDTO
     * @return RestApiResponseVoid
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun saveLog(userType: kotlin.String, loggerDTO: LoggerDTO) : RestApiResponseVoid {
        val localVarResponse = saveLogWithHttpInfo(userType = userType, loggerDTO = loggerDTO)

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
     * Save log
     *
     * @param userType
     * @param loggerDTO
     * @return ApiResponse<RestApiResponseVoid?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun saveLogWithHttpInfo(userType: kotlin.String, loggerDTO: LoggerDTO) : ApiResponse<RestApiResponseVoid?> {
        val localVariableConfig = saveLogRequestConfig(userType = userType, loggerDTO = loggerDTO)

        return request<LoggerDTO, RestApiResponseVoid>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation saveLog
     *
     * @param userType
     * @param loggerDTO
     * @return RequestConfig
     */
    fun saveLogRequestConfig(userType: kotlin.String, loggerDTO: LoggerDTO) : RequestConfig<LoggerDTO> {
        val localVariableBody = loggerDTO
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/admin/save/log/{userType}".replace("{"+"userType"+"}", encodeURIComponent(userType.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}