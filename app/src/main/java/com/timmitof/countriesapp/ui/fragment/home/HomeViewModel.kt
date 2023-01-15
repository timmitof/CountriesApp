package com.timmitof.countriesapp.ui.fragment.home

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.timmitof.countriesapp.R
import com.timmitof.countriesapp.models.Country
import com.timmitof.countriesapp.other.Resource
import com.timmitof.countriesapp.other.networkCheck
import com.timmitof.countriesapp.repository.CountryRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val api: CountryRepositoryImpl,
    @ApplicationContext private val context: Context
    ) : ViewModel() {

    val listCountries = MutableLiveData<Resource<List<Country>>>()

    fun getAllCountries() {
        listCountries.postValue(Resource.loading(null))
        viewModelScope.launch(Dispatchers.IO) {
            if (networkCheck(context)) {
                api.getAllCountry().let {
                    if (it.isSuccessful) listCountries.postValue(Resource.success(it.body()))
                    else listCountries.postValue(Resource.error(it.errorBody()?.string()))

                }
            } else listCountries.postValue(Resource.error(context.getString(R.string.no_internet_connection)))
        }
    }

    fun getCountryByName(name: String) {
        listCountries.postValue(Resource.loading(null))
        viewModelScope.launch(Dispatchers.IO) {
            if (networkCheck(context)) {
                api.getCountryByName(name).let {
                    if (it.isSuccessful) listCountries.postValue(Resource.success(it.body()))
                    else listCountries.postValue(Resource.error(it.errorBody()?.string()))
                }
            } else listCountries.postValue(Resource.error(context.getString(R.string.no_internet_connection)))
        }
    }
}