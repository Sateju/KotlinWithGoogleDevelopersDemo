package com.timson.kotlindemo.data.repository

import com.timson.kotlindemo.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getMeals() = apiHelper.getMeals()
}