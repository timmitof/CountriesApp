package com.timmitof.countriesapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CountryApp: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}