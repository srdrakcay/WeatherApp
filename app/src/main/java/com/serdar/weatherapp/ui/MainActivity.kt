package com.serdar.weatherapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.serdar.weatherapp.databinding.ActivityMainBinding
import com.serdar.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val weatherViewModel: WeatherViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        weatherViewModel.weatherResponse.observe(this) { weather ->
            binding.apply {

            temp.text=weather.main.temp.toString()
                location.text=weather.name
                maxTemp.text=weather.main.temp_max.toString()
                minTemp.text=weather.main.temp_min.toString()
                clouds.text=weather.weather.get(0).description

            //    temp.text=name.temp.toString()
            }
        }
    }
    }
