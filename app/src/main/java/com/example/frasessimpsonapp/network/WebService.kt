package com.example.frasessimpsonapp.network

import com.example.frasessimpsonapp.models.Personaje
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
   @GET("quotes?count=12")
   suspend fun obtenerPersonajes(): Response<list<Personaje>>
   @GET ("quotes")
   suspend fun obtenerPersonaje ()
   @Query("character") personaje: String
   ): Response <List<Personaje>>
}