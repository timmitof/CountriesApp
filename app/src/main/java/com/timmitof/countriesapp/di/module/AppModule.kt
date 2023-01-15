package com.timmitof.countriesapp.di.module

import com.timmitof.countriesapp.other.Constants.BASE_URL
import com.timmitof.countriesapp.api.Api
import com.timmitof.countriesapp.repository.CountryRepository
import com.timmitof.countriesapp.repository.CountryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

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
    fun provideApi(retrofit: Retrofit) = retrofit.create(Api::class.java)

    @Singleton
    @Provides
    fun provideRepository(countryRepository: CountryRepositoryImpl): CountryRepository = countryRepository
}