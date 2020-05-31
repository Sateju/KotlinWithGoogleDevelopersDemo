package com.timson.kotlindemo.data.api

class ApiHelper(private val apiService: ApiService) {

    suspend fun getMeals() = apiService.getMeals("Seafood")
}