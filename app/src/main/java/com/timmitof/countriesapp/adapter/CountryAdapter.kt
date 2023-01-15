package com.timmitof.countriesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.timmitof.countriesapp.databinding.ItemCountryBinding
import com.timmitof.countriesapp.models.Country

class CountryAdapter(private val onItemClicked: (country: Country?) -> Unit) :
    RecyclerView.Adapter<ViewHolder>() {
    private var data = mutableListOf<Country>()

    fun setItems(countries: List<Country>?) {
        if (countries != null) {
            data.clear()
            data.addAll(countries)
            notifyDataSetChanged()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return CountryViewHolder(
            ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            onItemClicked
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (holder) {
            is CountryViewHolder -> {
                holder.onBind(data[position])
            }
        }
    }

    class CountryViewHolder(
        binding: ItemCountryBinding,
        private val onItemClicked: (country: Country?) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {
        private val imageCountry = binding.imageCountry
        private val nameCountry = binding.nameCountry

        fun onBind(item: Country) = with(itemView.context) {
            Glide.with(itemView).load(item.flags?.png).circleCrop().into(imageCountry)
            nameCountry.text = item.name
            itemView.setOnClickListener {
                onItemClicked.invoke(item)
            }
        }
    }

}