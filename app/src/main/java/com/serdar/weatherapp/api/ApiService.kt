package com.serdar.weatherapp.api

import com.serdar.weatherapp.data.model.WeatherA
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("forecast")

   suspend fun getWeather(
        @Query("q") location: String,
        @Query("appid") key: String ="920becaf84c8771c64330727a5372d45",
    ):
            Call<WeatherA>
}