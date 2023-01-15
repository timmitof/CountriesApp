package com.timmitof.countriesapp.repositories

import com.timmitof.countriesapp.models.Country
import com.timmitof.countriesapp.repository.CountryRepository
import org.junit.Test
import retrofit2.Response

class FakeCountryRepository: CountryRepository {

    private val observableCountry: Response<List<Country>>
        get() = Response.success(listOf())

    private var shouldReturnNetworkError = false

    @Test
    fun `set should return network error`(value: Boolean) {
        shouldReturnNetworkError = value
    }

    @Test
    override suspend fun getAllCountry(): Response<List<Country>> {
        return observableCountry
    }

    @Test
    override suspend fun getCountryByName(name: String): Response<List<Country>> {
        return observableCountry
    }
}