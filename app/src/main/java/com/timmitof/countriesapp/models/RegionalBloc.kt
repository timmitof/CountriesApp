package com.timmitof.countriesapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class RegionalBloc(
    val acronym: String?,
    val name: String?
): Parcelable