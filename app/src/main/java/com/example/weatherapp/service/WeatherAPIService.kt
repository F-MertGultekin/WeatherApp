package com.example.weatherapp.service

import com.example.weatherapp.model.WeatherModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
//https://api.openweathermap.org/data/2.5/weather?q=%C4%B0zmir&APPID=207aa217697a8a9e0fa2f83658b4801d
class WeatherAPIService {

    private val BASE_URL = "https://api.openweathermap.org"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataService(): Single<WeatherModel>{
        return api.getData()
    }

}