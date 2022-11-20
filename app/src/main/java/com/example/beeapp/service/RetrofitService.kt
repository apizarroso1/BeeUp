package com.example.beeapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    // ip alex->192.168.56.1
    // ip piwi->172.19.16.1
    private val BASEURL:String="http://37.134.182.98:80"
    private val retrofit:Retrofit = initializeRetrofit()

    private fun initializeRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
     fun getRetrofit():Retrofit{
        return retrofit
    }
}