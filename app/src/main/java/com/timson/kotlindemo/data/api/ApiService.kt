package com.timson.kotlindemo.data.api

import com.timson.kotlindemo.data.model.MealsList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("filter.php")
    suspend fun getMeals(@Query("c") query: String): MealsList
}