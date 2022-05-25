package com.khesya.idn.sirohprophetapp.network

import com.khesya.idn.sirohprophetapp.model.ResponseMain
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ServiceApi {

    @GET("api/kisahnabi")
    fun getData(): Flowable<List<ResponseMain>>
}