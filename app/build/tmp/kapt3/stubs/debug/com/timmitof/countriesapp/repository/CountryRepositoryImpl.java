package com.timmitof.countriesapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/timmitof/countriesapp/repository/CountryRepositoryImpl;", "Lcom/timmitof/countriesapp/repository/CountryRepository;", "api", "Lcom/timmitof/countriesapp/api/Api;", "(Lcom/timmitof/countriesapp/api/Api;)V", "getAllCountry", "Lretrofit2/Response;", "", "Lcom/timmitof/countriesapp/models/Country;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountryByName", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CountryRepositoryImpl implements com.timmitof.countriesapp.repository.CountryRepository {
    private final com.timmitof.countriesapp.api.Api api = null;
    
    @javax.inject.Inject()
    public CountryRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.timmitof.countriesapp.api.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllCountry(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.timmitof.countriesapp.models.Country>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCountryByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.timmitof.countriesapp.models.Country>>> continuation) {
        return null;
    }
}