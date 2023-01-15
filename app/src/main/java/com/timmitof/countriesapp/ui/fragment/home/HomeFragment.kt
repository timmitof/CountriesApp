package com.timmitof.countriesapp.ui.fragment.home

import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.timmitof.countriesapp.R
import com.timmitof.countriesapp.adapter.CountryAdapter
import com.timmitof.countriesapp.databinding.FragmentHomeBinding
import com.timmitof.countriesapp.models.Country
import com.timmitof.countriesapp.models.DetailsCountry
import com.timmitof.countriesapp.other.Status
import com.timmitof.countriesapp.other.gone
import com.timmitof.countriesapp.other.visible
import com.timmitof.countriesapp.ui.baseclasses.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)
    private val viewModel: HomeViewModel by viewModels()

    private val adapter by lazy { CountryAdapter(::onItemClicked) }
    var countryName: String = ""

    override fun setupListener() {
        super.setupListener()
        binding.refreshButton.setOnClickListener {
            if (countryName.isEmpty()) {
                viewModel.getAllCountries()
            } else {
                countryName.let { name -> viewModel.getCountryByName(name) }
            }
        }

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                if (query != null) {
                    viewModel.getCountryByName(query)
                }
                return false
            }

            override fun onQueryTextChange(text: String?): Boolean {
                if (text != null) {
                    countryName = text
                }
                return false
            }
        })
    }

    private fun onItemClicked(country: Country?) {
        if (country != null)
            findNavController().navigate(HomeFragmentDirections.nextDetails(country))
    }

    override fun observeData() {
        super.observeData()
        binding.recyclerCountry.adapter = adapter
        viewModel.getAllCountries()

        viewModel.listCountries.observe(this) {
            when (it.status) {
                Status.SUCCESSFUL -> {
                    adapter.setItems(it.data)
                    showLoading(false)
                }
                Status.ERROR -> {
                    showAlert(it.message ?: getString(R.string.error_undefined))
                    showLoading(false)
                }
                Status.LOADING -> {
                    showLoading(true)
                }
            }
        }
    }

    private fun showLoading(value: Boolean) {
        when (value) {
            true -> {
                binding.recyclerCountry.gone()
                binding.progressBar.visible()
            }
            false -> {
                binding.recyclerCountry.visible()
                binding.progressBar.gone()
            }
        }

    }
}