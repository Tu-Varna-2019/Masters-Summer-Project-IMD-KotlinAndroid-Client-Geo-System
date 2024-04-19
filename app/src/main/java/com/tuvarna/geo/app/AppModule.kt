package com.tuvarna.geo.app

import android.content.Context
import com.tuvarna.geo.rest_api.apis.LoginControllerApi
import com.tuvarna.geo.rest_api.apis.RegisterControllerApi
import com.tuvarna.geo.storage.UserSessionStorage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

  private const val BASE_URL = "http://10.0.2.2:8080"

  @Singleton
  @Provides
  fun provideOkHttpClient(): OkHttpClient {

    return OkHttpClient.Builder().build()
  }

  @Singleton
  @Provides
  fun provideRegisterControllerApi(client: OkHttpClient): RegisterControllerApi {

    return RegisterControllerApi(BASE_URL, client)
  }

  @Singleton
  @Provides
  fun provideLoginControllerApi(client: OkHttpClient): LoginControllerApi {

    return LoginControllerApi(BASE_URL, client)
  }

  @Provides
  @Singleton
  fun provideUserSessionStorage(@ApplicationContext context: Context): UserSessionStorage {
    return UserSessionStorage(context)
  }
}
