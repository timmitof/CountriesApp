package com.timmitof.countriesapp.ui.fragment.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.timmitof.countriesapp.R
import com.timmitof.countriesapp.databinding.FragmentCountryDetailsBinding
import com.timmitof.countriesapp.ui.baseclasses.BaseFragment

class CountryDetailsFragment : BaseFragment<FragmentCountryDetailsBinding>() {
    override fun getViewBinding(): FragmentCountryDetailsBinding = FragmentCountryDetailsBinding.inflate(layoutInflater)

    val args: CountryDetailsFragmentArgs by navArgs()

    override fun observeData() {
        super.observeData()
        Glide.with(this).load(args.country.flags?.png).into(binding.imageCountry)
        binding.countryName.text = getString(R.string.country, args.country.name)
        binding.regionName.text = getString(R.string.region, args.country.region)
        binding.capitalName.text = getString(R.string.capital, args.country.capital)
        binding.currencyName.text = getString(R.string.currency, args.country.currencies?.map { it.name })
        binding.timezone.text = getString(R.string.region, args.country.timezones?.map { it })
    }

    override fun setupListener() {
        super.setupListener()
        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}