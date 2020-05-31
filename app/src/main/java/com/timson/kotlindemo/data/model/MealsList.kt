package com.timson.kotlindemo.data.model

import com.google.gson.annotations.SerializedName

class MealsList(
    @SerializedName("meals") val meals: List<Meals>
)