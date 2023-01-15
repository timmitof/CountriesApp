package com.timmitof.countriesapp.api

import com.timmitof.countriesapp.models.Country
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {

    @GET("all")
    suspend fun getAllCountries(): Response<List<Country>>

    @GET("name/{nameCountry}")
    suspend fun getCountryByName(@Path("nameCountry") nameCountry: String): Response<List<Country>>
}