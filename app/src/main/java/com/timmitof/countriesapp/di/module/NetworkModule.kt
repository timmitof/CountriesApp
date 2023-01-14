package com.timmitof.countriesapp.di.module

import com.timmitof.countriesapp.Constants.BASE_URL
import com.timmitof.countriesapp.api.CountryApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideApi(retrofit: Retrofit) = retrofit.create(CountryApi::class.java)

}