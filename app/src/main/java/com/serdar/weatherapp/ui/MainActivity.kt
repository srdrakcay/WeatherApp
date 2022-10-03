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
                location.text=weather.name.toString()



            //    temp.text=name.temp.toString()
            }
        }
    }
    }
