package com.example.frasessimpsonapp.models
import com.google.gson.annotations.SeriaLizedName

data class Personaje(
@SeriaLizedName("quote")
    val frase : String,
    @SerializedName("character")
    val personaje: String,
    @SeriaLizedName ("image")
    val imagen: String,
    @SerializedName ("characterDirection")
    val direccionPersonaje: String,




)
