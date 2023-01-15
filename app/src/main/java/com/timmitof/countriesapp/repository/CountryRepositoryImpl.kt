package com.timmitof.countriesapp.repository

import com.timmitof.countriesapp.api.Api
import com.timmitof.countriesapp.models.Country
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class CountryRepositoryImpl @Inject constructor(private val api: Api): CountryRepository {

    override suspend fun getAllCountry(): Response<List<Country>> {
        return api.getAllCountries()
    }

    override suspend fun getCountryByName(name: String): Response<List<Country>> {
        return api.getCountryByName(name)
    }
}