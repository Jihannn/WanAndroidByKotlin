package com.jihan.wanandroid.net

import com.jihan.wanandroid.Constants
import com.squareup.moshi.Moshi
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @Author Jihan
 * @Date 2020/5/18 16:38
 * @Description
 */
class RetrofitFactory private constructor() {
    companion object {
        val instance by lazy { RetrofitFactory() }
    }

    private val retrofit: Retrofit
    private val headInterceptor: Interceptor

    init {
        headInterceptor = Interceptor { chain ->
            chain.proceed(
                chain.request()
                    .newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("charset", "utf-8")
                    .build()
            )
        }
        retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(initOkHttpClient())
            .baseUrl(Constants.BASE_URL)
            .build()
    }

    private fun initOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.MINUTES)
            .readTimeout(10, TimeUnit.MINUTES)
            .build()
    }

    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }
}