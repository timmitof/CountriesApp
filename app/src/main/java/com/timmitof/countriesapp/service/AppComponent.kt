package com.timmitof.countriesapp.service

import com.timmitof.countriesapp.CountryApp
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface AppComponent {
    fun inject(app: CountryApp)
}