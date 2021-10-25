package com.example.weatherapp.service

import retrofit2.http.GET
import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q=%C4%B0zmir&APPID=207aa217697a8a9e0fa2f83658b4801d
interface WeatherAPI {

    @GET("data/2.5/weather?&units=metric&APPID=207aa217697a8a9e0fa2f83658b4801d")
    fun getData(
        @Query("q") cityName: String
    ) : Single<WeatherModel>

}