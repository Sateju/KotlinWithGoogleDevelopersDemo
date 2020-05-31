package com.timson.kotlindemo.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    //    private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood"
    private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}