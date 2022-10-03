package com.serdar.weatherapp.repository

import com.serdar.weatherapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject constructor(private val apiService: ApiService){

    suspend fun getWeather()=apiService.getWeather("London","920becaf84c8771c64330727a5372d45")
}