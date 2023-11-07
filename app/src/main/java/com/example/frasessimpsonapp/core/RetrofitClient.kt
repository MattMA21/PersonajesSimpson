package com.example.frasessimpsonapp.core

import com.example.frasessimpsonapp.network.WebService
import retrofit2.Retrofit

object RetrofitClient {
val  webService: WebService by lazy {
    Retrofit.Builder()
        .baseUrl(Constantes.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder(.create())))
    .build()
    .create(webService::class.java)
}

}