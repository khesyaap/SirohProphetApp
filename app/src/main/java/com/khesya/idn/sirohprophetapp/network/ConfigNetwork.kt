package com.khesya.idn.sirohprophetapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ConfigNetwork {
    fun getRetrofit(): Retrofit{
        return Retrofit
            .Builder()
            .baseUrl("https://islamic-api-zhirrr.vercel.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun service(): ServiceApi = getRetrofit().create(ServiceApi::class.java)

}