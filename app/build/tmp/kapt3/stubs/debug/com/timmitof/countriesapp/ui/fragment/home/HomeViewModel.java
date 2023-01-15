package com.timmitof.countriesapp.ui.fragment.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/timmitof/countriesapp/ui/fragment/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "api", "Lcom/timmitof/countriesapp/repository/CountryRepositoryImpl;", "context", "Landroid/content/Context;", "(Lcom/timmitof/countriesapp/repository/CountryRepositoryImpl;Landroid/content/Context;)V", "listCountries", "Landroidx/lifecycle/MutableLiveData;", "Lcom/timmitof/countriesapp/other/Resource;", "", "Lcom/timmitof/countriesapp/models/Country;", "getListCountries", "()Landroidx/lifecycle/MutableLiveData;", "getAllCountries", "", "getCountryByName", "name", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.timmitof.countriesapp.repository.CountryRepositoryImpl api = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.timmitof.countriesapp.other.Resource<java.util.List<com.timmitof.countriesapp.models.Country>>> listCountries = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.timmitof.countriesapp.repository.CountryRepositoryImpl api, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.timmitof.countriesapp.other.Resource<java.util.List<com.timmitof.countriesapp.models.Country>>> getListCountries() {
        return null;
    }
    
    public final void getAllCountries() {
    }
    
    public final void getCountryByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}