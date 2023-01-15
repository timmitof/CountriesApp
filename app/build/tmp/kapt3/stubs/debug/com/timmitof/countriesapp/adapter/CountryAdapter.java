package com.timmitof.countriesapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B*\u0012#\u0010\u0003\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0016\u0010\u0016\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0003\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/timmitof/countriesapp/adapter/CountryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onItemClicked", "Lkotlin/Function1;", "Lcom/timmitof/countriesapp/models/Country;", "Lkotlin/ParameterName;", "name", "country", "", "(Lkotlin/jvm/functions/Function1;)V", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "countries", "", "CountryViewHolder", "app_debug"})
public final class CountryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.timmitof.countriesapp.models.Country, kotlin.Unit> onItemClicked = null;
    private java.util.List<com.timmitof.countriesapp.models.Country> data;
    
    public CountryAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.timmitof.countriesapp.models.Country, kotlin.Unit> onItemClicked) {
        super();
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<com.timmitof.countriesapp.models.Country> countries) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/timmitof/countriesapp/adapter/CountryAdapter$CountryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/timmitof/countriesapp/databinding/ItemCountryBinding;", "onItemClicked", "Lkotlin/Function1;", "Lcom/timmitof/countriesapp/models/Country;", "Lkotlin/ParameterName;", "name", "country", "", "(Lcom/timmitof/countriesapp/databinding/ItemCountryBinding;Lkotlin/jvm/functions/Function1;)V", "imageCountry", "Landroid/widget/ImageView;", "nameCountry", "Landroid/widget/TextView;", "onBind", "item", "app_debug"})
    public static final class CountryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final kotlin.jvm.functions.Function1<com.timmitof.countriesapp.models.Country, kotlin.Unit> onItemClicked = null;
        private final android.widget.ImageView imageCountry = null;
        private final android.widget.TextView nameCountry = null;
        
        public CountryViewHolder(@org.jetbrains.annotations.NotNull()
        com.timmitof.countriesapp.databinding.ItemCountryBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.timmitof.countriesapp.models.Country, kotlin.Unit> onItemClicked) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.timmitof.countriesapp.models.Country item) {
        }
    }
}