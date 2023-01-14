package com.timmitof.countriesapp.repository

import com.timmitof.countriesapp.models.Country
import retrofit2.Response

interface CountryRepository {
    suspend fun getAllCountry(): Response<List<Country>>

    suspend fun getCountryByName(name: String): Response<List<Country>>
}