package com.serdar.weatherapp.data.model

data class Weather(
    val city: City,
    val cnt: Int,
    val cod: String,
    val message: Int
)