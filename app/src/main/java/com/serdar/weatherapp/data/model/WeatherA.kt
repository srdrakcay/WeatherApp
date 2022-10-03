package com.serdar.weatherapp.data.model

data class WeatherA (
    val clouds: Clouds,
    val dt: Int,
    val dt_txt: String,
    val main: List<Main>,
    val pop: Double,
    val rain: Rain,
    val sys: Sys,
    val visibility: Int,
    val weather: List<WeatherX>,
    val wind: Wind
)