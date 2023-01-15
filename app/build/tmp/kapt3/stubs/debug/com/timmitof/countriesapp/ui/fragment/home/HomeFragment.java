package com.timmitof.countriesapp.ui.fragment.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/timmitof/countriesapp/ui/fragment/home/HomeFragment;", "Lcom/timmitof/countriesapp/ui/baseclasses/BaseFragment;", "Lcom/timmitof/countriesapp/databinding/FragmentHomeBinding;", "()V", "adapter", "Lcom/timmitof/countriesapp/adapter/CountryAdapter;", "getAdapter", "()Lcom/timmitof/countriesapp/adapter/CountryAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "countryName", "", "getCountryName", "()Ljava/lang/String;", "setCountryName", "(Ljava/lang/String;)V", "viewModel", "Lcom/timmitof/countriesapp/ui/fragment/home/HomeViewModel;", "getViewModel", "()Lcom/timmitof/countriesapp/ui/fragment/home/HomeViewModel;", "viewModel$delegate", "getViewBinding", "observeData", "", "onItemClicked", "country", "Lcom/timmitof/countriesapp/models/Country;", "setupListener", "showLoading", "value", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeFragment extends com.timmitof.countriesapp.ui.baseclasses.BaseFragment<com.timmitof.countriesapp.databinding.FragmentHomeBinding> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String countryName = "";
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.timmitof.countriesapp.databinding.FragmentHomeBinding getViewBinding() {
        return null;
    }
    
    private final com.timmitof.countriesapp.ui.fragment.home.HomeViewModel getViewModel() {
        return null;
    }
    
    private final com.timmitof.countriesapp.adapter.CountryAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryName() {
        return null;
    }
    
    public final void setCountryName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void setupListener() {
    }
    
    private final void onItemClicked(com.timmitof.countriesapp.models.Country country) {
    }
    
    @java.lang.Override()
    public void observeData() {
    }
    
    private final void showLoading(boolean value) {
    }
}