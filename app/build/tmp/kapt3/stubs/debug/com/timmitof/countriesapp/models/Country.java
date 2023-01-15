package com.timmitof.countriesapp.models;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u00b5\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\u0002\u0010%J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0002\u0010@J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010V\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010Y\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u00c6\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006H\u00c6\u0003J\u00f0\u0002\u0010b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00062\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u00c6\u0001\u00a2\u0006\u0002\u0010cJ\t\u0010d\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010e\u001a\u00020\u00142\b\u0010f\u001a\u0004\u0018\u00010gH\u00d6\u0003J\t\u0010h\u001a\u00020\u001cH\u00d6\u0001J\t\u0010i\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010\u0011\u001a\u00020\u001cH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\'R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010*R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\'R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\'R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\'R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\'R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\'R\u0019\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0019\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010*R\u0013\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010H\u00a8\u0006n"}, d2 = {"Lcom/timmitof/countriesapp/models/Country;", "Landroid/os/Parcelable;", "alpha2Code", "", "alpha3Code", "altSpellings", "", "area", "", "borders", "callingCodes", "capital", "cioc", "currencies", "Lcom/timmitof/countriesapp/models/Currency;", "demonym", "flag", "flags", "Lcom/timmitof/countriesapp/models/Flags;", "independent", "", "languages", "Lcom/timmitof/countriesapp/models/Language;", "latlng", "name", "nativeName", "numericCode", "population", "", "region", "regionalBlocs", "Lcom/timmitof/countriesapp/models/RegionalBloc;", "subregion", "timezones", "topLevelDomain", "translations", "Lcom/timmitof/countriesapp/models/Translations;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/timmitof/countriesapp/models/Flags;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/timmitof/countriesapp/models/Translations;)V", "getAlpha2Code", "()Ljava/lang/String;", "getAlpha3Code", "getAltSpellings", "()Ljava/util/List;", "getArea", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBorders", "getCallingCodes", "getCapital", "getCioc", "getCurrencies", "getDemonym", "getFlag", "getFlags", "()Lcom/timmitof/countriesapp/models/Flags;", "getIndependent", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguages", "getLatlng", "getName", "getNativeName", "getNumericCode", "getPopulation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegion", "getRegionalBlocs", "getSubregion", "getTimezones", "getTopLevelDomain", "getTranslations", "()Lcom/timmitof/countriesapp/models/Translations;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/timmitof/countriesapp/models/Flags;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/timmitof/countriesapp/models/Translations;)Lcom/timmitof/countriesapp/models/Country;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "app_debug"})
public final class Country implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String alpha2Code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String alpha3Code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> altSpellings = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double area = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> borders = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> callingCodes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String capital = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cioc = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.timmitof.countriesapp.models.Currency> currencies = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String demonym = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String flag = null;
    @org.jetbrains.annotations.Nullable()
    private final com.timmitof.countriesapp.models.Flags flags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean independent = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.timmitof.countriesapp.models.Language> languages = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Double> latlng = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String nativeName = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String numericCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer population = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String region = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.timmitof.countriesapp.models.RegionalBloc> regionalBlocs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subregion = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> timezones = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> topLevelDomain = null;
    @org.jetbrains.annotations.Nullable()
    private final com.timmitof.countriesapp.models.Translations translations = null;
    public static final android.os.Parcelable.Creator<com.timmitof.countriesapp.models.Country> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.timmitof.countriesapp.models.Country copy(@org.jetbrains.annotations.Nullable()
    java.lang.String alpha2Code, @org.jetbrains.annotations.Nullable()
    java.lang.String alpha3Code, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> altSpellings, @org.jetbrains.annotations.Nullable()
    java.lang.Double area, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> borders, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> callingCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String capital, @org.jetbrains.annotations.Nullable()
    java.lang.String cioc, @org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.Currency> currencies, @org.jetbrains.annotations.Nullable()
    java.lang.String demonym, @org.jetbrains.annotations.Nullable()
    java.lang.String flag, @org.jetbrains.annotations.Nullable()
    com.timmitof.countriesapp.models.Flags flags, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean independent, @org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.Language> languages, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Double> latlng, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String nativeName, @org.jetbrains.annotations.Nullable()
    java.lang.String numericCode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer population, @org.jetbrains.annotations.Nullable()
    java.lang.String region, @org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.RegionalBloc> regionalBlocs, @org.jetbrains.annotations.Nullable()
    java.lang.String subregion, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> timezones, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> topLevelDomain, @org.jetbrains.annotations.Nullable()
    com.timmitof.countriesapp.models.Translations translations) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Country(@org.jetbrains.annotations.Nullable()
    java.lang.String alpha2Code, @org.jetbrains.annotations.Nullable()
    java.lang.String alpha3Code, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> altSpellings, @org.jetbrains.annotations.Nullable()
    java.lang.Double area, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> borders, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> callingCodes, @org.jetbrains.annotations.Nullable()
    java.lang.String capital, @org.jetbrains.annotations.Nullable()
    java.lang.String cioc, @org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.Currency> currencies, @org.jetbrains.annotations.Nullable()
    java.lang.String demonym, @org.jetbrains.annotations.Nullable()
    java.lang.String flag, @org.jetbrains.annotations.Nullable()
    com.timmitof.countriesapp.models.Flags flags, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean independent, @org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.Language> languages, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Double> latlng, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String nativeName, @org.jetbrains.annotations.Nullable()
    java.lang.String numericCode, @org.jetbrains.annotations.Nullable()
    java.lang.Integer population, @org.jetbrains.annotations.Nullable()
    java.lang.String region, @org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.RegionalBloc> regionalBlocs, @org.jetbrains.annotations.Nullable()
    java.lang.String subregion, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> timezones, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> topLevelDomain, @org.jetbrains.annotations.Nullable()
    com.timmitof.countriesapp.models.Translations translations) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlpha2Code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAlpha3Code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getAltSpellings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getArea() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getBorders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getCallingCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCapital() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCioc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.timmitof.countriesapp.models.Currency> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.timmitof.countriesapp.models.Currency> getCurrencies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDemonym() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFlag() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timmitof.countriesapp.models.Flags component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timmitof.countriesapp.models.Flags getFlags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getIndependent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.timmitof.countriesapp.models.Language> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.timmitof.countriesapp.models.Language> getLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Double> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Double> getLatlng() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNativeName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNumericCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPopulation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.timmitof.countriesapp.models.RegionalBloc> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.timmitof.countriesapp.models.RegionalBloc> getRegionalBlocs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubregion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTimezones() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTopLevelDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timmitof.countriesapp.models.Translations component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.timmitof.countriesapp.models.Translations getTranslations() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.timmitof.countriesapp.models.Country> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.timmitof.countriesapp.models.Country createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.timmitof.countriesapp.models.Country[] newArray(int size) {
            return null;
        }
    }
}