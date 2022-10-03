package com.serdar.weatherapp.data.model

import com.serdar.weatherapp.data.model.City

data class Weather(
    val city: City,
    val cnt: Int,
    val cod: String,
    val message: Int
)