package com.timmitof.countriesapp.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0007H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/timmitof/countriesapp/di/module/AppModule;", "", "()V", "provideApi", "Lcom/timmitof/countriesapp/api/Api;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "provideRepository", "Lcom/timmitof/countriesapp/repository/CountryRepository;", "countryRepository", "Lcom/timmitof/countriesapp/repository/CountryRepositoryImpl;", "provideRetrofit", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.timmitof.countriesapp.di.module.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.timmitof.countriesapp.api.Api provideApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.timmitof.countriesapp.repository.CountryRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.timmitof.countriesapp.repository.CountryRepositoryImpl countryRepository) {
        return null;
    }
}