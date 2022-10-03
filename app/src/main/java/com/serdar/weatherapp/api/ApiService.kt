package com.serdar.weatherapp.api

import com.serdar.weatherapp.data.model.Weather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("data/2.5/weather")

   suspend fun getWeather(
        @Query("q") location: String,
        @Query("appid") key: String ="920becaf84c8771c64330727a5372d45",
    ): Response<Weather>
}