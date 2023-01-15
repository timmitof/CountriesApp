package com.timmitof.countriesapp.models

data class DetailsCountry(
    val name: String?,
    val region: String?,
    val capital: String?,
    val currencies: List<Currency>?,
    val timezone: List<String>?
)